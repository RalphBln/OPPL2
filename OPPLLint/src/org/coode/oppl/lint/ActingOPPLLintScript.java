package org.coode.oppl.lint;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.coode.oppl.ChangeExtractor;
import org.coode.oppl.OPPLScript;
import org.coode.oppl.Variable;
import org.semanticweb.owl.lint.ActingLint;
import org.semanticweb.owl.lint.LintActionException;
import org.semanticweb.owl.lint.LintVisitor;
import org.semanticweb.owl.lint.LintVisitorEx;
import org.semanticweb.owl.model.OWLAxiomChange;
import org.semanticweb.owl.model.OWLObject;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyChangeException;
import org.semanticweb.owl.model.OWLOntologyManager;

public class ActingOPPLLintScript extends OPPLLintScript implements
		ActingLint<OWLObject> {
	/**
	 * @param name
	 * @param opplScript
	 * @param returnVariable
	 * @param description
	 * @param explanationTemplate
	 * @param ontologyManager
	 */
	public ActingOPPLLintScript(String name, OPPLScript opplScript,
			Variable returnVariable, String description,
			String explanationTemplate, OWLOntologyManager ontologyManager) {
		super(name, opplScript, returnVariable, description,
				explanationTemplate, ontologyManager);
		if (opplScript.getActions().isEmpty()) {
			throw new IllegalArgumentException(
					"The OPPL Script has no action, therefore it should not be wrapped into an ActingLint implementation");
		}
	}

	public List<OWLAxiomChange> getChanges(OWLOntology ontology,
			OWLOntologyManager ontologyManager) {
		ChangeExtractor changeExtractor = new ChangeExtractor(this
				.getOPPLScript().getConstraintSystem(), true);
		List<OWLAxiomChange> changes = this.getOPPLScript().accept(
				changeExtractor);
		return changes;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.getName());
		buffer.append("; ");
		buffer.append(this.getOPPLScript().render());
		buffer.append("RETURN ");
		buffer.append(this.getReturnVariable().getName());
		buffer.append("; ");
		buffer.append(this.getExplanationTemplate());
		buffer.append("; ");
		buffer.append(this.getDescription());
		return buffer.toString();
	}

	/**
	 * @see org.semanticweb.owl.lint.ActingLint#executeActions(org.semanticweb.owl.lint.LintReport)
	 */
	public void executeActions(Collection<? extends OWLOntology> ontologies)
			throws LintActionException {
		List<OWLAxiomChange> changes = new ArrayList<OWLAxiomChange>();
		for (OWLOntology ontology : ontologies) {
			changes
					.addAll(this
							.getChanges(ontology, this.getOntologyManager()));
		}
		try {
			this.getOntologyManager().applyChanges(changes);
		} catch (OWLOntologyChangeException e) {
			throw new LintActionException(e);
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ActingOPPLLintScript) {
			return this.getName().equals(
					((ActingOPPLLintScript) obj).getName());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}

	@Override
	public void accept(LintVisitor visitor) {
		visitor.visitActingLint(this);
	}

	@Override
	public <P> P accept(LintVisitorEx<P> visitor) {
		return visitor.visitActingLint(this);
	}
}