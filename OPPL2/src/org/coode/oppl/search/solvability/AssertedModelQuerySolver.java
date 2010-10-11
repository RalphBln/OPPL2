/**
 * 
 */
package org.coode.oppl.search.solvability;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;

/**
 * @author Luigi Iannone
 * 
 */
public final class AssertedModelQuerySolver implements QuerySolver {
	private final OWLOntologyManager ontologyManager;

	/**
	 * @param ontologyManager
	 */
	public AssertedModelQuerySolver(OWLOntologyManager ontologyManager) {
		if (ontologyManager == null) {
			throw new NullPointerException(
					"The ontology manager cannot be null");
		}
		this.ontologyManager = ontologyManager;
	}

	public Set<OWLClass> getSubClasses(OWLClassExpression superClass) {
		Set<OWLClass> toReturn = new HashSet<OWLClass>();
		for (OWLOntology ontology : this.ontologyManager.getOntologies()) {
			for (OWLSubClassOfAxiom owlAxiom : ontology
					.getAxioms(AxiomType.SUBCLASS_OF)) {
				if (owlAxiom.getSuperClass().equals(superClass)
						&& !owlAxiom.getSubClass().isAnonymous()) {
					toReturn.add(owlAxiom.getSubClass().asOWLClass());
				}
			}
		}
		return toReturn;
	}

	public Set<OWLClass> getSuperClasses(OWLClassExpression subClass) {
		Set<OWLClass> toReturn = new HashSet<OWLClass>();
		for (OWLOntology ontology : this.ontologyManager.getOntologies()) {
			for (OWLSubClassOfAxiom owlAxiom : ontology
					.getAxioms(AxiomType.SUBCLASS_OF)) {
				if (owlAxiom.getSubClass().equals(subClass)
						&& !owlAxiom.getSuperClass().isAnonymous()) {
					toReturn.add(owlAxiom.getSuperClass().asOWLClass());
				}
			}
		}
		return toReturn;
	}

	public boolean hasNoSubClass(OWLClassExpression superClass) {
		boolean found = false;
		Iterator<OWLOntology> ontologyIterator = this.ontologyManager
				.getOntologies().iterator();
		while (!found && ontologyIterator.hasNext()) {
			OWLOntology owlOntology = ontologyIterator.next();
			Iterator<OWLSubClassOfAxiom> iterator = owlOntology.getAxioms(
					AxiomType.SUBCLASS_OF).iterator();
			while (!found && iterator.hasNext()) {
				OWLSubClassOfAxiom owlSubClassOfAxiom = iterator.next();
				found = owlSubClassOfAxiom.getSuperClass().equals(superClass);
			}
		}
		return !found;
	}

	public boolean hasNoSuperClass(OWLClassExpression subClass) {
		boolean found = false;
		Iterator<OWLOntology> ontologyIterator = this.ontologyManager
				.getOntologies().iterator();
		while (!found && ontologyIterator.hasNext()) {
			OWLOntology owlOntology = ontologyIterator.next();
			Iterator<OWLSubClassOfAxiom> iterator = owlOntology.getAxioms(
					AxiomType.SUBCLASS_OF).iterator();
			while (!found && iterator.hasNext()) {
				OWLSubClassOfAxiom owlSubClassOfAxiom = iterator.next();
				found = owlSubClassOfAxiom.getSubClass().equals(subClass);
			}
		}
		return !found;
	}
}
