package org.coode.oppl.search.solvability.test;

import static org.junit.Assert.fail;

import org.coode.oppl.ConstraintSystem;
import org.coode.oppl.OPPLFactory;
import org.coode.oppl.Variable;
import org.coode.oppl.bindingtree.BindingNode;
import org.coode.oppl.search.solvability.*;
import org.coode.oppl.variabletypes.VariableTypeFactory;
import org.junit.Test;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings("javadoc")
public class NoResultsAxiomSolvabilityTest {

    @Test
    public void shouldTestNoResultsSubClassAxiom() throws Exception {
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.createOntology();
        OPPLFactory opplFactory = new OPPLFactory(manager, ontology, null);
        ConstraintSystem constraintSystem = opplFactory.createConstraintSystem();
        Variable<OWLClassExpression> x = constraintSystem.createVariable("?x",
            VariableTypeFactory.getCLASSVariableType(), null);
        OWLDataFactory dataFactory = manager.getOWLDataFactory();
        OWLClass a = dataFactory.getOWLClass(IRI.create("A"));
        OWLClass b = dataFactory.getOWLClass(IRI.create("B"));
        OWLClass c = dataFactory.getOWLClass(IRI.create("C"));
        OWLObjectProperty p = dataFactory.getOWLObjectProperty(IRI.create("p"));
        manager.addAxiom(
            ontology,
            dataFactory.getOWLSubClassOfAxiom(
                dataFactory.getOWLObjectSomeValuesFrom(p, a),
                dataFactory.getOWLObjectSomeValuesFrom(p, b)));
        OWLSubClassOfAxiom axiom = dataFactory.getOWLSubClassOfAxiom(
            dataFactory.getOWLObjectSomeValuesFrom(p,
                dataFactory.getOWLClass(x.getIRI())),
            dataFactory.getOWLObjectSomeValuesFrom(p, c));
        AxiomSolvability axiomSolvability = new NoResultsAxiomSolvability(
            constraintSystem, new AssertedModelQuerySolver(manager));
        SolvabilitySearchNode node = axiomSolvability.getSolvabilitySearchNode(axiom,
            BindingNode.createNewEmptyBindingNode());
        node.accept(new SolvabilitySearchNodeVisitor() {

            @Override
            public void visitUnsolvableSearchNode(
                UnsolvableSearchNode unsolvableSearchNode) {
                fail("Wrong type of solvability node: unsolvable, when expecting no solutions");
            }

            @Override
            public void visitSolvedSearchNode(SolvedSearchNode solvedSearchNode) {
                fail("Wrong type of solvability node: solved, when expecting no solutions");
            }

            @Override
            public void visitNoSolutionSolvableSearchNode(
                NoSolutionSolvableSearchNode noSolutionSolvableSearchNode) {
                // That's fine
            }

            @Override
            public void visitSolvableSearchNode(SolvableSearchNode solvableSearchNode) {
                fail("Wrong type of solvability node: no solution, when expecting no solutions");
            }
        });
    }

    @Test
    public void shouldTestUnsolvableSubClassAxiom() throws Exception {
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.createOntology();
        OPPLFactory opplFactory = new OPPLFactory(manager, ontology, null);
        ConstraintSystem constraintSystem = opplFactory.createConstraintSystem();
        Variable<OWLClassExpression> x = constraintSystem.createVariable("?x",
            VariableTypeFactory.getCLASSVariableType(), null);
        OWLDataFactory dataFactory = manager.getOWLDataFactory();
        OWLClass a = dataFactory.getOWLClass(IRI.create("A"));
        OWLClass b = dataFactory.getOWLClass(IRI.create("B"));
        OWLObjectProperty p = dataFactory.getOWLObjectProperty(IRI.create("p"));
        manager.addAxiom(
            ontology,
            dataFactory.getOWLSubClassOfAxiom(
                dataFactory.getOWLObjectSomeValuesFrom(p, a),
                dataFactory.getOWLObjectSomeValuesFrom(p, b)));
        OWLSubClassOfAxiom axiom = dataFactory.getOWLSubClassOfAxiom(
            dataFactory.getOWLObjectSomeValuesFrom(p,
                dataFactory.getOWLClass(x.getIRI())),
            dataFactory.getOWLObjectSomeValuesFrom(p, b));
        AxiomSolvability axiomSolvability = new NoResultsAxiomSolvability(
            constraintSystem, new AssertedModelQuerySolver(manager));
        SolvabilitySearchNode node = axiomSolvability.getSolvabilitySearchNode(axiom,
            BindingNode.createNewEmptyBindingNode());
        node.accept(new SolvabilitySearchNodeVisitor() {

            @Override
            public void visitUnsolvableSearchNode(
                UnsolvableSearchNode unsolvableSearchNode) {
                // That's fine
            }

            @Override
            public void visitSolvedSearchNode(SolvedSearchNode solvedSearchNode) {
                fail("Wrong type of solvability node: solved, when expecting unsolvable");
            }

            @Override
            public void visitNoSolutionSolvableSearchNode(
                NoSolutionSolvableSearchNode noSolutionSolvableSearchNode) {
                fail("Wrong type of solvability node: no solutions, when expecting unsolvable");
            }

            @Override
            public void visitSolvableSearchNode(SolvableSearchNode solvableSearchNode) {
                fail("Wrong type of solvability node: no solution, when expecting unsolvable");
            }
        });
    }
}
