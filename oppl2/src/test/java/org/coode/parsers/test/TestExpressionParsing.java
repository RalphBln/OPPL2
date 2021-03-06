package org.coode.parsers.test;

import static org.coode.oppl.testontologies.TestOntologies.pizza;
import static org.coode.parsers.oppl.test.SymbolTables.getOPPLSymbolTable;
import static org.junit.Assert.assertNotNull;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonErrorNode;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.coode.parsers.*;
import org.coode.parsers.common.SilentListener;
import org.coode.parsers.oppl.OPPLSymbolTable;
import org.junit.Test;

/**
 * @author Luigi Iannone
 */
@SuppressWarnings("javadoc")
public class TestExpressionParsing {

    public TreeAdaptor adaptor = new CommonTreeAdaptor() {

        @Override
        public Object create(Token token) {
            return new ManchesterOWLSyntaxTree(token);
        }

        @Override
        public Object dupNode(Object t) {
            if (t == null) {
                return null;
            }
            return this.create(((ManchesterOWLSyntaxTree) t).token);
        }

        @Override
        public Object errorNode(TokenStream input, Token start, Token stop,
            RecognitionException e) {
            return new CommonErrorNode(input, start, stop, e);
        }
    };
    private final ErrorListener errorListener = new SilentListener();

    protected ManchesterOWLSyntaxTree parse(String input) {
        MOWLLexer lexer = new MOWLLexer(new ANTLRStringStream(input));
        final TokenRewriteStream tokens = new TokenRewriteStream(lexer);
        ManchesterOWLSyntaxParser parser = new ManchesterOWLSyntaxParser(tokens,
            errorListener);
        parser.setTreeAdaptor(adaptor);
        try {
            RuleReturnScope r = parser.expression();
            CommonTree tree = (CommonTree) r.getTree();
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
            nodes.setTokenStream(tokens); // where to find tokens
            nodes.setTreeAdaptor(adaptor);
            OPPLSymbolTable symtab = getOPPLSymbolTable(pizza);
            symtab.setErrorListener(errorListener);
            ManchesterOWLSyntaxSimplify simplify = new ManchesterOWLSyntaxSimplify(nodes);
            simplify.setTreeAdaptor(adaptor);
            tree = (CommonTree) simplify.downup(tree);
            nodes.reset();
            ManchesterOWLSyntaxTypes types = new ManchesterOWLSyntaxTypes(nodes, symtab,
                errorListener);
            types.downup(tree);
            return (ManchesterOWLSyntaxTree) tree;
        } catch (RecognitionException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void shouldTestOWLClass() {
        ManchesterOWLSyntaxTree parsed = parse("Pizza");
        assertNotNull(parsed);
    }

    @Test
    public void shouldTestOWLClassDescription() {
        ManchesterOWLSyntaxTree parsed = parse("Pizza and Pizza");
        assertNotNull(parsed);
    }

    @Test
    public void shouldTestEntityReference() {
        ManchesterOWLSyntaxTree parsed = parse("'Pizza (the italian)'");
        assertNotNull(parsed);
    }

    @Test
    public void shouldTestRestriction() {
        ManchesterOWLSyntaxTree parsed = parse("Pizza and hasTopping some (Thing and hasTopping some Thing) and Thing");
        assertNotNull(parsed);
    }

    @Test
    public void shouldTestEscapeIdentifiersAsEntityReferences() {
        ManchesterOWLSyntaxTree parsed = parse("Pizza and 'hasTopping' some Thing");
        assertNotNull(parsed);
    }

    @Test
    public void shouldTestDataRange() {
        ManchesterOWLSyntaxTree parsed = parse("int [ > \"1\"]");
        assertNotNull(parsed);
    }

    @Test
    public void shouldTestComplexDataRange() {
        ManchesterOWLSyntaxTree parsed = parse("float[ > \"1\", > \"2\"]");
        assertNotNull(parsed);
    }

    @Test
    public void shouldTestDataRestriction() {
        ManchesterOWLSyntaxTree parsed = parse("hasKCal some float[ > \"1\", > \"2\"]");
        assertNotNull(parsed);
    }

    @Test
    public void shouldTestDataIntersectionOf() {
        ManchesterOWLSyntaxTree parsed = parse("float[ > \"1\"] and int [< \"1\"]");
        assertNotNull(parsed);
    }
}
