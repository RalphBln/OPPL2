package org.coode.parsers.oppl.test;

import static org.junit.Assert.*;

import java.util.Set;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonErrorNode;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.coode.oppl.OPPLFactory;
import org.coode.oppl.Ontologies;
import org.coode.parsers.ErrorListener;
import org.coode.parsers.ManchesterOWLSyntaxSimplify;
import org.coode.parsers.ManchesterOWLSyntaxTree;
import org.coode.parsers.Symbol;
import org.coode.parsers.common.SystemErrorEcho;
import org.coode.parsers.factory.SymbolTableFactory;
import org.coode.parsers.oppl.OPPLDefine;
import org.coode.parsers.oppl.OPPLLexer;
import org.coode.parsers.oppl.OPPLScriptParser;
import org.coode.parsers.oppl.OPPLSymbolTable;
import org.coode.parsers.oppl.OPPLSyntaxTree;
import org.coode.parsers.oppl.factory.SimpleSymbolTableFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** Test for the AST generation for OPPL
 * 
 * @author Luigi Iannone */
public class OPPLScriptDefineParserTest {
    private static TreeAdaptor adaptor = new CommonTreeAdaptor() {
        @Override
        public Object create(Token token) {
            return new OPPLSyntaxTree(token);
        }

        @Override
        public Object dupNode(Object t) {
            if (t == null) {
                return null;
            }
            return this.create(((OPPLSyntaxTree) t).token);
        }

        @Override
        public Object errorNode(TokenStream input, Token start, Token stop,
                RecognitionException e) {
            return new CommonErrorNode(input, start, stop, e);
        }
    };
    private final ErrorListener listener = new SystemErrorEcho();
    private Ontologies ontologies = new Ontologies();
    private SymbolTableFactory<OPPLSymbolTable> SYMBOL_TABLE_FACTORY;

    @Before
    public void setUp() throws Exception {
        SYMBOL_TABLE_FACTORY = new SimpleSymbolTableFactory(ontologies.manager);
        symtab = SYMBOL_TABLE_FACTORY.createSymbolTable();
    }

    private OPPLSymbolTable symtab;

    @Test
    public void testSubClassQuery() {
        String query = "?x:CLASS SELECT ?x subClassOf Thing BEGIN ADD ?x subClassOf Thing END;";
        ManchesterOWLSyntaxTree parsed = parse(query);
        System.out.println(parsed.toStringTree());
        assertNotNull(parsed);
        Set<Symbol> definedSymbols = symtab.getDefinedSymbols();
        assertTrue(definedSymbols.size() == 1);
        System.out.println(definedSymbols);
    }

    @Test
    public void testRegexpQuery() {
        String query = "?x:CLASS = MATCH (\".*ing\") SELECT ?x subClassOf Thing BEGIN ADD ?x subClassOf Thing END;";
        ManchesterOWLSyntaxTree parsed = parse(query);
        System.out.println(parsed.toStringTree());
        assertNotNull(parsed);
        Set<Symbol> definedSymbols = symtab.getDefinedSymbols();
        assertTrue(definedSymbols.size() == 1);
        System.out.println(definedSymbols);
    }

    @Test
    public void testGeneratedVariable() {
        String query = "?x:CLASS, ?y:OBJECTPROPERTY = MATCH(\" has((\\w+)) \"), ?z:CLASS, ?feature:CLASS = create(?y.GROUPS(1)) SELECT ASSERTED ?x subClassOf ?y some ?z BEGIN REMOVE ?x subClassOf ?y some ?z, ADD ?x subClassOf !hasFeature some (?feature and !hasValue some ?z) END;";
        ManchesterOWLSyntaxTree parsed = parse(query);
        System.out.println(parsed.toStringTree());
        assertNotNull(parsed);
        Set<Symbol> definedSymbols = symtab.getDefinedSymbols();
        assertTrue(definedSymbols.size() > 2);
        System.out.println(definedSymbols);
    }

    protected ManchesterOWLSyntaxTree parse(String input) {
        ANTLRStringStream antlrStringStream = new ANTLRStringStream(input);
        OPPLLexer lexer = new OPPLLexer(antlrStringStream);
        final TokenRewriteStream tokens = new TokenRewriteStream(lexer);
        OPPLScriptParser parser = new OPPLScriptParser(tokens);
        parser.setTreeAdaptor(adaptor);
        try {
            RuleReturnScope r = parser.statement();
            CommonTree tree = (CommonTree) r.getTree();
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
            nodes.setTokenStream(tokens); // where to find tokens
            nodes.setTreeAdaptor(adaptor);
            nodes.reset();
            // RESOLVE SYMBOLS, COMPUTE EXPRESSION TYPES
            ManchesterOWLSyntaxSimplify simplify = new ManchesterOWLSyntaxSimplify(nodes);
            simplify.setTreeAdaptor(adaptor);
            simplify.downup(tree);
            nodes.reset();
            OPPLFactory factory = new OPPLFactory(ontologies.manager, ontologies.syntax,
                    null);
            OPPLDefine define = new OPPLDefine(nodes, symtab, listener,
                    factory.createConstraintSystem());
            define.setTreeAdaptor(adaptor);
            define.downup(tree);
            return (ManchesterOWLSyntaxTree) r.getTree();
        } catch (RecognitionException e) {
            e.printStackTrace();
            return null;
        }
    }

    @After
    public void tearDown() throws Exception {
        symtab.dispose();
    }
}
