/**
 * Copyright (C) 2008, University of Manchester
 *
 * Modifications to the initial code base are copyright of their
 * respective authors, or their employers as appropriate.  Authorship
 * of the modifications may be determined from the ChangeLog placed at
 * the end of this file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.coode.oppl.bindingtree;

import java.io.StringWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.coode.oppl.ConstraintSystem;
import org.coode.oppl.PlainVariableVisitor;
import org.coode.oppl.Variable;
import org.coode.oppl.VariableVisitor;
import org.coode.oppl.entity.OWLEntityRenderer;
import org.coode.oppl.function.ValueComputationParameters;
import org.coode.oppl.generated.GeneratedVariable;
import org.coode.oppl.generated.RegexpGeneratedVariable;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLObject;

/**
 * @author Luigi Iannone
 * 
 */
public class BindingNode { // implements VariableVisitor<OWLObject> {
	private static final BindingNode EMPTY_BINDING_NODE = new BindingNode(
			Collections.<Assignment> emptySet(), Collections.<Variable> emptySet());

	private static class VariableInspector implements PlainVariableVisitor {
		private Set<Variable> toUpdate;

		public VariableInspector(Set<Variable> toUpdate) {
			this.toUpdate = toUpdate;
		}

		public void visit(Variable v) {
			this.toUpdate.add(v);
		}

		public void visit(GeneratedVariable<?> v) {
		}

		public void visit(RegexpGeneratedVariable<?> regExpGenerated) {
		}
	}

	private final Set<Assignment> assignments = new HashSet<Assignment>();
	private final Set<Variable> unassignedVariables = new HashSet<Variable>();
	private final VariableInspector unassignedVariablesUpdater = new VariableInspector(
			this.unassignedVariables);

	// TODO multiple issues to be clarified:
	// - assignments and unassigned variables are done differently in the
	// constructor and in the add methods
	// - unassigned variables are either added through a visitor or directly -
	// that might break things if the variable implementation of accept varies
	/**
	 * @param assignments
	 * @param unassignedVariables
	 */
	public BindingNode(Set<Assignment> assignments, Set<Variable> unassignedVariables) {
		this.assignments.addAll(assignments);
		this.unassignedVariables.addAll(unassignedVariables);
	}

	public BindingNode(BindingNode bindingNode) {
		if (bindingNode == null) {
			throw new NullPointerException("The binding node cannot be null");
		}
		this.assignments.addAll(bindingNode.getAssignments());
		this.unassignedVariables.addAll(bindingNode.getUnassignedVariables());
	}

	public void accept(BindingVisitor visitor) {
		visitor.visit(this);
	}

	public <O> O accept(BindingVistorEx<O> visitor) {
		return visitor.visit(this);
	}

	public boolean isLeaf() {
		// boolean found = false;
		// Iterator<Variable> it = this.unassignedVariables.iterator();
		// while (!found && it.hasNext()) {
		// found = !it.next().getPossibleBindings().isEmpty();
		// }
		// return this.unassignedVariables.isEmpty() || !found;
		return this.unassignedVariables.isEmpty();
	}

	@Override
	public String toString() {
		return this.assignments + "\n"
				+ (this.unassignedVariables.isEmpty() ? "" : this.unassignedVariables);
	}

	public String render(ConstraintSystem cs) {
		boolean first = true;
		StringWriter stringWriter = new StringWriter();
		OWLEntityRenderer entityRenderer = cs.getOPPLFactory().getOWLEntityRenderer(cs);
		for (Assignment assignment : this.assignments) {
			OWLObject value = assignment.getAssignment();
			String assignmentRendering = value instanceof OWLEntity ? entityRenderer.render((OWLEntity) value)
					: value.toString();
			String commaString = first ? "" : ", ";
			stringWriter.append(commaString);
			first = false;
			stringWriter.append(assignment.getAssignedVariable().getName() + " = "
					+ assignmentRendering);
		}
		if (!this.unassignedVariables.isEmpty()) {
			stringWriter.append(" ");
			stringWriter.append(this.unassignedVariables.toString());
		}
		return stringWriter.toString();
	}

	public OWLObject getAssignmentValue(Variable variable,
			final ValueComputationParameters parameters) {
		return variable.accept(new VariableVisitor<OWLObject>() {
			public OWLObject visit(Variable v) {
				return this.findAssignment(v);
			}

			/**
			 * @param v
			 * @return
			 */
			public OWLObject findAssignment(Variable v) {
				Iterator<Assignment> iterator = BindingNode.this.getAssignments().iterator();
				boolean found = false;
				OWLObject toReturn = null;
				while (!found && iterator.hasNext()) {
					Assignment assignment = iterator.next();
					found = assignment.getAssignedVariable().equals(v);
					if (found) {
						toReturn = assignment.getAssignment();
					}
				}
				return toReturn;
			}

			public OWLObject visit(GeneratedVariable<?> v) {
				return v.getOPPLFunction().compute(parameters);
			}

			public OWLObject visit(RegexpGeneratedVariable<?> v) {
				return this.findAssignment(v);
			}
		});
	}

	public void addAssignment(final Assignment assignment) {
		assignment.getAssignedVariable().accept(new PlainVariableVisitor() {
			public void visit(RegexpGeneratedVariable<?> regExpGenerated) {
				BindingNode.this.assignments.add(assignment);
				BindingNode.this.unassignedVariables.remove(assignment.getAssignedVariable());
			}

			public void visit(GeneratedVariable<?> v) {
			}

			public void visit(Variable v) {
				BindingNode.this.assignments.add(assignment);
				BindingNode.this.unassignedVariables.remove(assignment.getAssignedVariable());
			}
		});
	}

	public Set<Variable> getAssignedVariables() {
		Set<Variable> toReturn = new HashSet<Variable>();
		for (Assignment assignment : this.assignments) {
			toReturn.add(assignment.getAssignedVariable());
		}
		return toReturn;
	}

	/**
	 * @return the assignments
	 */
	public Set<Assignment> getAssignments() {
		return new HashSet<Assignment>(this.assignments);
	}

	public Set<Variable> getUnassignedVariables() {
		return new HashSet<Variable>(this.unassignedVariables);
	}

	/**
	 * Adds a variable to the set of the unassigned ones
	 * 
	 * @param v
	 */
	public void addUnassignedVariable(Variable v) {
		v.accept(this.unassignedVariablesUpdater);
	}

	// public OWLObject visit(Variable v) {
	// for (Assignment assignment : this.assignments) {
	// if (assignment.getAssignedVariable().equals(v)) {
	// return assignment.getAssignment();
	// }
	// }
	// return null;
	// }
	//
	// public OWLObject visit(GeneratedVariable<?> v) {
	// OWLObject toReturn = this.visit((Variable) v);
	// if (toReturn == null) {
	// toReturn = v.getOPPLFunction().compute(null);
	// }
	// return toReturn;
	// }
	//
	// public OWLObject visit(RegExpGenerated<?> v) {
	// OWLObject toReturn = this.visit((Variable) v);
	// if (toReturn == null) {
	// toReturn = v.getGeneratedOWLObject(this);
	// }
	// return toReturn;
	// }
	/**
	 * @return true if the Binding node has got no assigned variable nor to
	 *         assign variables
	 */
	public boolean isEmpty() {
		return this.assignments.isEmpty() && this.unassignedVariables.isEmpty();
	}

	public static BindingNode getEmptyBindingNode() {
		return BindingNode.EMPTY_BINDING_NODE;
	}

	public static BindingNode createNewEmptyBindingNode() {
		return new BindingNode(Collections.<Assignment> emptySet(),
				Collections.<Variable> emptySet());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.assignments == null ? 0 : this.assignments.hashCode());
		result = prime * result
				+ (this.unassignedVariables == null ? 0 : this.unassignedVariables.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		BindingNode other = (BindingNode) obj;
		if (this.assignments == null) {
			if (other.assignments != null) {
				return false;
			}
		} else if (!this.assignments.equals(other.assignments)) {
			return false;
		}
		if (this.unassignedVariables == null) {
			if (other.unassignedVariables != null) {
				return false;
			}
		} else if (!this.unassignedVariables.equals(other.unassignedVariables)) {
			return false;
		}
		return true;
	}
}
