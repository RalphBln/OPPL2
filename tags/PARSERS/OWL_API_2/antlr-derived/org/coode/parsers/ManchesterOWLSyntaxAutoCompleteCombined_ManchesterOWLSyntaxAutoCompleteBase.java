// $ANTLR 3.2 Sep 23, 2009 12:02:23 ManchesterOWLSyntaxAutoCompleteBase.g 2010-04-29 11:19:43

  package org.coode.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase extends Parser {
    public static final int VALUE_RESTRICTION=61;
    public static final int LETTER=43;
    public static final int INCOMPLETE_INVERSE_OF=81;
    public static final int TYPES=39;
    public static final int SAME_AS_AXIOM=50;
    public static final int INVERSE_OF=25;
    public static final int NOT=12;
    public static final int SUBCLASS_OF=20;
    public static final int EOF=-1;
    public static final int INCOMPLETE_ONE_OF=90;
    public static final int POW=36;
    public static final int INCOMPLETE_INVERSE_OBJECT_PROPERTY_EXPRESSION=85;
    public static final int INVERSE_OBJECT_PROPERTY_EXPRESSION=66;
    public static final int INSTANCE_OF=38;
    public static final int INCOMPLETE_TYPE_ASSERTION=70;
    public static final int SYMMETRIC=30;
    public static final int INCOMPLETE_DIFFERENT_FROM_AXIOM=78;
    public static final int INCOMPLETE_NEGATED_EXPRESSION=86;
    public static final int INCOMPLETE_SUB_PROPERTY_AXIOM=76;
    public static final int CARDINALITY_RESTRICTION=62;
    public static final int ROLE_ASSERTION=65;
    public static final int DIFFERENT_FROM_AXIOM=51;
    public static final int INCOMPLETE_SUB_CLASS_AXIOM=73;
    public static final int INCOMPLETE_ALL_RESTRICTION=88;
    public static final int TRANSITIVE=34;
    public static final int ANTI_SYMMETRIC=31;
    public static final int ALL_RESTRICTION=60;
    public static final int CONJUNCTION=54;
    public static final int NEGATED_ASSERTION=57;
    public static final int WHITESPACE=9;
    public static final int VALUE=18;
    public static final int OPEN_CURLY_BRACES=6;
    public static final int DISJUNCTION=53;
    public static final int INVERSE=19;
    public static final int INCOMPLETE_ROLE_ASSERTION=71;
    public static final int INCOMPLETE_SOME_RESTRICTION=87;
    public static final int DBLQUOTE=40;
    public static final int OR=11;
    public static final int CONSTANT=68;
    public static final int INCOMPLETE_EXPRESSION=92;
    public static final int ENTITY_REFERENCE=45;
    public static final int COMPOSITION=4;
    public static final int INCOMPLETE_DISJOINT_WITH_AXIOM=75;
    public static final int INCOMPLETE_VALUE_RESTRICTION=91;
    public static final int SAME_AS=23;
    public static final int INCOMPLETE_CONJUNCTION=84;
    public static final int DISJOINT_WITH=26;
    public static final int CLOSED_PARENTHESYS=8;
    public static final int ONLY=14;
    public static final int EQUIVALENT_TO_AXIOM=47;
    public static final int INCOMPLETE_EQUIVALENT_TO_AXIOM=74;
    public static final int SUB_PROPERTY_OF=21;
    public static final int NEGATED_EXPRESSION=56;
    public static final int MAX=16;
    public static final int AND=10;
    public static final int INVERSE_PROPERTY=58;
    public static final int DIFFERENT_FROM=24;
    public static final int EQUIVALENT_TO=22;
    public static final int UNARY_AXIOM=52;
    public static final int COMMA=37;
    public static final int CLOSED_CURLY_BRACES=7;
    public static final int INCOMPLETE_CARDINALITY_RESTRICTION=89;
    public static final int IDENTIFIER=44;
    public static final int SOME=13;
    public static final int OPEN_PARENTHESYS=5;
    public static final int REFLEXIVE=32;
    public static final int DIGIT=41;
    public static final int EXPRESSION=67;
    public static final int SOME_RESTRICTION=59;
    public static final int INTEGER=42;
    public static final int INCOMPLETE_DISJUNCTION=83;
    public static final int INCOMPLETE_SAME_AS_AXIOM=77;
    public static final int INCOMPLETE_RANGE=80;
    public static final int EXACTLY=17;
    public static final int SUB_PROPERTY_AXIOM=49;
    public static final int RANGE=28;
    public static final int ONE_OF=63;
    public static final int MIN=15;
    public static final int SUB_CLASS_AXIOM=46;
    public static final int DOMAIN=27;
    public static final int DISJOINT_WITH_AXIOM=48;
    public static final int STANDALONE_EXPRESSION=69;
    public static final int INVERSE_FUNCTIONAL=35;
    public static final int IRREFLEXIVE=33;
    public static final int INCOMPLETE_PROPERTY_CHAIN=82;
    public static final int FUNCTIONAL=29;
    public static final int PROPERTY_CHAIN=55;
    public static final int INCOMPLETE_DOMAIN=79;
    public static final int INCOMPLETE_UNARY_AXIOM=72;
    public static final int TYPE_ASSERTION=64;

    // delegates
    public ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser gMOWLParser;
    // delegators
    public ManchesterOWLSyntaxAutoCompleteCombinedParser gManchesterOWLSyntaxAutoCompleteCombined;
    public ManchesterOWLSyntaxAutoCompleteCombinedParser gParent;


        public ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase(TokenStream input, ManchesterOWLSyntaxAutoCompleteCombinedParser gManchesterOWLSyntaxAutoCompleteCombined) {
            this(input, new RecognizerSharedState(), gManchesterOWLSyntaxAutoCompleteCombined);
        }
        public ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase(TokenStream input, RecognizerSharedState state, ManchesterOWLSyntaxAutoCompleteCombinedParser gManchesterOWLSyntaxAutoCompleteCombined) {
            super(input, state);
            this.gManchesterOWLSyntaxAutoCompleteCombined = gManchesterOWLSyntaxAutoCompleteCombined;
            gMOWLParser = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser(input, state, gManchesterOWLSyntaxAutoCompleteCombined, this);         
            gParent = gManchesterOWLSyntaxAutoCompleteCombined;
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
        gMOWLParser.setTreeAdaptor(this.adaptor);
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ManchesterOWLSyntaxAutoCompleteCombinedParser.tokenNames; }
    public String getGrammarFileName() { return "ManchesterOWLSyntaxAutoCompleteBase.g"; }


    public static class standaloneExpression_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "standaloneExpression"
    // ManchesterOWLSyntaxAutoCompleteBase.g:49:1: standaloneExpression : expression EOF -> ^( STANDALONE_EXPRESSION ^( EXPRESSION expression ) ) ;
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.standaloneExpression_return standaloneExpression() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.standaloneExpression_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.standaloneExpression_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        Token EOF2=null;
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.expression_return expression1 = null;


        ManchesterOWLSyntaxTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:49:23: ( expression EOF -> ^( STANDALONE_EXPRESSION ^( EXPRESSION expression ) ) )
            // ManchesterOWLSyntaxAutoCompleteBase.g:50:5: expression EOF
            {
            pushFollow(FOLLOW_expression_in_standaloneExpression200);
            expression1=gManchesterOWLSyntaxAutoCompleteCombined.expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_standaloneExpression202); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF2);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
            // 50:20: -> ^( STANDALONE_EXPRESSION ^( EXPRESSION expression ) )
            {
                // ManchesterOWLSyntaxAutoCompleteBase.g:50:22: ^( STANDALONE_EXPRESSION ^( EXPRESSION expression ) )
                {
                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(STANDALONE_EXPRESSION, "STANDALONE_EXPRESSION"), root_1);

                // ManchesterOWLSyntaxAutoCompleteBase.g:50:46: ^( EXPRESSION expression )
                {
                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "standaloneExpression"

    public static class incompleteAxiom_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incompleteAxiom"
    // ManchesterOWLSyntaxAutoCompleteBase.g:53:1: incompleteAxiom : ( incompleteBinaryAxiom -> ^( incompleteBinaryAxiom ) | incompleteUnaryAxiom -> ^( incompleteUnaryAxiom ) | incompleteAssertionAxiom -> ^( incompleteAssertionAxiom ) );
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteAxiom_return incompleteAxiom() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteAxiom_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteAxiom_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteBinaryAxiom_return incompleteBinaryAxiom3 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteUnaryAxiom_return incompleteUnaryAxiom4 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteAssertionAxiom_return incompleteAssertionAxiom5 = null;


        RewriteRuleSubtreeStream stream_incompleteAssertionAxiom=new RewriteRuleSubtreeStream(adaptor,"rule incompleteAssertionAxiom");
        RewriteRuleSubtreeStream stream_incompleteUnaryAxiom=new RewriteRuleSubtreeStream(adaptor,"rule incompleteUnaryAxiom");
        RewriteRuleSubtreeStream stream_incompleteBinaryAxiom=new RewriteRuleSubtreeStream(adaptor,"rule incompleteBinaryAxiom");
        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:53:17: ( incompleteBinaryAxiom -> ^( incompleteBinaryAxiom ) | incompleteUnaryAxiom -> ^( incompleteUnaryAxiom ) | incompleteAssertionAxiom -> ^( incompleteAssertionAxiom ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==COMPOSITION||(LA1_1>=AND && LA1_1<=OR)||(LA1_1>=SOME && LA1_1<=VALUE)||(LA1_1>=SUBCLASS_OF && LA1_1<=RANGE)) ) {
                    alt1=1;
                }
                else if ( ((LA1_1>=INSTANCE_OF && LA1_1<=TYPES)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case OPEN_CURLY_BRACES:
            case NOT:
            case INVERSE:
            case DBLQUOTE:
            case ENTITY_REFERENCE:
                {
                alt1=1;
                }
                break;
            case FUNCTIONAL:
            case SYMMETRIC:
            case ANTI_SYMMETRIC:
            case REFLEXIVE:
            case IRREFLEXIVE:
            case TRANSITIVE:
            case INVERSE_FUNCTIONAL:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:54:5: incompleteBinaryAxiom
                    {
                    pushFollow(FOLLOW_incompleteBinaryAxiom_in_incompleteAxiom228);
                    incompleteBinaryAxiom3=incompleteBinaryAxiom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incompleteBinaryAxiom.add(incompleteBinaryAxiom3.getTree());


                    // AST REWRITE
                    // elements: incompleteBinaryAxiom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 54:27: -> ^( incompleteBinaryAxiom )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:54:30: ^( incompleteBinaryAxiom )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot(stream_incompleteBinaryAxiom.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:55:7: incompleteUnaryAxiom
                    {
                    pushFollow(FOLLOW_incompleteUnaryAxiom_in_incompleteAxiom242);
                    incompleteUnaryAxiom4=incompleteUnaryAxiom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incompleteUnaryAxiom.add(incompleteUnaryAxiom4.getTree());


                    // AST REWRITE
                    // elements: incompleteUnaryAxiom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 55:30: -> ^( incompleteUnaryAxiom )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:55:33: ^( incompleteUnaryAxiom )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot(stream_incompleteUnaryAxiom.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:56:7: incompleteAssertionAxiom
                    {
                    pushFollow(FOLLOW_incompleteAssertionAxiom_in_incompleteAxiom258);
                    incompleteAssertionAxiom5=incompleteAssertionAxiom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incompleteAssertionAxiom.add(incompleteAssertionAxiom5.getTree());


                    // AST REWRITE
                    // elements: incompleteAssertionAxiom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 56:32: -> ^( incompleteAssertionAxiom )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:56:35: ^( incompleteAssertionAxiom )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot(stream_incompleteAssertionAxiom.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incompleteAxiom"

    public static class incompleteAssertionAxiom_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incompleteAssertionAxiom"
    // ManchesterOWLSyntaxAutoCompleteBase.g:59:1: incompleteAssertionAxiom : i= IDENTIFIER ( INSTANCE_OF | TYPES ) -> ^( INCOMPLETE_TYPE_ASSERTION ^( EXPRESSION $i) ) ;
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteAssertionAxiom_return incompleteAssertionAxiom() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteAssertionAxiom_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteAssertionAxiom_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        Token i=null;
        Token INSTANCE_OF6=null;
        Token TYPES7=null;

        ManchesterOWLSyntaxTree i_tree=null;
        ManchesterOWLSyntaxTree INSTANCE_OF6_tree=null;
        ManchesterOWLSyntaxTree TYPES7_tree=null;
        RewriteRuleTokenStream stream_TYPES=new RewriteRuleTokenStream(adaptor,"token TYPES");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_INSTANCE_OF=new RewriteRuleTokenStream(adaptor,"token INSTANCE_OF");

        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:59:27: (i= IDENTIFIER ( INSTANCE_OF | TYPES ) -> ^( INCOMPLETE_TYPE_ASSERTION ^( EXPRESSION $i) ) )
            // ManchesterOWLSyntaxAutoCompleteBase.g:60:3: i= IDENTIFIER ( INSTANCE_OF | TYPES )
            {
            i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_incompleteAssertionAxiom282); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(i);

            // ManchesterOWLSyntaxAutoCompleteBase.g:60:18: ( INSTANCE_OF | TYPES )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==INSTANCE_OF) ) {
                alt2=1;
            }
            else if ( (LA2_0==TYPES) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:60:19: INSTANCE_OF
                    {
                    INSTANCE_OF6=(Token)match(input,INSTANCE_OF,FOLLOW_INSTANCE_OF_in_incompleteAssertionAxiom285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INSTANCE_OF.add(INSTANCE_OF6);


                    }
                    break;
                case 2 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:60:33: TYPES
                    {
                    TYPES7=(Token)match(input,TYPES,FOLLOW_TYPES_in_incompleteAssertionAxiom289); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPES.add(TYPES7);


                    }
                    break;

            }



            // AST REWRITE
            // elements: i
            // token labels: i
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
            // 60:41: -> ^( INCOMPLETE_TYPE_ASSERTION ^( EXPRESSION $i) )
            {
                // ManchesterOWLSyntaxAutoCompleteBase.g:60:44: ^( INCOMPLETE_TYPE_ASSERTION ^( EXPRESSION $i) )
                {
                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_TYPE_ASSERTION, "INCOMPLETE_TYPE_ASSERTION"), root_1);

                // ManchesterOWLSyntaxAutoCompleteBase.g:60:73: ^( EXPRESSION $i)
                {
                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                adaptor.addChild(root_2, stream_i.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incompleteAssertionAxiom"

    public static class incompleteUnaryAxiom_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incompleteUnaryAxiom"
    // ManchesterOWLSyntaxAutoCompleteBase.g:64:1: incompleteUnaryAxiom : unaryCharacteristic -> ^( INCOMPLETE_UNARY_AXIOM unaryCharacteristic ) ;
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteUnaryAxiom_return incompleteUnaryAxiom() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteUnaryAxiom_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteUnaryAxiom_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.unaryCharacteristic_return unaryCharacteristic8 = null;


        RewriteRuleSubtreeStream stream_unaryCharacteristic=new RewriteRuleSubtreeStream(adaptor,"rule unaryCharacteristic");
        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:64:23: ( unaryCharacteristic -> ^( INCOMPLETE_UNARY_AXIOM unaryCharacteristic ) )
            // ManchesterOWLSyntaxAutoCompleteBase.g:65:4: unaryCharacteristic
            {
            pushFollow(FOLLOW_unaryCharacteristic_in_incompleteUnaryAxiom327);
            unaryCharacteristic8=gManchesterOWLSyntaxAutoCompleteCombined.unaryCharacteristic();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryCharacteristic.add(unaryCharacteristic8.getTree());


            // AST REWRITE
            // elements: unaryCharacteristic
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
            // 65:25: -> ^( INCOMPLETE_UNARY_AXIOM unaryCharacteristic )
            {
                // ManchesterOWLSyntaxAutoCompleteBase.g:65:28: ^( INCOMPLETE_UNARY_AXIOM unaryCharacteristic )
                {
                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_UNARY_AXIOM, "INCOMPLETE_UNARY_AXIOM"), root_1);

                adaptor.addChild(root_1, stream_unaryCharacteristic.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incompleteUnaryAxiom"

    public static class incompleteBinaryAxiom_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incompleteBinaryAxiom"
    // ManchesterOWLSyntaxAutoCompleteBase.g:69:1: incompleteBinaryAxiom : (lhs= expression ( SUBCLASS_OF -> ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ) | SUBCLASS_OF superClass= incompleteExpression -> ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $superClass) ) | EQUIVALENT_TO -> ^( INCOMPLETE_EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ) | EQUIVALENT_TO rhs= incompleteExpression -> ^( EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $rhs) ) | DISJOINT_WITH -> ^( INCOMPLETE_DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ) | DISJOINT_WITH disjoint= incompleteExpression -> ^( DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $disjoint) ) | SUB_PROPERTY_OF -> ^( INCOMPLETE_SUB_PROPERTY_AXIOM ^( EXPRESSION $lhs) ) ) | lhsID= IDENTIFIER ( SAME_AS -> ^( INCOMPLETE_SAME_AS_AXIOM ^( EXPRESSION $lhsID) ) | DIFFERENT_FROM -> ^( INCOMPLETE_DIFFERENT_FROM_AXIOM ^( EXPRESSION $lhsID) ) | DOMAIN -> ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) ) | DOMAIN incompleteDomain= incompleteExpression -> ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteDomain) ) | RANGE -> ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) ) | RANGE incompleteRange= incompleteExpression -> ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteRange) ) | INVERSE_OF -> ^( INCOMPLETE_INVERSE_OF ^( EXPRESSION $lhsID) ) ) );
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteBinaryAxiom_return incompleteBinaryAxiom() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteBinaryAxiom_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteBinaryAxiom_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        Token lhsID=null;
        Token SUBCLASS_OF9=null;
        Token SUBCLASS_OF10=null;
        Token EQUIVALENT_TO11=null;
        Token EQUIVALENT_TO12=null;
        Token DISJOINT_WITH13=null;
        Token DISJOINT_WITH14=null;
        Token SUB_PROPERTY_OF15=null;
        Token SAME_AS16=null;
        Token DIFFERENT_FROM17=null;
        Token DOMAIN18=null;
        Token DOMAIN19=null;
        Token RANGE20=null;
        Token RANGE21=null;
        Token INVERSE_OF22=null;
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.expression_return lhs = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteExpression_return superClass = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteExpression_return rhs = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteExpression_return disjoint = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteExpression_return incompleteDomain = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteExpression_return incompleteRange = null;


        ManchesterOWLSyntaxTree lhsID_tree=null;
        ManchesterOWLSyntaxTree SUBCLASS_OF9_tree=null;
        ManchesterOWLSyntaxTree SUBCLASS_OF10_tree=null;
        ManchesterOWLSyntaxTree EQUIVALENT_TO11_tree=null;
        ManchesterOWLSyntaxTree EQUIVALENT_TO12_tree=null;
        ManchesterOWLSyntaxTree DISJOINT_WITH13_tree=null;
        ManchesterOWLSyntaxTree DISJOINT_WITH14_tree=null;
        ManchesterOWLSyntaxTree SUB_PROPERTY_OF15_tree=null;
        ManchesterOWLSyntaxTree SAME_AS16_tree=null;
        ManchesterOWLSyntaxTree DIFFERENT_FROM17_tree=null;
        ManchesterOWLSyntaxTree DOMAIN18_tree=null;
        ManchesterOWLSyntaxTree DOMAIN19_tree=null;
        ManchesterOWLSyntaxTree RANGE20_tree=null;
        ManchesterOWLSyntaxTree RANGE21_tree=null;
        ManchesterOWLSyntaxTree INVERSE_OF22_tree=null;
        RewriteRuleTokenStream stream_SAME_AS=new RewriteRuleTokenStream(adaptor,"token SAME_AS");
        RewriteRuleTokenStream stream_RANGE=new RewriteRuleTokenStream(adaptor,"token RANGE");
        RewriteRuleTokenStream stream_DISJOINT_WITH=new RewriteRuleTokenStream(adaptor,"token DISJOINT_WITH");
        RewriteRuleTokenStream stream_INVERSE_OF=new RewriteRuleTokenStream(adaptor,"token INVERSE_OF");
        RewriteRuleTokenStream stream_DIFFERENT_FROM=new RewriteRuleTokenStream(adaptor,"token DIFFERENT_FROM");
        RewriteRuleTokenStream stream_EQUIVALENT_TO=new RewriteRuleTokenStream(adaptor,"token EQUIVALENT_TO");
        RewriteRuleTokenStream stream_SUBCLASS_OF=new RewriteRuleTokenStream(adaptor,"token SUBCLASS_OF");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_DOMAIN=new RewriteRuleTokenStream(adaptor,"token DOMAIN");
        RewriteRuleTokenStream stream_SUB_PROPERTY_OF=new RewriteRuleTokenStream(adaptor,"token SUB_PROPERTY_OF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_incompleteExpression=new RewriteRuleSubtreeStream(adaptor,"rule incompleteExpression");
        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:69:23: (lhs= expression ( SUBCLASS_OF -> ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ) | SUBCLASS_OF superClass= incompleteExpression -> ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $superClass) ) | EQUIVALENT_TO -> ^( INCOMPLETE_EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ) | EQUIVALENT_TO rhs= incompleteExpression -> ^( EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $rhs) ) | DISJOINT_WITH -> ^( INCOMPLETE_DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ) | DISJOINT_WITH disjoint= incompleteExpression -> ^( DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $disjoint) ) | SUB_PROPERTY_OF -> ^( INCOMPLETE_SUB_PROPERTY_AXIOM ^( EXPRESSION $lhs) ) ) | lhsID= IDENTIFIER ( SAME_AS -> ^( INCOMPLETE_SAME_AS_AXIOM ^( EXPRESSION $lhsID) ) | DIFFERENT_FROM -> ^( INCOMPLETE_DIFFERENT_FROM_AXIOM ^( EXPRESSION $lhsID) ) | DOMAIN -> ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) ) | DOMAIN incompleteDomain= incompleteExpression -> ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteDomain) ) | RANGE -> ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) ) | RANGE incompleteRange= incompleteExpression -> ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteRange) ) | INVERSE_OF -> ^( INCOMPLETE_INVERSE_OF ^( EXPRESSION $lhsID) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENTIFIER) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==COMPOSITION||(LA5_1>=AND && LA5_1<=OR)||(LA5_1>=SOME && LA5_1<=VALUE)||(LA5_1>=SUBCLASS_OF && LA5_1<=EQUIVALENT_TO)||LA5_1==DISJOINT_WITH) ) {
                    alt5=1;
                }
                else if ( ((LA5_1>=SAME_AS && LA5_1<=INVERSE_OF)||(LA5_1>=DOMAIN && LA5_1<=RANGE)) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==OPEN_CURLY_BRACES||LA5_0==NOT||LA5_0==INVERSE||LA5_0==DBLQUOTE||LA5_0==ENTITY_REFERENCE) ) {
                alt5=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:70:5: lhs= expression ( SUBCLASS_OF -> ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ) | SUBCLASS_OF superClass= incompleteExpression -> ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $superClass) ) | EQUIVALENT_TO -> ^( INCOMPLETE_EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ) | EQUIVALENT_TO rhs= incompleteExpression -> ^( EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $rhs) ) | DISJOINT_WITH -> ^( INCOMPLETE_DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ) | DISJOINT_WITH disjoint= incompleteExpression -> ^( DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $disjoint) ) | SUB_PROPERTY_OF -> ^( INCOMPLETE_SUB_PROPERTY_AXIOM ^( EXPRESSION $lhs) ) )
                    {
                    pushFollow(FOLLOW_expression_in_incompleteBinaryAxiom375);
                    lhs=gManchesterOWLSyntaxAutoCompleteCombined.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(lhs.getTree());
                    // ManchesterOWLSyntaxAutoCompleteBase.g:72:17: ( SUBCLASS_OF -> ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ) | SUBCLASS_OF superClass= incompleteExpression -> ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $superClass) ) | EQUIVALENT_TO -> ^( INCOMPLETE_EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ) | EQUIVALENT_TO rhs= incompleteExpression -> ^( EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $rhs) ) | DISJOINT_WITH -> ^( INCOMPLETE_DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ) | DISJOINT_WITH disjoint= incompleteExpression -> ^( DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $disjoint) ) | SUB_PROPERTY_OF -> ^( INCOMPLETE_SUB_PROPERTY_AXIOM ^( EXPRESSION $lhs) ) )
                    int alt3=7;
                    alt3 = dfa3.predict(input);
                    switch (alt3) {
                        case 1 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:73:17: SUBCLASS_OF
                            {
                            SUBCLASS_OF9=(Token)match(input,SUBCLASS_OF,FOLLOW_SUBCLASS_OF_in_incompleteBinaryAxiom430); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBCLASS_OF.add(SUBCLASS_OF9);



                            // AST REWRITE
                            // elements: lhs
                            // token labels: 
                            // rule labels: retval, lhs
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs",lhs!=null?lhs.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 73:31: -> ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:73:34: ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_SUB_CLASS_AXIOM, "INCOMPLETE_SUB_CLASS_AXIOM"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:73:64: ^( EXPRESSION $lhs)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhs.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:74:19: SUBCLASS_OF superClass= incompleteExpression
                            {
                            SUBCLASS_OF10=(Token)match(input,SUBCLASS_OF,FOLLOW_SUBCLASS_OF_in_incompleteBinaryAxiom466); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUBCLASS_OF.add(SUBCLASS_OF10);

                            pushFollow(FOLLOW_incompleteExpression_in_incompleteBinaryAxiom472);
                            superClass=incompleteExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_incompleteExpression.add(superClass.getTree());


                            // AST REWRITE
                            // elements: superClass, lhs
                            // token labels: 
                            // rule labels: retval, superClass, lhs
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_superClass=new RewriteRuleSubtreeStream(adaptor,"rule superClass",superClass!=null?superClass.tree:null);
                            RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs",lhs!=null?lhs.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 74:65: -> ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $superClass) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:74:68: ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $superClass) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_SUB_CLASS_AXIOM, "INCOMPLETE_SUB_CLASS_AXIOM"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:74:98: ^( EXPRESSION $lhs)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhs.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // ManchesterOWLSyntaxAutoCompleteBase.g:74:117: ^( INCOMPLETE_EXPRESSION $superClass)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_EXPRESSION, "INCOMPLETE_EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_superClass.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 3 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:75:19: EQUIVALENT_TO
                            {
                            EQUIVALENT_TO11=(Token)match(input,EQUIVALENT_TO,FOLLOW_EQUIVALENT_TO_in_incompleteBinaryAxiom513); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUIVALENT_TO.add(EQUIVALENT_TO11);



                            // AST REWRITE
                            // elements: lhs
                            // token labels: 
                            // rule labels: retval, lhs
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs",lhs!=null?lhs.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 75:34: -> ^( INCOMPLETE_EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:75:37: ^( INCOMPLETE_EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_EQUIVALENT_TO_AXIOM, "INCOMPLETE_EQUIVALENT_TO_AXIOM"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:75:70: ^( EXPRESSION $lhs)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhs.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 4 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:76:19: EQUIVALENT_TO rhs= incompleteExpression
                            {
                            EQUIVALENT_TO12=(Token)match(input,EQUIVALENT_TO,FOLLOW_EQUIVALENT_TO_in_incompleteBinaryAxiom547); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUIVALENT_TO.add(EQUIVALENT_TO12);

                            pushFollow(FOLLOW_incompleteExpression_in_incompleteBinaryAxiom553);
                            rhs=incompleteExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_incompleteExpression.add(rhs.getTree());


                            // AST REWRITE
                            // elements: rhs, lhs
                            // token labels: 
                            // rule labels: retval, rhs, lhs
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_rhs=new RewriteRuleSubtreeStream(adaptor,"rule rhs",rhs!=null?rhs.tree:null);
                            RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs",lhs!=null?lhs.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 76:60: -> ^( EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $rhs) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:76:63: ^( EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $rhs) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EQUIVALENT_TO_AXIOM, "EQUIVALENT_TO_AXIOM"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:76:85: ^( EXPRESSION $lhs)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhs.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // ManchesterOWLSyntaxAutoCompleteBase.g:76:104: ^( INCOMPLETE_EXPRESSION $rhs)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_EXPRESSION, "INCOMPLETE_EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_rhs.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 5 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:77:19: DISJOINT_WITH
                            {
                            DISJOINT_WITH13=(Token)match(input,DISJOINT_WITH,FOLLOW_DISJOINT_WITH_in_incompleteBinaryAxiom593); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DISJOINT_WITH.add(DISJOINT_WITH13);



                            // AST REWRITE
                            // elements: lhs
                            // token labels: 
                            // rule labels: retval, lhs
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs",lhs!=null?lhs.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 77:33: -> ^( INCOMPLETE_DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:77:36: ^( INCOMPLETE_DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_DISJOINT_WITH_AXIOM, "INCOMPLETE_DISJOINT_WITH_AXIOM"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:77:69: ^( EXPRESSION $lhs)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhs.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 6 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:78:19: DISJOINT_WITH disjoint= incompleteExpression
                            {
                            DISJOINT_WITH14=(Token)match(input,DISJOINT_WITH,FOLLOW_DISJOINT_WITH_in_incompleteBinaryAxiom626); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DISJOINT_WITH.add(DISJOINT_WITH14);

                            pushFollow(FOLLOW_incompleteExpression_in_incompleteBinaryAxiom632);
                            disjoint=incompleteExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_incompleteExpression.add(disjoint.getTree());


                            // AST REWRITE
                            // elements: disjoint, lhs
                            // token labels: 
                            // rule labels: retval, disjoint, lhs
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_disjoint=new RewriteRuleSubtreeStream(adaptor,"rule disjoint",disjoint!=null?disjoint.tree:null);
                            RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs",lhs!=null?lhs.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 78:65: -> ^( DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $disjoint) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:78:68: ^( DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $disjoint) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(DISJOINT_WITH_AXIOM, "DISJOINT_WITH_AXIOM"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:78:90: ^( EXPRESSION $lhs)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhs.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }
                                // ManchesterOWLSyntaxAutoCompleteBase.g:78:109: ^( INCOMPLETE_EXPRESSION $disjoint)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_EXPRESSION, "INCOMPLETE_EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_disjoint.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 7 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:79:19: SUB_PROPERTY_OF
                            {
                            SUB_PROPERTY_OF15=(Token)match(input,SUB_PROPERTY_OF,FOLLOW_SUB_PROPERTY_OF_in_incompleteBinaryAxiom672); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SUB_PROPERTY_OF.add(SUB_PROPERTY_OF15);



                            // AST REWRITE
                            // elements: lhs
                            // token labels: 
                            // rule labels: retval, lhs
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs",lhs!=null?lhs.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 79:36: -> ^( INCOMPLETE_SUB_PROPERTY_AXIOM ^( EXPRESSION $lhs) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:79:39: ^( INCOMPLETE_SUB_PROPERTY_AXIOM ^( EXPRESSION $lhs) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_SUB_PROPERTY_AXIOM, "INCOMPLETE_SUB_PROPERTY_AXIOM"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:79:71: ^( EXPRESSION $lhs)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhs.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:82:5: lhsID= IDENTIFIER ( SAME_AS -> ^( INCOMPLETE_SAME_AS_AXIOM ^( EXPRESSION $lhsID) ) | DIFFERENT_FROM -> ^( INCOMPLETE_DIFFERENT_FROM_AXIOM ^( EXPRESSION $lhsID) ) | DOMAIN -> ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) ) | DOMAIN incompleteDomain= incompleteExpression -> ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteDomain) ) | RANGE -> ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) ) | RANGE incompleteRange= incompleteExpression -> ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteRange) ) | INVERSE_OF -> ^( INCOMPLETE_INVERSE_OF ^( EXPRESSION $lhsID) ) )
                    {
                    lhsID=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_incompleteBinaryAxiom743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(lhsID);

                    // ManchesterOWLSyntaxAutoCompleteBase.g:82:25: ( SAME_AS -> ^( INCOMPLETE_SAME_AS_AXIOM ^( EXPRESSION $lhsID) ) | DIFFERENT_FROM -> ^( INCOMPLETE_DIFFERENT_FROM_AXIOM ^( EXPRESSION $lhsID) ) | DOMAIN -> ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) ) | DOMAIN incompleteDomain= incompleteExpression -> ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteDomain) ) | RANGE -> ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) ) | RANGE incompleteRange= incompleteExpression -> ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteRange) ) | INVERSE_OF -> ^( INCOMPLETE_INVERSE_OF ^( EXPRESSION $lhsID) ) )
                    int alt4=7;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:83:21: SAME_AS
                            {
                            SAME_AS16=(Token)match(input,SAME_AS,FOLLOW_SAME_AS_in_incompleteBinaryAxiom768); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SAME_AS.add(SAME_AS16);



                            // AST REWRITE
                            // elements: lhsID
                            // token labels: lhsID
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_lhsID=new RewriteRuleTokenStream(adaptor,"token lhsID",lhsID);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 83:31: -> ^( INCOMPLETE_SAME_AS_AXIOM ^( EXPRESSION $lhsID) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:83:34: ^( INCOMPLETE_SAME_AS_AXIOM ^( EXPRESSION $lhsID) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_SAME_AS_AXIOM, "INCOMPLETE_SAME_AS_AXIOM"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:83:61: ^( EXPRESSION $lhsID)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhsID.nextNode());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:84:21: DIFFERENT_FROM
                            {
                            DIFFERENT_FROM17=(Token)match(input,DIFFERENT_FROM,FOLLOW_DIFFERENT_FROM_in_incompleteBinaryAxiom806); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DIFFERENT_FROM.add(DIFFERENT_FROM17);



                            // AST REWRITE
                            // elements: lhsID
                            // token labels: lhsID
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_lhsID=new RewriteRuleTokenStream(adaptor,"token lhsID",lhsID);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 84:37: -> ^( INCOMPLETE_DIFFERENT_FROM_AXIOM ^( EXPRESSION $lhsID) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:84:40: ^( INCOMPLETE_DIFFERENT_FROM_AXIOM ^( EXPRESSION $lhsID) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_DIFFERENT_FROM_AXIOM, "INCOMPLETE_DIFFERENT_FROM_AXIOM"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:84:74: ^( EXPRESSION $lhsID)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhsID.nextNode());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 3 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:85:21: DOMAIN
                            {
                            DOMAIN18=(Token)match(input,DOMAIN,FOLLOW_DOMAIN_in_incompleteBinaryAxiom842); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOMAIN.add(DOMAIN18);



                            // AST REWRITE
                            // elements: lhsID
                            // token labels: lhsID
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_lhsID=new RewriteRuleTokenStream(adaptor,"token lhsID",lhsID);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 85:29: -> ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:85:32: ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_DOMAIN, "INCOMPLETE_DOMAIN"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:85:52: ^( EXPRESSION $lhsID)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhsID.nextNode());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 4 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:86:21: DOMAIN incompleteDomain= incompleteExpression
                            {
                            DOMAIN19=(Token)match(input,DOMAIN,FOLLOW_DOMAIN_in_incompleteBinaryAxiom878); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOMAIN.add(DOMAIN19);

                            pushFollow(FOLLOW_incompleteExpression_in_incompleteBinaryAxiom884);
                            incompleteDomain=incompleteExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_incompleteExpression.add(incompleteDomain.getTree());


                            // AST REWRITE
                            // elements: lhsID, incompleteDomain
                            // token labels: lhsID
                            // rule labels: retval, incompleteDomain
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_lhsID=new RewriteRuleTokenStream(adaptor,"token lhsID",lhsID);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_incompleteDomain=new RewriteRuleSubtreeStream(adaptor,"rule incompleteDomain",incompleteDomain!=null?incompleteDomain.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 86:69: -> ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteDomain) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:86:72: ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteDomain) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_DOMAIN, "INCOMPLETE_DOMAIN"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:86:92: ^( EXPRESSION $lhsID)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhsID.nextNode());

                                adaptor.addChild(root_1, root_2);
                                }
                                // ManchesterOWLSyntaxAutoCompleteBase.g:86:113: ^( INCOMPLETE_EXPRESSION $incompleteDomain)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_EXPRESSION, "INCOMPLETE_EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_incompleteDomain.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 5 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:87:21: RANGE
                            {
                            RANGE20=(Token)match(input,RANGE,FOLLOW_RANGE_in_incompleteBinaryAxiom927); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RANGE.add(RANGE20);



                            // AST REWRITE
                            // elements: lhsID
                            // token labels: lhsID
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_lhsID=new RewriteRuleTokenStream(adaptor,"token lhsID",lhsID);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 87:28: -> ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:87:31: ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_RANGE, "INCOMPLETE_RANGE"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:87:50: ^( EXPRESSION $lhsID)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhsID.nextNode());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 6 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:88:21: RANGE incompleteRange= incompleteExpression
                            {
                            RANGE21=(Token)match(input,RANGE,FOLLOW_RANGE_in_incompleteBinaryAxiom963); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RANGE.add(RANGE21);

                            pushFollow(FOLLOW_incompleteExpression_in_incompleteBinaryAxiom970);
                            incompleteRange=incompleteExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_incompleteExpression.add(incompleteRange.getTree());


                            // AST REWRITE
                            // elements: incompleteRange, lhsID
                            // token labels: lhsID
                            // rule labels: retval, incompleteRange
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_lhsID=new RewriteRuleTokenStream(adaptor,"token lhsID",lhsID);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_incompleteRange=new RewriteRuleSubtreeStream(adaptor,"rule incompleteRange",incompleteRange!=null?incompleteRange.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 88:67: -> ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteRange) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:88:70: ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteRange) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_RANGE, "INCOMPLETE_RANGE"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:88:89: ^( EXPRESSION $lhsID)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhsID.nextNode());

                                adaptor.addChild(root_1, root_2);
                                }
                                // ManchesterOWLSyntaxAutoCompleteBase.g:88:110: ^( INCOMPLETE_EXPRESSION $incompleteRange)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_EXPRESSION, "INCOMPLETE_EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_incompleteRange.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 7 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:89:21: INVERSE_OF
                            {
                            INVERSE_OF22=(Token)match(input,INVERSE_OF,FOLLOW_INVERSE_OF_in_incompleteBinaryAxiom1012); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INVERSE_OF.add(INVERSE_OF22);



                            // AST REWRITE
                            // elements: lhsID
                            // token labels: lhsID
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_lhsID=new RewriteRuleTokenStream(adaptor,"token lhsID",lhsID);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            // 89:32: -> ^( INCOMPLETE_INVERSE_OF ^( EXPRESSION $lhsID) )
                            {
                                // ManchesterOWLSyntaxAutoCompleteBase.g:89:35: ^( INCOMPLETE_INVERSE_OF ^( EXPRESSION $lhsID) )
                                {
                                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_INVERSE_OF, "INCOMPLETE_INVERSE_OF"), root_1);

                                // ManchesterOWLSyntaxAutoCompleteBase.g:89:59: ^( EXPRESSION $lhsID)
                                {
                                ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                                root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                                adaptor.addChild(root_2, stream_lhsID.nextNode());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incompleteBinaryAxiom"

    public static class incompleteExpression_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incompleteExpression"
    // ManchesterOWLSyntaxAutoCompleteBase.g:94:1: incompleteExpression : ( options {backtrack=true; } : head= propertyExpression ( COMPOSITION rest+= propertyExpression )+ COMPOSITION -> ^( INCOMPLETE_PROPERTY_CHAIN $head $rest) | ( conjunction ( OR . )* ) OR ( incompleteConjunction )? -> ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? ) | incompleteConjunction -> ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? ) | incompleteUnary -> ^( incompleteUnary ) | expression IDENTIFIER -> ^( INCOMPLETE_EXPRESSION ^( EXPRESSION expression ) IDENTIFIER ) ) ;
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteExpression_return incompleteExpression() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteExpression_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteExpression_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        Token COMPOSITION23=null;
        Token COMPOSITION24=null;
        Token OR26=null;
        Token wildcard27=null;
        Token OR28=null;
        Token IDENTIFIER33=null;
        List list_rest=null;
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.propertyExpression_return head = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.conjunction_return conjunction25 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteConjunction_return incompleteConjunction29 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteConjunction_return incompleteConjunction30 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteUnary_return incompleteUnary31 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.expression_return expression32 = null;

        RuleReturnScope rest = null;
        ManchesterOWLSyntaxTree COMPOSITION23_tree=null;
        ManchesterOWLSyntaxTree COMPOSITION24_tree=null;
        ManchesterOWLSyntaxTree OR26_tree=null;
        ManchesterOWLSyntaxTree wildcard27_tree=null;
        ManchesterOWLSyntaxTree OR28_tree=null;
        ManchesterOWLSyntaxTree IDENTIFIER33_tree=null;
        RewriteRuleTokenStream stream_COMPOSITION=new RewriteRuleTokenStream(adaptor,"token COMPOSITION");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_incompleteConjunction=new RewriteRuleSubtreeStream(adaptor,"rule incompleteConjunction");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_propertyExpression=new RewriteRuleSubtreeStream(adaptor,"rule propertyExpression");
        RewriteRuleSubtreeStream stream_conjunction=new RewriteRuleSubtreeStream(adaptor,"rule conjunction");
        RewriteRuleSubtreeStream stream_incompleteUnary=new RewriteRuleSubtreeStream(adaptor,"rule incompleteUnary");
        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:94:21: ( ( options {backtrack=true; } : head= propertyExpression ( COMPOSITION rest+= propertyExpression )+ COMPOSITION -> ^( INCOMPLETE_PROPERTY_CHAIN $head $rest) | ( conjunction ( OR . )* ) OR ( incompleteConjunction )? -> ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? ) | incompleteConjunction -> ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? ) | incompleteUnary -> ^( incompleteUnary ) | expression IDENTIFIER -> ^( INCOMPLETE_EXPRESSION ^( EXPRESSION expression ) IDENTIFIER ) ) )
            // ManchesterOWLSyntaxAutoCompleteBase.g:95:5: ( options {backtrack=true; } : head= propertyExpression ( COMPOSITION rest+= propertyExpression )+ COMPOSITION -> ^( INCOMPLETE_PROPERTY_CHAIN $head $rest) | ( conjunction ( OR . )* ) OR ( incompleteConjunction )? -> ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? ) | incompleteConjunction -> ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? ) | incompleteUnary -> ^( incompleteUnary ) | expression IDENTIFIER -> ^( INCOMPLETE_EXPRESSION ^( EXPRESSION expression ) IDENTIFIER ) )
            {
            // ManchesterOWLSyntaxAutoCompleteBase.g:95:5: ( options {backtrack=true; } : head= propertyExpression ( COMPOSITION rest+= propertyExpression )+ COMPOSITION -> ^( INCOMPLETE_PROPERTY_CHAIN $head $rest) | ( conjunction ( OR . )* ) OR ( incompleteConjunction )? -> ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? ) | incompleteConjunction -> ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? ) | incompleteUnary -> ^( incompleteUnary ) | expression IDENTIFIER -> ^( INCOMPLETE_EXPRESSION ^( EXPRESSION expression ) IDENTIFIER ) )
            int alt9=5;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:97:7: head= propertyExpression ( COMPOSITION rest+= propertyExpression )+ COMPOSITION
                    {
                    pushFollow(FOLLOW_propertyExpression_in_incompleteExpression1130);
                    head=gManchesterOWLSyntaxAutoCompleteCombined.propertyExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propertyExpression.add(head.getTree());
                    // ManchesterOWLSyntaxAutoCompleteBase.g:97:33: ( COMPOSITION rest+= propertyExpression )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==COMPOSITION) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==INVERSE||LA6_1==IDENTIFIER) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ManchesterOWLSyntaxAutoCompleteBase.g:97:34: COMPOSITION rest+= propertyExpression
                    	    {
                    	    COMPOSITION23=(Token)match(input,COMPOSITION,FOLLOW_COMPOSITION_in_incompleteExpression1133); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMPOSITION.add(COMPOSITION23);

                    	    pushFollow(FOLLOW_propertyExpression_in_incompleteExpression1137);
                    	    rest=gManchesterOWLSyntaxAutoCompleteCombined.propertyExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_propertyExpression.add(rest.getTree());
                    	    if (list_rest==null) list_rest=new ArrayList();
                    	    list_rest.add(rest.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    COMPOSITION24=(Token)match(input,COMPOSITION,FOLLOW_COMPOSITION_in_incompleteExpression1142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMPOSITION.add(COMPOSITION24);



                    // AST REWRITE
                    // elements: rest, head
                    // token labels: 
                    // rule labels: retval, head
                    // token list labels: 
                    // rule list labels: rest
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_head=new RewriteRuleSubtreeStream(adaptor,"rule head",head!=null?head.tree:null);
                    RewriteRuleSubtreeStream stream_rest=new RewriteRuleSubtreeStream(adaptor,"token rest",list_rest);
                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 97:87: -> ^( INCOMPLETE_PROPERTY_CHAIN $head $rest)
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:97:90: ^( INCOMPLETE_PROPERTY_CHAIN $head $rest)
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_PROPERTY_CHAIN, "INCOMPLETE_PROPERTY_CHAIN"), root_1);

                        adaptor.addChild(root_1, stream_head.nextTree());
                        adaptor.addChild(root_1, stream_rest.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:98:9: ( conjunction ( OR . )* ) OR ( incompleteConjunction )?
                    {
                    // ManchesterOWLSyntaxAutoCompleteBase.g:98:9: ( conjunction ( OR . )* )
                    // ManchesterOWLSyntaxAutoCompleteBase.g:98:10: conjunction ( OR . )*
                    {
                    pushFollow(FOLLOW_conjunction_in_incompleteExpression1167);
                    conjunction25=gManchesterOWLSyntaxAutoCompleteCombined.conjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conjunction.add(conjunction25.getTree());
                    // ManchesterOWLSyntaxAutoCompleteBase.g:98:22: ( OR . )*
                    loop7:
                    do {
                        int alt7=2;
                        alt7 = dfa7.predict(input);
                        switch (alt7) {
                    	case 1 :
                    	    // ManchesterOWLSyntaxAutoCompleteBase.g:98:23: OR .
                    	    {
                    	    OR26=(Token)match(input,OR,FOLLOW_OR_in_incompleteExpression1170); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OR.add(OR26);

                    	    wildcard27=(Token)input.LT(1);
                    	    matchAny(input); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    wildcard27_tree = (ManchesterOWLSyntaxTree)adaptor.create(wildcard27);
                    	    adaptor.addChild(root_0, wildcard27_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }

                    OR28=(Token)match(input,OR,FOLLOW_OR_in_incompleteExpression1177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR28);

                    // ManchesterOWLSyntaxAutoCompleteBase.g:98:35: ( incompleteConjunction )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==OPEN_CURLY_BRACES||LA8_0==NOT||LA8_0==INVERSE||LA8_0==DBLQUOTE||(LA8_0>=IDENTIFIER && LA8_0<=ENTITY_REFERENCE)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ManchesterOWLSyntaxAutoCompleteBase.g:98:35: incompleteConjunction
                            {
                            pushFollow(FOLLOW_incompleteConjunction_in_incompleteExpression1180);
                            incompleteConjunction29=incompleteConjunction();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_incompleteConjunction.add(incompleteConjunction29.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: incompleteConjunction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 98:59: -> ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:98:62: ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_DISJUNCTION, "INCOMPLETE_DISJUNCTION"), root_1);

                        // ManchesterOWLSyntaxAutoCompleteBase.g:98:88: ( ^( incompleteConjunction ) )?
                        if ( stream_incompleteConjunction.hasNext() ) {
                            // ManchesterOWLSyntaxAutoCompleteBase.g:98:88: ^( incompleteConjunction )
                            {
                            ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot(stream_incompleteConjunction.nextNode(), root_2);

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_incompleteConjunction.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:99:9: incompleteConjunction
                    {
                    pushFollow(FOLLOW_incompleteConjunction_in_incompleteExpression1204);
                    incompleteConjunction30=incompleteConjunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incompleteConjunction.add(incompleteConjunction30.getTree());


                    // AST REWRITE
                    // elements: incompleteConjunction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 99:31: -> ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:99:34: ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_DISJUNCTION, "INCOMPLETE_DISJUNCTION"), root_1);

                        // ManchesterOWLSyntaxAutoCompleteBase.g:99:60: ( ^( incompleteConjunction ) )?
                        if ( stream_incompleteConjunction.hasNext() ) {
                            // ManchesterOWLSyntaxAutoCompleteBase.g:99:60: ^( incompleteConjunction )
                            {
                            ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                            root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot(stream_incompleteConjunction.nextNode(), root_2);

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_incompleteConjunction.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:100:9: incompleteUnary
                    {
                    pushFollow(FOLLOW_incompleteUnary_in_incompleteExpression1227);
                    incompleteUnary31=incompleteUnary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incompleteUnary.add(incompleteUnary31.getTree());


                    // AST REWRITE
                    // elements: incompleteUnary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 100:25: -> ^( incompleteUnary )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:100:28: ^( incompleteUnary )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot(stream_incompleteUnary.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:101:9: expression IDENTIFIER
                    {
                    pushFollow(FOLLOW_expression_in_incompleteExpression1243);
                    expression32=gManchesterOWLSyntaxAutoCompleteCombined.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression32.getTree());
                    IDENTIFIER33=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_incompleteExpression1245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER33);



                    // AST REWRITE
                    // elements: expression, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 101:31: -> ^( INCOMPLETE_EXPRESSION ^( EXPRESSION expression ) IDENTIFIER )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:101:33: ^( INCOMPLETE_EXPRESSION ^( EXPRESSION expression ) IDENTIFIER )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_EXPRESSION, "INCOMPLETE_EXPRESSION"), root_1);

                        // ManchesterOWLSyntaxAutoCompleteBase.g:101:57: ^( EXPRESSION expression )
                        {
                        ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incompleteExpression"

    public static class incompleteConjunction_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incompleteConjunction"
    // ManchesterOWLSyntaxAutoCompleteBase.g:105:1: incompleteConjunction : ( unary ( AND . )* ) AND ( incompleteUnary )? -> ^( INCOMPLETE_CONJUNCTION ( ^( incompleteUnary ) )? ) ;
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteConjunction_return incompleteConjunction() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteConjunction_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteConjunction_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        Token AND35=null;
        Token wildcard36=null;
        Token AND37=null;
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.unary_return unary34 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteUnary_return incompleteUnary38 = null;


        ManchesterOWLSyntaxTree AND35_tree=null;
        ManchesterOWLSyntaxTree wildcard36_tree=null;
        ManchesterOWLSyntaxTree AND37_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_unary=new RewriteRuleSubtreeStream(adaptor,"rule unary");
        RewriteRuleSubtreeStream stream_incompleteUnary=new RewriteRuleSubtreeStream(adaptor,"rule incompleteUnary");
        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:105:24: ( ( unary ( AND . )* ) AND ( incompleteUnary )? -> ^( INCOMPLETE_CONJUNCTION ( ^( incompleteUnary ) )? ) )
            // ManchesterOWLSyntaxAutoCompleteBase.g:106:9: ( unary ( AND . )* ) AND ( incompleteUnary )?
            {
            // ManchesterOWLSyntaxAutoCompleteBase.g:106:9: ( unary ( AND . )* )
            // ManchesterOWLSyntaxAutoCompleteBase.g:106:10: unary ( AND . )*
            {
            pushFollow(FOLLOW_unary_in_incompleteConjunction1295);
            unary34=gManchesterOWLSyntaxAutoCompleteCombined.unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unary.add(unary34.getTree());
            // ManchesterOWLSyntaxAutoCompleteBase.g:106:16: ( AND . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AND) ) {
                    switch ( input.LA(2) ) {
                    case NOT:
                        {
                        int LA10_2 = input.LA(3);

                        if ( (LA10_2==AND) ) {
                            alt10=1;
                        }


                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA10_3 = input.LA(3);

                        if ( (LA10_3==AND) ) {
                            alt10=1;
                        }


                        }
                        break;
                    case INVERSE:
                        {
                        int LA10_4 = input.LA(3);

                        if ( (LA10_4==AND) ) {
                            alt10=1;
                        }


                        }
                        break;
                    case OPEN_CURLY_BRACES:
                        {
                        int LA10_5 = input.LA(3);

                        if ( (LA10_5==AND) ) {
                            alt10=1;
                        }


                        }
                        break;
                    case COMPOSITION:
                    case OPEN_PARENTHESYS:
                    case CLOSED_CURLY_BRACES:
                    case CLOSED_PARENTHESYS:
                    case WHITESPACE:
                    case AND:
                    case OR:
                    case SOME:
                    case ONLY:
                    case MIN:
                    case MAX:
                    case EXACTLY:
                    case VALUE:
                    case SUBCLASS_OF:
                    case SUB_PROPERTY_OF:
                    case EQUIVALENT_TO:
                    case SAME_AS:
                    case DIFFERENT_FROM:
                    case INVERSE_OF:
                    case DISJOINT_WITH:
                    case DOMAIN:
                    case RANGE:
                    case FUNCTIONAL:
                    case SYMMETRIC:
                    case ANTI_SYMMETRIC:
                    case REFLEXIVE:
                    case IRREFLEXIVE:
                    case TRANSITIVE:
                    case INVERSE_FUNCTIONAL:
                    case POW:
                    case COMMA:
                    case INSTANCE_OF:
                    case TYPES:
                    case DBLQUOTE:
                    case DIGIT:
                    case INTEGER:
                    case LETTER:
                    case ENTITY_REFERENCE:
                    case SUB_CLASS_AXIOM:
                    case EQUIVALENT_TO_AXIOM:
                    case DISJOINT_WITH_AXIOM:
                    case SUB_PROPERTY_AXIOM:
                    case SAME_AS_AXIOM:
                    case DIFFERENT_FROM_AXIOM:
                    case UNARY_AXIOM:
                    case DISJUNCTION:
                    case CONJUNCTION:
                    case PROPERTY_CHAIN:
                    case NEGATED_EXPRESSION:
                    case NEGATED_ASSERTION:
                    case INVERSE_PROPERTY:
                    case SOME_RESTRICTION:
                    case ALL_RESTRICTION:
                    case VALUE_RESTRICTION:
                    case CARDINALITY_RESTRICTION:
                    case ONE_OF:
                    case TYPE_ASSERTION:
                    case ROLE_ASSERTION:
                    case INVERSE_OBJECT_PROPERTY_EXPRESSION:
                    case EXPRESSION:
                    case CONSTANT:
                    case STANDALONE_EXPRESSION:
                    case INCOMPLETE_TYPE_ASSERTION:
                    case INCOMPLETE_ROLE_ASSERTION:
                    case INCOMPLETE_UNARY_AXIOM:
                    case INCOMPLETE_SUB_CLASS_AXIOM:
                    case INCOMPLETE_EQUIVALENT_TO_AXIOM:
                    case INCOMPLETE_DISJOINT_WITH_AXIOM:
                    case INCOMPLETE_SUB_PROPERTY_AXIOM:
                    case INCOMPLETE_SAME_AS_AXIOM:
                    case INCOMPLETE_DIFFERENT_FROM_AXIOM:
                    case INCOMPLETE_DOMAIN:
                    case INCOMPLETE_RANGE:
                    case INCOMPLETE_INVERSE_OF:
                    case INCOMPLETE_PROPERTY_CHAIN:
                    case INCOMPLETE_DISJUNCTION:
                    case INCOMPLETE_CONJUNCTION:
                    case INCOMPLETE_INVERSE_OBJECT_PROPERTY_EXPRESSION:
                    case INCOMPLETE_NEGATED_EXPRESSION:
                    case INCOMPLETE_SOME_RESTRICTION:
                    case INCOMPLETE_ALL_RESTRICTION:
                    case INCOMPLETE_CARDINALITY_RESTRICTION:
                    case INCOMPLETE_ONE_OF:
                    case INCOMPLETE_VALUE_RESTRICTION:
                    case INCOMPLETE_EXPRESSION:
                        {
                        alt10=1;
                        }
                        break;

                    }

                }


                switch (alt10) {
            	case 1 :
            	    // ManchesterOWLSyntaxAutoCompleteBase.g:106:17: AND .
            	    {
            	    AND35=(Token)match(input,AND,FOLLOW_AND_in_incompleteConjunction1298); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND35);

            	    wildcard36=(Token)input.LT(1);
            	    matchAny(input); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    wildcard36_tree = (ManchesterOWLSyntaxTree)adaptor.create(wildcard36);
            	    adaptor.addChild(root_0, wildcard36_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            AND37=(Token)match(input,AND,FOLLOW_AND_in_incompleteConjunction1307); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AND.add(AND37);

            // ManchesterOWLSyntaxAutoCompleteBase.g:106:32: ( incompleteUnary )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==OPEN_CURLY_BRACES||LA11_0==NOT||LA11_0==INVERSE||LA11_0==IDENTIFIER) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:106:32: incompleteUnary
                    {
                    pushFollow(FOLLOW_incompleteUnary_in_incompleteConjunction1309);
                    incompleteUnary38=incompleteUnary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incompleteUnary.add(incompleteUnary38.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: incompleteUnary
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
            // 106:49: -> ^( INCOMPLETE_CONJUNCTION ( ^( incompleteUnary ) )? )
            {
                // ManchesterOWLSyntaxAutoCompleteBase.g:106:52: ^( INCOMPLETE_CONJUNCTION ( ^( incompleteUnary ) )? )
                {
                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_CONJUNCTION, "INCOMPLETE_CONJUNCTION"), root_1);

                // ManchesterOWLSyntaxAutoCompleteBase.g:106:78: ( ^( incompleteUnary ) )?
                if ( stream_incompleteUnary.hasNext() ) {
                    // ManchesterOWLSyntaxAutoCompleteBase.g:106:78: ^( incompleteUnary )
                    {
                    ManchesterOWLSyntaxTree root_2 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    root_2 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot(stream_incompleteUnary.nextNode(), root_2);

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_incompleteUnary.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incompleteConjunction"

    public static class incompleteComplexPropertyExpression_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incompleteComplexPropertyExpression"
    // ManchesterOWLSyntaxAutoCompleteBase.g:109:1: incompleteComplexPropertyExpression : INVERSE OPEN_PARENTHESYS -> ^( INCOMPLETE_INVERSE_OBJECT_PROPERTY_EXPRESSION ) ;
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteComplexPropertyExpression_return incompleteComplexPropertyExpression() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteComplexPropertyExpression_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteComplexPropertyExpression_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        Token INVERSE39=null;
        Token OPEN_PARENTHESYS40=null;

        ManchesterOWLSyntaxTree INVERSE39_tree=null;
        ManchesterOWLSyntaxTree OPEN_PARENTHESYS40_tree=null;
        RewriteRuleTokenStream stream_INVERSE=new RewriteRuleTokenStream(adaptor,"token INVERSE");
        RewriteRuleTokenStream stream_OPEN_PARENTHESYS=new RewriteRuleTokenStream(adaptor,"token OPEN_PARENTHESYS");

        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:109:36: ( INVERSE OPEN_PARENTHESYS -> ^( INCOMPLETE_INVERSE_OBJECT_PROPERTY_EXPRESSION ) )
            // ManchesterOWLSyntaxAutoCompleteBase.g:110:4: INVERSE OPEN_PARENTHESYS
            {
            INVERSE39=(Token)match(input,INVERSE,FOLLOW_INVERSE_in_incompleteComplexPropertyExpression1344); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INVERSE.add(INVERSE39);

            OPEN_PARENTHESYS40=(Token)match(input,OPEN_PARENTHESYS,FOLLOW_OPEN_PARENTHESYS_in_incompleteComplexPropertyExpression1346); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_PARENTHESYS.add(OPEN_PARENTHESYS40);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
            // 110:29: -> ^( INCOMPLETE_INVERSE_OBJECT_PROPERTY_EXPRESSION )
            {
                // ManchesterOWLSyntaxAutoCompleteBase.g:110:32: ^( INCOMPLETE_INVERSE_OBJECT_PROPERTY_EXPRESSION )
                {
                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_INVERSE_OBJECT_PROPERTY_EXPRESSION, "INCOMPLETE_INVERSE_OBJECT_PROPERTY_EXPRESSION"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incompleteComplexPropertyExpression"

    public static class incompleteUnary_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incompleteUnary"
    // ManchesterOWLSyntaxAutoCompleteBase.g:113:1: incompleteUnary : ( NOT OPEN_PARENTHESYS -> ^( INCOMPLETE_NEGATED_EXPRESSION ) | incompleteQualifiedRestriction -> ^( incompleteQualifiedRestriction ) );
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteUnary_return incompleteUnary() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteUnary_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteUnary_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        Token NOT41=null;
        Token OPEN_PARENTHESYS42=null;
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteQualifiedRestriction_return incompleteQualifiedRestriction43 = null;


        ManchesterOWLSyntaxTree NOT41_tree=null;
        ManchesterOWLSyntaxTree OPEN_PARENTHESYS42_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_OPEN_PARENTHESYS=new RewriteRuleTokenStream(adaptor,"token OPEN_PARENTHESYS");
        RewriteRuleSubtreeStream stream_incompleteQualifiedRestriction=new RewriteRuleSubtreeStream(adaptor,"rule incompleteQualifiedRestriction");
        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:113:17: ( NOT OPEN_PARENTHESYS -> ^( INCOMPLETE_NEGATED_EXPRESSION ) | incompleteQualifiedRestriction -> ^( incompleteQualifiedRestriction ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NOT) ) {
                alt12=1;
            }
            else if ( (LA12_0==OPEN_CURLY_BRACES||LA12_0==INVERSE||LA12_0==IDENTIFIER) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:114:5: NOT OPEN_PARENTHESYS
                    {
                    NOT41=(Token)match(input,NOT,FOLLOW_NOT_in_incompleteUnary1373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT41);

                    OPEN_PARENTHESYS42=(Token)match(input,OPEN_PARENTHESYS,FOLLOW_OPEN_PARENTHESYS_in_incompleteUnary1375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PARENTHESYS.add(OPEN_PARENTHESYS42);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 114:27: -> ^( INCOMPLETE_NEGATED_EXPRESSION )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:114:30: ^( INCOMPLETE_NEGATED_EXPRESSION )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_NEGATED_EXPRESSION, "INCOMPLETE_NEGATED_EXPRESSION"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:115:7: incompleteQualifiedRestriction
                    {
                    pushFollow(FOLLOW_incompleteQualifiedRestriction_in_incompleteUnary1408);
                    incompleteQualifiedRestriction43=incompleteQualifiedRestriction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incompleteQualifiedRestriction.add(incompleteQualifiedRestriction43.getTree());


                    // AST REWRITE
                    // elements: incompleteQualifiedRestriction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 115:38: -> ^( incompleteQualifiedRestriction )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:115:41: ^( incompleteQualifiedRestriction )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot(stream_incompleteQualifiedRestriction.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incompleteUnary"

    public static class incompleteQualifiedRestriction_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incompleteQualifiedRestriction"
    // ManchesterOWLSyntaxAutoCompleteBase.g:118:1: incompleteQualifiedRestriction : ( options {backtrack=true; } : propertyExpression SOME -> ^( INCOMPLETE_SOME_RESTRICTION propertyExpression ) | propertyExpression ONLY -> ^( INCOMPLETE_ALL_RESTRICTION propertyExpression ) | incompleteCardinalityRestriction -> ^( incompleteCardinalityRestriction ) | incompleteOneOf -> ^( incompleteOneOf ) | incompleteValueRestriction -> ^( incompleteValueRestriction ) ) ;
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteQualifiedRestriction_return incompleteQualifiedRestriction() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteQualifiedRestriction_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteQualifiedRestriction_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        Token SOME45=null;
        Token ONLY47=null;
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.propertyExpression_return propertyExpression44 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.propertyExpression_return propertyExpression46 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteCardinalityRestriction_return incompleteCardinalityRestriction48 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteOneOf_return incompleteOneOf49 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteValueRestriction_return incompleteValueRestriction50 = null;


        ManchesterOWLSyntaxTree SOME45_tree=null;
        ManchesterOWLSyntaxTree ONLY47_tree=null;
        RewriteRuleTokenStream stream_ONLY=new RewriteRuleTokenStream(adaptor,"token ONLY");
        RewriteRuleTokenStream stream_SOME=new RewriteRuleTokenStream(adaptor,"token SOME");
        RewriteRuleSubtreeStream stream_propertyExpression=new RewriteRuleSubtreeStream(adaptor,"rule propertyExpression");
        RewriteRuleSubtreeStream stream_incompleteCardinalityRestriction=new RewriteRuleSubtreeStream(adaptor,"rule incompleteCardinalityRestriction");
        RewriteRuleSubtreeStream stream_incompleteOneOf=new RewriteRuleSubtreeStream(adaptor,"rule incompleteOneOf");
        RewriteRuleSubtreeStream stream_incompleteValueRestriction=new RewriteRuleSubtreeStream(adaptor,"rule incompleteValueRestriction");
        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:118:31: ( ( options {backtrack=true; } : propertyExpression SOME -> ^( INCOMPLETE_SOME_RESTRICTION propertyExpression ) | propertyExpression ONLY -> ^( INCOMPLETE_ALL_RESTRICTION propertyExpression ) | incompleteCardinalityRestriction -> ^( incompleteCardinalityRestriction ) | incompleteOneOf -> ^( incompleteOneOf ) | incompleteValueRestriction -> ^( incompleteValueRestriction ) ) )
            // ManchesterOWLSyntaxAutoCompleteBase.g:119:9: ( options {backtrack=true; } : propertyExpression SOME -> ^( INCOMPLETE_SOME_RESTRICTION propertyExpression ) | propertyExpression ONLY -> ^( INCOMPLETE_ALL_RESTRICTION propertyExpression ) | incompleteCardinalityRestriction -> ^( incompleteCardinalityRestriction ) | incompleteOneOf -> ^( incompleteOneOf ) | incompleteValueRestriction -> ^( incompleteValueRestriction ) )
            {
            // ManchesterOWLSyntaxAutoCompleteBase.g:119:9: ( options {backtrack=true; } : propertyExpression SOME -> ^( INCOMPLETE_SOME_RESTRICTION propertyExpression ) | propertyExpression ONLY -> ^( INCOMPLETE_ALL_RESTRICTION propertyExpression ) | incompleteCardinalityRestriction -> ^( incompleteCardinalityRestriction ) | incompleteOneOf -> ^( incompleteOneOf ) | incompleteValueRestriction -> ^( incompleteValueRestriction ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA13_1 = input.LA(2);

                if ( (synpred5_ManchesterOWLSyntaxAutoCompleteBase()) ) {
                    alt13=1;
                }
                else if ( (synpred6_ManchesterOWLSyntaxAutoCompleteBase()) ) {
                    alt13=2;
                }
                else if ( (synpred7_ManchesterOWLSyntaxAutoCompleteBase()) ) {
                    alt13=3;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case INVERSE:
                {
                int LA13_2 = input.LA(2);

                if ( (synpred5_ManchesterOWLSyntaxAutoCompleteBase()) ) {
                    alt13=1;
                }
                else if ( (synpred6_ManchesterOWLSyntaxAutoCompleteBase()) ) {
                    alt13=2;
                }
                else if ( (synpred7_ManchesterOWLSyntaxAutoCompleteBase()) ) {
                    alt13=3;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case OPEN_CURLY_BRACES:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:121:11: propertyExpression SOME
                    {
                    pushFollow(FOLLOW_propertyExpression_in_incompleteQualifiedRestriction1473);
                    propertyExpression44=gManchesterOWLSyntaxAutoCompleteCombined.propertyExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propertyExpression.add(propertyExpression44.getTree());
                    SOME45=(Token)match(input,SOME,FOLLOW_SOME_in_incompleteQualifiedRestriction1476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SOME.add(SOME45);



                    // AST REWRITE
                    // elements: propertyExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 121:36: -> ^( INCOMPLETE_SOME_RESTRICTION propertyExpression )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:121:39: ^( INCOMPLETE_SOME_RESTRICTION propertyExpression )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_SOME_RESTRICTION, "INCOMPLETE_SOME_RESTRICTION"), root_1);

                        adaptor.addChild(root_1, stream_propertyExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:122:11: propertyExpression ONLY
                    {
                    pushFollow(FOLLOW_propertyExpression_in_incompleteQualifiedRestriction1513);
                    propertyExpression46=gManchesterOWLSyntaxAutoCompleteCombined.propertyExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propertyExpression.add(propertyExpression46.getTree());
                    ONLY47=(Token)match(input,ONLY,FOLLOW_ONLY_in_incompleteQualifiedRestriction1515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONLY.add(ONLY47);



                    // AST REWRITE
                    // elements: propertyExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 122:35: -> ^( INCOMPLETE_ALL_RESTRICTION propertyExpression )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:122:38: ^( INCOMPLETE_ALL_RESTRICTION propertyExpression )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_ALL_RESTRICTION, "INCOMPLETE_ALL_RESTRICTION"), root_1);

                        adaptor.addChild(root_1, stream_propertyExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:123:11: incompleteCardinalityRestriction
                    {
                    pushFollow(FOLLOW_incompleteCardinalityRestriction_in_incompleteQualifiedRestriction1535);
                    incompleteCardinalityRestriction48=incompleteCardinalityRestriction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incompleteCardinalityRestriction.add(incompleteCardinalityRestriction48.getTree());


                    // AST REWRITE
                    // elements: incompleteCardinalityRestriction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 123:44: -> ^( incompleteCardinalityRestriction )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:123:47: ^( incompleteCardinalityRestriction )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot(stream_incompleteCardinalityRestriction.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:124:11: incompleteOneOf
                    {
                    pushFollow(FOLLOW_incompleteOneOf_in_incompleteQualifiedRestriction1553);
                    incompleteOneOf49=incompleteOneOf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incompleteOneOf.add(incompleteOneOf49.getTree());


                    // AST REWRITE
                    // elements: incompleteOneOf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 124:27: -> ^( incompleteOneOf )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:124:30: ^( incompleteOneOf )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot(stream_incompleteOneOf.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // ManchesterOWLSyntaxAutoCompleteBase.g:125:11: incompleteValueRestriction
                    {
                    pushFollow(FOLLOW_incompleteValueRestriction_in_incompleteQualifiedRestriction1571);
                    incompleteValueRestriction50=incompleteValueRestriction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incompleteValueRestriction.add(incompleteValueRestriction50.getTree());


                    // AST REWRITE
                    // elements: incompleteValueRestriction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
                    // 125:38: -> ^( incompleteValueRestriction )
                    {
                        // ManchesterOWLSyntaxAutoCompleteBase.g:125:41: ^( incompleteValueRestriction )
                        {
                        ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                        root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot(stream_incompleteValueRestriction.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incompleteQualifiedRestriction"

    public static class incompleteCardinalityRestriction_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incompleteCardinalityRestriction"
    // ManchesterOWLSyntaxAutoCompleteBase.g:129:1: incompleteCardinalityRestriction : propertyExpression restrictionKind INTEGER -> ^( INCOMPLETE_CARDINALITY_RESTRICTION restrictionKind INTEGER propertyExpression ) ;
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteCardinalityRestriction_return incompleteCardinalityRestriction() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteCardinalityRestriction_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteCardinalityRestriction_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        Token INTEGER53=null;
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.propertyExpression_return propertyExpression51 = null;

        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.restrictionKind_return restrictionKind52 = null;


        ManchesterOWLSyntaxTree INTEGER53_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleSubtreeStream stream_propertyExpression=new RewriteRuleSubtreeStream(adaptor,"rule propertyExpression");
        RewriteRuleSubtreeStream stream_restrictionKind=new RewriteRuleSubtreeStream(adaptor,"rule restrictionKind");
        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:129:35: ( propertyExpression restrictionKind INTEGER -> ^( INCOMPLETE_CARDINALITY_RESTRICTION restrictionKind INTEGER propertyExpression ) )
            // ManchesterOWLSyntaxAutoCompleteBase.g:130:11: propertyExpression restrictionKind INTEGER
            {
            pushFollow(FOLLOW_propertyExpression_in_incompleteCardinalityRestriction1611);
            propertyExpression51=gManchesterOWLSyntaxAutoCompleteCombined.propertyExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propertyExpression.add(propertyExpression51.getTree());
            pushFollow(FOLLOW_restrictionKind_in_incompleteCardinalityRestriction1614);
            restrictionKind52=gManchesterOWLSyntaxAutoCompleteCombined.restrictionKind();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_restrictionKind.add(restrictionKind52.getTree());
            INTEGER53=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_incompleteCardinalityRestriction1616); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTEGER.add(INTEGER53);



            // AST REWRITE
            // elements: restrictionKind, INTEGER, propertyExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
            // 130:56: -> ^( INCOMPLETE_CARDINALITY_RESTRICTION restrictionKind INTEGER propertyExpression )
            {
                // ManchesterOWLSyntaxAutoCompleteBase.g:130:59: ^( INCOMPLETE_CARDINALITY_RESTRICTION restrictionKind INTEGER propertyExpression )
                {
                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_CARDINALITY_RESTRICTION, "INCOMPLETE_CARDINALITY_RESTRICTION"), root_1);

                adaptor.addChild(root_1, stream_restrictionKind.nextTree());
                adaptor.addChild(root_1, stream_INTEGER.nextNode());
                adaptor.addChild(root_1, stream_propertyExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incompleteCardinalityRestriction"

    public static class incompleteOneOf_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incompleteOneOf"
    // ManchesterOWLSyntaxAutoCompleteBase.g:133:1: incompleteOneOf : OPEN_CURLY_BRACES IDENTIFIER ( COMMA IDENTIFIER )* COMMA -> ^( INCOMPLETE_ONE_OF ( IDENTIFIER )+ ) ;
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteOneOf_return incompleteOneOf() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteOneOf_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteOneOf_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        Token OPEN_CURLY_BRACES54=null;
        Token IDENTIFIER55=null;
        Token COMMA56=null;
        Token IDENTIFIER57=null;
        Token COMMA58=null;

        ManchesterOWLSyntaxTree OPEN_CURLY_BRACES54_tree=null;
        ManchesterOWLSyntaxTree IDENTIFIER55_tree=null;
        ManchesterOWLSyntaxTree COMMA56_tree=null;
        ManchesterOWLSyntaxTree IDENTIFIER57_tree=null;
        ManchesterOWLSyntaxTree COMMA58_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACES=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACES");

        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:133:17: ( OPEN_CURLY_BRACES IDENTIFIER ( COMMA IDENTIFIER )* COMMA -> ^( INCOMPLETE_ONE_OF ( IDENTIFIER )+ ) )
            // ManchesterOWLSyntaxAutoCompleteBase.g:134:5: OPEN_CURLY_BRACES IDENTIFIER ( COMMA IDENTIFIER )* COMMA
            {
            OPEN_CURLY_BRACES54=(Token)match(input,OPEN_CURLY_BRACES,FOLLOW_OPEN_CURLY_BRACES_in_incompleteOneOf1647); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_CURLY_BRACES.add(OPEN_CURLY_BRACES54);

            IDENTIFIER55=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_incompleteOneOf1649); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER55);

            // ManchesterOWLSyntaxAutoCompleteBase.g:134:34: ( COMMA IDENTIFIER )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COMMA) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==IDENTIFIER) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ManchesterOWLSyntaxAutoCompleteBase.g:134:35: COMMA IDENTIFIER
            	    {
            	    COMMA56=(Token)match(input,COMMA,FOLLOW_COMMA_in_incompleteOneOf1652); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA56);

            	    IDENTIFIER57=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_incompleteOneOf1654); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER57);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_incompleteOneOf1658); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA58);



            // AST REWRITE
            // elements: IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
            // 134:60: -> ^( INCOMPLETE_ONE_OF ( IDENTIFIER )+ )
            {
                // ManchesterOWLSyntaxAutoCompleteBase.g:134:63: ^( INCOMPLETE_ONE_OF ( IDENTIFIER )+ )
                {
                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_ONE_OF, "INCOMPLETE_ONE_OF"), root_1);

                if ( !(stream_IDENTIFIER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incompleteOneOf"

    public static class incompleteValueRestriction_return extends ParserRuleReturnScope {
        ManchesterOWLSyntaxTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incompleteValueRestriction"
    // ManchesterOWLSyntaxAutoCompleteBase.g:137:1: incompleteValueRestriction : propertyExpression VALUE -> ^( INCOMPLETE_VALUE_RESTRICTION propertyExpression ) ;
    public final ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteValueRestriction_return incompleteValueRestriction() throws RecognitionException {
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteValueRestriction_return retval = new ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase.incompleteValueRestriction_return();
        retval.start = input.LT(1);

        ManchesterOWLSyntaxTree root_0 = null;

        Token VALUE60=null;
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.propertyExpression_return propertyExpression59 = null;


        ManchesterOWLSyntaxTree VALUE60_tree=null;
        RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
        RewriteRuleSubtreeStream stream_propertyExpression=new RewriteRuleSubtreeStream(adaptor,"rule propertyExpression");
        try {
            // ManchesterOWLSyntaxAutoCompleteBase.g:137:29: ( propertyExpression VALUE -> ^( INCOMPLETE_VALUE_RESTRICTION propertyExpression ) )
            // ManchesterOWLSyntaxAutoCompleteBase.g:137:31: propertyExpression VALUE
            {
            pushFollow(FOLLOW_propertyExpression_in_incompleteValueRestriction1679);
            propertyExpression59=gManchesterOWLSyntaxAutoCompleteCombined.propertyExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propertyExpression.add(propertyExpression59.getTree());
            VALUE60=(Token)match(input,VALUE,FOLLOW_VALUE_in_incompleteValueRestriction1681); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VALUE.add(VALUE60);



            // AST REWRITE
            // elements: propertyExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ManchesterOWLSyntaxTree)adaptor.nil();
            // 137:57: -> ^( INCOMPLETE_VALUE_RESTRICTION propertyExpression )
            {
                // ManchesterOWLSyntaxAutoCompleteBase.g:137:60: ^( INCOMPLETE_VALUE_RESTRICTION propertyExpression )
                {
                ManchesterOWLSyntaxTree root_1 = (ManchesterOWLSyntaxTree)adaptor.nil();
                root_1 = (ManchesterOWLSyntaxTree)adaptor.becomeRoot((ManchesterOWLSyntaxTree)adaptor.create(INCOMPLETE_VALUE_RESTRICTION, "INCOMPLETE_VALUE_RESTRICTION"), root_1);

                adaptor.addChild(root_1, stream_propertyExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (ManchesterOWLSyntaxTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ManchesterOWLSyntaxTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incompleteValueRestriction"

    // $ANTLR start synpred1_ManchesterOWLSyntaxAutoCompleteBase
    public final void synpred1_ManchesterOWLSyntaxAutoCompleteBase_fragment() throws RecognitionException {   
        List list_rest=null;
        ManchesterOWLSyntaxAutoCompleteCombined_ManchesterOWLSyntaxAutoCompleteBase_MOWLParser.propertyExpression_return head = null;

        RuleReturnScope rest = null;
        // ManchesterOWLSyntaxAutoCompleteBase.g:97:7: (head= propertyExpression ( COMPOSITION rest+= propertyExpression )+ COMPOSITION )
        // ManchesterOWLSyntaxAutoCompleteBase.g:97:7: head= propertyExpression ( COMPOSITION rest+= propertyExpression )+ COMPOSITION
        {
        pushFollow(FOLLOW_propertyExpression_in_synpred1_ManchesterOWLSyntaxAutoCompleteBase1130);
        head=gManchesterOWLSyntaxAutoCompleteCombined.propertyExpression();

        state._fsp--;
        if (state.failed) return ;
        // ManchesterOWLSyntaxAutoCompleteBase.g:97:33: ( COMPOSITION rest+= propertyExpression )+
        int cnt15=0;
        loop15:
        do {
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==COMPOSITION) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==INVERSE||LA15_1==IDENTIFIER) ) {
                    alt15=1;
                }


            }


            switch (alt15) {
        	case 1 :
        	    // ManchesterOWLSyntaxAutoCompleteBase.g:97:34: COMPOSITION rest+= propertyExpression
        	    {
        	    match(input,COMPOSITION,FOLLOW_COMPOSITION_in_synpred1_ManchesterOWLSyntaxAutoCompleteBase1133); if (state.failed) return ;
        	    pushFollow(FOLLOW_propertyExpression_in_synpred1_ManchesterOWLSyntaxAutoCompleteBase1137);
        	    rest=gManchesterOWLSyntaxAutoCompleteCombined.propertyExpression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    if (list_rest==null) list_rest=new ArrayList();
        	    list_rest.add(rest);


        	    }
        	    break;

        	default :
        	    if ( cnt15 >= 1 ) break loop15;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(15, input);
                    throw eee;
            }
            cnt15++;
        } while (true);

        match(input,COMPOSITION,FOLLOW_COMPOSITION_in_synpred1_ManchesterOWLSyntaxAutoCompleteBase1142); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_ManchesterOWLSyntaxAutoCompleteBase

    // $ANTLR start synpred2_ManchesterOWLSyntaxAutoCompleteBase
    public final void synpred2_ManchesterOWLSyntaxAutoCompleteBase_fragment() throws RecognitionException {   
        // ManchesterOWLSyntaxAutoCompleteBase.g:98:9: ( ( conjunction ( OR . )* ) OR ( incompleteConjunction )? )
        // ManchesterOWLSyntaxAutoCompleteBase.g:98:9: ( conjunction ( OR . )* ) OR ( incompleteConjunction )?
        {
        // ManchesterOWLSyntaxAutoCompleteBase.g:98:9: ( conjunction ( OR . )* )
        // ManchesterOWLSyntaxAutoCompleteBase.g:98:10: conjunction ( OR . )*
        {
        pushFollow(FOLLOW_conjunction_in_synpred2_ManchesterOWLSyntaxAutoCompleteBase1167);
        gManchesterOWLSyntaxAutoCompleteCombined.conjunction();

        state._fsp--;
        if (state.failed) return ;
        // ManchesterOWLSyntaxAutoCompleteBase.g:98:22: ( OR . )*
        loop16:
        do {
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
        	case 1 :
        	    // ManchesterOWLSyntaxAutoCompleteBase.g:98:23: OR .
        	    {
        	    match(input,OR,FOLLOW_OR_in_synpred2_ManchesterOWLSyntaxAutoCompleteBase1170); if (state.failed) return ;
        	    matchAny(input); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop16;
            }
        } while (true);


        }

        match(input,OR,FOLLOW_OR_in_synpred2_ManchesterOWLSyntaxAutoCompleteBase1177); if (state.failed) return ;
        // ManchesterOWLSyntaxAutoCompleteBase.g:98:35: ( incompleteConjunction )?
        int alt17=2;
        int LA17_0 = input.LA(1);

        if ( (LA17_0==OPEN_CURLY_BRACES||LA17_0==NOT||LA17_0==INVERSE||LA17_0==DBLQUOTE||(LA17_0>=IDENTIFIER && LA17_0<=ENTITY_REFERENCE)) ) {
            alt17=1;
        }
        switch (alt17) {
            case 1 :
                // ManchesterOWLSyntaxAutoCompleteBase.g:98:35: incompleteConjunction
                {
                pushFollow(FOLLOW_incompleteConjunction_in_synpred2_ManchesterOWLSyntaxAutoCompleteBase1180);
                incompleteConjunction();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred2_ManchesterOWLSyntaxAutoCompleteBase

    // $ANTLR start synpred3_ManchesterOWLSyntaxAutoCompleteBase
    public final void synpred3_ManchesterOWLSyntaxAutoCompleteBase_fragment() throws RecognitionException {   
        // ManchesterOWLSyntaxAutoCompleteBase.g:99:9: ( incompleteConjunction )
        // ManchesterOWLSyntaxAutoCompleteBase.g:99:9: incompleteConjunction
        {
        pushFollow(FOLLOW_incompleteConjunction_in_synpred3_ManchesterOWLSyntaxAutoCompleteBase1204);
        incompleteConjunction();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_ManchesterOWLSyntaxAutoCompleteBase

    // $ANTLR start synpred4_ManchesterOWLSyntaxAutoCompleteBase
    public final void synpred4_ManchesterOWLSyntaxAutoCompleteBase_fragment() throws RecognitionException {   
        // ManchesterOWLSyntaxAutoCompleteBase.g:100:9: ( incompleteUnary )
        // ManchesterOWLSyntaxAutoCompleteBase.g:100:9: incompleteUnary
        {
        pushFollow(FOLLOW_incompleteUnary_in_synpred4_ManchesterOWLSyntaxAutoCompleteBase1227);
        incompleteUnary();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_ManchesterOWLSyntaxAutoCompleteBase

    // $ANTLR start synpred5_ManchesterOWLSyntaxAutoCompleteBase
    public final void synpred5_ManchesterOWLSyntaxAutoCompleteBase_fragment() throws RecognitionException {   
        // ManchesterOWLSyntaxAutoCompleteBase.g:121:11: ( propertyExpression SOME )
        // ManchesterOWLSyntaxAutoCompleteBase.g:121:11: propertyExpression SOME
        {
        pushFollow(FOLLOW_propertyExpression_in_synpred5_ManchesterOWLSyntaxAutoCompleteBase1473);
        gManchesterOWLSyntaxAutoCompleteCombined.propertyExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,SOME,FOLLOW_SOME_in_synpred5_ManchesterOWLSyntaxAutoCompleteBase1476); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_ManchesterOWLSyntaxAutoCompleteBase

    // $ANTLR start synpred6_ManchesterOWLSyntaxAutoCompleteBase
    public final void synpred6_ManchesterOWLSyntaxAutoCompleteBase_fragment() throws RecognitionException {   
        // ManchesterOWLSyntaxAutoCompleteBase.g:122:11: ( propertyExpression ONLY )
        // ManchesterOWLSyntaxAutoCompleteBase.g:122:11: propertyExpression ONLY
        {
        pushFollow(FOLLOW_propertyExpression_in_synpred6_ManchesterOWLSyntaxAutoCompleteBase1513);
        gManchesterOWLSyntaxAutoCompleteCombined.propertyExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,ONLY,FOLLOW_ONLY_in_synpred6_ManchesterOWLSyntaxAutoCompleteBase1515); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_ManchesterOWLSyntaxAutoCompleteBase

    // $ANTLR start synpred7_ManchesterOWLSyntaxAutoCompleteBase
    public final void synpred7_ManchesterOWLSyntaxAutoCompleteBase_fragment() throws RecognitionException {   
        // ManchesterOWLSyntaxAutoCompleteBase.g:123:11: ( incompleteCardinalityRestriction )
        // ManchesterOWLSyntaxAutoCompleteBase.g:123:11: incompleteCardinalityRestriction
        {
        pushFollow(FOLLOW_incompleteCardinalityRestriction_in_synpred7_ManchesterOWLSyntaxAutoCompleteBase1535);
        incompleteCardinalityRestriction();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_ManchesterOWLSyntaxAutoCompleteBase

    // Delegated rules

    public final boolean synpred2_ManchesterOWLSyntaxAutoCompleteBase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_ManchesterOWLSyntaxAutoCompleteBase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_ManchesterOWLSyntaxAutoCompleteBase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_ManchesterOWLSyntaxAutoCompleteBase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_ManchesterOWLSyntaxAutoCompleteBase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_ManchesterOWLSyntaxAutoCompleteBase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_ManchesterOWLSyntaxAutoCompleteBase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_ManchesterOWLSyntaxAutoCompleteBase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_ManchesterOWLSyntaxAutoCompleteBase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_ManchesterOWLSyntaxAutoCompleteBase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_ManchesterOWLSyntaxAutoCompleteBase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_ManchesterOWLSyntaxAutoCompleteBase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_ManchesterOWLSyntaxAutoCompleteBase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_ManchesterOWLSyntaxAutoCompleteBase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\1\uffff\1\6\1\10\1\12\7\uffff";
    static final String DFA3_minS =
        "\1\24\3\6\7\uffff";
    static final String DFA3_maxS =
        "\1\32\3\55\7\uffff";
    static final String DFA3_acceptS =
        "\4\uffff\1\7\1\2\1\1\1\4\1\3\1\6\1\5";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\4\1\2\3\uffff\1\3",
            "\1\5\5\uffff\1\5\6\uffff\1\5\24\uffff\1\5\3\uffff\2\5",
            "\1\7\5\uffff\1\7\6\uffff\1\7\24\uffff\1\7\3\uffff\2\7",
            "\1\11\5\uffff\1\11\6\uffff\1\11\24\uffff\1\11\3\uffff\2\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "72:17: ( SUBCLASS_OF -> ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ) | SUBCLASS_OF superClass= incompleteExpression -> ^( INCOMPLETE_SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $superClass) ) | EQUIVALENT_TO -> ^( INCOMPLETE_EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ) | EQUIVALENT_TO rhs= incompleteExpression -> ^( EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $rhs) ) | DISJOINT_WITH -> ^( INCOMPLETE_DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ) | DISJOINT_WITH disjoint= incompleteExpression -> ^( DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ^( INCOMPLETE_EXPRESSION $disjoint) ) | SUB_PROPERTY_OF -> ^( INCOMPLETE_SUB_PROPERTY_AXIOM ^( EXPRESSION $lhs) ) )";
        }
    }
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\3\uffff\1\7\1\10\5\uffff";
    static final String DFA4_minS =
        "\1\27\2\uffff\2\6\5\uffff";
    static final String DFA4_maxS =
        "\1\34\2\uffff\2\55\5\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\7\1\4\1\3\1\5\1\6";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\5\1\uffff\1\3\1\4",
            "",
            "",
            "\1\6\5\uffff\1\6\6\uffff\1\6\24\uffff\1\6\3\uffff\2\6",
            "\1\11\5\uffff\1\11\6\uffff\1\11\24\uffff\1\11\3\uffff\2\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "82:25: ( SAME_AS -> ^( INCOMPLETE_SAME_AS_AXIOM ^( EXPRESSION $lhsID) ) | DIFFERENT_FROM -> ^( INCOMPLETE_DIFFERENT_FROM_AXIOM ^( EXPRESSION $lhsID) ) | DOMAIN -> ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) ) | DOMAIN incompleteDomain= incompleteExpression -> ^( INCOMPLETE_DOMAIN ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteDomain) ) | RANGE -> ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) ) | RANGE incompleteRange= incompleteExpression -> ^( INCOMPLETE_RANGE ^( EXPRESSION $lhsID) ^( INCOMPLETE_EXPRESSION $incompleteRange) ) | INVERSE_OF -> ^( INCOMPLETE_INVERSE_OF ^( EXPRESSION $lhsID) ) )";
        }
    }
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\6\6\0\5\uffff";
    static final String DFA9_maxS =
        "\1\55\6\0\5\uffff";
    static final String DFA9_acceptS =
        "\7\uffff\1\1\1\2\1\3\1\4\1\5";
    static final String DFA9_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\5\5\uffff\1\3\6\uffff\1\2\24\uffff\1\6\3\uffff\1\1\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "95:5: ( options {backtrack=true; } : head= propertyExpression ( COMPOSITION rest+= propertyExpression )+ COMPOSITION -> ^( INCOMPLETE_PROPERTY_CHAIN $head $rest) | ( conjunction ( OR . )* ) OR ( incompleteConjunction )? -> ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? ) | incompleteConjunction -> ^( INCOMPLETE_DISJUNCTION ( ^( incompleteConjunction ) )? ) | incompleteUnary -> ^( incompleteUnary ) | expression IDENTIFIER -> ^( INCOMPLETE_EXPRESSION ^( EXPRESSION expression ) IDENTIFIER ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 7;}

                        else if ( (synpred2_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 8;}

                        else if ( (synpred3_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 9;}

                        else if ( (synpred4_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 7;}

                        else if ( (synpred2_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 8;}

                        else if ( (synpred3_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 9;}

                        else if ( (synpred4_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 8;}

                        else if ( (synpred3_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 9;}

                        else if ( (synpred4_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 8;}

                        else if ( (synpred3_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 9;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 8;}

                        else if ( (synpred3_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 9;}

                        else if ( (synpred4_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 8;}

                        else if ( (synpred3_ManchesterOWLSyntaxAutoCompleteBase()) ) {s = 9;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\1\uffff\1\11\10\uffff";
    static final String DFA7_minS =
        "\1\13\1\4\1\12\1\5\1\12\1\5\1\13\1\12\2\uffff";
    static final String DFA7_maxS =
        "\1\13\1\134\1\22\1\54\2\13\1\54\1\44\2\uffff";
    static final String DFA7_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\2\10\1\6\5\10\1\3\6\10\1\5\24\10\1\7\3\10\1\2\1\4\57\10",
            "\1\11\1\10\1\uffff\6\11",
            "\1\11\5\uffff\1\10\40\uffff\1\11",
            "\1\11\1\10",
            "\1\11\5\uffff\1\10",
            "\1\10\40\uffff\1\11",
            "\1\11\1\10\30\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 98:22: ( OR . )*";
        }
    }
    static final String DFA16_eotS =
        "\12\uffff";
    static final String DFA16_eofS =
        "\1\uffff\1\11\10\uffff";
    static final String DFA16_minS =
        "\1\13\1\4\1\12\1\5\1\12\1\5\1\13\1\12\2\uffff";
    static final String DFA16_maxS =
        "\1\13\1\134\1\22\1\54\2\13\1\54\1\44\2\uffff";
    static final String DFA16_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA16_specialS =
        "\12\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1",
            "\2\10\1\6\5\10\1\3\6\10\1\5\24\10\1\7\3\10\1\2\1\4\57\10",
            "\1\11\1\10\1\uffff\6\11",
            "\1\11\5\uffff\1\10\40\uffff\1\11",
            "\1\11\1\10",
            "\1\11\5\uffff\1\10",
            "\1\10\40\uffff\1\11",
            "\1\11\1\10\30\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 98:22: ( OR . )*";
        }
    }
 

    public static final BitSet FOLLOW_expression_in_standaloneExpression200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_standaloneExpression202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incompleteBinaryAxiom_in_incompleteAxiom228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incompleteUnaryAxiom_in_incompleteAxiom242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incompleteAssertionAxiom_in_incompleteAxiom258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_incompleteAssertionAxiom282 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_INSTANCE_OF_in_incompleteAssertionAxiom285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPES_in_incompleteAssertionAxiom289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryCharacteristic_in_incompleteUnaryAxiom327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_incompleteBinaryAxiom375 = new BitSet(new long[]{0x0000000004700000L});
    public static final BitSet FOLLOW_SUBCLASS_OF_in_incompleteBinaryAxiom430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBCLASS_OF_in_incompleteBinaryAxiom466 = new BitSet(new long[]{0x0000310000081040L});
    public static final BitSet FOLLOW_incompleteExpression_in_incompleteBinaryAxiom472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUIVALENT_TO_in_incompleteBinaryAxiom513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUIVALENT_TO_in_incompleteBinaryAxiom547 = new BitSet(new long[]{0x0000310000081040L});
    public static final BitSet FOLLOW_incompleteExpression_in_incompleteBinaryAxiom553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISJOINT_WITH_in_incompleteBinaryAxiom593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISJOINT_WITH_in_incompleteBinaryAxiom626 = new BitSet(new long[]{0x0000310000081040L});
    public static final BitSet FOLLOW_incompleteExpression_in_incompleteBinaryAxiom632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_PROPERTY_OF_in_incompleteBinaryAxiom672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_incompleteBinaryAxiom743 = new BitSet(new long[]{0x000000001B800000L});
    public static final BitSet FOLLOW_SAME_AS_in_incompleteBinaryAxiom768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIFFERENT_FROM_in_incompleteBinaryAxiom806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOMAIN_in_incompleteBinaryAxiom842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOMAIN_in_incompleteBinaryAxiom878 = new BitSet(new long[]{0x0000310000081040L});
    public static final BitSet FOLLOW_incompleteExpression_in_incompleteBinaryAxiom884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_in_incompleteBinaryAxiom927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_in_incompleteBinaryAxiom963 = new BitSet(new long[]{0x0000310000081040L});
    public static final BitSet FOLLOW_incompleteExpression_in_incompleteBinaryAxiom970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERSE_OF_in_incompleteBinaryAxiom1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyExpression_in_incompleteExpression1130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COMPOSITION_in_incompleteExpression1133 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_propertyExpression_in_incompleteExpression1137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COMPOSITION_in_incompleteExpression1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_incompleteExpression1167 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_OR_in_incompleteExpression1170 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_OR_in_incompleteExpression1177 = new BitSet(new long[]{0x0000310000081042L});
    public static final BitSet FOLLOW_incompleteConjunction_in_incompleteExpression1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incompleteConjunction_in_incompleteExpression1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incompleteUnary_in_incompleteExpression1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_incompleteExpression1243 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_incompleteExpression1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_incompleteConjunction1295 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_AND_in_incompleteConjunction1298 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_AND_in_incompleteConjunction1307 = new BitSet(new long[]{0x0000100000081042L});
    public static final BitSet FOLLOW_incompleteUnary_in_incompleteConjunction1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERSE_in_incompleteComplexPropertyExpression1344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPEN_PARENTHESYS_in_incompleteComplexPropertyExpression1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_incompleteUnary1373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPEN_PARENTHESYS_in_incompleteUnary1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incompleteQualifiedRestriction_in_incompleteUnary1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyExpression_in_incompleteQualifiedRestriction1473 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SOME_in_incompleteQualifiedRestriction1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyExpression_in_incompleteQualifiedRestriction1513 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ONLY_in_incompleteQualifiedRestriction1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incompleteCardinalityRestriction_in_incompleteQualifiedRestriction1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incompleteOneOf_in_incompleteQualifiedRestriction1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incompleteValueRestriction_in_incompleteQualifiedRestriction1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyExpression_in_incompleteCardinalityRestriction1611 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_restrictionKind_in_incompleteCardinalityRestriction1614 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_INTEGER_in_incompleteCardinalityRestriction1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACES_in_incompleteOneOf1647 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_incompleteOneOf1649 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_COMMA_in_incompleteOneOf1652 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_incompleteOneOf1654 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_COMMA_in_incompleteOneOf1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyExpression_in_incompleteValueRestriction1679 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_VALUE_in_incompleteValueRestriction1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyExpression_in_synpred1_ManchesterOWLSyntaxAutoCompleteBase1130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COMPOSITION_in_synpred1_ManchesterOWLSyntaxAutoCompleteBase1133 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_propertyExpression_in_synpred1_ManchesterOWLSyntaxAutoCompleteBase1137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COMPOSITION_in_synpred1_ManchesterOWLSyntaxAutoCompleteBase1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_synpred2_ManchesterOWLSyntaxAutoCompleteBase1167 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_OR_in_synpred2_ManchesterOWLSyntaxAutoCompleteBase1170 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_OR_in_synpred2_ManchesterOWLSyntaxAutoCompleteBase1177 = new BitSet(new long[]{0x0000310000081042L});
    public static final BitSet FOLLOW_incompleteConjunction_in_synpred2_ManchesterOWLSyntaxAutoCompleteBase1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incompleteConjunction_in_synpred3_ManchesterOWLSyntaxAutoCompleteBase1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incompleteUnary_in_synpred4_ManchesterOWLSyntaxAutoCompleteBase1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyExpression_in_synpred5_ManchesterOWLSyntaxAutoCompleteBase1473 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SOME_in_synpred5_ManchesterOWLSyntaxAutoCompleteBase1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyExpression_in_synpred6_ManchesterOWLSyntaxAutoCompleteBase1513 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ONLY_in_synpred6_ManchesterOWLSyntaxAutoCompleteBase1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incompleteCardinalityRestriction_in_synpred7_ManchesterOWLSyntaxAutoCompleteBase1535 = new BitSet(new long[]{0x0000000000000002L});

}