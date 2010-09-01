/**
 * 
 */
package org.coode.parsers.oppl.testcase;

import org.coode.parsers.ErrorListener;
import org.coode.parsers.factory.SymbolTableFactory;
import org.coode.parsers.oppl.testcase.OPPLTestCaseParser.AbstractParserFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;

/**
 * @author Luigi Iannone
 * 
 */
public class ParserFactory implements AbstractParserFactory {
	private final OWLOntologyManager ontologyManager;
	private final OWLOntology ontology;
	private final OWLReasoner reasoner;

	/**
	 * @param ontology
	 * @param ontologyManager
	 */
	public ParserFactory(OWLOntology ontology,
			OWLOntologyManager ontologyManager, OWLReasoner reasoner) {
		if (ontologyManager == null) {
			throw new NullPointerException(
					"The ontology manager cannot be null");
		}
		if (ontology == null) {
			throw new NullPointerException("The ontology cannot be null");
		}
		this.ontologyManager = ontologyManager;
		this.ontology = ontology;
		this.reasoner = reasoner;
	}

	public ParserFactory(OWLOntology ontology,
			OWLOntologyManager ontologyManager) {
		this(ontology, ontologyManager, null);
	}

	/**
	 * @return the ontologyManager
	 */
	public OWLOntologyManager getOntologyManager() {
		return this.ontologyManager;
	}

	public OPPLTestCaseParser build(ErrorListener errorListener) {
		SymbolTableFactory<OPPLTestCaseSymbolTable> symbolTableFactory = new SimpleSymbolTableFactory(
				this.getOntologyManager());
		return new OPPLTestCaseParser(this.getOPPLTestCaseFactory(),
				errorListener, symbolTableFactory);
	}

	public AbstractOPPLTestCaseFactory getOPPLTestCaseFactory() {
		return new OPPLTestCaseFactory(this.getOntology(), this
				.getOntologyManager(), this.getReasoner());
	}

	/**
	 * @return the ontology
	 */
	public OWLOntology getOntology() {
		return this.ontology;
	}

	/**
	 * @return the reasoner
	 */
	public OWLReasoner getReasoner() {
		return this.reasoner;
	}
}
