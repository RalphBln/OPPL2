package org.coode.parsers.oppl.variableattribute;

import org.coode.oppl.variablemansyntax.generated.AbstractCollectionGeneratedValue;
import org.coode.parsers.oppl.OPPLSymbolVisitor;
import org.coode.parsers.oppl.OPPLSymbolVisitorEx;

public class CollectionVariableAttributeSymbol<O> extends
		VariableAttributeSymbol<AbstractCollectionGeneratedValue<O>> {
	/**
	 * @param name
	 * @param type
	 * @param factory
	 */
	public CollectionVariableAttributeSymbol(String name,
			AttributeFactory<AbstractCollectionGeneratedValue<O>> factory) {
		super(name, VariableAttributeType.COLLECTION, factory);
	}

	/**
	 * @see org.coode.parsers.oppl.OPPLSymbol#accept(org.coode.parsers.oppl.
	 *      OPPLSymbolVisitor)
	 */
	public void accept(OPPLSymbolVisitor visitor) {
		visitor.visitCollectionVariableAttributeSymbol(this);
	}

	/**
	 * @see org.coode.parsers.oppl.OPPLSymbol#accept(org.coode.parsers.oppl.
	 *      OPPLSymbolVisitorEx)
	 */
	public <N> N accept(OPPLSymbolVisitorEx<N> visitor) {
		return visitor.visitCollectionVariableAttributeSymbol(this);
	}
}