package org.coode.oppl.queryplanner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.coode.oppl.ConstraintSystem;
import org.coode.oppl.Variable;
import org.coode.oppl.VariableScope;
import org.coode.oppl.bindingtree.BindingNode;
import org.coode.oppl.exceptions.RuntimeExceptionHandler;
import org.coode.oppl.function.SimpleValueComputationParameters;
import org.coode.oppl.function.ValueComputationParameters;
import org.coode.oppl.log.Logging;
import org.coode.oppl.search.AssignableValueExtractor;
import org.coode.oppl.utils.AbstractVariableVisitorExAdapter;
import org.coode.oppl.utils.ConstantCollector;
import org.coode.oppl.utils.VariableExtractor;
import org.coode.oppl.variabletypes.ANNOTATIONPROPERTYVariableType;
import org.coode.oppl.variabletypes.CLASSVariableType;
import org.coode.oppl.variabletypes.CONSTANTVariableType;
import org.coode.oppl.variabletypes.DATAPROPERTYVariableType;
import org.coode.oppl.variabletypes.INDIVIDUALVariableType;
import org.coode.oppl.variabletypes.InputVariable;
import org.coode.oppl.variabletypes.OBJECTPROPERTYVariableType;
import org.coode.oppl.variabletypes.VariableTypeVisitorEx;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLQuantifiedRestriction;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.util.OWLObjectVisitorAdapter;

public class ComplexityEstimate implements QueryPlannerVisitorEx<Float> {
    private final VariableExtractor variableExtractor;
    private final RuntimeExceptionHandler runtimeExceptionHandler;
    private final ConstraintSystem constraintSystem;
    private final VariableTypeVisitorEx<Set<? extends OWLObject>> assignableValuesVisitor = new VariableTypeVisitorEx<Set<? extends OWLObject>>() {
        @Override
        public Set<? extends OWLObject> visitCLASSVariableType(
                CLASSVariableType classVariableType) {
            return allClasses;
        }

        @Override
        public Set<? extends OWLObject> visitOBJECTPROPERTYVariableType(
                OBJECTPROPERTYVariableType objectpropertyVariableType) {
            return allObjectProperties;
        }

        @Override
        public Set<? extends OWLObject> visitDATAPROPERTYVariableType(
                DATAPROPERTYVariableType datapropertyVariableType) {
            return allDataProperties;
        }

        @Override
        public Set<? extends OWLObject> visitINDIVIDUALVariableType(
                INDIVIDUALVariableType individualVariableType) {
            return allIndividuals;
        }

        @Override
        public Set<? extends OWLObject> visitCONSTANTVariableType(
                CONSTANTVariableType constantVariableType) {
            return allConstants;
        }

        @Override
        public Set<? extends OWLObject> visitANNOTATIONPROPERTYVariableType(
                ANNOTATIONPROPERTYVariableType annotationpropertyVariableType) {
            return allAnnotationProperties;
        }
    };
    private final Set<OWLAnnotationProperty> allAnnotationProperties = new HashSet<OWLAnnotationProperty>();
    private final Set<OWLClass> allClasses = new HashSet<OWLClass>();
    private final Set<OWLLiteral> allConstants = new HashSet<OWLLiteral>();
    private final Set<OWLDataProperty> allDataProperties = new HashSet<OWLDataProperty>();
    private final Set<OWLIndividual> allIndividuals = new HashSet<OWLIndividual>();
    private final Set<OWLObjectProperty> allObjectProperties = new HashSet<OWLObjectProperty>();

    public ComplexityEstimate(ConstraintSystem contraintSystem,
            RuntimeExceptionHandler runtimeExceptionHandler) {
        if (contraintSystem == null) {
            throw new NullPointerException("The contraint system cannot be null");
        }
        if (runtimeExceptionHandler == null) {
            throw new NullPointerException("The runtime Exception Handler cannot be null");
        }
        constraintSystem = contraintSystem;
        variableExtractor = new VariableExtractor(contraintSystem, false);
        this.runtimeExceptionHandler = runtimeExceptionHandler;
        initAssignableValues();
    }

    @Override
    public Float visitConstraintQueryPlannerItem(
            ConstraintQueryPlannerItem constraintQueryPlannerItem) {
        // Constraints do not require computing oll the possible permutations of
        // values as variables are always resolved before getting to constraint
        // evaluation
        return 0f;
    }

    @Override
    public Float visitAssertedAxiomPlannerItem(
            AssertedAxiomPlannerItem assertedAxiomPlannerItem) {
        return computeAxiomComplexity(assertedAxiomPlannerItem.getAxiom());
    }

    private float computeAxiomComplexity(OWLAxiom axiom) {
        Set<Variable<?>> variables = variableExtractor.extractVariables(axiom);
        long toReturn = 1;
        ValueComputationParameters parameters = new SimpleValueComputationParameters(
                getConstraintSystem(), BindingNode.createNewEmptyBindingNode(),
                getRuntimeExceptionHandler());
        for (Variable<?> variable : variables) {
            toReturn *= getAssignableValues(variable, parameters).size();
        }
        return toReturn;
    }

    private Set<OWLObject> getAssignableValues(Variable<?> variable,
            ValueComputationParameters parameters) {
        Set<OWLObject> toReturn = new HashSet<OWLObject>();
        toReturn.addAll(variable.accept(new AssignableValueExtractor(
                assignableValuesVisitor, parameters)));
        Iterator<OWLObject> iterator = toReturn.iterator();
        while (iterator.hasNext()) {
            final OWLObject owlObject = iterator.next();
            boolean inScope = variable
                    .accept(new AbstractVariableVisitorExAdapter<Boolean>(true) {
                        @Override
                        public <P extends OWLObject> Boolean visit(InputVariable<P> v) {
                            VariableScope<?> variableScope = v.getVariableScope();
                            try {
                                return variableScope == null
                                        || variableScope.check(owlObject);
                            } catch (OWLRuntimeException e) {
                                ComplexityEstimate.this.getRuntimeExceptionHandler()
                                        .handleOWLRuntimeException(e);
                                return false;
                            }
                        }
                    });
            if (!inScope) {
                iterator.remove();
            }
        }
        return toReturn;
    }

    @Override
    public Float visitInferredAxiomQueryPlannerItem(
            InferredAxiomQueryPlannerItem inferredAxiomQueryPlannerItem) {
        return computeAxiomComplexity(inferredAxiomQueryPlannerItem.getAxiom());
    }

    /** @return the variableExtractor */
    protected VariableExtractor getVariableExtractor() {
        return variableExtractor;
    }

    /** @return the runtimeExceptionHandler */
    public RuntimeExceptionHandler getRuntimeExceptionHandler() {
        return runtimeExceptionHandler;
    }

    private Set<OWLAnnotationProperty> getAllAnnotationProperties() {
        Set<OWLAnnotationProperty> toReturn = new HashSet<OWLAnnotationProperty>();
        for (OWLOntology ontology : getConstraintSystem().getOntologyManager()
                .getOntologies()) {
            toReturn.addAll(ontology.getAnnotationPropertiesInSignature());
        }
        return toReturn;
    }

    private Collection<OWLClass> getAllClasses() {
        Set<OWLClass> toReturn = new HashSet<OWLClass>();
        for (OWLOntology owlOntology : getConstraintSystem().getOntologyManager()
                .getOntologies()) {
            toReturn.addAll(owlOntology.getClassesInSignature());
        }
        return toReturn;
    }

    private Collection<OWLLiteral> getAllConstants() {
        final Set<OWLLiteral> toReturn = new HashSet<OWLLiteral>();
        final OWLObjectVisitorAdapter constantExtractor = new OWLObjectVisitorAdapter() {
            protected void visitOWLQuantifiedRestriction(
                    OWLQuantifiedRestriction<?, ?, ?> restriction) {
                if (restriction.getFiller() != null) {
                    restriction.getFiller().accept(this);
                }
            }

            @Override
            public void visit(OWLDataMaxCardinality desc) {
                visitOWLQuantifiedRestriction(desc);
            }

            @Override
            public void visit(OWLDataExactCardinality desc) {
                visitOWLQuantifiedRestriction(desc);
            }

            @Override
            public void visit(OWLDataMinCardinality desc) {
                visitOWLQuantifiedRestriction(desc);
            }

            @Override
            public void visit(OWLDataAllValuesFrom desc) {
                visitOWLQuantifiedRestriction(desc);
            }

            @Override
            public void visit(OWLDataSomeValuesFrom desc) {
                visitOWLQuantifiedRestriction(desc);
            }

            @Override
            public void visit(OWLObjectOneOf desc) {}

            @Override
            public void visit(OWLObjectHasSelf desc) {}

            @Override
            public void visit(OWLObjectMaxCardinality desc) {
                visitOWLQuantifiedRestriction(desc);
            }

            @Override
            public void visit(OWLObjectExactCardinality desc) {
                visitOWLQuantifiedRestriction(desc);
            }

            @Override
            public void visit(OWLObjectMinCardinality desc) {
                visitOWLQuantifiedRestriction(desc);
            }

            @Override
            public void visit(OWLObjectHasValue desc) {}

            @Override
            public void visit(OWLObjectAllValuesFrom desc) {
                visitOWLQuantifiedRestriction(desc);
            }

            @Override
            public void visit(OWLDataHasValue desc) {
                toReturn.add(desc.getValue());
            }

            @Override
            public void visit(OWLObjectSomeValuesFrom desc) {
                visitOWLQuantifiedRestriction(desc);
            }

            @Override
            public void visit(OWLObjectComplementOf desc) {
                desc.getOperand().accept(this);
            }

            protected void visitOWLObjectCollection(
                    Collection<? extends OWLObject> collection) {
                for (OWLObject owlObject : collection) {
                    owlObject.accept(this);
                }
            }

            @Override
            public void visit(OWLObjectUnionOf desc) {
                visitOWLObjectCollection(desc.getOperands());
            }

            @Override
            public void visit(OWLObjectIntersectionOf desc) {
                visitOWLObjectCollection(desc.getOperands());
            }
        };
        ConstantCollector visitor = new ConstantCollector(toReturn, constantExtractor);
        for (OWLOntology owlOntology : getConstraintSystem().getOntologyManager()
                .getOntologies()) {
            for (OWLAxiom axiomToVisit : owlOntology.getAxioms()) {
                axiomToVisit.accept(visitor);
            }
        }
        return toReturn;
    }

    private Collection<OWLDataProperty> getAllDataProperties() {
        Set<OWLDataProperty> toReturn = new HashSet<OWLDataProperty>();
        for (OWLOntology owlOntology : getConstraintSystem().getOntologyManager()
                .getOntologies()) {
            toReturn.addAll(owlOntology.getDataPropertiesInSignature());
        }
        return toReturn;
    }

    private Collection<OWLIndividual> getAllIndividuals() {
        Set<OWLIndividual> toReturn = new HashSet<OWLIndividual>();
        for (OWLOntology owlOntology : getConstraintSystem().getOntologyManager()
                .getOntologies()) {
            toReturn.addAll(owlOntology.getIndividualsInSignature());
        }
        return toReturn;
    }

    private Collection<OWLObjectProperty> getAllObjectProperties() {
        Set<OWLObjectProperty> toReturn = new HashSet<OWLObjectProperty>();
        for (OWLOntology owlOntology : getConstraintSystem().getOntologyManager()
                .getOntologies()) {
            toReturn.addAll(owlOntology.getObjectPropertiesInSignature());
        }
        return toReturn;
    }

    private void initAssignableValues() {
        allClasses.addAll(getAllClasses());
        Logging.getQueryLogger().fine("Possible class values ", allClasses.size());
        allDataProperties.addAll(getAllDataProperties());
        Logging.getQueryLogger().fine("Possible data property values ",
                allDataProperties.size());
        allObjectProperties.addAll(getAllObjectProperties());
        Logging.getQueryLogger().fine("Possible object property values ",
                allObjectProperties.size());
        allIndividuals.addAll(getAllIndividuals());
        Logging.getQueryLogger().fine("Possible individual  values ",
                allIndividuals.size());
        allConstants.addAll(getAllConstants());
        Logging.getQueryLogger().fine("Possible constant  values ", allConstants.size());
        allAnnotationProperties.addAll(getAllAnnotationProperties());
        Logging.getQueryLogger().fine("Possible annotation properties values ",
                allAnnotationProperties.size());
    }

    /** @return the constraintSystem */
    public ConstraintSystem getConstraintSystem() {
        return constraintSystem;
    }
}