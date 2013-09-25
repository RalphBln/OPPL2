package org.coode.oppl.function;

import org.coode.oppl.ConstraintSystem;
import org.coode.oppl.PartialOWLObjectInstantiator;
import org.coode.oppl.rendering.ManchesterSyntaxRenderer;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.util.ShortFormProvider;

public class Expression<O extends OWLObject> extends AbstractOPPLFunction<O> implements
        OPPLFunction<O> {
    private final O expression;

    /** @param expression */
    public Expression(O expression) {
        if (expression == null) {
            throw new NullPointerException("The expression cannot be null");
        }
        this.expression = expression;
    }

    @Override
    public void accept(OPPLFunctionVisitor visitor) {
        visitor.visitExpression(this);
    }

    @Override
    public <P> P accept(OPPLFunctionVisitorEx<P> visitor) {
        return visitor.visitExpression(this);
    }

    @Override
    public ValueComputation<O> getValueComputation(
            final ValueComputationParameters parameters) {
        return new ValueComputation<O>() {
            @Override
            @SuppressWarnings("unchecked")
            public O compute(OPPLFunction<? extends O> opplFunction) {
                PartialOWLObjectInstantiator instantiator = new PartialOWLObjectInstantiator(
                        parameters);
                OWLObject instantiation = Expression.this.getExpression().accept(
                        instantiator);
                // I am sure the instantiator will return an object of the same
                // kind.
                return (O) instantiation;
            }
        };
    }

    /** @return the expression */
    public O getExpression() {
        return this.expression;
    }

    @Override
    public String render(ShortFormProvider shortFormProvider) {
        ManchesterSyntaxRenderer renderer = new ManchesterSyntaxRenderer(
                shortFormProvider);
        this.getExpression().accept(renderer);
        return renderer.toString();
    }

    @Override
    public String render(ConstraintSystem constraintSystem) {
        ManchesterSyntaxRenderer renderer = constraintSystem.getOPPLFactory()
                .getManchesterSyntaxRenderer(constraintSystem);
        this.getExpression().accept(renderer);
        return renderer.toString();
    }
}
