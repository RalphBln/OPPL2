package org.coode.oppl.search.solvability.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.coode.oppl.ConstraintSystem;
import org.coode.oppl.OPPLFactory;
import org.coode.oppl.Variable;
import org.coode.oppl.bindingtree.BindingNode;
import org.coode.oppl.search.solvability.*;
import org.coode.oppl.variabletypes.VariableTypeFactory;
import org.junit.Test;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;

import uk.ac.manchester.cs.jfact.JFactFactory;

@SuppressWarnings("javadoc")
public class OWLClassSubClassOfAxiomSolvabilityTest {

    @Test
    public void shouldTestSolvableSubClassAxiom() throws Exception {
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.createOntology();
        OPPLFactory opplFactory = new OPPLFactory(manager, ontology, null);
        ConstraintSystem constraintSystem = opplFactory.createConstraintSystem();
        Variable<OWLClassExpression> x = constraintSystem.createVariable("?x",
            VariableTypeFactory.getCLASSVariableType(), null);
        OWLDataFactory dataFactory = manager.getOWLDataFactory();
        manager.addAxiom(
            ontology,
            dataFactory.getOWLSubClassOfAxiom(
                dataFactory.getOWLClass(IRI.create("A")),
                dataFactory.getOWLClass(IRI.create("A"))));
        OWLSubClassOfAxiom axiom = dataFactory.getOWLSubClassOfAxiom(
            dataFactory.getOWLClass(x.getIRI()),
            dataFactory.getOWLClass(IRI.create("A")));
        OWLClassSubClassOfAxiomSolvability axiomSolvability = new OWLClassSubClassOfAxiomSolvability(
            constraintSystem, new AssertedModelQuerySolver(manager));
        SolvabilitySearchNode node = axiomSolvability.getSolvabilitySearchNode(axiom,
            BindingNode.createNewEmptyBindingNode());
        node.accept(new SolvabilitySearchNodeVisitor() {

            @Override
            public void visitUnsolvableSearchNode(
                UnsolvableSearchNode unsolvableSearchNode) {
                fail("Wrong type of solvability node: unsolvable, when expecting solavble");
            }

            @Override
            public void visitSolvedSearchNode(SolvedSearchNode solvedSearchNode) {
                fail("Wrong type of solvability node: solved, when expecting solavble");
            }

            @Override
            public void visitNoSolutionSolvableSearchNode(
                NoSolutionSolvableSearchNode noSolutionSolvableSearchNode) {
                fail("Wrong type of solvability node: no solution, when expecting solavble");
            }

            @Override
            public void visitSolvableSearchNode(SolvableSearchNode solvableSearchNode) {
                // That's fine
            }
        });
    }

    @Test
    public void shouldTestInferredSolvableSubClassAxiom() throws Exception {
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.createOntology();
        OWLReasonerFactory reasonerFactory = new JFactFactory();
        OWLReasoner reasoner = reasonerFactory.createReasoner(ontology);
        OPPLFactory opplFactory = new OPPLFactory(manager, ontology, reasoner);
        ConstraintSystem constraintSystem = opplFactory.createConstraintSystem();
        Variable<OWLClassExpression> x = constraintSystem.createVariable("?x",
            VariableTypeFactory.getCLASSVariableType(), null);
        OWLDataFactory dataFactory = manager.getOWLDataFactory();
        OWLSubClassOfAxiom axiom = dataFactory.getOWLSubClassOfAxiom(
            dataFactory.getOWLClass(x.getIRI()),
            dataFactory.getOWLClass(IRI.create("A")));
        OWLClassSubClassOfAxiomSolvability axiomSolvability = new OWLClassSubClassOfAxiomSolvability(
            constraintSystem, new InferredModelQuerySolver(reasoner));
        SolvabilitySearchNode node = axiomSolvability.getSolvabilitySearchNode(axiom,
            BindingNode.createNewEmptyBindingNode());
        node.accept(new SolvabilitySearchNodeVisitor() {

            @Override
            public void visitUnsolvableSearchNode(
                UnsolvableSearchNode unsolvableSearchNode) {
                fail("Wrong type of solvability node: unsolvable, when expecting solavble");
            }

            @Override
            public void visitNoSolutionSolvableSearchNode(
                NoSolutionSolvableSearchNode noSolutionSolvableSearchNode) {
                fail("Wrong type of solvability node: no solution, when expecting solavble");
            }

            @Override
            public void visitSolvedSearchNode(SolvedSearchNode solvedSearchNode) {
                fail("Wrong type of solvability node: solved, when expecting solavble");
            }

            @Override
            public void visitSolvableSearchNode(SolvableSearchNode solvableSearchNode) {
                // That's fine
            }
        });
    }

    @Test
    public void shouldTestSolvableSubClassAxiomMultipleValues() throws Exception {
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.createOntology();
        OPPLFactory opplFactory = new OPPLFactory(manager, ontology, null);
        ConstraintSystem constraintSystem = opplFactory.createConstraintSystem();
        Variable<OWLClassExpression> x = constraintSystem.createVariable("?x",
            VariableTypeFactory.getCLASSVariableType(), null);
        OWLDataFactory dataFactory = manager.getOWLDataFactory();
        manager.addAxioms(
            ontology,
            new HashSet<OWLAxiom>(Arrays.asList(
                dataFactory.getOWLSubClassOfAxiom(
                    dataFactory.getOWLClass(IRI.create("A")),
                    dataFactory.getOWLClass(IRI.create("A"))),
                dataFactory.getOWLSubClassOfAxiom(
                    dataFactory.getOWLClass(IRI.create("B")),
                    dataFactory.getOWLClass(IRI.create("A"))))));
        OWLSubClassOfAxiom axiom = dataFactory.getOWLSubClassOfAxiom(
            dataFactory.getOWLClass(x.getIRI()),
            dataFactory.getOWLClass(IRI.create("A")));
        OWLClassSubClassOfAxiomSolvability axiomSolvability = new OWLClassSubClassOfAxiomSolvability(
            constraintSystem, new AssertedModelQuerySolver(manager));
        SolvabilitySearchNode node = axiomSolvability.getSolvabilitySearchNode(axiom,
            BindingNode.createNewEmptyBindingNode());
        node.accept(new SolvabilitySearchNodeVisitor() {

            @Override
            public void visitUnsolvableSearchNode(
                UnsolvableSearchNode unsolvableSearchNode) {
                fail("Wrong type of solvability node: unsolvable, when expecting solavble");
            }

            @Override
            public void visitNoSolutionSolvableSearchNode(
                NoSolutionSolvableSearchNode noSolutionSolvableSearchNode) {
                fail("Wrong type of solvability node: no solutions, when expecting solavble");
            }

            @Override
            public void visitSolvedSearchNode(SolvedSearchNode solvedSearchNode) {
                fail("Wrong type of solvability node: solved, when expecting solavble");
            }

            @Override
            public void visitSolvableSearchNode(SolvableSearchNode solvableSearchNode) {
                assertTrue(solvableSearchNode.getValues().size() == 2);
            }
        });
    }

    @Test
    public void shouldTestSolvableSubClassAxiomComplexExpression() throws Exception {
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.createOntology();
        OPPLFactory opplFactory = new OPPLFactory(manager, ontology, null);
        ConstraintSystem constraintSystem = opplFactory.createConstraintSystem();
        Variable<OWLClassExpression> x = constraintSystem.createVariable("?x",
            VariableTypeFactory.getCLASSVariableType(), null);
        OWLDataFactory dataFactory = manager.getOWLDataFactory();
        OWLClass a = dataFactory.getOWLClass(IRI.create("A"));
        OWLObjectProperty p = dataFactory.getOWLObjectProperty(IRI.create("p"));
        manager.addAxiom(
            ontology,
            dataFactory.getOWLSubClassOfAxiom(a,
                dataFactory.getOWLObjectSomeValuesFrom(p, a)));
        OWLSubClassOfAxiom axiom = dataFactory.getOWLSubClassOfAxiom(
            dataFactory.getOWLClass(x.getIRI()),
            dataFactory.getOWLObjectSomeValuesFrom(p, a));
        OWLClassSubClassOfAxiomSolvability axiomSolvability = new OWLClassSubClassOfAxiomSolvability(
            constraintSystem, new AssertedModelQuerySolver(manager));
        SolvabilitySearchNode node = axiomSolvability.getSolvabilitySearchNode(axiom,
            BindingNode.createNewEmptyBindingNode());
        node.accept(new SolvabilitySearchNodeVisitor() {

            @Override
            public void visitUnsolvableSearchNode(
                UnsolvableSearchNode unsolvableSearchNode) {
                fail("Wrong type of solvability node: unsolvable, when expecting solavble");
            }

            @Override
            public void visitNoSolutionSolvableSearchNode(
                NoSolutionSolvableSearchNode noSolutionSolvableSearchNode) {
                fail("Wrong type of solvability node: no solution, when expecting solavble");
            }

            @Override
            public void visitSolvedSearchNode(SolvedSearchNode solvedSearchNode) {
                fail("Wrong type of solvability node: solved, when expecting solavble");
            }

            @Override
            public void visitSolvableSearchNode(SolvableSearchNode solvableSearchNode) {
                // That's fine
            }
        });
    }

    @Test
    public void shouldTestUnSolvableSubClassAxiomComplexExpression() throws Exception {
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.createOntology();
        OPPLFactory opplFactory = new OPPLFactory(manager, ontology, null);
        ConstraintSystem constraintSystem = opplFactory.createConstraintSystem();
        Variable<OWLClassExpression> x = constraintSystem.createVariable("?x",
            VariableTypeFactory.getCLASSVariableType(), null);
        OWLDataFactory dataFactory = manager.getOWLDataFactory();
        OWLClass a = dataFactory.getOWLClass(IRI.create("A"));
        OWLObjectProperty p = dataFactory.getOWLObjectProperty(IRI.create("p"));
        manager.addAxiom(
            ontology,
            dataFactory.getOWLSubClassOfAxiom(a,
                dataFactory.getOWLObjectSomeValuesFrom(p, a)));
        OWLSubClassOfAxiom axiom = dataFactory.getOWLSubClassOfAxiom(
            dataFactory.getOWLObjectIntersectionOf(a,
                dataFactory.getOWLClass(x.getIRI())),
            dataFactory.getOWLObjectSomeValuesFrom(p, a));
        OWLClassSubClassOfAxiomSolvability axiomSolvability = new OWLClassSubClassOfAxiomSolvability(
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
            public void visitNoSolutionSolvableSearchNode(
                NoSolutionSolvableSearchNode noSolutionSolvableSearchNode) {
                fail("Wrong type of solvability node: no solutions, when expecting unsolavble");
            }

            @Override
            public void visitSolvedSearchNode(SolvedSearchNode solvedSearchNode) {
                fail("Wrong type of solvability node: solved, when expecting unsolavble");
            }

            @Override
            public void visitSolvableSearchNode(SolvableSearchNode solvableSearchNode) {
                fail("Wrong type of solvability node: solvable, when expecting unsolavble");
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
        Variable<OWLClassExpression> y = constraintSystem.createVariable("?y",
            VariableTypeFactory.getCLASSVariableType(), null);
        OWLDataFactory dataFactory = manager.getOWLDataFactory();
        manager.addAxiom(
            ontology,
            dataFactory.getOWLSubClassOfAxiom(
                dataFactory.getOWLClass(IRI.create("A")),
                dataFactory.getOWLClass(IRI.create("A"))));
        OWLSubClassOfAxiom axiom = dataFactory.getOWLSubClassOfAxiom(
            dataFactory.getOWLClass(x.getIRI()), dataFactory.getOWLClass(y.getIRI()));
        OWLClassSubClassOfAxiomSolvability axiomSolvability = new OWLClassSubClassOfAxiomSolvability(
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
            public void visitNoSolutionSolvableSearchNode(
                NoSolutionSolvableSearchNode noSolutionSolvableSearchNode) {
                fail("Wrong type of solvability node: no solutions, when expecting unsolavble");
            }

            @Override
            public void visitSolvedSearchNode(SolvedSearchNode solvedSearchNode) {
                fail("Wrong type of solvability node: solved, when expecting unsolavble");
            }

            @Override
            public void visitSolvableSearchNode(SolvableSearchNode solvableSearchNode) {
                fail("Wrong type of solvability node: solvable, when expecting unsolavble");
            }
        });
    }
}
