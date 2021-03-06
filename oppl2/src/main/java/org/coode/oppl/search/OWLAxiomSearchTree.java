package org.coode.oppl.search;

import static org.coode.oppl.utils.ArgCheck.checkNotNull;

import java.util.*;

import org.coode.oppl.PartialOWLObjectInstantiator;
import org.coode.oppl.Variable;
import org.coode.oppl.VariableVisitorEx;
import org.coode.oppl.bindingtree.Assignment;
import org.coode.oppl.bindingtree.BindingNode;
import org.coode.oppl.function.SimpleValueComputationParameters;
import org.coode.oppl.function.ValueComputationParameters;
import org.coode.oppl.generated.GeneratedVariable;
import org.coode.oppl.generated.RegexpGeneratedVariable;
import org.coode.oppl.rendering.ManchesterSyntaxRenderer;
import org.coode.oppl.utils.OWLObjectExtractor;
import org.coode.oppl.utils.VariableExtractor;
import org.coode.oppl.variabletypes.*;
import org.semanticweb.owlapi.model.*;

/**
 * @author Luigi Iannone
 */
public class OWLAxiomSearchTree extends SearchTree<OWLAxiom> {

    private final ValueComputationParameters parameters;

    /**
     * @param parameters
     *        parameters
     */
    public OWLAxiomSearchTree(ValueComputationParameters parameters) {
        this.parameters = checkNotNull(parameters, "parameters");
    }

    /**
     * @return the parameters
     */
    public ValueComputationParameters getParameters() {
        return parameters;
    }

    @Override
    protected List<OWLAxiom> getChildren(OWLAxiom node) {
        Set<BindingNode> leaves = getParameters().getConstraintSystem().getLeaves();
        List<OWLAxiom> toReturn = new ArrayList<>();
        VariableExtractor variableExtractor = new VariableExtractor(getParameters()
            .getConstraintSystem(), false);
        Set<Variable<?>> variables = variableExtractor.extractVariables(node);
        if (!variables.isEmpty()) {
            Variable<?> variable = variables.iterator().next();
            Collection<OWLObject> values = new HashSet<>();
            if (leaves == null) {
                values.addAll(getAssignableValues(variable));
            } else {
                for (BindingNode bindingNode : leaves) {
                    SimpleValueComputationParameters pars = new SimpleValueComputationParameters(
                        getParameters().getConstraintSystem(), bindingNode,
                        getParameters().getRuntimeExceptionHandler());
                    if (bindingNode.containsAssignedVariable(variable)) {
                        values.add(getParameters().getBindingNode().getAssignmentValue(
                            variable, pars));
                    } else {
                        values.addAll(getAssignableValues(variable));
                    }
                }
            }
            for (OWLObject value : values) {
                Assignment assignment = new Assignment(variable, value);
                BindingNode bindingNode = new BindingNode(
                    Collections.singleton(assignment), variables);
                SimpleValueComputationParameters par = new SimpleValueComputationParameters(
                    getParameters().getConstraintSystem(), bindingNode,
                    getParameters().getRuntimeExceptionHandler());
                PartialOWLObjectInstantiator instantiator = new PartialOWLObjectInstantiator(
                    par);
                toReturn.add((OWLAxiom) node.accept(instantiator));
            }
        }
        return toReturn;
    }

    @Override
    protected boolean goalReached(OWLAxiom start) {
        boolean found = false;
        Iterator<OWLOntology> iterator = getParameters().getConstraintSystem()
            .getOntologyManager().getOntologies().iterator();
        while (!found && iterator.hasNext()) {
            OWLOntology ontology = iterator.next();
            found = ontology.containsAxiom(start);
        }
        return found;
    }

    protected Set<OWLClass> getAllClasses() {
        Set<OWLClass> toReturn = new HashSet<>();
        Set<OWLOntology> ontologies = getParameters().getConstraintSystem()
            .getOntologyManager().getOntologies();
        for (OWLOntology owlOntology : ontologies) {
            toReturn.addAll(owlOntology.getClassesInSignature());
        }
        return toReturn;
    }

    protected Set<OWLLiteral> getAllConstants() {
        Set<OWLLiteral> toReturn = new HashSet<>();
        for (OWLOntology ontology : getParameters().getConstraintSystem()
            .getOntologyManager().getOntologies()) {
            for (OWLAxiom axiom : ontology.getAxioms()) {
                toReturn.addAll(OWLObjectExtractor.getAllOWLLiterals(axiom));
            }
        }
        return toReturn;
    }

    protected Set<OWLDataProperty> getAllDataProperties() {
        Set<OWLDataProperty> toReturn = new HashSet<>();
        Set<OWLOntology> ontologies = getParameters().getConstraintSystem()
            .getOntologyManager().getOntologies();
        for (OWLOntology owlOntology : ontologies) {
            toReturn.addAll(owlOntology.getDataPropertiesInSignature());
        }
        return toReturn;
    }

    protected Set<OWLAnnotationProperty> getAllAnnotationProperties() {
        Set<OWLAnnotationProperty> toReturn = new HashSet<>();
        Set<OWLOntology> ontologies = getParameters().getConstraintSystem()
            .getOntologyManager().getOntologies();
        for (OWLOntology owlOntology : ontologies) {
            toReturn.addAll(owlOntology.getAnnotationPropertiesInSignature());
        }
        return toReturn;
    }

    protected Set<OWLNamedIndividual> getAllIndividuals() {
        Set<OWLNamedIndividual> toReturn = new HashSet<>();
        Set<OWLOntology> ontologies = getParameters().getConstraintSystem()
            .getOntologyManager().getOntologies();
        for (OWLOntology owlOntology : ontologies) {
            toReturn.addAll(owlOntology.getIndividualsInSignature());
        }
        return toReturn;
    }

    protected final VariableTypeVisitorEx<Set<? extends OWLObject>> assignableValuesVisitor = new VariableTypeVisitorEx<Set<? extends OWLObject>>() {

        @Override
        public Set<? extends OWLObject> visitCLASSVariableType(
            CLASSVariableType classVariableType) {
            return OWLAxiomSearchTree.this.getAllClasses();
        }

        @Override
        public Set<? extends OWLObject> visitOBJECTPROPERTYVariableType(
            OBJECTPROPERTYVariableType objectpropertyVariableType) {
            return OWLAxiomSearchTree.this.getObjectProperties();
        }

        @Override
        public Set<? extends OWLObject> visitDATAPROPERTYVariableType(
            DATAPROPERTYVariableType datapropertyVariableType) {
            return OWLAxiomSearchTree.this.getAllDataProperties();
        }

        @Override
        public Set<? extends OWLObject> visitANNOTATIONPROPERTYVariableType(
            ANNOTATIONPROPERTYVariableType annotationpropertyVariableType) {
            return OWLAxiomSearchTree.this.getAllAnnotationProperties();
        }

        @Override
        public Set<? extends OWLObject> visitINDIVIDUALVariableType(
            INDIVIDUALVariableType individualVariableType) {
            return OWLAxiomSearchTree.this.getAllIndividuals();
        }

        @Override
        public Set<? extends OWLObject> visitCONSTANTVariableType(
            CONSTANTVariableType constantVariableType) {
            return OWLAxiomSearchTree.this.getAllConstants();
        }
    };

    private Collection<? extends OWLObject> getAssignableValues(Variable<?> variable) {
        Set<OWLObject> toReturn = new HashSet<>();
        VariableVisitorEx<Set<? extends OWLObject>> visitor = new VariableVisitorEx<Set<? extends OWLObject>>() {

            @Override
            public <O extends OWLObject> Set<? extends OWLObject> visit(InputVariable<O> v) {
                return v.getType().accept(assignableValuesVisitor);
            }

            @Override
            public <O extends OWLObject> Set<? extends OWLObject> visit(
                RegexpGeneratedVariable<O> v) {
                Set<? extends OWLObject> result = v.getType().accept(
                    assignableValuesVisitor);
                Iterator<? extends OWLObject> iterator = result.iterator();
                while (iterator.hasNext()) {
                    OWLObject owlObject = iterator.next();
                    ManchesterSyntaxRenderer renderer = OWLAxiomSearchTree.this
                        .getParameters()
                        .getConstraintSystem()
                        .getOPPLFactory()
                        .getManchesterSyntaxRenderer(
                            OWLAxiomSearchTree.this.getParameters()
                                .getConstraintSystem());
                    owlObject.accept(renderer);
                    if (!v.getPatternGeneratingOPPLFunction()
                        .compute(OWLAxiomSearchTree.this.getParameters())
                        .matcher(renderer.toString()).matches()) {
                        iterator.remove();
                    }
                }
                return result;
            }

            @Override
            public <O extends OWLObject> Set<? extends OWLObject> visit(
                GeneratedVariable<O> v) {
                return Collections.emptySet();
            }
        };
        toReturn.addAll(variable.accept(visitor));
        return toReturn;
    }

    protected Set<OWLObjectProperty> getObjectProperties() {
        Set<OWLObjectProperty> toReturn = new HashSet<>();
        Set<OWLOntology> ontologies = getParameters().getConstraintSystem()
            .getOntologyManager().getOntologies();
        for (OWLOntology owlOntology : ontologies) {
            toReturn.addAll(owlOntology.getObjectPropertiesInSignature());
        }
        return toReturn;
    }

    /**
     * @return the assignableValuesVisitor
     */
    public VariableTypeVisitorEx<Set<? extends OWLObject>> getAssignableValuesVisitor() {
        return assignableValuesVisitor;
    }
}
