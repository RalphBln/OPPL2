package org.coode.oppl.function;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.coode.oppl.ConstraintSystem;
import org.coode.oppl.function.inline.InlineSet;
import org.coode.oppl.variabletypes.ANNOTATIONPROPERTYVariableType;
import org.coode.oppl.variabletypes.CLASSVariableType;
import org.coode.oppl.variabletypes.CONSTANTVariableType;
import org.coode.oppl.variabletypes.DATAPROPERTYVariableType;
import org.coode.oppl.variabletypes.INDIVIDUALVariableType;
import org.coode.oppl.variabletypes.OBJECTPROPERTYVariableType;
import org.coode.oppl.variabletypes.VariableType;
import org.coode.oppl.variabletypes.VariableTypeVisitorEx;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.util.ShortFormProvider;

public class Adapter {
    public static <O> OPPLFunction<O> buildObjectAdater(O value) {
        if (value == null) {
            throw new NullPointerException("The value cannot be null");
        }
        return new Constant<O>(value);
    }

    public static <O extends OWLObject> Set<Aggregandum<Collection<? extends O>>>
            buildOWLObjectCollectionAdapter(Collection<? extends O> collection) {
        if (collection == null) {
            throw new NullPointerException("The collection cannot be null");
        }
        Set<Aggregandum<Collection<? extends O>>> toReturn = new HashSet<Aggregandum<Collection<? extends O>>>();
        for (O o : collection) {
            toReturn.add(buildAggregandumOfCollection(o));
        }
        return toReturn;
    }

    public static <I> Aggregandum<I> buildSingletonAggregandum(
            final OPPLFunction<I> singleton) {
        if (singleton == null) {
            throw new NullPointerException("The OPPL function cannot be null");
        }
        return new Aggregandum<I>() {
            @Override
            public Set<OPPLFunction<I>> getOPPLFunctions() {
                return Collections.<OPPLFunction<I>> singleton(singleton);
            }

            @Override
            public boolean isCompatible(VariableType<?> variableType) {
                return Adapter.isCompatible(this, variableType);
            }

            @Override
            public String render(ConstraintSystem constraintSystem) {
                return Adapter.renderAggregandum(this, constraintSystem);
            }

            @Override
            public String render(ShortFormProvider shortFormProvider) {
                return Adapter.renderAggregandum(this, shortFormProvider);
            }
        };
    }

    public static <I> Aggregandum<Collection<? extends I>> buildAggregandumOfCollection(
            I singleton) {
        if (singleton == null) {
            throw new NullPointerException("The OPPL function cannot be null");
        }
        final OPPLFunction<I> adapted = buildObjectAdater(singleton);
        return new Aggregandum<Collection<? extends I>>() {
            @Override
            public Set<OPPLFunction<Collection<? extends I>>> getOPPLFunctions() {
                OPPLFunction<Collection<? extends I>> singleton = new OPPLFunction<Collection<? extends I>>() {
                    @Override
                    public Collection<? extends I> compute(
                            ValueComputationParameters params) {
                        I value = adapted.compute(params);
                        return Collections.singleton(value);
                    }

                    @Override
                    public <P> P accept(OPPLFunctionVisitorEx<P> visitor) {
                        return adapted.accept(visitor);
                    }

                    @Override
                    public void accept(OPPLFunctionVisitor visitor) {
                        adapted.accept(visitor);
                    }

                    @Override
                    public String render(ConstraintSystem constraintSystem) {
                        return adapted.render(constraintSystem);
                    }

                    @Override
                    public String render(ShortFormProvider shortFormProvider) {
                        return adapted.render(shortFormProvider);
                    }
                };
                return Collections.singleton(singleton);
            }

            @Override
            public boolean isCompatible(VariableType<?> variableType) {
                return Adapter.isCompatible(this, variableType);
            }

            @Override
            public String render(ConstraintSystem constraintSystem) {
                return renderAggregandum(this, constraintSystem);
            }

            @Override
            public String render(ShortFormProvider shortFormProvider) {
                return renderAggregandum(this, shortFormProvider);
            }
        };
    }

    public static <I> Aggregandum<I> buildAggregandumCollection(
            final Collection<? extends OPPLFunction<I>> collection) {
        return new Aggregandum<I>() {
            @Override
            public Set<OPPLFunction<I>> getOPPLFunctions() {
                return new HashSet<OPPLFunction<I>>(collection);
            }

            @Override
            public boolean isCompatible(VariableType<?> variableType) {
                return Adapter.isCompatible(this, variableType);
            }

            @Override
            public String render(ConstraintSystem constraintSystem) {
                return Adapter.renderAggregandum(this, constraintSystem);
            }

            @Override
            public String render(ShortFormProvider shortFormProvider) {
                return renderAggregandum(this, shortFormProvider);
            }
        };
    }

    public static OPPLFunction<Pattern> buildRegexpPatternAdapter(
            final OPPLFunction<String> stringOPPLFunction) {
        return new OPPLFunction<Pattern>() {
            @Override
            public String render(ConstraintSystem constraintSystem) {
                return stringOPPLFunction.render(constraintSystem);
            }

            @Override
            public String render(ShortFormProvider shortFormProvider) {
                return stringOPPLFunction.render(shortFormProvider);
            }

            @Override
            public Pattern compute(ValueComputationParameters params) {
                String string = stringOPPLFunction.compute(params);
                Pattern pattern = null;
                try {
                    pattern = Pattern.compile(string);
                } catch (PatternSyntaxException e) {
                    params.getRuntimeExceptionHandler().handlePatternSyntaxExcpetion(e);
                }
                return pattern;
            }

            @Override
            public void accept(OPPLFunctionVisitor visitor) {
                stringOPPLFunction.accept(visitor);
            }

            @Override
            public <P> P accept(OPPLFunctionVisitorEx<P> visitor) {
                return stringOPPLFunction.accept(visitor);
            }
        };
    }

    protected static <I> boolean isCompatible(Aggregandum<I> aggregandum,
            final VariableType<?> type) {
        boolean isCompatible = true;
        Iterator<OPPLFunction<I>> iterator = aggregandum.getOPPLFunctions().iterator();
        while (isCompatible && iterator.hasNext()) {
            OPPLFunction<I> opplFunction = iterator.next();
            isCompatible = opplFunction.accept(new OPPLFunctionVisitorEx<Boolean>() {
                @Override
                public <O, T> Boolean visitAggregation(Aggregation<O, T> aggregation) {
                    boolean isCompatible = true;
                    Iterator<Aggregandum<T>> it = aggregation.getToAggreagte().iterator();
                    while (it.hasNext()) {
                        Aggregandum<T> aggregandum = it.next();
                        isCompatible = Adapter.isCompatible(aggregandum, type);
                    }
                    return isCompatible;
                }

                @Override
                public <O extends OWLObject> Boolean
                        visitInlineSet(InlineSet<O> inlineSet) {
                    boolean isCompatible = true;
                    Iterator<Aggregandum<Collection<? extends O>>> it = inlineSet
                            .getAggregandums().iterator();
                    while (it.hasNext()) {
                        Aggregandum<Collection<? extends O>> aggregandum = it.next();
                        isCompatible = Adapter.isCompatible(aggregandum, type);
                    }
                    return isCompatible;
                }

                @Override
                public <P extends OWLObject> Boolean visitGenericOPPLFunction(
                        OPPLFunction<P> opplFunction) {
                    return false;
                }

                @Override
                public <O> Boolean visitConstant(Constant<O> constant) {
                    final O value = constant.getValue();
                    return type.accept(new VariableTypeVisitorEx<Boolean>() {
                        @Override
                        public Boolean visitCLASSVariableType(
                                CLASSVariableType classVariableType) {
                            return value instanceof OWLClassExpression;
                        }

                        @Override
                        public Boolean visitOBJECTPROPERTYVariableType(
                                OBJECTPROPERTYVariableType objectpropertyVariableType) {
                            return value instanceof OWLObjectPropertyExpression;
                        }

                        @Override
                        public Boolean visitDATAPROPERTYVariableType(
                                DATAPROPERTYVariableType datapropertyVariableType) {
                            return value instanceof OWLDataPropertyExpression;
                        }

                        @Override
                        public Boolean visitINDIVIDUALVariableType(
                                INDIVIDUALVariableType individualVariableType) {
                            return value instanceof OWLIndividual;
                        }

                        @Override
                        public Boolean visitCONSTANTVariableType(
                                CONSTANTVariableType constantVariableType) {
                            return value instanceof OWLLiteral;
                        }

                        @Override
                        public
                                Boolean
                                visitANNOTATIONPROPERTYVariableType(
                                        ANNOTATIONPROPERTYVariableType annotationpropertyVariableType) {
                            return value instanceof OWLAnnotationProperty;
                        }
                    });
                }

                @Override
                public <O extends OWLObject> Boolean visitValuesVariableAtttribute(
                        ValuesVariableAtttribute<O> valuesVariableAtttribute) {
                    return valuesVariableAtttribute.getVariable().getType() == type;
                }

                @Override
                public Boolean visitRenderingVariableAttribute(
                        RenderingVariableAttribute renderingVariableAttribute) {
                    return false;
                }

                @Override
                public <O extends OWLObject> Boolean visitGroupVariableAttribute(
                        GroupVariableAttribute<O> groupVariableAttribute) {
                    return false;
                }

                @Override
                public <O extends OWLObject> Boolean visitExpression(
                        Expression<O> expression) {
                    return type.isCompatibleWith(expression.getExpression());
                }

                @Override
                public <O, T extends OPPLFunction<?>> Boolean visitCreate(
                        Create<T, O> create) {
                    return create.isCompatible(type);
                }

                @Override
                public Boolean visitIRIVariableAttribute(
                        IRIVariableAttribute iriVariableAttribute) {
                    return false;
                }

                @Override
                public
                        Boolean
                        visitToLowerCaseStringManipulationOPPLFunction(
                                ToLowerCaseStringManipulationOPPLFunction toLowerCaseStringManipulationOPPLFunction) {
                    return false;
                }

                @Override
                public
                        Boolean
                        visitToUpperCaseStringManipulationOPPLFunction(
                                ToUpperCaseStringManipulationOPPLFunction upperCaseStringManipulationOPPLFunction) {
                    return false;
                }
            });
        }
        return isCompatible;
    }

    protected static <I> String renderAggregandum(Aggregandum<I> aggregandum,
            ConstraintSystem constraintSystem) {
        StringBuilder builder = new StringBuilder();
        Iterator<OPPLFunction<I>> iterator = aggregandum.getOPPLFunctions().iterator();
        while (iterator.hasNext()) {
            OPPLFunction<I> opplFunction = iterator.next();
            builder.append(String.format("%s%s", opplFunction.render(constraintSystem),
                    iterator.hasNext() ? ", " : ""));
        }
        return builder.toString();
    }

    private static <I> String renderAggregandum(Aggregandum<I> aggregandum,
            ShortFormProvider shortFormProvider) {
        StringBuilder builder = new StringBuilder();
        Iterator<OPPLFunction<I>> iterator = aggregandum.getOPPLFunctions().iterator();
        while (iterator.hasNext()) {
            OPPLFunction<I> opplFunction = iterator.next();
            builder.append(String.format("%s%s", opplFunction.render(shortFormProvider),
                    iterator.hasNext() ? ", " : ""));
        }
        return builder.toString();
    }
}
