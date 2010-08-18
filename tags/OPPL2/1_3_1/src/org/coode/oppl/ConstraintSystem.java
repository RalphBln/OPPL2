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
package org.coode.oppl;

import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.coode.oppl.bindingtree.Assignment;
import org.coode.oppl.bindingtree.BindingNode;
import org.coode.oppl.exceptions.InvalidVariableNameException;
import org.coode.oppl.exceptions.OPPLException;
import org.coode.oppl.generated.AbstractCollectionGeneratedValue;
import org.coode.oppl.generated.AbstractGeneratedVariable;
import org.coode.oppl.generated.AbstractOWLObjectCollectionGeneratedVariable;
import org.coode.oppl.generated.SingleValueGeneratedValue;
import org.coode.oppl.generated.SingleValueGeneratedVariable;
import org.coode.oppl.generated.StringGeneratedVariable;
import org.coode.oppl.utils.VariableDetector;
import org.coode.oppl.utils.VariableExtractor;
import org.coode.oppl.visitors.GeneratedVariableCollector;
import org.coode.oppl.visitors.InputVariableCollector;
import org.semanticweb.owl.inference.OWLReasoner;
import org.semanticweb.owl.inference.OWLReasonerException;
import org.semanticweb.owl.model.OWLAxiom;
import org.semanticweb.owl.model.OWLClass;
import org.semanticweb.owl.model.OWLConstant;
import org.semanticweb.owl.model.OWLDataProperty;
import org.semanticweb.owl.model.OWLDescription;
import org.semanticweb.owl.model.OWLIndividual;
import org.semanticweb.owl.model.OWLObject;
import org.semanticweb.owl.model.OWLObjectProperty;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyManager;

/**
 * @author Luigi Iannone
 * 
 */
public class ConstraintSystem {
	private final static class VariableSet {
		private final Map<String, Variable> map = new HashMap<String, Variable>();
		private final Map<URI, Variable> urisMap = new HashMap<URI, Variable>();

		public VariableSet() {
		}

		public Variable get(String name) {
			return this.map.get(name);
		}

		public Variable get(URI variableURI) {
			return this.urisMap.get(variableURI);
		}

		public void store(Variable variable) {
			this.map.put(variable.getName(), variable);
			this.urisMap.put(variable.getURI(), variable);
		}

		public boolean containsVariableURI(URI variableURI) {
			return this.urisMap.containsKey(variableURI);
		}

		public Set<Variable> getInputVariables() {
			InputVariableCollector visitor = new InputVariableCollector();
			for (Variable variable : this.map.values()) {
				variable.accept(visitor);
			}
			return new HashSet<Variable>(visitor.getCollectedVariables());
		}

		public Set<Variable> getAllVariables() {
			return new HashSet<Variable>(this.map.values());
		}

		public Set<SingleValueGeneratedVariable<?>> getGeneratedVariables() {
			GeneratedVariableCollector visitor = new GeneratedVariableCollector();
			for (Variable v : this.map.values()) {
				v.accept(visitor);
			}
			return new HashSet<SingleValueGeneratedVariable<?>>(visitor.getCollectedVariables());
		}

		public void remove(String name) {
			Variable removed = this.map.remove(name);
			if (removed != null) {
				this.urisMap.remove(removed.getURI());
			}
		}

		public void clear() {
			this.map.clear();
			this.urisMap.clear();
		}

		@Override
		public String toString() {
			Set<Variable> allVariables = this.getAllVariables();
			StringBuilder out = new StringBuilder();
			Formatter formatter = new Formatter(out, Locale.getDefault());
			for (Variable variable : allVariables) {
				formatter.format(
						"Variable name: %s generated: %s \n",
						variable.getName(),
						this.getGeneratedVariables().contains(variable));
			}
			return out.toString();
		}
	}

	private final VariableSet variables = new VariableSet();
	private final OWLOntology ontology;
	private Set<BindingNode> leaves = null;
	private OWLReasoner reasoner = null;
	private final OWLOntologyManager ontologyManager;
	private final OPPLAbstractFactory opplFactory;

	public ConstraintSystem(OWLOntology ontology, OWLOntologyManager ontologyManager,
			OPPLAbstractFactory opplFactory) {
		if (ontology == null) {
			throw new NullPointerException("The ontology cannot be null");
		}
		if (ontologyManager == null) {
			throw new NullPointerException("The ontology manager cannot be null");
		}
		if (opplFactory == null) {
			throw new NullPointerException("The OPPL factory cannot be null");
		}
		this.opplFactory = opplFactory;
		this.ontology = ontology;
		this.ontologyManager = ontologyManager;
	}

	public ConstraintSystem(OWLOntology ontology, OWLOntologyManager ontologyManager,
			OWLReasoner reasoner, OPPLAbstractFactory opplAbstractFactory) {
		this(ontology, ontologyManager, opplAbstractFactory);
		this.reasoner = reasoner;
		if (this.reasoner != null) {
			this.loadReasoner();
		}
	}

	/**
	 *
	 */
	private void loadReasoner() {
		try {
			this.reasoner.loadOntologies(this.getOntologyManager().getOntologies());
		} catch (OWLReasonerException e) {
			e.printStackTrace();
		}
	}

	public Variable getVariable(String name) {
		return this.variables.get(name);
	}

	public Variable createVariable(String name, VariableType type) throws OPPLException {
		if (name.matches("\\?([\\p{Alnum}[-_]])+")) {
			Variable newVariable = type.instantiateVariable(name);
			// new VariableImpl(name.trim(), type);
			this.variables.store(newVariable);
			return newVariable;
		} else {
			throw new InvalidVariableNameException("Invalid name: " + name);
		}
	}

	public Set<Variable> getAxiomVariables(OWLAxiom axiom) {
		VariableExtractor axiomVariableExtractor = new VariableExtractor(this, true);
		Set<Variable> axiomVariables = axiomVariableExtractor.extractVariables(axiom);
		return new HashSet<Variable>(axiomVariables);
	}

	public boolean isVariableURI(URI uri) {
		return this.variables.containsVariableURI(uri);
	}

	public Variable getVariable(URI uri) {
		return this.variables.get(uri);
	}

	public boolean isVariable(OWLDescription desc) {
		VariableDetector variableDetector = new VariableDetector(this);
		return desc.accept(variableDetector);
	}

	public boolean isVariable(OWLObjectProperty property) {
		return this.isVariableURI(property.getURI());
	}

	public boolean isVariable(OWLDataProperty property) {
		return this.isVariableURI(property.getURI());
	}

	public boolean isVariable(OWLIndividual individual) {
		return this.isVariableURI(individual.getURI());
	}

	public void addLeaf(BindingNode bindingNode) {
		if (this.leaves == null) {
			this.leaves = new HashSet<BindingNode>();
		}
		this.leaves.add(bindingNode);
	}

	public Set<OWLObject> getVariableBindings(Variable v) {
		Set<BindingNode> leaves = this.getLeaves();
		Set<OWLObject> toReturn = new HashSet<OWLObject>();
		if (leaves != null) {
			for (BindingNode bindingNode : leaves) {
				OWLObject assignmentValue = bindingNode.getAssignmentValue(v);
				if (assignmentValue != null) {
					toReturn.add(assignmentValue);
				}
			}
		}
		return toReturn;
	}

	public boolean addLeaf(Variable variable, OWLObject object) {
		boolean toReturn = variable.getType().isCompatibleWith(object);
		if (toReturn) {
			if (this.leaves == null) {
				this.leaves = new HashSet<BindingNode>();
			}
			Assignment assignment = new Assignment(variable, object);
			if (!this.leaves.isEmpty()) {
				for (BindingNode node : this.leaves) {
					node.addAssignment(assignment);
				}
			} else {
				this.leaves.add(new BindingNode(Collections.singleton(assignment),
						Collections.<Variable> emptySet()));
			}
		}
		return toReturn;
	}

	/**
	 * @return the leaves
	 */
	public Set<BindingNode> getLeaves() {
		return this.leaves == null ? this.leaves : new HashSet<BindingNode>(this.leaves);
	}

	public OPPLAbstractFactory getOPPLFactory() {
		return this.opplFactory;
	}

	public Set<Variable> getInputVariables() {
		return this.variables.getInputVariables();
	}

	public void removeBinding(BindingNode binding) {
		this.leaves.remove(binding);
	}

	public boolean isVariable(OWLConstant node) {
		return node.getLiteral().startsWith("?");
	}

	public void setLeaves(Set<BindingNode> newLeaves) {
		this.leaves = newLeaves;
	}

	public void setReasoner(OWLReasoner reasoner) {
		this.reasoner = reasoner;
		if (this.reasoner != null) {
			this.loadReasoner();
		}
	}

	public Set<Variable> getVariables() {
		return this.variables.getAllVariables();
	}

	/**
	 * If the reasoner is not calssified it classifies it first
	 * 
	 * @return the reasoner
	 * @throws OWLReasonerException
	 */
	public OWLReasoner getReasoner() throws OWLReasonerException {
		if (this.reasoner != null && !this.reasoner.isClassified()) {
			this.reasoner.classify();
		}
		return this.reasoner;
	}

	public SingleValueGeneratedVariable<String> createStringGeneratedVariable(String name,
			VariableType type, SingleValueGeneratedValue<String> value) {
		AbstractGeneratedVariable<String> generatedVariable = StringGeneratedVariable.buildGeneratedVariable(
				name,
				type,
				value,
				this);
		this.variables.store(generatedVariable);
		return generatedVariable;
	}

	/**
	 * @return the ontology
	 */
	public OWLOntology getOntology() {
		return this.ontology;
	}

	public Set<SingleValueGeneratedVariable<?>> getGeneratedVariables() {
		return this.variables.getGeneratedVariables();
	}

	public boolean isGenerated(Variable v) {
		return this.variables.getGeneratedVariables().contains(v);
	}

	public void reset() {
		this.leaves = null;
	}

	public void removeVariable(Variable variable) {
		this.variables.remove(variable.getName());
	}

	public SingleValueGeneratedVariable<Collection<OWLClass>> createIntersectionGeneratedVariable(
			String name, VariableType type, AbstractCollectionGeneratedValue<OWLClass> collection) {
		SingleValueGeneratedVariable<Collection<OWLClass>> toReturn = null;
		if (type.equals(VariableType.CLASS)) {
			toReturn = AbstractOWLObjectCollectionGeneratedVariable.getConjunction(
					name,
					type,
					collection,
					this.getOntologyManager().getOWLDataFactory());
			this.variables.store(toReturn);
		} else {
			throw new IllegalArgumentException("Incompatibile type " + type.name());
		}
		return toReturn;
	}

	public SingleValueGeneratedVariable<Collection<OWLClass>> createUnionGeneratedVariable(
			String name, VariableType type, AbstractCollectionGeneratedValue<OWLClass> collection) {
		SingleValueGeneratedVariable<Collection<OWLClass>> toReturn = null;
		if (type.equals(VariableType.CLASS)) {
			toReturn = AbstractOWLObjectCollectionGeneratedVariable.getDisjunction(
					name,
					type,
					collection,
					this.getOntologyManager().getOWLDataFactory());
			this.variables.store(toReturn);
		}
		if (toReturn == null) {
			throw new IllegalArgumentException("Incompatibile type " + type.name());
		}
		return toReturn;
	}

	public String render(Variable variable) {
		return variable.getName();
	}

	public void importVariable(Variable v) {
		this.variables.store(v);
	}

	public void clearVariables() {
		this.variables.clear();
	}

	/**
	 * @return the ontologyManager
	 */
	public OWLOntologyManager getOntologyManager() {
		return this.ontologyManager;
	}
}