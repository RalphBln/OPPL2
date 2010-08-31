package org.coode.parsers.oppl.patterns;

// $ANTLR 3.2 Sep 23, 2009 12:02:23 MOWLParser.g 2010-08-27 12:09:15
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteEmptyStreamException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.coode.parsers.oppl.OPPLSyntaxTree;

public class OPPLPatternParser_OPPLParser_MOWLParser extends Parser {
	public static final int VALUE_RESTRICTION = 63;
	public static final int LETTER = 43;
	public static final int REMOVE = 91;
	public static final int TYPES = 39;
	public static final int SAME_AS_AXIOM = 52;
	public static final int INVERSE_OF = 25;
	public static final int NOT = 12;
	public static final int SUBCLASS_OF = 20;
	public static final int EOF = -1;
	public static final int ESCLAMATION_MARK = 149;
	public static final int ACTIONS = 101;
	public static final int CREATE_IDENTIFIER = 151;
	public static final int CREATE = 80;
	public static final int POW = 36;
	public static final int INPUT_VARIABLE_DEFINITION = 96;
	public static final int NOT_EQUAL = 72;
	public static final int INVERSE_OBJECT_PROPERTY_EXPRESSION = 68;
	public static final int INSTANCE_OF = 38;
	public static final int BEGIN = 83;
	public static final int RETURN = 415;
	public static final int VARIABLE_SCOPE = 104;
	public static final int INEQUALITY_CONSTRAINT = 94;
	public static final int QUESTION_MARK = 46;
	public static final int SYMMETRIC = 30;
	public static final int CARDINALITY_RESTRICTION = 64;
	public static final int SELECT = 75;
	public static final int ROLE_ASSERTION = 67;
	public static final int DIFFERENT_FROM_AXIOM = 53;
	public static final int CREATE_OPPL_FUNCTION = 98;
	public static final int TRANSITIVE = 34;
	public static final int ANTI_SYMMETRIC = 31;
	public static final int ARGUMENTS = 417;
	public static final int ALL_RESTRICTION = 62;
	public static final int CONJUNCTION = 56;
	public static final int OPPL_STATEMENT = 107;
	public static final int NEGATED_ASSERTION = 59;
	public static final int WHITESPACE = 9;
	public static final int MATCH = 176;
	public static final int IN_SET_CONSTRAINT = 95;
	public static final int SEMICOLON = 422;
	public static final int VALUE = 18;
	public static final int FAIL = 466;
	public static final int GROUPS = 356;
	public static final int OPEN_CURLY_BRACES = 6;
	public static final int DISJUNCTION = 55;
	public static final int INVERSE = 19;
	public static final int NAF_CONSTRAINT = 467;
	public static final int DBLQUOTE = 40;
	public static final int STRING_OPERATION = 394;
	public static final int OR = 11;
	public static final int CONSTANT = 70;
	public static final int QUERY = 103;
	public static final int ENTITY_REFERENCE = 45;
	public static final int END = 84;
	public static final int COMPOSITION = 4;
	public static final int CLOSED_SQUARE_BRACKET = 86;
	public static final int DOLLAR = 400;
	public static final int SAME_AS = 23;
	public static final int WHERE = 71;
	public static final int DISJOINT_WITH = 26;
	public static final int SUPER_PROPERTY_OF = 88;
	public static final int VARIABLE_TYPE = 89;
	public static final int ATTRIBUTE_SELECTOR = 283;
	public static final int CLOSED_PARENTHESYS = 8;
	public static final int ONLY = 14;
	public static final int EQUIVALENT_TO_AXIOM = 49;
	public static final int SUB_PROPERTY_OF = 21;
	public static final int NEGATED_EXPRESSION = 58;
	public static final int MAX = 16;
	public static final int CREATE_DISJUNCTION = 82;
	public static final int AND = 10;
	public static final int ASSERTED_CLAUSE = 92;
	public static final int INVERSE_PROPERTY = 60;
	public static final int OPPL_PATTERN = 419;
	public static final int VARIABLE_NAME = 464;
	public static final int THIS_CLASS = 416;
	public static final int DIFFERENT_FROM = 24;
	public static final int IN = 74;
	public static final int EQUIVALENT_TO = 22;
	public static final int UNARY_AXIOM = 54;
	public static final int COMMA = 37;
	public static final int CLOSED_CURLY_BRACES = 7;
	public static final int IDENTIFIER = 44;
	public static final int SOME = 13;
	public static final int EQUAL = 73;
	public static final int OPEN_PARENTHESYS = 5;
	public static final int REFLEXIVE = 32;
	public static final int PLUS = 79;
	public static final int DIGIT = 41;
	public static final int DOT = 78;
	public static final int SUPER_CLASS_OF = 87;
	public static final int EXPRESSION = 69;
	public static final int SOME_RESTRICTION = 61;
	public static final int ADD = 90;
	public static final int INTEGER = 42;
	public static final int GENERATED_VARIABLE_DEFINITION = 97;
	public static final int EXACTLY = 17;
	public static final int SUB_PROPERTY_AXIOM = 51;
	public static final int OPEN_SQUARE_BRACKET = 85;
	public static final int VALUES = 354;
	public static final int REGEXP_CONSTRAINT = 465;
	public static final int RANGE = 28;
	public static final int ONE_OF = 65;
	public static final int VARIABLE_DEFINITIONS = 102;
	public static final int MIN = 15;
	public static final int SUB_CLASS_AXIOM = 48;
	public static final int PLAIN_CLAUSE = 93;
	public static final int Tokens = 47;
	public static final int DOMAIN = 27;
	public static final int SUBPROPERTY_OF = 105;
	public static final int OPPL_FUNCTION = 100;
	public static final int COLON = 77;
	public static final int DISJOINT_WITH_AXIOM = 50;
	public static final int CREATE_INTERSECTION = 81;
	public static final int HYPHEN = 465;
	public static final int INVERSE_FUNCTIONAL = 35;
	public static final int RENDERING = 355;
	public static final int VARIABLE_IDENTIFIER = 106;
	public static final int IRREFLEXIVE = 33;
	public static final int PLAIN_IDENTIFIER = 152;
	public static final int VARIABLE_ATTRIBUTE = 99;
	public static final int ASSERTED = 76;
	public static final int FUNCTIONAL = 29;
	public static final int PROPERTY_CHAIN = 57;
	public static final int PATTERN_REFERENCE = 421;
	public static final int TYPE_ASSERTION = 66;
	// delegates
	// delegators
	public OPPLPatternParser gOPPLPatternParser;
	public OPPLPatternParser_OPPLParser gOPPLParser;
	public OPPLPatternParser_OPPLParser gParent;

	public OPPLPatternParser_OPPLParser_MOWLParser(TokenStream input,
			OPPLPatternParser gOPPLPatternParser,
			OPPLPatternParser_OPPLParser gOPPLParser) {
		this(input, new RecognizerSharedState(), gOPPLPatternParser,
				gOPPLParser);
	}

	public OPPLPatternParser_OPPLParser_MOWLParser(TokenStream input,
			RecognizerSharedState state, OPPLPatternParser gOPPLPatternParser,
			OPPLPatternParser_OPPLParser gOPPLParser) {
		super(input, state);
		this.gOPPLPatternParser = gOPPLPatternParser;
		this.gOPPLParser = gOPPLParser;
		this.gParent = gOPPLParser;
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}

	public TreeAdaptor getTreeAdaptor() {
		return this.adaptor;
	}

	public String[] getTokenNames() {
		return OPPLPatternParser.tokenNames;
	}

	public String getGrammarFileName() {
		return "MOWLParser.g";
	}

	public void displayRecognitionError(String[] tokenNames,
			RecognitionException e) {
	}

	public static class axiom_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "axiom"
	// MOWLParser.g:63:1: axiom options {backtrack=true; } : ( binaryAxiom -> ^(
	// binaryAxiom ) | unaryAxiom -> ^( unaryAxiom ) | assertionAxiom -> ^(
	// assertionAxiom ) );
	public final OPPLPatternParser_OPPLParser_MOWLParser.axiom_return axiom()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.axiom_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.axiom_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.binaryAxiom_return binaryAxiom1 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.unaryAxiom_return unaryAxiom2 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.assertionAxiom_return assertionAxiom3 = null;
		RewriteRuleSubtreeStream stream_binaryAxiom = new RewriteRuleSubtreeStream(
				this.adaptor, "rule binaryAxiom");
		RewriteRuleSubtreeStream stream_unaryAxiom = new RewriteRuleSubtreeStream(
				this.adaptor, "rule unaryAxiom");
		RewriteRuleSubtreeStream stream_assertionAxiom = new RewriteRuleSubtreeStream(
				this.adaptor, "rule assertionAxiom");
		try {
			// MOWLParser.g:63:37: ( binaryAxiom -> ^( binaryAxiom ) |
			// unaryAxiom -> ^( unaryAxiom ) | assertionAxiom -> ^(
			// assertionAxiom ) )
			int alt1 = 3;
			alt1 = this.dfa1.predict(this.input);
			switch (alt1) {
			case 1:
				// MOWLParser.g:64:3: binaryAxiom
			{
				this.pushFollow(FOLLOW_binaryAxiom_in_axiom231);
				binaryAxiom1 = this.binaryAxiom();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_binaryAxiom.add(binaryAxiom1.getTree());
				}
				// AST REWRITE
				// elements: binaryAxiom
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 64:15: -> ^( binaryAxiom )
					{
						// MOWLParser.g:64:18: ^( binaryAxiom )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_binaryAxiom.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// MOWLParser.g:65:5: unaryAxiom
			{
				this.pushFollow(FOLLOW_unaryAxiom_in_axiom243);
				unaryAxiom2 = this.unaryAxiom();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_unaryAxiom.add(unaryAxiom2.getTree());
				}
				// AST REWRITE
				// elements: unaryAxiom
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 65:16: -> ^( unaryAxiom )
					{
						// MOWLParser.g:65:19: ^( unaryAxiom )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_unaryAxiom.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// MOWLParser.g:66:5: assertionAxiom
			{
				this.pushFollow(FOLLOW_assertionAxiom_in_axiom255);
				assertionAxiom3 = this.assertionAxiom();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_assertionAxiom.add(assertionAxiom3.getTree());
				}
				// AST REWRITE
				// elements: assertionAxiom
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 66:20: -> ^( assertionAxiom )
					{
						// MOWLParser.g:66:23: ^( assertionAxiom )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_assertionAxiom.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "axiom"
	public static class assertionAxiom_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "assertionAxiom"
	// MOWLParser.g:71:1: assertionAxiom options {backtrack=true; } : (i= atomic
	// ( INSTANCE_OF | TYPES ) expression -> ^( TYPE_ASSERTION ^( EXPRESSION
	// expression ) ^( EXPRESSION $i) ) | subject= atomic propertyExpression
	// value -> ^( ROLE_ASSERTION ^( EXPRESSION $subject) ^( EXPRESSION
	// propertyExpression ) ^( EXPRESSION value ) ) | NOT assertionAxiom -> ^(
	// NEGATED_ASSERTION assertionAxiom ) );
	public final OPPLPatternParser_OPPLParser_MOWLParser.assertionAxiom_return assertionAxiom()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.assertionAxiom_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.assertionAxiom_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token INSTANCE_OF4 = null;
		Token TYPES5 = null;
		Token NOT9 = null;
		OPPLPatternParser.atomic_return i = null;
		OPPLPatternParser.atomic_return subject = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return expression6 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.propertyExpression_return propertyExpression7 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.value_return value8 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.assertionAxiom_return assertionAxiom10 = null;
		OPPLSyntaxTree INSTANCE_OF4_tree = null;
		OPPLSyntaxTree TYPES5_tree = null;
		OPPLSyntaxTree NOT9_tree = null;
		RewriteRuleTokenStream stream_TYPES = new RewriteRuleTokenStream(
				this.adaptor, "token TYPES");
		RewriteRuleTokenStream stream_NOT = new RewriteRuleTokenStream(
				this.adaptor, "token NOT");
		RewriteRuleTokenStream stream_INSTANCE_OF = new RewriteRuleTokenStream(
				this.adaptor, "token INSTANCE_OF");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule expression");
		RewriteRuleSubtreeStream stream_propertyExpression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule propertyExpression");
		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(
				this.adaptor, "rule value");
		RewriteRuleSubtreeStream stream_assertionAxiom = new RewriteRuleSubtreeStream(
				this.adaptor, "rule assertionAxiom");
		RewriteRuleSubtreeStream stream_atomic = new RewriteRuleSubtreeStream(
				this.adaptor, "rule atomic");
		try {
			// MOWLParser.g:71:41: (i= atomic ( INSTANCE_OF | TYPES ) expression
			// -> ^( TYPE_ASSERTION ^( EXPRESSION expression ) ^( EXPRESSION $i)
			// ) | subject= atomic propertyExpression value -> ^( ROLE_ASSERTION
			// ^( EXPRESSION $subject) ^( EXPRESSION propertyExpression ) ^(
			// EXPRESSION value ) ) | NOT assertionAxiom -> ^( NEGATED_ASSERTION
			// assertionAxiom ) )
			int alt3 = 3;
			alt3 = this.dfa3.predict(this.input);
			switch (alt3) {
			case 1:
				// MOWLParser.g:72:3: i= atomic ( INSTANCE_OF | TYPES )
				// expression
			{
				this.pushFollow(FOLLOW_atomic_in_assertionAxiom285);
				i = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(i.getTree());
				}
				// MOWLParser.g:72:14: ( INSTANCE_OF | TYPES )
				int alt2 = 2;
				int LA2_0 = this.input.LA(1);
				if (LA2_0 == INSTANCE_OF) {
					alt2 = 1;
				} else if (LA2_0 == TYPES) {
					alt2 = 2;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("", 2,
							0, this.input);
					throw nvae;
				}
				switch (alt2) {
				case 1:
					// MOWLParser.g:72:15: INSTANCE_OF
				{
					INSTANCE_OF4 = (Token) this.match(this.input, INSTANCE_OF,
							FOLLOW_INSTANCE_OF_in_assertionAxiom288);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_INSTANCE_OF.add(INSTANCE_OF4);
					}
				}
					break;
				case 2:
					// MOWLParser.g:72:29: TYPES
				{
					TYPES5 = (Token) this.match(this.input, TYPES,
							FOLLOW_TYPES_in_assertionAxiom292);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_TYPES.add(TYPES5);
					}
				}
					break;
				}
				this.pushFollow(FOLLOW_expression_in_assertionAxiom295);
				expression6 = this.expression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expression.add(expression6.getTree());
				}
				// AST REWRITE
				// elements: expression, i
				// token labels:
				// rule labels: retval, i
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_i = new RewriteRuleSubtreeStream(
							this.adaptor, "rule i", i != null ? i.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 72:47: -> ^( TYPE_ASSERTION ^( EXPRESSION expression ) ^(
					// EXPRESSION $i) )
					{
						// MOWLParser.g:72:50: ^( TYPE_ASSERTION ^( EXPRESSION
						// expression ) ^( EXPRESSION $i) )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											TYPE_ASSERTION, "TYPE_ASSERTION"),
									root_1);
							// MOWLParser.g:72:67: ^( EXPRESSION expression )
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_expression
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							// MOWLParser.g:72:92: ^( EXPRESSION $i)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_i
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// MOWLParser.g:73:7: subject= atomic propertyExpression value
			{
				this.pushFollow(FOLLOW_atomic_in_assertionAxiom326);
				subject = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(subject.getTree());
				}
				this.pushFollow(FOLLOW_propertyExpression_in_assertionAxiom328);
				propertyExpression7 = this.propertyExpression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_propertyExpression
							.add(propertyExpression7.getTree());
				}
				this.pushFollow(FOLLOW_value_in_assertionAxiom331);
				value8 = this.value();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_value.add(value8.getTree());
				}
				// AST REWRITE
				// elements: subject, value, propertyExpression
				// token labels:
				// rule labels: retval, subject
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_subject = new RewriteRuleSubtreeStream(
							this.adaptor, "rule subject",
							subject != null ? subject.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 73:50: -> ^( ROLE_ASSERTION ^( EXPRESSION $subject) ^(
					// EXPRESSION propertyExpression ) ^( EXPRESSION value ) )
					{
						// MOWLParser.g:73:53: ^( ROLE_ASSERTION ^( EXPRESSION
						// $subject) ^( EXPRESSION propertyExpression ) ^(
						// EXPRESSION value ) )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											ROLE_ASSERTION, "ROLE_ASSERTION"),
									root_1);
							// MOWLParser.g:73:70: ^( EXPRESSION $subject)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_subject
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							// MOWLParser.g:73:93: ^( EXPRESSION
							// propertyExpression )
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2,
										stream_propertyExpression.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							// MOWLParser.g:73:126: ^( EXPRESSION value )
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_value
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// MOWLParser.g:75:5: NOT assertionAxiom
			{
				NOT9 = (Token) this.match(this.input, NOT,
						FOLLOW_NOT_in_assertionAxiom365);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_NOT.add(NOT9);
				}
				this.pushFollow(FOLLOW_assertionAxiom_in_assertionAxiom367);
				assertionAxiom10 = this.assertionAxiom();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_assertionAxiom.add(assertionAxiom10.getTree());
				}
				// AST REWRITE
				// elements: assertionAxiom
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 75:24: -> ^( NEGATED_ASSERTION assertionAxiom )
					{
						// MOWLParser.g:75:27: ^( NEGATED_ASSERTION
						// assertionAxiom )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											NEGATED_ASSERTION,
											"NEGATED_ASSERTION"), root_1);
							this.adaptor.addChild(root_1, stream_assertionAxiom
									.nextTree());
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "assertionAxiom"
	public static class binaryAxiom_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "binaryAxiom"
	// MOWLParser.g:80:1: binaryAxiom options {backtrack=true; } : (lhs=
	// expression SUBCLASS_OF superClass= expression -> ^( SUB_CLASS_AXIOM ^(
	// EXPRESSION $lhs) ^( EXPRESSION $superClass) ) | lhs= expression
	// EQUIVALENT_TO rhs= expression -> ^( EQUIVALENT_TO_AXIOM ^( EXPRESSION
	// $lhs) ^( EXPRESSION $rhs) ) | lhs= expression DISJOINT_WITH disjoint=
	// expression -> ^( DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ^( EXPRESSION
	// $disjoint) ) | lhs= expression SUB_PROPERTY_OF superProperty=
	// propertyExpression -> ^( SUB_PROPERTY_AXIOM ^( EXPRESSION $lhs) ^(
	// EXPRESSION $superProperty) ) | lhsID= atomic INVERSE_OF rhsAtomic= atomic
	// -> ^( INVERSE_OF ^( EXPRESSION $lhsID) ^( EXPRESSION $rhsAtomic) ) |
	// lhsID= atomic SAME_AS rhsID= atomic -> ^( SAME_AS_AXIOM ^( EXPRESSION
	// $lhsID) ^( EXPRESSION $rhsID) ) | lhsID= atomic DIFFERENT_FROM rhsID=
	// atomic -> ^( DIFFERENT_FROM_AXIOM ^( EXPRESSION $lhsID) ^( EXPRESSION
	// $rhsID) ) | lhsID= atomic DOMAIN expression -> ^( DOMAIN ^( EXPRESSION
	// $lhsID) ^( EXPRESSION expression ) ) | lhsID= atomic RANGE expression ->
	// ^( RANGE ^( EXPRESSION $lhsID) ^( EXPRESSION expression ) ) );
	public final OPPLPatternParser_OPPLParser_MOWLParser.binaryAxiom_return binaryAxiom()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.binaryAxiom_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.binaryAxiom_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token SUBCLASS_OF11 = null;
		Token EQUIVALENT_TO12 = null;
		Token DISJOINT_WITH13 = null;
		Token SUB_PROPERTY_OF14 = null;
		Token INVERSE_OF15 = null;
		Token SAME_AS16 = null;
		Token DIFFERENT_FROM17 = null;
		Token DOMAIN18 = null;
		Token RANGE20 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return lhs = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return superClass = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return rhs = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return disjoint = null;
		OPPLPatternParser_OPPLParser_MOWLParser.propertyExpression_return superProperty = null;
		OPPLPatternParser.atomic_return lhsID = null;
		OPPLPatternParser.atomic_return rhsAtomic = null;
		OPPLPatternParser.atomic_return rhsID = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return expression19 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return expression21 = null;
		OPPLSyntaxTree SUBCLASS_OF11_tree = null;
		OPPLSyntaxTree EQUIVALENT_TO12_tree = null;
		OPPLSyntaxTree DISJOINT_WITH13_tree = null;
		OPPLSyntaxTree SUB_PROPERTY_OF14_tree = null;
		OPPLSyntaxTree INVERSE_OF15_tree = null;
		OPPLSyntaxTree SAME_AS16_tree = null;
		OPPLSyntaxTree DIFFERENT_FROM17_tree = null;
		OPPLSyntaxTree DOMAIN18_tree = null;
		OPPLSyntaxTree RANGE20_tree = null;
		RewriteRuleTokenStream stream_RANGE = new RewriteRuleTokenStream(
				this.adaptor, "token RANGE");
		RewriteRuleTokenStream stream_SAME_AS = new RewriteRuleTokenStream(
				this.adaptor, "token SAME_AS");
		RewriteRuleTokenStream stream_DISJOINT_WITH = new RewriteRuleTokenStream(
				this.adaptor, "token DISJOINT_WITH");
		RewriteRuleTokenStream stream_INVERSE_OF = new RewriteRuleTokenStream(
				this.adaptor, "token INVERSE_OF");
		RewriteRuleTokenStream stream_DIFFERENT_FROM = new RewriteRuleTokenStream(
				this.adaptor, "token DIFFERENT_FROM");
		RewriteRuleTokenStream stream_EQUIVALENT_TO = new RewriteRuleTokenStream(
				this.adaptor, "token EQUIVALENT_TO");
		RewriteRuleTokenStream stream_SUBCLASS_OF = new RewriteRuleTokenStream(
				this.adaptor, "token SUBCLASS_OF");
		RewriteRuleTokenStream stream_DOMAIN = new RewriteRuleTokenStream(
				this.adaptor, "token DOMAIN");
		RewriteRuleTokenStream stream_SUB_PROPERTY_OF = new RewriteRuleTokenStream(
				this.adaptor, "token SUB_PROPERTY_OF");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule expression");
		RewriteRuleSubtreeStream stream_propertyExpression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule propertyExpression");
		RewriteRuleSubtreeStream stream_atomic = new RewriteRuleSubtreeStream(
				this.adaptor, "rule atomic");
		try {
			// MOWLParser.g:82:26: (lhs= expression SUBCLASS_OF superClass=
			// expression -> ^( SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ^(
			// EXPRESSION $superClass) ) | lhs= expression EQUIVALENT_TO rhs=
			// expression -> ^( EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ^(
			// EXPRESSION $rhs) ) | lhs= expression DISJOINT_WITH disjoint=
			// expression -> ^( DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ^(
			// EXPRESSION $disjoint) ) | lhs= expression SUB_PROPERTY_OF
			// superProperty= propertyExpression -> ^( SUB_PROPERTY_AXIOM ^(
			// EXPRESSION $lhs) ^( EXPRESSION $superProperty) ) | lhsID= atomic
			// INVERSE_OF rhsAtomic= atomic -> ^( INVERSE_OF ^( EXPRESSION
			// $lhsID) ^( EXPRESSION $rhsAtomic) ) | lhsID= atomic SAME_AS
			// rhsID= atomic -> ^( SAME_AS_AXIOM ^( EXPRESSION $lhsID) ^(
			// EXPRESSION $rhsID) ) | lhsID= atomic DIFFERENT_FROM rhsID= atomic
			// -> ^( DIFFERENT_FROM_AXIOM ^( EXPRESSION $lhsID) ^( EXPRESSION
			// $rhsID) ) | lhsID= atomic DOMAIN expression -> ^( DOMAIN ^(
			// EXPRESSION $lhsID) ^( EXPRESSION expression ) ) | lhsID= atomic
			// RANGE expression -> ^( RANGE ^( EXPRESSION $lhsID) ^( EXPRESSION
			// expression ) ) )
			int alt4 = 9;
			alt4 = this.dfa4.predict(this.input);
			switch (alt4) {
			case 1:
				// MOWLParser.g:83:2: lhs= expression SUBCLASS_OF superClass=
				// expression
			{
				this.pushFollow(FOLLOW_expression_in_binaryAxiom406);
				lhs = this.expression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expression.add(lhs.getTree());
				}
				SUBCLASS_OF11 = (Token) this.match(this.input, SUBCLASS_OF,
						FOLLOW_SUBCLASS_OF_in_binaryAxiom408);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SUBCLASS_OF.add(SUBCLASS_OF11);
				}
				this.pushFollow(FOLLOW_expression_in_binaryAxiom415);
				superClass = this.expression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expression.add(superClass.getTree());
				}
				// AST REWRITE
				// elements: lhs, superClass
				// token labels:
				// rule labels: retval, superClass, lhs
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_superClass = new RewriteRuleSubtreeStream(
							this.adaptor, "rule superClass",
							superClass != null ? superClass.tree : null);
					RewriteRuleSubtreeStream stream_lhs = new RewriteRuleSubtreeStream(
							this.adaptor, "rule lhs", lhs != null ? lhs.tree
									: null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 83:57: -> ^( SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ^(
					// EXPRESSION $superClass) )
					{
						// MOWLParser.g:83:60: ^( SUB_CLASS_AXIOM ^( EXPRESSION
						// $lhs) ^( EXPRESSION $superClass) )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor
									.becomeRoot((OPPLSyntaxTree) this.adaptor
											.create(SUB_CLASS_AXIOM,
													"SUB_CLASS_AXIOM"), root_1);
							// MOWLParser.g:83:79: ^( EXPRESSION $lhs)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_lhs
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							// MOWLParser.g:83:98: ^( EXPRESSION $superClass)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_superClass
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// MOWLParser.g:84:11: lhs= expression EQUIVALENT_TO rhs=
				// expression
			{
				this.pushFollow(FOLLOW_expression_in_binaryAxiom453);
				lhs = this.expression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expression.add(lhs.getTree());
				}
				EQUIVALENT_TO12 = (Token) this.match(this.input, EQUIVALENT_TO,
						FOLLOW_EQUIVALENT_TO_in_binaryAxiom455);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_EQUIVALENT_TO.add(EQUIVALENT_TO12);
				}
				this.pushFollow(FOLLOW_expression_in_binaryAxiom461);
				rhs = this.expression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expression.add(rhs.getTree());
				}
				// AST REWRITE
				// elements: rhs, lhs
				// token labels:
				// rule labels: retval, rhs, lhs
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_rhs = new RewriteRuleSubtreeStream(
							this.adaptor, "rule rhs", rhs != null ? rhs.tree
									: null);
					RewriteRuleSubtreeStream stream_lhs = new RewriteRuleSubtreeStream(
							this.adaptor, "rule lhs", lhs != null ? lhs.tree
									: null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 84:60: -> ^( EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ^(
					// EXPRESSION $rhs) )
					{
						// MOWLParser.g:84:63: ^( EQUIVALENT_TO_AXIOM ^(
						// EXPRESSION $lhs) ^( EXPRESSION $rhs) )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											EQUIVALENT_TO_AXIOM,
											"EQUIVALENT_TO_AXIOM"), root_1);
							// MOWLParser.g:84:85: ^( EXPRESSION $lhs)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_lhs
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							// MOWLParser.g:84:104: ^( EXPRESSION $rhs)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_rhs
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// MOWLParser.g:85:11: lhs= expression DISJOINT_WITH disjoint=
				// expression
			{
				this.pushFollow(FOLLOW_expression_in_binaryAxiom498);
				lhs = this.expression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expression.add(lhs.getTree());
				}
				DISJOINT_WITH13 = (Token) this.match(this.input, DISJOINT_WITH,
						FOLLOW_DISJOINT_WITH_in_binaryAxiom500);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_DISJOINT_WITH.add(DISJOINT_WITH13);
				}
				this.pushFollow(FOLLOW_expression_in_binaryAxiom506);
				disjoint = this.expression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expression.add(disjoint.getTree());
				}
				// AST REWRITE
				// elements: disjoint, lhs
				// token labels:
				// rule labels: retval, disjoint, lhs
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_disjoint = new RewriteRuleSubtreeStream(
							this.adaptor, "rule disjoint",
							disjoint != null ? disjoint.tree : null);
					RewriteRuleSubtreeStream stream_lhs = new RewriteRuleSubtreeStream(
							this.adaptor, "rule lhs", lhs != null ? lhs.tree
									: null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 85:65: -> ^( DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ^(
					// EXPRESSION $disjoint) )
					{
						// MOWLParser.g:85:68: ^( DISJOINT_WITH_AXIOM ^(
						// EXPRESSION $lhs) ^( EXPRESSION $disjoint) )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											DISJOINT_WITH_AXIOM,
											"DISJOINT_WITH_AXIOM"), root_1);
							// MOWLParser.g:85:90: ^( EXPRESSION $lhs)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_lhs
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							// MOWLParser.g:85:109: ^( EXPRESSION $disjoint)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_disjoint
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// MOWLParser.g:86:11: lhs= expression SUB_PROPERTY_OF
				// superProperty= propertyExpression
			{
				this.pushFollow(FOLLOW_expression_in_binaryAxiom543);
				lhs = this.expression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expression.add(lhs.getTree());
				}
				SUB_PROPERTY_OF14 = (Token) this.match(this.input,
						SUB_PROPERTY_OF,
						FOLLOW_SUB_PROPERTY_OF_in_binaryAxiom545);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SUB_PROPERTY_OF.add(SUB_PROPERTY_OF14);
				}
				this.pushFollow(FOLLOW_propertyExpression_in_binaryAxiom551);
				superProperty = this.propertyExpression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_propertyExpression.add(superProperty.getTree());
				}
				// AST REWRITE
				// elements: lhs, superProperty
				// token labels:
				// rule labels: retval, superProperty, lhs
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_superProperty = new RewriteRuleSubtreeStream(
							this.adaptor, "rule superProperty",
							superProperty != null ? superProperty.tree : null);
					RewriteRuleSubtreeStream stream_lhs = new RewriteRuleSubtreeStream(
							this.adaptor, "rule lhs", lhs != null ? lhs.tree
									: null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 86:80: -> ^( SUB_PROPERTY_AXIOM ^( EXPRESSION $lhs) ^(
					// EXPRESSION $superProperty) )
					{
						// MOWLParser.g:86:83: ^( SUB_PROPERTY_AXIOM ^(
						// EXPRESSION $lhs) ^( EXPRESSION $superProperty) )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											SUB_PROPERTY_AXIOM,
											"SUB_PROPERTY_AXIOM"), root_1);
							// MOWLParser.g:86:104: ^( EXPRESSION $lhs)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_lhs
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							// MOWLParser.g:86:123: ^( EXPRESSION
							// $superProperty)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2,
										stream_superProperty.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// MOWLParser.g:87:11: lhsID= atomic INVERSE_OF rhsAtomic=
				// atomic
			{
				this.pushFollow(FOLLOW_atomic_in_binaryAxiom588);
				lhsID = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(lhsID.getTree());
				}
				INVERSE_OF15 = (Token) this.match(this.input, INVERSE_OF,
						FOLLOW_INVERSE_OF_in_binaryAxiom590);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_INVERSE_OF.add(INVERSE_OF15);
				}
				this.pushFollow(FOLLOW_atomic_in_binaryAxiom596);
				rhsAtomic = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(rhsAtomic.getTree());
				}
				// AST REWRITE
				// elements: INVERSE_OF, lhsID, rhsAtomic
				// token labels:
				// rule labels: lhsID, retval, rhsAtomic
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_lhsID = new RewriteRuleSubtreeStream(
							this.adaptor, "rule lhsID",
							lhsID != null ? lhsID.tree : null);
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_rhsAtomic = new RewriteRuleSubtreeStream(
							this.adaptor, "rule rhsAtomic",
							rhsAtomic != null ? rhsAtomic.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 87:57: -> ^( INVERSE_OF ^( EXPRESSION $lhsID) ^(
					// EXPRESSION $rhsAtomic) )
					{
						// MOWLParser.g:87:60: ^( INVERSE_OF ^( EXPRESSION
						// $lhsID) ^( EXPRESSION $rhsAtomic) )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_INVERSE_OF.nextNode(), root_1);
							// MOWLParser.g:87:73: ^( EXPRESSION $lhsID)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_lhsID
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							// MOWLParser.g:87:94: ^( EXPRESSION $rhsAtomic)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_rhsAtomic
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 6:
				// MOWLParser.g:88:3: lhsID= atomic SAME_AS rhsID= atomic
			{
				this.pushFollow(FOLLOW_atomic_in_binaryAxiom627);
				lhsID = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(lhsID.getTree());
				}
				SAME_AS16 = (Token) this.match(this.input, SAME_AS,
						FOLLOW_SAME_AS_in_binaryAxiom629);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SAME_AS.add(SAME_AS16);
				}
				this.pushFollow(FOLLOW_atomic_in_binaryAxiom636);
				rhsID = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(rhsID.getTree());
				}
				// AST REWRITE
				// elements: rhsID, lhsID
				// token labels:
				// rule labels: lhsID, retval, rhsID
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_lhsID = new RewriteRuleSubtreeStream(
							this.adaptor, "rule lhsID",
							lhsID != null ? lhsID.tree : null);
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_rhsID = new RewriteRuleSubtreeStream(
							this.adaptor, "rule rhsID",
							rhsID != null ? rhsID.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 88:43: -> ^( SAME_AS_AXIOM ^( EXPRESSION $lhsID) ^(
					// EXPRESSION $rhsID) )
					{
						// MOWLParser.g:88:46: ^( SAME_AS_AXIOM ^( EXPRESSION
						// $lhsID) ^( EXPRESSION $rhsID) )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											SAME_AS_AXIOM, "SAME_AS_AXIOM"),
									root_1);
							// MOWLParser.g:88:62: ^( EXPRESSION $lhsID)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_lhsID
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							// MOWLParser.g:88:84: ^( EXPRESSION $rhsID)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_rhsID
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 7:
				// MOWLParser.g:89:11: lhsID= atomic DIFFERENT_FROM rhsID=
				// atomic
			{
				this.pushFollow(FOLLOW_atomic_in_binaryAxiom674);
				lhsID = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(lhsID.getTree());
				}
				DIFFERENT_FROM17 = (Token) this
						.match(this.input, DIFFERENT_FROM,
								FOLLOW_DIFFERENT_FROM_in_binaryAxiom676);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_DIFFERENT_FROM.add(DIFFERENT_FROM17);
				}
				this.pushFollow(FOLLOW_atomic_in_binaryAxiom683);
				rhsID = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(rhsID.getTree());
				}
				// AST REWRITE
				// elements: rhsID, lhsID
				// token labels:
				// rule labels: lhsID, retval, rhsID
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_lhsID = new RewriteRuleSubtreeStream(
							this.adaptor, "rule lhsID",
							lhsID != null ? lhsID.tree : null);
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_rhsID = new RewriteRuleSubtreeStream(
							this.adaptor, "rule rhsID",
							rhsID != null ? rhsID.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 89:58: -> ^( DIFFERENT_FROM_AXIOM ^( EXPRESSION $lhsID)
					// ^( EXPRESSION $rhsID) )
					{
						// MOWLParser.g:89:61: ^( DIFFERENT_FROM_AXIOM ^(
						// EXPRESSION $lhsID) ^( EXPRESSION $rhsID) )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											DIFFERENT_FROM_AXIOM,
											"DIFFERENT_FROM_AXIOM"), root_1);
							// MOWLParser.g:89:84: ^( EXPRESSION $lhsID)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_lhsID
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							// MOWLParser.g:89:105: ^( EXPRESSION $rhsID)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_rhsID
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 8:
				// MOWLParser.g:90:11: lhsID= atomic DOMAIN expression
			{
				this.pushFollow(FOLLOW_atomic_in_binaryAxiom720);
				lhsID = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(lhsID.getTree());
				}
				DOMAIN18 = (Token) this.match(this.input, DOMAIN,
						FOLLOW_DOMAIN_in_binaryAxiom723);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_DOMAIN.add(DOMAIN18);
				}
				this.pushFollow(FOLLOW_expression_in_binaryAxiom725);
				expression19 = this.expression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expression.add(expression19.getTree());
				}
				// AST REWRITE
				// elements: lhsID, DOMAIN, expression
				// token labels:
				// rule labels: lhsID, retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_lhsID = new RewriteRuleSubtreeStream(
							this.adaptor, "rule lhsID",
							lhsID != null ? lhsID.tree : null);
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 90:46: -> ^( DOMAIN ^( EXPRESSION $lhsID) ^( EXPRESSION
					// expression ) )
					{
						// MOWLParser.g:90:49: ^( DOMAIN ^( EXPRESSION $lhsID)
						// ^( EXPRESSION expression ) )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_DOMAIN.nextNode(), root_1);
							// MOWLParser.g:90:58: ^( EXPRESSION $lhsID)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_lhsID
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							// MOWLParser.g:90:79: ^( EXPRESSION expression )
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_expression
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 9:
				// MOWLParser.g:91:11: lhsID= atomic RANGE expression
			{
				this.pushFollow(FOLLOW_atomic_in_binaryAxiom761);
				lhsID = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(lhsID.getTree());
				}
				RANGE20 = (Token) this.match(this.input, RANGE,
						FOLLOW_RANGE_in_binaryAxiom763);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RANGE.add(RANGE20);
				}
				this.pushFollow(FOLLOW_expression_in_binaryAxiom765);
				expression21 = this.expression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expression.add(expression21.getTree());
				}
				// AST REWRITE
				// elements: RANGE, expression, lhsID
				// token labels:
				// rule labels: lhsID, retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_lhsID = new RewriteRuleSubtreeStream(
							this.adaptor, "rule lhsID",
							lhsID != null ? lhsID.tree : null);
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 91:44: -> ^( RANGE ^( EXPRESSION $lhsID) ^( EXPRESSION
					// expression ) )
					{
						// MOWLParser.g:91:47: ^( RANGE ^( EXPRESSION $lhsID) ^(
						// EXPRESSION expression ) )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_RANGE.nextNode(), root_1);
							// MOWLParser.g:91:55: ^( EXPRESSION $lhsID)
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_lhsID
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							// MOWLParser.g:91:76: ^( EXPRESSION expression )
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_expression
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "binaryAxiom"
	public static class unaryAxiom_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "unaryAxiom"
	// MOWLParser.g:95:1: unaryAxiom : unaryCharacteristic unary -> ^(
	// UNARY_AXIOM unaryCharacteristic ^( EXPRESSION unary ) ) ;
	public final OPPLPatternParser_OPPLParser_MOWLParser.unaryAxiom_return unaryAxiom()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.unaryAxiom_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.unaryAxiom_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.unaryCharacteristic_return unaryCharacteristic22 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.unary_return unary23 = null;
		RewriteRuleSubtreeStream stream_unary = new RewriteRuleSubtreeStream(
				this.adaptor, "rule unary");
		RewriteRuleSubtreeStream stream_unaryCharacteristic = new RewriteRuleSubtreeStream(
				this.adaptor, "rule unaryCharacteristic");
		try {
			// MOWLParser.g:95:13: ( unaryCharacteristic unary -> ^( UNARY_AXIOM
			// unaryCharacteristic ^( EXPRESSION unary ) ) )
			// MOWLParser.g:96:4: unaryCharacteristic unary
			{
				this.pushFollow(FOLLOW_unaryCharacteristic_in_unaryAxiom839);
				unaryCharacteristic22 = this.unaryCharacteristic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_unaryCharacteristic.add(unaryCharacteristic22
							.getTree());
				}
				this.pushFollow(FOLLOW_unary_in_unaryAxiom843);
				unary23 = this.unary();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_unary.add(unary23.getTree());
				}
				// AST REWRITE
				// elements: unary, unaryCharacteristic
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 96:32: -> ^( UNARY_AXIOM unaryCharacteristic ^(
					// EXPRESSION unary ) )
					{
						// MOWLParser.g:96:35: ^( UNARY_AXIOM
						// unaryCharacteristic ^( EXPRESSION unary ) )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor
									.becomeRoot(
											(OPPLSyntaxTree) this.adaptor
													.create(UNARY_AXIOM,
															"UNARY_AXIOM"),
											root_1);
							this.adaptor.addChild(root_1,
									stream_unaryCharacteristic.nextTree());
							// MOWLParser.g:96:69: ^( EXPRESSION unary )
							{
								OPPLSyntaxTree root_2 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_2 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(EXPRESSION,
																"EXPRESSION"),
												root_2);
								this.adaptor.addChild(root_2, stream_unary
										.nextTree());
								this.adaptor.addChild(root_1, root_2);
							}
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "unaryAxiom"
	public static class unaryCharacteristic_return extends
			ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "unaryCharacteristic"
	// MOWLParser.g:99:1: unaryCharacteristic : ( FUNCTIONAL -> ^( FUNCTIONAL )
	// | INVERSE_FUNCTIONAL -> ^( INVERSE_FUNCTIONAL ) | SYMMETRIC -> ^(
	// SYMMETRIC ) | ANTI_SYMMETRIC -> ^( ANTI_SYMMETRIC ) | REFLEXIVE -> ^(
	// REFLEXIVE ) | IRREFLEXIVE -> ^( IRREFLEXIVE ) | TRANSITIVE -> ^(
	// TRANSITIVE ) );
	public final OPPLPatternParser_OPPLParser_MOWLParser.unaryCharacteristic_return unaryCharacteristic()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.unaryCharacteristic_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.unaryCharacteristic_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token FUNCTIONAL24 = null;
		Token INVERSE_FUNCTIONAL25 = null;
		Token SYMMETRIC26 = null;
		Token ANTI_SYMMETRIC27 = null;
		Token REFLEXIVE28 = null;
		Token IRREFLEXIVE29 = null;
		Token TRANSITIVE30 = null;
		OPPLSyntaxTree FUNCTIONAL24_tree = null;
		OPPLSyntaxTree INVERSE_FUNCTIONAL25_tree = null;
		OPPLSyntaxTree SYMMETRIC26_tree = null;
		OPPLSyntaxTree ANTI_SYMMETRIC27_tree = null;
		OPPLSyntaxTree REFLEXIVE28_tree = null;
		OPPLSyntaxTree IRREFLEXIVE29_tree = null;
		OPPLSyntaxTree TRANSITIVE30_tree = null;
		RewriteRuleTokenStream stream_REFLEXIVE = new RewriteRuleTokenStream(
				this.adaptor, "token REFLEXIVE");
		RewriteRuleTokenStream stream_SYMMETRIC = new RewriteRuleTokenStream(
				this.adaptor, "token SYMMETRIC");
		RewriteRuleTokenStream stream_FUNCTIONAL = new RewriteRuleTokenStream(
				this.adaptor, "token FUNCTIONAL");
		RewriteRuleTokenStream stream_TRANSITIVE = new RewriteRuleTokenStream(
				this.adaptor, "token TRANSITIVE");
		RewriteRuleTokenStream stream_ANTI_SYMMETRIC = new RewriteRuleTokenStream(
				this.adaptor, "token ANTI_SYMMETRIC");
		RewriteRuleTokenStream stream_INVERSE_FUNCTIONAL = new RewriteRuleTokenStream(
				this.adaptor, "token INVERSE_FUNCTIONAL");
		RewriteRuleTokenStream stream_IRREFLEXIVE = new RewriteRuleTokenStream(
				this.adaptor, "token IRREFLEXIVE");
		try {
			// MOWLParser.g:99:21: ( FUNCTIONAL -> ^( FUNCTIONAL ) |
			// INVERSE_FUNCTIONAL -> ^( INVERSE_FUNCTIONAL ) | SYMMETRIC -> ^(
			// SYMMETRIC ) | ANTI_SYMMETRIC -> ^( ANTI_SYMMETRIC ) | REFLEXIVE
			// -> ^( REFLEXIVE ) | IRREFLEXIVE -> ^( IRREFLEXIVE ) | TRANSITIVE
			// -> ^( TRANSITIVE ) )
			int alt5 = 7;
			switch (this.input.LA(1)) {
			case FUNCTIONAL: {
				alt5 = 1;
			}
				break;
			case INVERSE_FUNCTIONAL: {
				alt5 = 2;
			}
				break;
			case SYMMETRIC: {
				alt5 = 3;
			}
				break;
			case ANTI_SYMMETRIC: {
				alt5 = 4;
			}
				break;
			case REFLEXIVE: {
				alt5 = 5;
			}
				break;
			case IRREFLEXIVE: {
				alt5 = 6;
			}
				break;
			case TRANSITIVE: {
				alt5 = 7;
			}
				break;
			default:
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 5, 0,
						this.input);
				throw nvae;
			}
			switch (alt5) {
			case 1:
				// MOWLParser.g:100:5: FUNCTIONAL
			{
				FUNCTIONAL24 = (Token) this.match(this.input, FUNCTIONAL,
						FOLLOW_FUNCTIONAL_in_unaryCharacteristic888);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_FUNCTIONAL.add(FUNCTIONAL24);
				}
				// AST REWRITE
				// elements: FUNCTIONAL
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 100:16: -> ^( FUNCTIONAL )
					{
						// MOWLParser.g:100:19: ^( FUNCTIONAL )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_FUNCTIONAL.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// MOWLParser.g:101:7: INVERSE_FUNCTIONAL
			{
				INVERSE_FUNCTIONAL25 = (Token) this.match(this.input,
						INVERSE_FUNCTIONAL,
						FOLLOW_INVERSE_FUNCTIONAL_in_unaryCharacteristic902);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_INVERSE_FUNCTIONAL.add(INVERSE_FUNCTIONAL25);
				}
				// AST REWRITE
				// elements: INVERSE_FUNCTIONAL
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 101:26: -> ^( INVERSE_FUNCTIONAL )
					{
						// MOWLParser.g:101:29: ^( INVERSE_FUNCTIONAL )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_INVERSE_FUNCTIONAL.nextNode(),
									root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// MOWLParser.g:102:7: SYMMETRIC
			{
				SYMMETRIC26 = (Token) this.match(this.input, SYMMETRIC,
						FOLLOW_SYMMETRIC_in_unaryCharacteristic916);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SYMMETRIC.add(SYMMETRIC26);
				}
				// AST REWRITE
				// elements: SYMMETRIC
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 102:17: -> ^( SYMMETRIC )
					{
						// MOWLParser.g:102:20: ^( SYMMETRIC )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_SYMMETRIC.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// MOWLParser.g:103:7: ANTI_SYMMETRIC
			{
				ANTI_SYMMETRIC27 = (Token) this.match(this.input,
						ANTI_SYMMETRIC,
						FOLLOW_ANTI_SYMMETRIC_in_unaryCharacteristic930);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_ANTI_SYMMETRIC.add(ANTI_SYMMETRIC27);
				}
				// AST REWRITE
				// elements: ANTI_SYMMETRIC
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 103:22: -> ^( ANTI_SYMMETRIC )
					{
						// MOWLParser.g:103:25: ^( ANTI_SYMMETRIC )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_ANTI_SYMMETRIC.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// MOWLParser.g:104:7: REFLEXIVE
			{
				REFLEXIVE28 = (Token) this.match(this.input, REFLEXIVE,
						FOLLOW_REFLEXIVE_in_unaryCharacteristic944);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_REFLEXIVE.add(REFLEXIVE28);
				}
				// AST REWRITE
				// elements: REFLEXIVE
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 104:17: -> ^( REFLEXIVE )
					{
						// MOWLParser.g:104:20: ^( REFLEXIVE )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_REFLEXIVE.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 6:
				// MOWLParser.g:105:7: IRREFLEXIVE
			{
				IRREFLEXIVE29 = (Token) this.match(this.input, IRREFLEXIVE,
						FOLLOW_IRREFLEXIVE_in_unaryCharacteristic958);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IRREFLEXIVE.add(IRREFLEXIVE29);
				}
				// AST REWRITE
				// elements: IRREFLEXIVE
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 105:19: -> ^( IRREFLEXIVE )
					{
						// MOWLParser.g:105:22: ^( IRREFLEXIVE )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_IRREFLEXIVE.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 7:
				// MOWLParser.g:106:7: TRANSITIVE
			{
				TRANSITIVE30 = (Token) this.match(this.input, TRANSITIVE,
						FOLLOW_TRANSITIVE_in_unaryCharacteristic972);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_TRANSITIVE.add(TRANSITIVE30);
				}
				// AST REWRITE
				// elements: TRANSITIVE
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 106:18: -> ^( TRANSITIVE )
					{
						// MOWLParser.g:106:21: ^( TRANSITIVE )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_TRANSITIVE.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "unaryCharacteristic"
	public static class expression_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "expression"
	// MOWLParser.g:109:1: expression : ( options {backtrack=true; } : |
	// conjunction ( OR conjunction )* -> ^( DISJUNCTION ( conjunction )+ ) |
	// complexPropertyExpression -> ^( complexPropertyExpression ) |
	// OPEN_PARENTHESYS expression CLOSED_PARENTHESYS -> ^( expression ) ) ;
	public final OPPLPatternParser_OPPLParser_MOWLParser.expression_return expression()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.expression_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token OR32 = null;
		Token OPEN_PARENTHESYS35 = null;
		Token CLOSED_PARENTHESYS37 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.conjunction_return conjunction31 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.conjunction_return conjunction33 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.complexPropertyExpression_return complexPropertyExpression34 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return expression36 = null;
		OPPLSyntaxTree OR32_tree = null;
		OPPLSyntaxTree OPEN_PARENTHESYS35_tree = null;
		OPPLSyntaxTree CLOSED_PARENTHESYS37_tree = null;
		RewriteRuleTokenStream stream_CLOSED_PARENTHESYS = new RewriteRuleTokenStream(
				this.adaptor, "token CLOSED_PARENTHESYS");
		RewriteRuleTokenStream stream_OR = new RewriteRuleTokenStream(
				this.adaptor, "token OR");
		RewriteRuleTokenStream stream_OPEN_PARENTHESYS = new RewriteRuleTokenStream(
				this.adaptor, "token OPEN_PARENTHESYS");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule expression");
		RewriteRuleSubtreeStream stream_conjunction = new RewriteRuleSubtreeStream(
				this.adaptor, "rule conjunction");
		RewriteRuleSubtreeStream stream_complexPropertyExpression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule complexPropertyExpression");
		try {
			// MOWLParser.g:109:11: ( ( options {backtrack=true; } : |
			// conjunction ( OR conjunction )* -> ^( DISJUNCTION ( conjunction
			// )+ ) | complexPropertyExpression -> ^( complexPropertyExpression
			// ) | OPEN_PARENTHESYS expression CLOSED_PARENTHESYS -> ^(
			// expression ) ) )
			// MOWLParser.g:110:5: ( options {backtrack=true; } : | conjunction
			// ( OR conjunction )* -> ^( DISJUNCTION ( conjunction )+ ) |
			// complexPropertyExpression -> ^( complexPropertyExpression ) |
			// OPEN_PARENTHESYS expression CLOSED_PARENTHESYS -> ^( expression )
			// )
			{
				// MOWLParser.g:110:5: ( options {backtrack=true; } : |
				// conjunction ( OR conjunction )* -> ^( DISJUNCTION (
				// conjunction )+ ) | complexPropertyExpression -> ^(
				// complexPropertyExpression ) | OPEN_PARENTHESYS expression
				// CLOSED_PARENTHESYS -> ^( expression ) )
				int alt7 = 4;
				alt7 = this.dfa7.predict(this.input);
				switch (alt7) {
				case 1:
					// MOWLParser.g:112:4:
				{
				}
					break;
				case 2:
					// MOWLParser.g:112:6: conjunction ( OR conjunction )*
				{
					this.pushFollow(FOLLOW_conjunction_in_expression1015);
					conjunction31 = this.conjunction();
					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_conjunction.add(conjunction31.getTree());
					}
					// MOWLParser.g:112:18: ( OR conjunction )*
					loop6: do {
						int alt6 = 2;
						int LA6_0 = this.input.LA(1);
						if (LA6_0 == OR) {
							alt6 = 1;
						}
						switch (alt6) {
						case 1:
							// MOWLParser.g:112:19: OR conjunction
						{
							OR32 = (Token) this.match(this.input, OR,
									FOLLOW_OR_in_expression1018);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								stream_OR.add(OR32);
							}
							this
									.pushFollow(FOLLOW_conjunction_in_expression1020);
							conjunction33 = this.conjunction();
							this.state._fsp--;
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								stream_conjunction.add(conjunction33.getTree());
							}
						}
							break;
						default:
							break loop6;
						}
					} while (true);
					// AST REWRITE
					// elements: conjunction
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					if (this.state.backtracking == 0) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								this.adaptor, "rule retval",
								retval != null ? retval.tree : null);
						root_0 = (OPPLSyntaxTree) this.adaptor.nil();
						// 112:36: -> ^( DISJUNCTION ( conjunction )+ )
						{
							// MOWLParser.g:112:39: ^( DISJUNCTION ( conjunction
							// )+ )
							{
								OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_1 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(DISJUNCTION,
																"DISJUNCTION"),
												root_1);
								if (!stream_conjunction.hasNext()) {
									throw new RewriteEarlyExitException();
								}
								while (stream_conjunction.hasNext()) {
									this.adaptor.addChild(root_1,
											stream_conjunction.nextTree());
								}
								stream_conjunction.reset();
								this.adaptor.addChild(root_0, root_1);
							}
						}
						retval.tree = root_0;
					}
				}
					break;
				case 3:
					// MOWLParser.g:113:6: complexPropertyExpression
				{
					this
							.pushFollow(FOLLOW_complexPropertyExpression_in_expression1039);
					complexPropertyExpression34 = this
							.complexPropertyExpression();
					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_complexPropertyExpression
								.add(complexPropertyExpression34.getTree());
					}
					// AST REWRITE
					// elements: complexPropertyExpression
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					if (this.state.backtracking == 0) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								this.adaptor, "rule retval",
								retval != null ? retval.tree : null);
						root_0 = (OPPLSyntaxTree) this.adaptor.nil();
						// 113:32: -> ^( complexPropertyExpression )
						{
							// MOWLParser.g:113:35: ^( complexPropertyExpression
							// )
							{
								OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_1 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												stream_complexPropertyExpression
														.nextNode(), root_1);
								this.adaptor.addChild(root_0, root_1);
							}
						}
						retval.tree = root_0;
					}
				}
					break;
				case 4:
					// MOWLParser.g:114:6: OPEN_PARENTHESYS expression
					// CLOSED_PARENTHESYS
				{
					OPEN_PARENTHESYS35 = (Token) this.match(this.input,
							OPEN_PARENTHESYS,
							FOLLOW_OPEN_PARENTHESYS_in_expression1052);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_OPEN_PARENTHESYS.add(OPEN_PARENTHESYS35);
					}
					this.pushFollow(FOLLOW_expression_in_expression1054);
					expression36 = this.expression();
					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_expression.add(expression36.getTree());
					}
					CLOSED_PARENTHESYS37 = (Token) this.match(this.input,
							CLOSED_PARENTHESYS,
							FOLLOW_CLOSED_PARENTHESYS_in_expression1056);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_CLOSED_PARENTHESYS.add(CLOSED_PARENTHESYS37);
					}
					// AST REWRITE
					// elements: expression
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					if (this.state.backtracking == 0) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								this.adaptor, "rule retval",
								retval != null ? retval.tree : null);
						root_0 = (OPPLSyntaxTree) this.adaptor.nil();
						// 114:53: -> ^( expression )
						{
							// MOWLParser.g:114:56: ^( expression )
							{
								OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_1 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(stream_expression
												.nextNode(), root_1);
								this.adaptor.addChild(root_0, root_1);
							}
						}
						retval.tree = root_0;
					}
				}
					break;
				}
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "expression"
	public static class conjunction_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "conjunction"
	// MOWLParser.g:122:1: conjunction : unary ( AND unary )* -> ^( CONJUNCTION
	// ( unary )+ ) ;
	public final OPPLPatternParser_OPPLParser_MOWLParser.conjunction_return conjunction()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.conjunction_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.conjunction_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token AND39 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.unary_return unary38 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.unary_return unary40 = null;
		OPPLSyntaxTree AND39_tree = null;
		RewriteRuleTokenStream stream_AND = new RewriteRuleTokenStream(
				this.adaptor, "token AND");
		RewriteRuleSubtreeStream stream_unary = new RewriteRuleSubtreeStream(
				this.adaptor, "rule unary");
		try {
			// MOWLParser.g:122:13: ( unary ( AND unary )* -> ^( CONJUNCTION (
			// unary )+ ) )
			// MOWLParser.g:123:5: unary ( AND unary )*
			{
				this.pushFollow(FOLLOW_unary_in_conjunction1089);
				unary38 = this.unary();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_unary.add(unary38.getTree());
				}
				// MOWLParser.g:123:11: ( AND unary )*
				loop8: do {
					int alt8 = 2;
					int LA8_0 = this.input.LA(1);
					if (LA8_0 == AND) {
						alt8 = 1;
					}
					switch (alt8) {
					case 1:
						// MOWLParser.g:123:12: AND unary
					{
						AND39 = (Token) this.match(this.input, AND,
								FOLLOW_AND_in_conjunction1092);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_AND.add(AND39);
						}
						this.pushFollow(FOLLOW_unary_in_conjunction1094);
						unary40 = this.unary();
						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_unary.add(unary40.getTree());
						}
					}
						break;
					default:
						break loop8;
					}
				} while (true);
				// AST REWRITE
				// elements: unary
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 123:24: -> ^( CONJUNCTION ( unary )+ )
					{
						// MOWLParser.g:123:27: ^( CONJUNCTION ( unary )+ )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor
									.becomeRoot(
											(OPPLSyntaxTree) this.adaptor
													.create(CONJUNCTION,
															"CONJUNCTION"),
											root_1);
							if (!stream_unary.hasNext()) {
								throw new RewriteEarlyExitException();
							}
							while (stream_unary.hasNext()) {
								this.adaptor.addChild(root_1, stream_unary
										.nextTree());
							}
							stream_unary.reset();
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "conjunction"
	public static class complexPropertyExpression_return extends
			ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "complexPropertyExpression"
	// MOWLParser.g:126:1: complexPropertyExpression : ( INVERSE
	// OPEN_PARENTHESYS complexPropertyExpression CLOSED_PARENTHESYS -> ^(
	// INVERSE_OBJECT_PROPERTY_EXPRESSION complexPropertyExpression ) | INVERSE
	// OPEN_PARENTHESYS atomic CLOSED_PARENTHESYS -> ^(
	// INVERSE_OBJECT_PROPERTY_EXPRESSION atomic ) );
	public final OPPLPatternParser_OPPLParser_MOWLParser.complexPropertyExpression_return complexPropertyExpression()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.complexPropertyExpression_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.complexPropertyExpression_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token INVERSE41 = null;
		Token OPEN_PARENTHESYS42 = null;
		Token CLOSED_PARENTHESYS44 = null;
		Token INVERSE45 = null;
		Token OPEN_PARENTHESYS46 = null;
		Token CLOSED_PARENTHESYS48 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.complexPropertyExpression_return complexPropertyExpression43 = null;
		OPPLPatternParser.atomic_return atomic47 = null;
		OPPLSyntaxTree INVERSE41_tree = null;
		OPPLSyntaxTree OPEN_PARENTHESYS42_tree = null;
		OPPLSyntaxTree CLOSED_PARENTHESYS44_tree = null;
		OPPLSyntaxTree INVERSE45_tree = null;
		OPPLSyntaxTree OPEN_PARENTHESYS46_tree = null;
		OPPLSyntaxTree CLOSED_PARENTHESYS48_tree = null;
		RewriteRuleTokenStream stream_INVERSE = new RewriteRuleTokenStream(
				this.adaptor, "token INVERSE");
		RewriteRuleTokenStream stream_CLOSED_PARENTHESYS = new RewriteRuleTokenStream(
				this.adaptor, "token CLOSED_PARENTHESYS");
		RewriteRuleTokenStream stream_OPEN_PARENTHESYS = new RewriteRuleTokenStream(
				this.adaptor, "token OPEN_PARENTHESYS");
		RewriteRuleSubtreeStream stream_complexPropertyExpression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule complexPropertyExpression");
		RewriteRuleSubtreeStream stream_atomic = new RewriteRuleSubtreeStream(
				this.adaptor, "rule atomic");
		try {
			// MOWLParser.g:126:26: ( INVERSE OPEN_PARENTHESYS
			// complexPropertyExpression CLOSED_PARENTHESYS -> ^(
			// INVERSE_OBJECT_PROPERTY_EXPRESSION complexPropertyExpression ) |
			// INVERSE OPEN_PARENTHESYS atomic CLOSED_PARENTHESYS -> ^(
			// INVERSE_OBJECT_PROPERTY_EXPRESSION atomic ) )
			int alt9 = 2;
			int LA9_0 = this.input.LA(1);
			if (LA9_0 == INVERSE) {
				int LA9_1 = this.input.LA(2);
				if (LA9_1 == OPEN_PARENTHESYS) {
					int LA9_2 = this.input.LA(3);
					if (LA9_2 == INVERSE) {
						alt9 = 1;
					} else if (LA9_2 >= IDENTIFIER && LA9_2 <= ENTITY_REFERENCE
							|| LA9_2 == ESCLAMATION_MARK || LA9_2 == DOLLAR
							|| LA9_2 == THIS_CLASS || LA9_2 == VARIABLE_NAME) {
						alt9 = 2;
					} else {
						if (this.state.backtracking > 0) {
							this.state.failed = true;
							return retval;
						}
						NoViableAltException nvae = new NoViableAltException(
								"", 9, 2, this.input);
						throw nvae;
					}
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("", 9,
							1, this.input);
					throw nvae;
				}
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 9, 0,
						this.input);
				throw nvae;
			}
			switch (alt9) {
			case 1:
				// MOWLParser.g:127:2: INVERSE OPEN_PARENTHESYS
				// complexPropertyExpression CLOSED_PARENTHESYS
			{
				INVERSE41 = (Token) this.match(this.input, INVERSE,
						FOLLOW_INVERSE_in_complexPropertyExpression1115);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_INVERSE.add(INVERSE41);
				}
				OPEN_PARENTHESYS42 = (Token) this
						.match(this.input, OPEN_PARENTHESYS,
								FOLLOW_OPEN_PARENTHESYS_in_complexPropertyExpression1117);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_OPEN_PARENTHESYS.add(OPEN_PARENTHESYS42);
				}
				this
						.pushFollow(FOLLOW_complexPropertyExpression_in_complexPropertyExpression1119);
				complexPropertyExpression43 = this.complexPropertyExpression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_complexPropertyExpression
							.add(complexPropertyExpression43.getTree());
				}
				CLOSED_PARENTHESYS44 = (Token) this
						.match(this.input, CLOSED_PARENTHESYS,
								FOLLOW_CLOSED_PARENTHESYS_in_complexPropertyExpression1121);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_CLOSED_PARENTHESYS.add(CLOSED_PARENTHESYS44);
				}
				// AST REWRITE
				// elements: complexPropertyExpression
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 127:72: -> ^( INVERSE_OBJECT_PROPERTY_EXPRESSION
					// complexPropertyExpression )
					{
						// MOWLParser.g:127:75: ^(
						// INVERSE_OBJECT_PROPERTY_EXPRESSION
						// complexPropertyExpression )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor
									.becomeRoot(
											(OPPLSyntaxTree) this.adaptor
													.create(
															INVERSE_OBJECT_PROPERTY_EXPRESSION,
															"INVERSE_OBJECT_PROPERTY_EXPRESSION"),
											root_1);
							this.adaptor
									.addChild(root_1,
											stream_complexPropertyExpression
													.nextTree());
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// MOWLParser.g:128:4: INVERSE OPEN_PARENTHESYS atomic
				// CLOSED_PARENTHESYS
			{
				INVERSE45 = (Token) this.match(this.input, INVERSE,
						FOLLOW_INVERSE_in_complexPropertyExpression1134);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_INVERSE.add(INVERSE45);
				}
				OPEN_PARENTHESYS46 = (Token) this
						.match(this.input, OPEN_PARENTHESYS,
								FOLLOW_OPEN_PARENTHESYS_in_complexPropertyExpression1136);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_OPEN_PARENTHESYS.add(OPEN_PARENTHESYS46);
				}
				this.pushFollow(FOLLOW_atomic_in_complexPropertyExpression1138);
				atomic47 = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(atomic47.getTree());
				}
				CLOSED_PARENTHESYS48 = (Token) this
						.match(this.input, CLOSED_PARENTHESYS,
								FOLLOW_CLOSED_PARENTHESYS_in_complexPropertyExpression1140);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_CLOSED_PARENTHESYS.add(CLOSED_PARENTHESYS48);
				}
				// AST REWRITE
				// elements: atomic
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 128:54: -> ^( INVERSE_OBJECT_PROPERTY_EXPRESSION atomic )
					{
						// MOWLParser.g:128:57: ^(
						// INVERSE_OBJECT_PROPERTY_EXPRESSION atomic )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor
									.becomeRoot(
											(OPPLSyntaxTree) this.adaptor
													.create(
															INVERSE_OBJECT_PROPERTY_EXPRESSION,
															"INVERSE_OBJECT_PROPERTY_EXPRESSION"),
											root_1);
							this.adaptor.addChild(root_1, stream_atomic
									.nextTree());
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "complexPropertyExpression"
	public static class unary_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "unary"
	// MOWLParser.g:131:1: unary options {backtrack=true; } : (head=
	// propertyExpression ( COMPOSITION rest+= propertyExpression )+ -> ^(
	// PROPERTY_CHAIN $head $rest) | NOT OPEN_PARENTHESYS expression
	// CLOSED_PARENTHESYS -> ^( NEGATED_EXPRESSION expression ) | NOT atomic ->
	// ^( NEGATED_EXPRESSION atomic ) | qualifiedRestriction -> ^(
	// qualifiedRestriction ) | constant | atomic );
	public final OPPLPatternParser_OPPLParser_MOWLParser.unary_return unary()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.unary_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.unary_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token COMPOSITION49 = null;
		Token NOT50 = null;
		Token OPEN_PARENTHESYS51 = null;
		Token CLOSED_PARENTHESYS53 = null;
		Token NOT54 = null;
		List list_rest = null;
		OPPLPatternParser_OPPLParser_MOWLParser.propertyExpression_return head = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return expression52 = null;
		OPPLPatternParser.atomic_return atomic55 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.qualifiedRestriction_return qualifiedRestriction56 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.constant_return constant57 = null;
		OPPLPatternParser.atomic_return atomic58 = null;
		RuleReturnScope rest = null;
		OPPLSyntaxTree COMPOSITION49_tree = null;
		OPPLSyntaxTree NOT50_tree = null;
		OPPLSyntaxTree OPEN_PARENTHESYS51_tree = null;
		OPPLSyntaxTree CLOSED_PARENTHESYS53_tree = null;
		OPPLSyntaxTree NOT54_tree = null;
		RewriteRuleTokenStream stream_NOT = new RewriteRuleTokenStream(
				this.adaptor, "token NOT");
		RewriteRuleTokenStream stream_CLOSED_PARENTHESYS = new RewriteRuleTokenStream(
				this.adaptor, "token CLOSED_PARENTHESYS");
		RewriteRuleTokenStream stream_COMPOSITION = new RewriteRuleTokenStream(
				this.adaptor, "token COMPOSITION");
		RewriteRuleTokenStream stream_OPEN_PARENTHESYS = new RewriteRuleTokenStream(
				this.adaptor, "token OPEN_PARENTHESYS");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule expression");
		RewriteRuleSubtreeStream stream_qualifiedRestriction = new RewriteRuleSubtreeStream(
				this.adaptor, "rule qualifiedRestriction");
		RewriteRuleSubtreeStream stream_propertyExpression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule propertyExpression");
		RewriteRuleSubtreeStream stream_atomic = new RewriteRuleSubtreeStream(
				this.adaptor, "rule atomic");
		try {
			// MOWLParser.g:131:34: (head= propertyExpression ( COMPOSITION
			// rest+= propertyExpression )+ -> ^( PROPERTY_CHAIN $head $rest) |
			// NOT OPEN_PARENTHESYS expression CLOSED_PARENTHESYS -> ^(
			// NEGATED_EXPRESSION expression ) | NOT atomic -> ^(
			// NEGATED_EXPRESSION atomic ) | qualifiedRestriction -> ^(
			// qualifiedRestriction ) | constant | atomic )
			int alt11 = 6;
			alt11 = this.dfa11.predict(this.input);
			switch (alt11) {
			case 1:
				// MOWLParser.g:133:4: head= propertyExpression ( COMPOSITION
				// rest+= propertyExpression )+
			{
				this.pushFollow(FOLLOW_propertyExpression_in_unary1177);
				head = this.propertyExpression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_propertyExpression.add(head.getTree());
				}
				// MOWLParser.g:133:30: ( COMPOSITION rest+= propertyExpression
				// )+
				int cnt10 = 0;
				loop10: do {
					int alt10 = 2;
					int LA10_0 = this.input.LA(1);
					if (LA10_0 == COMPOSITION) {
						alt10 = 1;
					}
					switch (alt10) {
					case 1:
						// MOWLParser.g:133:31: COMPOSITION rest+=
						// propertyExpression
					{
						COMPOSITION49 = (Token) this.match(this.input,
								COMPOSITION, FOLLOW_COMPOSITION_in_unary1180);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_COMPOSITION.add(COMPOSITION49);
						}
						this.pushFollow(FOLLOW_propertyExpression_in_unary1184);
						rest = this.propertyExpression();
						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_propertyExpression.add(rest.getTree());
						}
						if (list_rest == null) {
							list_rest = new ArrayList();
						}
						list_rest.add(rest.getTree());
					}
						break;
					default:
						if (cnt10 >= 1) {
							break loop10;
						}
						if (this.state.backtracking > 0) {
							this.state.failed = true;
							return retval;
						}
						EarlyExitException eee = new EarlyExitException(10,
								this.input);
						throw eee;
					}
					cnt10++;
				} while (true);
				// AST REWRITE
				// elements: head, rest
				// token labels:
				// rule labels: retval, head
				// token list labels:
				// rule list labels: rest
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_head = new RewriteRuleSubtreeStream(
							this.adaptor, "rule head", head != null ? head.tree
									: null);
					RewriteRuleSubtreeStream stream_rest = new RewriteRuleSubtreeStream(
							this.adaptor, "token rest", list_rest);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 133:71: -> ^( PROPERTY_CHAIN $head $rest)
					{
						// MOWLParser.g:133:74: ^( PROPERTY_CHAIN $head $rest)
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											PROPERTY_CHAIN, "PROPERTY_CHAIN"),
									root_1);
							this.adaptor.addChild(root_1, stream_head
									.nextTree());
							this.adaptor.addChild(root_1, stream_rest
									.nextTree());
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// MOWLParser.g:134:5: NOT OPEN_PARENTHESYS expression
				// CLOSED_PARENTHESYS
			{
				NOT50 = (Token) this.match(this.input, NOT,
						FOLLOW_NOT_in_unary1206);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_NOT.add(NOT50);
				}
				OPEN_PARENTHESYS51 = (Token) this.match(this.input,
						OPEN_PARENTHESYS, FOLLOW_OPEN_PARENTHESYS_in_unary1208);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_OPEN_PARENTHESYS.add(OPEN_PARENTHESYS51);
				}
				this.pushFollow(FOLLOW_expression_in_unary1210);
				expression52 = this.expression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expression.add(expression52.getTree());
				}
				CLOSED_PARENTHESYS53 = (Token) this.match(this.input,
						CLOSED_PARENTHESYS,
						FOLLOW_CLOSED_PARENTHESYS_in_unary1212);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_CLOSED_PARENTHESYS.add(CLOSED_PARENTHESYS53);
				}
				// AST REWRITE
				// elements: expression
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 134:56: -> ^( NEGATED_EXPRESSION expression )
					{
						// MOWLParser.g:134:59: ^( NEGATED_EXPRESSION expression
						// )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											NEGATED_EXPRESSION,
											"NEGATED_EXPRESSION"), root_1);
							this.adaptor.addChild(root_1, stream_expression
									.nextTree());
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// MOWLParser.g:135:5: NOT atomic
			{
				NOT54 = (Token) this.match(this.input, NOT,
						FOLLOW_NOT_in_unary1226);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_NOT.add(NOT54);
				}
				this.pushFollow(FOLLOW_atomic_in_unary1228);
				atomic55 = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(atomic55.getTree());
				}
				// AST REWRITE
				// elements: atomic
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 135:16: -> ^( NEGATED_EXPRESSION atomic )
					{
						// MOWLParser.g:135:19: ^( NEGATED_EXPRESSION atomic )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											NEGATED_EXPRESSION,
											"NEGATED_EXPRESSION"), root_1);
							this.adaptor.addChild(root_1, stream_atomic
									.nextTree());
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// MOWLParser.g:136:5: qualifiedRestriction
			{
				this.pushFollow(FOLLOW_qualifiedRestriction_in_unary1251);
				qualifiedRestriction56 = this.qualifiedRestriction();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_qualifiedRestriction.add(qualifiedRestriction56
							.getTree());
				}
				// AST REWRITE
				// elements: qualifiedRestriction
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 136:26: -> ^( qualifiedRestriction )
					{
						// MOWLParser.g:136:29: ^( qualifiedRestriction )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_qualifiedRestriction.nextNode(),
									root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// MOWLParser.g:137:5: constant
			{
				root_0 = (OPPLSyntaxTree) this.adaptor.nil();
				this.pushFollow(FOLLOW_constant_in_unary1263);
				constant57 = this.constant();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, constant57.getTree());
				}
			}
				break;
			case 6:
				// MOWLParser.g:138:5: atomic
			{
				root_0 = (OPPLSyntaxTree) this.adaptor.nil();
				this.pushFollow(FOLLOW_atomic_in_unary1269);
				atomic58 = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, atomic58.getTree());
				}
			}
				break;
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "unary"
	public static class qualifiedRestriction_return extends
			ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "qualifiedRestriction"
	// MOWLParser.g:146:1: qualifiedRestriction : ( options {backtrack=true; } :
	// propertyExpression SOME expression -> ^( SOME_RESTRICTION
	// propertyExpression expression ) | propertyExpression ONLY expression ->
	// ^( ALL_RESTRICTION propertyExpression expression ) |
	// cardinalityRestriction -> ^( cardinalityRestriction ) | oneOf -> ^( oneOf
	// ) | valueRestriction -> ^( valueRestriction ) ) ;
	public final OPPLPatternParser_OPPLParser_MOWLParser.qualifiedRestriction_return qualifiedRestriction()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.qualifiedRestriction_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.qualifiedRestriction_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token SOME60 = null;
		Token ONLY63 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.propertyExpression_return propertyExpression59 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return expression61 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.propertyExpression_return propertyExpression62 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return expression64 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.cardinalityRestriction_return cardinalityRestriction65 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.oneOf_return oneOf66 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.valueRestriction_return valueRestriction67 = null;
		OPPLSyntaxTree SOME60_tree = null;
		OPPLSyntaxTree ONLY63_tree = null;
		RewriteRuleTokenStream stream_ONLY = new RewriteRuleTokenStream(
				this.adaptor, "token ONLY");
		RewriteRuleTokenStream stream_SOME = new RewriteRuleTokenStream(
				this.adaptor, "token SOME");
		RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule expression");
		RewriteRuleSubtreeStream stream_oneOf = new RewriteRuleSubtreeStream(
				this.adaptor, "rule oneOf");
		RewriteRuleSubtreeStream stream_propertyExpression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule propertyExpression");
		RewriteRuleSubtreeStream stream_cardinalityRestriction = new RewriteRuleSubtreeStream(
				this.adaptor, "rule cardinalityRestriction");
		RewriteRuleSubtreeStream stream_valueRestriction = new RewriteRuleSubtreeStream(
				this.adaptor, "rule valueRestriction");
		try {
			// MOWLParser.g:146:21: ( ( options {backtrack=true; } :
			// propertyExpression SOME expression -> ^( SOME_RESTRICTION
			// propertyExpression expression ) | propertyExpression ONLY
			// expression -> ^( ALL_RESTRICTION propertyExpression expression )
			// | cardinalityRestriction -> ^( cardinalityRestriction ) | oneOf
			// -> ^( oneOf ) | valueRestriction -> ^( valueRestriction ) ) )
			// MOWLParser.g:147:9: ( options {backtrack=true; } :
			// propertyExpression SOME expression -> ^( SOME_RESTRICTION
			// propertyExpression expression ) | propertyExpression ONLY
			// expression -> ^( ALL_RESTRICTION propertyExpression expression )
			// | cardinalityRestriction -> ^( cardinalityRestriction ) | oneOf
			// -> ^( oneOf ) | valueRestriction -> ^( valueRestriction ) )
			{
				// MOWLParser.g:147:9: ( options {backtrack=true; } :
				// propertyExpression SOME expression -> ^( SOME_RESTRICTION
				// propertyExpression expression ) | propertyExpression ONLY
				// expression -> ^( ALL_RESTRICTION propertyExpression
				// expression ) | cardinalityRestriction -> ^(
				// cardinalityRestriction ) | oneOf -> ^( oneOf ) |
				// valueRestriction -> ^( valueRestriction ) )
				int alt13 = 5;
				alt13 = this.dfa13.predict(this.input);
				switch (alt13) {
				case 1:
					// MOWLParser.g:149:7: propertyExpression SOME expression
				{
					this
							.pushFollow(FOLLOW_propertyExpression_in_qualifiedRestriction1342);
					propertyExpression59 = this.propertyExpression();
					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_propertyExpression.add(propertyExpression59
								.getTree());
					}
					SOME60 = (Token) this.match(this.input, SOME,
							FOLLOW_SOME_in_qualifiedRestriction1345);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_SOME.add(SOME60);
					}
					this
							.pushFollow(FOLLOW_expression_in_qualifiedRestriction1349);
					expression61 = this.expression();
					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_expression.add(expression61.getTree());
					}
					// AST REWRITE
					// elements: expression, propertyExpression
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					if (this.state.backtracking == 0) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								this.adaptor, "rule retval",
								retval != null ? retval.tree : null);
						root_0 = (OPPLSyntaxTree) this.adaptor.nil();
						// 149:46: -> ^( SOME_RESTRICTION propertyExpression
						// expression )
						{
							// MOWLParser.g:149:49: ^( SOME_RESTRICTION
							// propertyExpression expression )
							{
								OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_1 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(
																SOME_RESTRICTION,
																"SOME_RESTRICTION"),
												root_1);
								this.adaptor.addChild(root_1,
										stream_propertyExpression.nextTree());
								this.adaptor.addChild(root_1, stream_expression
										.nextTree());
								this.adaptor.addChild(root_0, root_1);
							}
						}
						retval.tree = root_0;
					}
				}
					break;
				case 2:
					// MOWLParser.g:150:7: propertyExpression ONLY expression
				{
					this
							.pushFollow(FOLLOW_propertyExpression_in_qualifiedRestriction1378);
					propertyExpression62 = this.propertyExpression();
					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_propertyExpression.add(propertyExpression62
								.getTree());
					}
					ONLY63 = (Token) this.match(this.input, ONLY,
							FOLLOW_ONLY_in_qualifiedRestriction1380);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_ONLY.add(ONLY63);
					}
					this
							.pushFollow(FOLLOW_expression_in_qualifiedRestriction1383);
					expression64 = this.expression();
					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_expression.add(expression64.getTree());
					}
					// AST REWRITE
					// elements: expression, propertyExpression
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					if (this.state.backtracking == 0) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								this.adaptor, "rule retval",
								retval != null ? retval.tree : null);
						root_0 = (OPPLSyntaxTree) this.adaptor.nil();
						// 150:44: -> ^( ALL_RESTRICTION propertyExpression
						// expression )
						{
							// MOWLParser.g:150:47: ^( ALL_RESTRICTION
							// propertyExpression expression )
							{
								OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_1 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												(OPPLSyntaxTree) this.adaptor
														.create(
																ALL_RESTRICTION,
																"ALL_RESTRICTION"),
												root_1);
								this.adaptor.addChild(root_1,
										stream_propertyExpression.nextTree());
								this.adaptor.addChild(root_1, stream_expression
										.nextTree());
								this.adaptor.addChild(root_0, root_1);
							}
						}
						retval.tree = root_0;
					}
				}
					break;
				case 3:
					// MOWLParser.g:151:7: cardinalityRestriction
				{
					this
							.pushFollow(FOLLOW_cardinalityRestriction_in_qualifiedRestriction1402);
					cardinalityRestriction65 = this.cardinalityRestriction();
					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_cardinalityRestriction
								.add(cardinalityRestriction65.getTree());
					}
					// AST REWRITE
					// elements: cardinalityRestriction
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					if (this.state.backtracking == 0) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								this.adaptor, "rule retval",
								retval != null ? retval.tree : null);
						root_0 = (OPPLSyntaxTree) this.adaptor.nil();
						// 151:30: -> ^( cardinalityRestriction )
						{
							// MOWLParser.g:151:33: ^( cardinalityRestriction )
							{
								OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_1 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(
												stream_cardinalityRestriction
														.nextNode(), root_1);
								this.adaptor.addChild(root_0, root_1);
							}
						}
						retval.tree = root_0;
					}
				}
					break;
				case 4:
					// MOWLParser.g:152:7: oneOf
				{
					this.pushFollow(FOLLOW_oneOf_in_qualifiedRestriction1416);
					oneOf66 = this.oneOf();
					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_oneOf.add(oneOf66.getTree());
					}
					// AST REWRITE
					// elements: oneOf
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					if (this.state.backtracking == 0) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								this.adaptor, "rule retval",
								retval != null ? retval.tree : null);
						root_0 = (OPPLSyntaxTree) this.adaptor.nil();
						// 152:13: -> ^( oneOf )
						{
							// MOWLParser.g:152:16: ^( oneOf )
							{
								OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_1 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(stream_oneOf.nextNode(),
												root_1);
								this.adaptor.addChild(root_0, root_1);
							}
						}
						retval.tree = root_0;
					}
				}
					break;
				case 5:
					// MOWLParser.g:153:7: valueRestriction
				{
					this
							.pushFollow(FOLLOW_valueRestriction_in_qualifiedRestriction1430);
					valueRestriction67 = this.valueRestriction();
					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_valueRestriction.add(valueRestriction67
								.getTree());
					}
					// AST REWRITE
					// elements: valueRestriction
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					if (this.state.backtracking == 0) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								this.adaptor, "rule retval",
								retval != null ? retval.tree : null);
						root_0 = (OPPLSyntaxTree) this.adaptor.nil();
						// 153:24: -> ^( valueRestriction )
						{
							// MOWLParser.g:153:27: ^( valueRestriction )
							{
								OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
										.nil();
								root_1 = (OPPLSyntaxTree) this.adaptor
										.becomeRoot(stream_valueRestriction
												.nextNode(), root_1);
								this.adaptor.addChild(root_0, root_1);
							}
						}
						retval.tree = root_0;
					}
				}
					break;
				}
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "qualifiedRestriction"
	public static class propertyExpression_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "propertyExpression"
	// MOWLParser.g:157:1: propertyExpression : ( atomic -> ^( atomic ) |
	// complexPropertyExpression -> ^( complexPropertyExpression ) );
	public final OPPLPatternParser_OPPLParser_MOWLParser.propertyExpression_return propertyExpression()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.propertyExpression_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.propertyExpression_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		OPPLPatternParser.atomic_return atomic68 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.complexPropertyExpression_return complexPropertyExpression69 = null;
		RewriteRuleSubtreeStream stream_complexPropertyExpression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule complexPropertyExpression");
		RewriteRuleSubtreeStream stream_atomic = new RewriteRuleSubtreeStream(
				this.adaptor, "rule atomic");
		try {
			// MOWLParser.g:157:21: ( atomic -> ^( atomic ) |
			// complexPropertyExpression -> ^( complexPropertyExpression ) )
			int alt14 = 2;
			int LA14_0 = this.input.LA(1);
			if (LA14_0 >= IDENTIFIER && LA14_0 <= ENTITY_REFERENCE
					|| LA14_0 == ESCLAMATION_MARK || LA14_0 == DOLLAR
					|| LA14_0 == THIS_CLASS || LA14_0 == VARIABLE_NAME) {
				alt14 = 1;
			} else if (LA14_0 == INVERSE) {
				alt14 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 14, 0,
						this.input);
				throw nvae;
			}
			switch (alt14) {
			case 1:
				// MOWLParser.g:158:7: atomic
			{
				this.pushFollow(FOLLOW_atomic_in_propertyExpression1462);
				atomic68 = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(atomic68.getTree());
				}
				// AST REWRITE
				// elements: atomic
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 158:14: -> ^( atomic )
					{
						// MOWLParser.g:158:17: ^( atomic )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_atomic.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// MOWLParser.g:159:7: complexPropertyExpression
			{
				this
						.pushFollow(FOLLOW_complexPropertyExpression_in_propertyExpression1476);
				complexPropertyExpression69 = this.complexPropertyExpression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_complexPropertyExpression
							.add(complexPropertyExpression69.getTree());
				}
				// AST REWRITE
				// elements: complexPropertyExpression
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 159:33: -> ^( complexPropertyExpression )
					{
						// MOWLParser.g:159:36: ^( complexPropertyExpression )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor
									.becomeRoot(
											stream_complexPropertyExpression
													.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "propertyExpression"
	public static class cardinalityRestriction_return extends
			ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "cardinalityRestriction"
	// MOWLParser.g:162:1: cardinalityRestriction options {backtrack=true; } :
	// propertyExpression restrictionKind INTEGER ( unary )? -> ^(
	// CARDINALITY_RESTRICTION restrictionKind INTEGER propertyExpression (
	// unary )? ) ;
	public final OPPLPatternParser_OPPLParser_MOWLParser.cardinalityRestriction_return cardinalityRestriction()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.cardinalityRestriction_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.cardinalityRestriction_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token INTEGER72 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.propertyExpression_return propertyExpression70 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.restrictionKind_return restrictionKind71 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.unary_return unary73 = null;
		OPPLSyntaxTree INTEGER72_tree = null;
		RewriteRuleTokenStream stream_INTEGER = new RewriteRuleTokenStream(
				this.adaptor, "token INTEGER");
		RewriteRuleSubtreeStream stream_unary = new RewriteRuleSubtreeStream(
				this.adaptor, "rule unary");
		RewriteRuleSubtreeStream stream_propertyExpression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule propertyExpression");
		RewriteRuleSubtreeStream stream_restrictionKind = new RewriteRuleSubtreeStream(
				this.adaptor, "rule restrictionKind");
		try {
			// MOWLParser.g:163:28: ( propertyExpression restrictionKind INTEGER
			// ( unary )? -> ^( CARDINALITY_RESTRICTION restrictionKind INTEGER
			// propertyExpression ( unary )? ) )
			// MOWLParser.g:164:2: propertyExpression restrictionKind INTEGER (
			// unary )?
			{
				this
						.pushFollow(FOLLOW_propertyExpression_in_cardinalityRestriction1518);
				propertyExpression70 = this.propertyExpression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_propertyExpression.add(propertyExpression70
							.getTree());
				}
				this
						.pushFollow(FOLLOW_restrictionKind_in_cardinalityRestriction1521);
				restrictionKind71 = this.restrictionKind();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_restrictionKind.add(restrictionKind71.getTree());
				}
				INTEGER72 = (Token) this.match(this.input, INTEGER,
						FOLLOW_INTEGER_in_cardinalityRestriction1523);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_INTEGER.add(INTEGER72);
				}
				// MOWLParser.g:164:46: ( unary )?
				int alt15 = 2;
				int LA15_0 = this.input.LA(1);
				if (LA15_0 == OPEN_CURLY_BRACES || LA15_0 == NOT
						|| LA15_0 == INVERSE || LA15_0 == DBLQUOTE
						|| LA15_0 >= IDENTIFIER && LA15_0 <= ENTITY_REFERENCE
						|| LA15_0 == ESCLAMATION_MARK || LA15_0 == DOLLAR
						|| LA15_0 == THIS_CLASS || LA15_0 == VARIABLE_NAME) {
					alt15 = 1;
				}
				switch (alt15) {
				case 1:
					// MOWLParser.g:164:46: unary
				{
					this.pushFollow(FOLLOW_unary_in_cardinalityRestriction1525);
					unary73 = this.unary();
					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_unary.add(unary73.getTree());
					}
				}
					break;
				}
				// AST REWRITE
				// elements: restrictionKind, unary, INTEGER, propertyExpression
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 164:53: -> ^( CARDINALITY_RESTRICTION restrictionKind
					// INTEGER propertyExpression ( unary )? )
					{
						// MOWLParser.g:164:56: ^( CARDINALITY_RESTRICTION
						// restrictionKind INTEGER propertyExpression ( unary )?
						// )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											CARDINALITY_RESTRICTION,
											"CARDINALITY_RESTRICTION"), root_1);
							this.adaptor.addChild(root_1,
									stream_restrictionKind.nextTree());
							this.adaptor.addChild(root_1, stream_INTEGER
									.nextNode());
							this.adaptor.addChild(root_1,
									stream_propertyExpression.nextTree());
							// MOWLParser.g:164:127: ( unary )?
							if (stream_unary.hasNext()) {
								this.adaptor.addChild(root_1, stream_unary
										.nextTree());
							}
							stream_unary.reset();
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "cardinalityRestriction"
	public static class restrictionKind_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "restrictionKind"
	// MOWLParser.g:167:1: restrictionKind : ( MIN -> ^( MIN ) | MAX -> ^( MAX )
	// | EXACTLY -> ^( EXACTLY ) );
	public final OPPLPatternParser_OPPLParser_MOWLParser.restrictionKind_return restrictionKind()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.restrictionKind_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.restrictionKind_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token MIN74 = null;
		Token MAX75 = null;
		Token EXACTLY76 = null;
		OPPLSyntaxTree MIN74_tree = null;
		OPPLSyntaxTree MAX75_tree = null;
		OPPLSyntaxTree EXACTLY76_tree = null;
		RewriteRuleTokenStream stream_MAX = new RewriteRuleTokenStream(
				this.adaptor, "token MAX");
		RewriteRuleTokenStream stream_MIN = new RewriteRuleTokenStream(
				this.adaptor, "token MIN");
		RewriteRuleTokenStream stream_EXACTLY = new RewriteRuleTokenStream(
				this.adaptor, "token EXACTLY");
		try {
			// MOWLParser.g:167:17: ( MIN -> ^( MIN ) | MAX -> ^( MAX ) |
			// EXACTLY -> ^( EXACTLY ) )
			int alt16 = 3;
			switch (this.input.LA(1)) {
			case MIN: {
				alt16 = 1;
			}
				break;
			case MAX: {
				alt16 = 2;
			}
				break;
			case EXACTLY: {
				alt16 = 3;
			}
				break;
			default:
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 16, 0,
						this.input);
				throw nvae;
			}
			switch (alt16) {
			case 1:
				// MOWLParser.g:168:5: MIN
			{
				MIN74 = (Token) this.match(this.input, MIN,
						FOLLOW_MIN_in_restrictionKind1558);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_MIN.add(MIN74);
				}
				// AST REWRITE
				// elements: MIN
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 168:9: -> ^( MIN )
					{
						// MOWLParser.g:168:12: ^( MIN )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_MIN.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// MOWLParser.g:169:7: MAX
			{
				MAX75 = (Token) this.match(this.input, MAX,
						FOLLOW_MAX_in_restrictionKind1572);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_MAX.add(MAX75);
				}
				// AST REWRITE
				// elements: MAX
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 169:11: -> ^( MAX )
					{
						// MOWLParser.g:169:14: ^( MAX )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_MAX.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// MOWLParser.g:170:7: EXACTLY
			{
				EXACTLY76 = (Token) this.match(this.input, EXACTLY,
						FOLLOW_EXACTLY_in_restrictionKind1586);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_EXACTLY.add(EXACTLY76);
				}
				// AST REWRITE
				// elements: EXACTLY
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 170:15: -> ^( EXACTLY )
					{
						// MOWLParser.g:170:18: ^( EXACTLY )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_EXACTLY.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "restrictionKind"
	public static class oneOf_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "oneOf"
	// MOWLParser.g:174:1: oneOf : OPEN_CURLY_BRACES IDENTIFIER ( COMMA
	// IDENTIFIER )* CLOSED_CURLY_BRACES -> ^( ONE_OF ( IDENTIFIER )+ ) ;
	public final OPPLPatternParser_OPPLParser_MOWLParser.oneOf_return oneOf()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.oneOf_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.oneOf_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token OPEN_CURLY_BRACES77 = null;
		Token IDENTIFIER78 = null;
		Token COMMA79 = null;
		Token IDENTIFIER80 = null;
		Token CLOSED_CURLY_BRACES81 = null;
		OPPLSyntaxTree OPEN_CURLY_BRACES77_tree = null;
		OPPLSyntaxTree IDENTIFIER78_tree = null;
		OPPLSyntaxTree COMMA79_tree = null;
		OPPLSyntaxTree IDENTIFIER80_tree = null;
		OPPLSyntaxTree CLOSED_CURLY_BRACES81_tree = null;
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				this.adaptor, "token COMMA");
		RewriteRuleTokenStream stream_CLOSED_CURLY_BRACES = new RewriteRuleTokenStream(
				this.adaptor, "token CLOSED_CURLY_BRACES");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				this.adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_OPEN_CURLY_BRACES = new RewriteRuleTokenStream(
				this.adaptor, "token OPEN_CURLY_BRACES");
		try {
			// MOWLParser.g:174:7: ( OPEN_CURLY_BRACES IDENTIFIER ( COMMA
			// IDENTIFIER )* CLOSED_CURLY_BRACES -> ^( ONE_OF ( IDENTIFIER )+ )
			// )
			// MOWLParser.g:175:3: OPEN_CURLY_BRACES IDENTIFIER ( COMMA
			// IDENTIFIER )* CLOSED_CURLY_BRACES
			{
				OPEN_CURLY_BRACES77 = (Token) this.match(this.input,
						OPEN_CURLY_BRACES,
						FOLLOW_OPEN_CURLY_BRACES_in_oneOf1608);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_OPEN_CURLY_BRACES.add(OPEN_CURLY_BRACES77);
				}
				IDENTIFIER78 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_oneOf1610);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IDENTIFIER.add(IDENTIFIER78);
				}
				// MOWLParser.g:175:32: ( COMMA IDENTIFIER )*
				loop17: do {
					int alt17 = 2;
					int LA17_0 = this.input.LA(1);
					if (LA17_0 == COMMA) {
						alt17 = 1;
					}
					switch (alt17) {
					case 1:
						// MOWLParser.g:175:33: COMMA IDENTIFIER
					{
						COMMA79 = (Token) this.match(this.input, COMMA,
								FOLLOW_COMMA_in_oneOf1613);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_COMMA.add(COMMA79);
						}
						IDENTIFIER80 = (Token) this.match(this.input,
								IDENTIFIER, FOLLOW_IDENTIFIER_in_oneOf1615);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_IDENTIFIER.add(IDENTIFIER80);
						}
					}
						break;
					default:
						break loop17;
					}
				} while (true);
				CLOSED_CURLY_BRACES81 = (Token) this.match(this.input,
						CLOSED_CURLY_BRACES,
						FOLLOW_CLOSED_CURLY_BRACES_in_oneOf1619);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_CLOSED_CURLY_BRACES.add(CLOSED_CURLY_BRACES81);
				}
				// AST REWRITE
				// elements: IDENTIFIER
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 175:72: -> ^( ONE_OF ( IDENTIFIER )+ )
					{
						// MOWLParser.g:175:75: ^( ONE_OF ( IDENTIFIER )+ )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											ONE_OF, "ONE_OF"), root_1);
							if (!stream_IDENTIFIER.hasNext()) {
								throw new RewriteEarlyExitException();
							}
							while (stream_IDENTIFIER.hasNext()) {
								this.adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());
							}
							stream_IDENTIFIER.reset();
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "oneOf"
	public static class valueRestriction_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "valueRestriction"
	// MOWLParser.g:178:1: valueRestriction : propertyExpression VALUE value ->
	// ^( VALUE_RESTRICTION propertyExpression value ) ;
	public final OPPLPatternParser_OPPLParser_MOWLParser.valueRestriction_return valueRestriction()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.valueRestriction_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.valueRestriction_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token VALUE83 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.propertyExpression_return propertyExpression82 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.value_return value84 = null;
		OPPLSyntaxTree VALUE83_tree = null;
		RewriteRuleTokenStream stream_VALUE = new RewriteRuleTokenStream(
				this.adaptor, "token VALUE");
		RewriteRuleSubtreeStream stream_propertyExpression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule propertyExpression");
		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(
				this.adaptor, "rule value");
		try {
			// MOWLParser.g:178:18: ( propertyExpression VALUE value -> ^(
			// VALUE_RESTRICTION propertyExpression value ) )
			// MOWLParser.g:178:20: propertyExpression VALUE value
			{
				this
						.pushFollow(FOLLOW_propertyExpression_in_valueRestriction1639);
				propertyExpression82 = this.propertyExpression();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_propertyExpression.add(propertyExpression82
							.getTree());
				}
				VALUE83 = (Token) this.match(this.input, VALUE,
						FOLLOW_VALUE_in_valueRestriction1641);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_VALUE.add(VALUE83);
				}
				this.pushFollow(FOLLOW_value_in_valueRestriction1643);
				value84 = this.value();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_value.add(value84.getTree());
				}
				// AST REWRITE
				// elements: propertyExpression, value
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 178:51: -> ^( VALUE_RESTRICTION propertyExpression value
					// )
					{
						// MOWLParser.g:178:54: ^( VALUE_RESTRICTION
						// propertyExpression value )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											VALUE_RESTRICTION,
											"VALUE_RESTRICTION"), root_1);
							this.adaptor.addChild(root_1,
									stream_propertyExpression.nextTree());
							this.adaptor.addChild(root_1, stream_value
									.nextTree());
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "valueRestriction"
	public static class value_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "value"
	// MOWLParser.g:181:1: value : ( atomic -> ^( atomic ) | constant -> ^(
	// constant ) );
	public final OPPLPatternParser_OPPLParser_MOWLParser.value_return value()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.value_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.value_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		OPPLPatternParser.atomic_return atomic85 = null;
		OPPLPatternParser_OPPLParser_MOWLParser.constant_return constant86 = null;
		RewriteRuleSubtreeStream stream_constant = new RewriteRuleSubtreeStream(
				this.adaptor, "rule constant");
		RewriteRuleSubtreeStream stream_atomic = new RewriteRuleSubtreeStream(
				this.adaptor, "rule atomic");
		try {
			// MOWLParser.g:181:6: ( atomic -> ^( atomic ) | constant -> ^(
			// constant ) )
			int alt18 = 2;
			int LA18_0 = this.input.LA(1);
			if (LA18_0 >= IDENTIFIER && LA18_0 <= ENTITY_REFERENCE
					|| LA18_0 == ESCLAMATION_MARK || LA18_0 == DOLLAR
					|| LA18_0 == THIS_CLASS || LA18_0 == VARIABLE_NAME) {
				alt18 = 1;
			} else if (LA18_0 == DBLQUOTE) {
				alt18 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 18, 0,
						this.input);
				throw nvae;
			}
			switch (alt18) {
			case 1:
				// MOWLParser.g:182:7: atomic
			{
				this.pushFollow(FOLLOW_atomic_in_value1668);
				atomic85 = this.gOPPLPatternParser.atomic();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_atomic.add(atomic85.getTree());
				}
				// AST REWRITE
				// elements: atomic
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 182:14: -> ^( atomic )
					{
						// MOWLParser.g:182:17: ^( atomic )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_atomic.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// MOWLParser.g:183:7: constant
			{
				this.pushFollow(FOLLOW_constant_in_value1683);
				constant86 = this.constant();
				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_constant.add(constant86.getTree());
				}
				// AST REWRITE
				// elements: constant
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 183:16: -> ^( constant )
					{
						// MOWLParser.g:183:19: ^( constant )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									stream_constant.nextNode(), root_1);
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
				break;
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "value"
	public static class constant_return extends ParserRuleReturnScope {
		OPPLSyntaxTree tree;

		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "constant"
	// MOWLParser.g:186:1: constant : constantValue= DBLQUOTE ( POW type=
	// IDENTIFIER )? -> ^( CONSTANT $constantValue ( $type)? ) ;
	public final OPPLPatternParser_OPPLParser_MOWLParser.constant_return constant()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.constant_return retval = new OPPLPatternParser_OPPLParser_MOWLParser.constant_return();
		retval.start = this.input.LT(1);
		OPPLSyntaxTree root_0 = null;
		Token constantValue = null;
		Token type = null;
		Token POW87 = null;
		OPPLSyntaxTree constantValue_tree = null;
		OPPLSyntaxTree type_tree = null;
		OPPLSyntaxTree POW87_tree = null;
		RewriteRuleTokenStream stream_POW = new RewriteRuleTokenStream(
				this.adaptor, "token POW");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				this.adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_DBLQUOTE = new RewriteRuleTokenStream(
				this.adaptor, "token DBLQUOTE");
		try {
			// MOWLParser.g:186:11: (constantValue= DBLQUOTE ( POW type=
			// IDENTIFIER )? -> ^( CONSTANT $constantValue ( $type)? ) )
			// MOWLParser.g:186:14: constantValue= DBLQUOTE ( POW type=
			// IDENTIFIER )?
			{
				constantValue = (Token) this.match(this.input, DBLQUOTE,
						FOLLOW_DBLQUOTE_in_constant1708);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_DBLQUOTE.add(constantValue);
				}
				// MOWLParser.g:186:39: ( POW type= IDENTIFIER )?
				int alt19 = 2;
				int LA19_0 = this.input.LA(1);
				if (LA19_0 == POW) {
					alt19 = 1;
				}
				switch (alt19) {
				case 1:
					// MOWLParser.g:186:41: POW type= IDENTIFIER
				{
					POW87 = (Token) this.match(this.input, POW,
							FOLLOW_POW_in_constant1712);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_POW.add(POW87);
					}
					type = (Token) this.match(this.input, IDENTIFIER,
							FOLLOW_IDENTIFIER_in_constant1718);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_IDENTIFIER.add(type);
					}
				}
					break;
				}
				// AST REWRITE
				// elements: type, constantValue
				// token labels: constantValue, type
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_constantValue = new RewriteRuleTokenStream(
							this.adaptor, "token constantValue", constantValue);
					RewriteRuleTokenStream stream_type = new RewriteRuleTokenStream(
							this.adaptor, "token type", type);
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					root_0 = (OPPLSyntaxTree) this.adaptor.nil();
					// 186:65: -> ^( CONSTANT $constantValue ( $type)? )
					{
						// MOWLParser.g:186:67: ^( CONSTANT $constantValue (
						// $type)? )
						{
							OPPLSyntaxTree root_1 = (OPPLSyntaxTree) this.adaptor
									.nil();
							root_1 = (OPPLSyntaxTree) this.adaptor.becomeRoot(
									(OPPLSyntaxTree) this.adaptor.create(
											CONSTANT, "CONSTANT"), root_1);
							this.adaptor.addChild(root_1, stream_constantValue
									.nextNode());
							// MOWLParser.g:186:93: ( $type)?
							if (stream_type.hasNext()) {
								this.adaptor.addChild(root_1, stream_type
										.nextNode());
							}
							stream_type.reset();
							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}
			retval.stop = this.input.LT(-1);
			if (this.state.backtracking == 0) {
				retval.tree = (OPPLSyntaxTree) this.adaptor
						.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} catch (RewriteEmptyStreamException e) {
			throw e;
		} finally {
		}
		return retval;
	}

	// $ANTLR end "constant"
	// $ANTLR start synpred1_MOWLParser
	public final void synpred1_MOWLParser_fragment()
			throws RecognitionException {
		// MOWLParser.g:64:3: ( binaryAxiom )
		// MOWLParser.g:64:3: binaryAxiom
		{
			this.pushFollow(FOLLOW_binaryAxiom_in_synpred1_MOWLParser231);
			this.binaryAxiom();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred1_MOWLParser
	// $ANTLR start synpred3_MOWLParser
	public final void synpred3_MOWLParser_fragment()
			throws RecognitionException {
		OPPLPatternParser.atomic_return i = null;
		// MOWLParser.g:72:3: (i= atomic ( INSTANCE_OF | TYPES ) expression )
		// MOWLParser.g:72:3: i= atomic ( INSTANCE_OF | TYPES ) expression
		{
			this.pushFollow(FOLLOW_atomic_in_synpred3_MOWLParser285);
			i = this.gOPPLPatternParser.atomic();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			if (this.input.LA(1) >= INSTANCE_OF && this.input.LA(1) <= TYPES) {
				this.input.consume();
				this.state.errorRecovery = false;
				this.state.failed = false;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return;
				}
				MismatchedSetException mse = new MismatchedSetException(null,
						this.input);
				throw mse;
			}
			this.pushFollow(FOLLOW_expression_in_synpred3_MOWLParser295);
			this.expression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred3_MOWLParser
	// $ANTLR start synpred4_MOWLParser
	public final void synpred4_MOWLParser_fragment()
			throws RecognitionException {
		OPPLPatternParser.atomic_return subject = null;
		// MOWLParser.g:73:7: (subject= atomic propertyExpression value )
		// MOWLParser.g:73:7: subject= atomic propertyExpression value
		{
			this.pushFollow(FOLLOW_atomic_in_synpred4_MOWLParser326);
			subject = this.gOPPLPatternParser.atomic();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this
					.pushFollow(FOLLOW_propertyExpression_in_synpred4_MOWLParser328);
			this.propertyExpression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_value_in_synpred4_MOWLParser331);
			this.value();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred4_MOWLParser
	// $ANTLR start synpred5_MOWLParser
	public final void synpred5_MOWLParser_fragment()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return lhs = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return superClass = null;
		// MOWLParser.g:83:2: (lhs= expression SUBCLASS_OF superClass=
		// expression )
		// MOWLParser.g:83:2: lhs= expression SUBCLASS_OF superClass= expression
		{
			this.pushFollow(FOLLOW_expression_in_synpred5_MOWLParser406);
			lhs = this.expression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, SUBCLASS_OF,
					FOLLOW_SUBCLASS_OF_in_synpred5_MOWLParser408);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_expression_in_synpred5_MOWLParser415);
			superClass = this.expression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred5_MOWLParser
	// $ANTLR start synpred6_MOWLParser
	public final void synpred6_MOWLParser_fragment()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return lhs = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return rhs = null;
		// MOWLParser.g:84:11: (lhs= expression EQUIVALENT_TO rhs= expression )
		// MOWLParser.g:84:11: lhs= expression EQUIVALENT_TO rhs= expression
		{
			this.pushFollow(FOLLOW_expression_in_synpred6_MOWLParser453);
			lhs = this.expression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, EQUIVALENT_TO,
					FOLLOW_EQUIVALENT_TO_in_synpred6_MOWLParser455);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_expression_in_synpred6_MOWLParser461);
			rhs = this.expression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred6_MOWLParser
	// $ANTLR start synpred7_MOWLParser
	public final void synpred7_MOWLParser_fragment()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return lhs = null;
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return disjoint = null;
		// MOWLParser.g:85:11: (lhs= expression DISJOINT_WITH disjoint=
		// expression )
		// MOWLParser.g:85:11: lhs= expression DISJOINT_WITH disjoint=
		// expression
		{
			this.pushFollow(FOLLOW_expression_in_synpred7_MOWLParser498);
			lhs = this.expression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, DISJOINT_WITH,
					FOLLOW_DISJOINT_WITH_in_synpred7_MOWLParser500);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_expression_in_synpred7_MOWLParser506);
			disjoint = this.expression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred7_MOWLParser
	// $ANTLR start synpred8_MOWLParser
	public final void synpred8_MOWLParser_fragment()
			throws RecognitionException {
		OPPLPatternParser_OPPLParser_MOWLParser.expression_return lhs = null;
		OPPLPatternParser_OPPLParser_MOWLParser.propertyExpression_return superProperty = null;
		// MOWLParser.g:86:11: (lhs= expression SUB_PROPERTY_OF superProperty=
		// propertyExpression )
		// MOWLParser.g:86:11: lhs= expression SUB_PROPERTY_OF superProperty=
		// propertyExpression
		{
			this.pushFollow(FOLLOW_expression_in_synpred8_MOWLParser543);
			lhs = this.expression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, SUB_PROPERTY_OF,
					FOLLOW_SUB_PROPERTY_OF_in_synpred8_MOWLParser545);
			if (this.state.failed) {
				return;
			}
			this
					.pushFollow(FOLLOW_propertyExpression_in_synpred8_MOWLParser551);
			superProperty = this.propertyExpression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred8_MOWLParser
	// $ANTLR start synpred9_MOWLParser
	public final void synpred9_MOWLParser_fragment()
			throws RecognitionException {
		OPPLPatternParser.atomic_return lhsID = null;
		OPPLPatternParser.atomic_return rhsAtomic = null;
		// MOWLParser.g:87:11: (lhsID= atomic INVERSE_OF rhsAtomic= atomic )
		// MOWLParser.g:87:11: lhsID= atomic INVERSE_OF rhsAtomic= atomic
		{
			this.pushFollow(FOLLOW_atomic_in_synpred9_MOWLParser588);
			lhsID = this.gOPPLPatternParser.atomic();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, INVERSE_OF,
					FOLLOW_INVERSE_OF_in_synpred9_MOWLParser590);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_atomic_in_synpred9_MOWLParser596);
			rhsAtomic = this.gOPPLPatternParser.atomic();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred9_MOWLParser
	// $ANTLR start synpred10_MOWLParser
	public final void synpred10_MOWLParser_fragment()
			throws RecognitionException {
		OPPLPatternParser.atomic_return lhsID = null;
		OPPLPatternParser.atomic_return rhsID = null;
		// MOWLParser.g:88:3: (lhsID= atomic SAME_AS rhsID= atomic )
		// MOWLParser.g:88:3: lhsID= atomic SAME_AS rhsID= atomic
		{
			this.pushFollow(FOLLOW_atomic_in_synpred10_MOWLParser627);
			lhsID = this.gOPPLPatternParser.atomic();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, SAME_AS,
					FOLLOW_SAME_AS_in_synpred10_MOWLParser629);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_atomic_in_synpred10_MOWLParser636);
			rhsID = this.gOPPLPatternParser.atomic();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred10_MOWLParser
	// $ANTLR start synpred11_MOWLParser
	public final void synpred11_MOWLParser_fragment()
			throws RecognitionException {
		OPPLPatternParser.atomic_return lhsID = null;
		OPPLPatternParser.atomic_return rhsID = null;
		// MOWLParser.g:89:11: (lhsID= atomic DIFFERENT_FROM rhsID= atomic )
		// MOWLParser.g:89:11: lhsID= atomic DIFFERENT_FROM rhsID= atomic
		{
			this.pushFollow(FOLLOW_atomic_in_synpred11_MOWLParser674);
			lhsID = this.gOPPLPatternParser.atomic();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, DIFFERENT_FROM,
					FOLLOW_DIFFERENT_FROM_in_synpred11_MOWLParser676);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_atomic_in_synpred11_MOWLParser683);
			rhsID = this.gOPPLPatternParser.atomic();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred11_MOWLParser
	// $ANTLR start synpred12_MOWLParser
	public final void synpred12_MOWLParser_fragment()
			throws RecognitionException {
		OPPLPatternParser.atomic_return lhsID = null;
		// MOWLParser.g:90:11: (lhsID= atomic DOMAIN expression )
		// MOWLParser.g:90:11: lhsID= atomic DOMAIN expression
		{
			this.pushFollow(FOLLOW_atomic_in_synpred12_MOWLParser720);
			lhsID = this.gOPPLPatternParser.atomic();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, DOMAIN,
					FOLLOW_DOMAIN_in_synpred12_MOWLParser723);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_expression_in_synpred12_MOWLParser725);
			this.expression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred12_MOWLParser
	// $ANTLR start synpred14_MOWLParser
	public final void synpred14_MOWLParser_fragment()
			throws RecognitionException {
		// MOWLParser.g:112:6: ( conjunction ( OR conjunction )* )
		// MOWLParser.g:112:6: conjunction ( OR conjunction )*
		{
			this.pushFollow(FOLLOW_conjunction_in_synpred14_MOWLParser1015);
			this.conjunction();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			// MOWLParser.g:112:18: ( OR conjunction )*
			loop20: do {
				int alt20 = 2;
				int LA20_0 = this.input.LA(1);
				if (LA20_0 == OR) {
					alt20 = 1;
				}
				switch (alt20) {
				case 1:
					// MOWLParser.g:112:19: OR conjunction
				{
					this.match(this.input, OR,
							FOLLOW_OR_in_synpred14_MOWLParser1018);
					if (this.state.failed) {
						return;
					}
					this
							.pushFollow(FOLLOW_conjunction_in_synpred14_MOWLParser1020);
					this.conjunction();
					this.state._fsp--;
					if (this.state.failed) {
						return;
					}
				}
					break;
				default:
					break loop20;
				}
			} while (true);
		}
	}

	// $ANTLR end synpred14_MOWLParser
	// $ANTLR start synpred15_MOWLParser
	public final void synpred15_MOWLParser_fragment()
			throws RecognitionException {
		// MOWLParser.g:113:6: ( complexPropertyExpression )
		// MOWLParser.g:113:6: complexPropertyExpression
		{
			this
					.pushFollow(FOLLOW_complexPropertyExpression_in_synpred15_MOWLParser1039);
			this.complexPropertyExpression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred15_MOWLParser
	// $ANTLR start synpred16_MOWLParser
	public final void synpred16_MOWLParser_fragment()
			throws RecognitionException {
		List list_rest = null;
		OPPLPatternParser_OPPLParser_MOWLParser.propertyExpression_return head = null;
		RuleReturnScope rest = null;
		// MOWLParser.g:133:4: (head= propertyExpression ( COMPOSITION rest+=
		// propertyExpression )+ )
		// MOWLParser.g:133:4: head= propertyExpression ( COMPOSITION rest+=
		// propertyExpression )+
		{
			this
					.pushFollow(FOLLOW_propertyExpression_in_synpred16_MOWLParser1177);
			head = this.propertyExpression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			// MOWLParser.g:133:30: ( COMPOSITION rest+= propertyExpression )+
			int cnt21 = 0;
			loop21: do {
				int alt21 = 2;
				int LA21_0 = this.input.LA(1);
				if (LA21_0 == COMPOSITION) {
					alt21 = 1;
				}
				switch (alt21) {
				case 1:
					// MOWLParser.g:133:31: COMPOSITION rest+=
					// propertyExpression
				{
					this.match(this.input, COMPOSITION,
							FOLLOW_COMPOSITION_in_synpred16_MOWLParser1180);
					if (this.state.failed) {
						return;
					}
					this
							.pushFollow(FOLLOW_propertyExpression_in_synpred16_MOWLParser1184);
					rest = this.propertyExpression();
					this.state._fsp--;
					if (this.state.failed) {
						return;
					}
					if (list_rest == null) {
						list_rest = new ArrayList();
					}
					list_rest.add(rest);
				}
					break;
				default:
					if (cnt21 >= 1) {
						break loop21;
					}
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return;
					}
					EarlyExitException eee = new EarlyExitException(21,
							this.input);
					throw eee;
				}
				cnt21++;
			} while (true);
		}
	}

	// $ANTLR end synpred16_MOWLParser
	// $ANTLR start synpred17_MOWLParser
	public final void synpred17_MOWLParser_fragment()
			throws RecognitionException {
		// MOWLParser.g:134:5: ( NOT OPEN_PARENTHESYS expression
		// CLOSED_PARENTHESYS )
		// MOWLParser.g:134:5: NOT OPEN_PARENTHESYS expression
		// CLOSED_PARENTHESYS
		{
			this.match(this.input, NOT, FOLLOW_NOT_in_synpred17_MOWLParser1206);
			if (this.state.failed) {
				return;
			}
			this.match(this.input, OPEN_PARENTHESYS,
					FOLLOW_OPEN_PARENTHESYS_in_synpred17_MOWLParser1208);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_expression_in_synpred17_MOWLParser1210);
			this.expression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, CLOSED_PARENTHESYS,
					FOLLOW_CLOSED_PARENTHESYS_in_synpred17_MOWLParser1212);
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred17_MOWLParser
	// $ANTLR start synpred18_MOWLParser
	public final void synpred18_MOWLParser_fragment()
			throws RecognitionException {
		// MOWLParser.g:135:5: ( NOT atomic )
		// MOWLParser.g:135:5: NOT atomic
		{
			this.match(this.input, NOT, FOLLOW_NOT_in_synpred18_MOWLParser1226);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_atomic_in_synpred18_MOWLParser1228);
			this.gOPPLPatternParser.atomic();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred18_MOWLParser
	// $ANTLR start synpred19_MOWLParser
	public final void synpred19_MOWLParser_fragment()
			throws RecognitionException {
		// MOWLParser.g:136:5: ( qualifiedRestriction )
		// MOWLParser.g:136:5: qualifiedRestriction
		{
			this
					.pushFollow(FOLLOW_qualifiedRestriction_in_synpred19_MOWLParser1251);
			this.qualifiedRestriction();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred19_MOWLParser
	// $ANTLR start synpred21_MOWLParser
	public final void synpred21_MOWLParser_fragment()
			throws RecognitionException {
		// MOWLParser.g:149:7: ( propertyExpression SOME expression )
		// MOWLParser.g:149:7: propertyExpression SOME expression
		{
			this
					.pushFollow(FOLLOW_propertyExpression_in_synpred21_MOWLParser1342);
			this.propertyExpression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, SOME,
					FOLLOW_SOME_in_synpred21_MOWLParser1345);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_expression_in_synpred21_MOWLParser1349);
			this.expression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred21_MOWLParser
	// $ANTLR start synpred22_MOWLParser
	public final void synpred22_MOWLParser_fragment()
			throws RecognitionException {
		// MOWLParser.g:150:7: ( propertyExpression ONLY expression )
		// MOWLParser.g:150:7: propertyExpression ONLY expression
		{
			this
					.pushFollow(FOLLOW_propertyExpression_in_synpred22_MOWLParser1378);
			this.propertyExpression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, ONLY,
					FOLLOW_ONLY_in_synpred22_MOWLParser1380);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_expression_in_synpred22_MOWLParser1383);
			this.expression();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred22_MOWLParser
	// $ANTLR start synpred23_MOWLParser
	public final void synpred23_MOWLParser_fragment()
			throws RecognitionException {
		// MOWLParser.g:151:7: ( cardinalityRestriction )
		// MOWLParser.g:151:7: cardinalityRestriction
		{
			this
					.pushFollow(FOLLOW_cardinalityRestriction_in_synpred23_MOWLParser1402);
			this.cardinalityRestriction();
			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
		}
	}

	// $ANTLR end synpred23_MOWLParser
	// Delegated rules
	public final boolean synpred22_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred22_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred23_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred23_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred21_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred21_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred17_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred17_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred3_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred3_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred7_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred7_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred1_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred1_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred12_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred12_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred19_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred19_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred8_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred8_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred14_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred14_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred16_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred16_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred11_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred11_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred15_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred15_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred5_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred5_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred9_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred9_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred6_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred6_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred4_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred4_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred18_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred18_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	public final boolean synpred10_MOWLParser() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred10_MOWLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	protected DFA1 dfa1 = new DFA1(this);
	protected DFA3 dfa3 = new DFA3(this);
	protected DFA4 dfa4 = new DFA4(this);
	protected DFA7 dfa7 = new DFA7(this);
	protected DFA11 dfa11 = new DFA11(this);
	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA1_eotS = "\30\uffff";
	static final String DFA1_eofS = "\30\uffff";
	static final String DFA1_minS = "\1\5\1\uffff\6\0\1\uffff\1\0\16\uffff";
	static final String DFA1_maxS = "\1\u01d0\1\uffff\6\0\1\uffff\1\0\16\uffff";
	static final String DFA1_acceptS = "\1\uffff\1\1\16\uffff\1\2\6\uffff\1\3";
	static final String DFA1_specialS = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\16\uffff}>";
	static final String[] DFA1_transitionS = {
			"\2\1\5\uffff\1\11\6\uffff\4\1\3\uffff\1\1\2\uffff\7\20\4\uffff"
					+ "\1\1\3\uffff\1\2\1\3\147\uffff\1\5\u00fa\uffff\1\7\17\uffff"
					+ "\1\6\57\uffff\1\4", "", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "", "\1\uffff", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "" };
	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;
	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	class DFA1 extends DFA {
		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}

		public String getDescription() {
			return "63:1: axiom options {backtrack=true; } : ( binaryAxiom -> ^( binaryAxiom ) | unaryAxiom -> ^( unaryAxiom ) | assertionAxiom -> ^( assertionAxiom ) );";
		}

		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA1_2 = input.LA(1);
				int index1_2 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred1_MOWLParser()) {
					s = 1;
				} else if (true) {
					s = 23;
				}
				input.seek(index1_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA1_3 = input.LA(1);
				int index1_3 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred1_MOWLParser()) {
					s = 1;
				} else if (true) {
					s = 23;
				}
				input.seek(index1_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA1_4 = input.LA(1);
				int index1_4 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred1_MOWLParser()) {
					s = 1;
				} else if (true) {
					s = 23;
				}
				input.seek(index1_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA1_5 = input.LA(1);
				int index1_5 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred1_MOWLParser()) {
					s = 1;
				} else if (true) {
					s = 23;
				}
				input.seek(index1_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA1_6 = input.LA(1);
				int index1_6 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred1_MOWLParser()) {
					s = 1;
				} else if (true) {
					s = 23;
				}
				input.seek(index1_6);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA1_7 = input.LA(1);
				int index1_7 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred1_MOWLParser()) {
					s = 1;
				} else if (true) {
					s = 23;
				}
				input.seek(index1_7);
				if (s >= 0) {
					return s;
				}
				break;
			case 6:
				int LA1_9 = input.LA(1);
				int index1_9 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred1_MOWLParser()) {
					s = 1;
				} else if (true) {
					s = 23;
				}
				input.seek(index1_9);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (OPPLPatternParser_OPPLParser_MOWLParser.this.state.backtracking > 0) {
				OPPLPatternParser_OPPLParser_MOWLParser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 1, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	static final String DFA3_eotS = "\12\uffff";
	static final String DFA3_eofS = "\12\uffff";
	static final String DFA3_minS = "\1\14\6\0\3\uffff";
	static final String DFA3_maxS = "\1\u01d0\6\0\3\uffff";
	static final String DFA3_acceptS = "\7\uffff\1\3\1\1\1\2";
	static final String DFA3_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\3\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\7\37\uffff\1\1\1\2\147\uffff\1\4\u00fa\uffff\1\6\17\uffff"
					+ "\1\5\57\uffff\1\3", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "", "", "" };
	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;
	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
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
			return "71:1: assertionAxiom options {backtrack=true; } : (i= atomic ( INSTANCE_OF | TYPES ) expression -> ^( TYPE_ASSERTION ^( EXPRESSION expression ) ^( EXPRESSION $i) ) | subject= atomic propertyExpression value -> ^( ROLE_ASSERTION ^( EXPRESSION $subject) ^( EXPRESSION propertyExpression ) ^( EXPRESSION value ) ) | NOT assertionAxiom -> ^( NEGATED_ASSERTION assertionAxiom ) );";
		}

		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA3_1 = input.LA(1);
				int index3_1 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred3_MOWLParser()) {
					s = 8;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred4_MOWLParser()) {
					s = 9;
				}
				input.seek(index3_1);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA3_2 = input.LA(1);
				int index3_2 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred3_MOWLParser()) {
					s = 8;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred4_MOWLParser()) {
					s = 9;
				}
				input.seek(index3_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA3_3 = input.LA(1);
				int index3_3 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred3_MOWLParser()) {
					s = 8;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred4_MOWLParser()) {
					s = 9;
				}
				input.seek(index3_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA3_4 = input.LA(1);
				int index3_4 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred3_MOWLParser()) {
					s = 8;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred4_MOWLParser()) {
					s = 9;
				}
				input.seek(index3_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA3_5 = input.LA(1);
				int index3_5 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred3_MOWLParser()) {
					s = 8;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred4_MOWLParser()) {
					s = 9;
				}
				input.seek(index3_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA3_6 = input.LA(1);
				int index3_6 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred3_MOWLParser()) {
					s = 8;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred4_MOWLParser()) {
					s = 9;
				}
				input.seek(index3_6);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (OPPLPatternParser_OPPLParser_MOWLParser.this.state.backtracking > 0) {
				OPPLPatternParser_OPPLParser_MOWLParser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 3, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	static final String DFA4_eotS = "\25\uffff";
	static final String DFA4_eofS = "\25\uffff";
	static final String DFA4_minS = "\1\5\1\uffff\13\0\10\uffff";
	static final String DFA4_maxS = "\1\u01d0\1\uffff\13\0\10\uffff";
	static final String DFA4_acceptS = "\1\uffff\1\1\13\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
	static final String DFA4_specialS = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\10\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\14\1\12\5\uffff\1\11\6\uffff\1\10\1\1\1\17\1\15\3\uffff\1"
					+ "\16\15\uffff\1\13\3\uffff\1\2\1\3\147\uffff\1\5\u00fa\uffff"
					+ "\1\7\17\uffff\1\6\57\uffff\1\4", "", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "", "",
			"", "", "", "", "", "" };
	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;
	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
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
			return "80:1: binaryAxiom options {backtrack=true; } : (lhs= expression SUBCLASS_OF superClass= expression -> ^( SUB_CLASS_AXIOM ^( EXPRESSION $lhs) ^( EXPRESSION $superClass) ) | lhs= expression EQUIVALENT_TO rhs= expression -> ^( EQUIVALENT_TO_AXIOM ^( EXPRESSION $lhs) ^( EXPRESSION $rhs) ) | lhs= expression DISJOINT_WITH disjoint= expression -> ^( DISJOINT_WITH_AXIOM ^( EXPRESSION $lhs) ^( EXPRESSION $disjoint) ) | lhs= expression SUB_PROPERTY_OF superProperty= propertyExpression -> ^( SUB_PROPERTY_AXIOM ^( EXPRESSION $lhs) ^( EXPRESSION $superProperty) ) | lhsID= atomic INVERSE_OF rhsAtomic= atomic -> ^( INVERSE_OF ^( EXPRESSION $lhsID) ^( EXPRESSION $rhsAtomic) ) | lhsID= atomic SAME_AS rhsID= atomic -> ^( SAME_AS_AXIOM ^( EXPRESSION $lhsID) ^( EXPRESSION $rhsID) ) | lhsID= atomic DIFFERENT_FROM rhsID= atomic -> ^( DIFFERENT_FROM_AXIOM ^( EXPRESSION $lhsID) ^( EXPRESSION $rhsID) ) | lhsID= atomic DOMAIN expression -> ^( DOMAIN ^( EXPRESSION $lhsID) ^( EXPRESSION expression ) ) | lhsID= atomic RANGE expression -> ^( RANGE ^( EXPRESSION $lhsID) ^( EXPRESSION expression ) ) );";
		}

		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA4_2 = input.LA(1);
				int index4_2 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred5_MOWLParser()) {
					s = 1;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred6_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred7_MOWLParser()) {
					s = 14;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred8_MOWLParser()) {
					s = 15;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred9_MOWLParser()) {
					s = 16;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred10_MOWLParser()) {
					s = 17;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred11_MOWLParser()) {
					s = 18;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred12_MOWLParser()) {
					s = 19;
				} else if (true) {
					s = 20;
				}
				input.seek(index4_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA4_3 = input.LA(1);
				int index4_3 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred5_MOWLParser()) {
					s = 1;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred6_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred7_MOWLParser()) {
					s = 14;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred8_MOWLParser()) {
					s = 15;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred9_MOWLParser()) {
					s = 16;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred10_MOWLParser()) {
					s = 17;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred11_MOWLParser()) {
					s = 18;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred12_MOWLParser()) {
					s = 19;
				} else if (true) {
					s = 20;
				}
				input.seek(index4_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA4_4 = input.LA(1);
				int index4_4 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred5_MOWLParser()) {
					s = 1;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred6_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred7_MOWLParser()) {
					s = 14;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred8_MOWLParser()) {
					s = 15;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred9_MOWLParser()) {
					s = 16;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred10_MOWLParser()) {
					s = 17;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred11_MOWLParser()) {
					s = 18;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred12_MOWLParser()) {
					s = 19;
				} else if (true) {
					s = 20;
				}
				input.seek(index4_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA4_5 = input.LA(1);
				int index4_5 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred5_MOWLParser()) {
					s = 1;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred6_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred7_MOWLParser()) {
					s = 14;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred8_MOWLParser()) {
					s = 15;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred9_MOWLParser()) {
					s = 16;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred10_MOWLParser()) {
					s = 17;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred11_MOWLParser()) {
					s = 18;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred12_MOWLParser()) {
					s = 19;
				} else if (true) {
					s = 20;
				}
				input.seek(index4_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA4_6 = input.LA(1);
				int index4_6 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred5_MOWLParser()) {
					s = 1;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred6_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred7_MOWLParser()) {
					s = 14;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred8_MOWLParser()) {
					s = 15;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred9_MOWLParser()) {
					s = 16;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred10_MOWLParser()) {
					s = 17;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred11_MOWLParser()) {
					s = 18;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred12_MOWLParser()) {
					s = 19;
				} else if (true) {
					s = 20;
				}
				input.seek(index4_6);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA4_7 = input.LA(1);
				int index4_7 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred5_MOWLParser()) {
					s = 1;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred6_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred7_MOWLParser()) {
					s = 14;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred8_MOWLParser()) {
					s = 15;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred9_MOWLParser()) {
					s = 16;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred10_MOWLParser()) {
					s = 17;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred11_MOWLParser()) {
					s = 18;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred12_MOWLParser()) {
					s = 19;
				} else if (true) {
					s = 20;
				}
				input.seek(index4_7);
				if (s >= 0) {
					return s;
				}
				break;
			case 6:
				int LA4_8 = input.LA(1);
				int index4_8 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred5_MOWLParser()) {
					s = 1;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred6_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred7_MOWLParser()) {
					s = 14;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred8_MOWLParser()) {
					s = 15;
				}
				input.seek(index4_8);
				if (s >= 0) {
					return s;
				}
				break;
			case 7:
				int LA4_9 = input.LA(1);
				int index4_9 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred5_MOWLParser()) {
					s = 1;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred6_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred7_MOWLParser()) {
					s = 14;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred8_MOWLParser()) {
					s = 15;
				}
				input.seek(index4_9);
				if (s >= 0) {
					return s;
				}
				break;
			case 8:
				int LA4_10 = input.LA(1);
				int index4_10 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred5_MOWLParser()) {
					s = 1;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred6_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred7_MOWLParser()) {
					s = 14;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred8_MOWLParser()) {
					s = 15;
				}
				input.seek(index4_10);
				if (s >= 0) {
					return s;
				}
				break;
			case 9:
				int LA4_11 = input.LA(1);
				int index4_11 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred5_MOWLParser()) {
					s = 1;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred6_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred7_MOWLParser()) {
					s = 14;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred8_MOWLParser()) {
					s = 15;
				}
				input.seek(index4_11);
				if (s >= 0) {
					return s;
				}
				break;
			case 10:
				int LA4_12 = input.LA(1);
				int index4_12 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred5_MOWLParser()) {
					s = 1;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred6_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred7_MOWLParser()) {
					s = 14;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred8_MOWLParser()) {
					s = 15;
				}
				input.seek(index4_12);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (OPPLPatternParser_OPPLParser_MOWLParser.this.state.backtracking > 0) {
				OPPLPatternParser_OPPLParser_MOWLParser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 4, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	static final String DFA7_eotS = "\31\uffff";
	static final String DFA7_eofS = "\1\1\30\uffff";
	static final String DFA7_minS = "\1\5\22\uffff\1\0\5\uffff";
	static final String DFA7_maxS = "\1\u01d0\22\uffff\1\0\5\uffff";
	static final String DFA7_acceptS = "\1\uffff\1\1\13\uffff\1\2\11\uffff\1\4\1\3";
	static final String DFA7_specialS = "\23\uffff\1\0\5\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\27\1\15\1\uffff\1\1\1\uffff\2\1\1\15\6\uffff\1\23\3\1\3\uffff"
					+ "\1\1\12\uffff\1\1\2\uffff\1\15\3\uffff\2\15\31\uffff\1\1\14"
					+ "\uffff\1\1\1\uffff\1\1\76\uffff\1\15\u00fa\uffff\1\15\17\uffff"
					+ "\1\15\57\uffff\1\15", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "\1\uffff", "", "", "", "",
			"" };
	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;
	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
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
			return "110:5: ( options {backtrack=true; } : | conjunction ( OR conjunction )* -> ^( DISJUNCTION ( conjunction )+ ) | complexPropertyExpression -> ^( complexPropertyExpression ) | OPEN_PARENTHESYS expression CLOSED_PARENTHESYS -> ^( expression ) )";
		}

		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA7_19 = input.LA(1);
				int index7_19 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred14_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred15_MOWLParser()) {
					s = 24;
				}
				input.seek(index7_19);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (OPPLPatternParser_OPPLParser_MOWLParser.this.state.backtracking > 0) {
				OPPLPatternParser_OPPLParser_MOWLParser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 7, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	static final String DFA11_eotS = "\17\uffff";
	static final String DFA11_eofS = "\17\uffff";
	static final String DFA11_minS = "\1\6\10\0\6\uffff";
	static final String DFA11_maxS = "\1\u01d0\10\0\6\uffff";
	static final String DFA11_acceptS = "\11\uffff\1\4\1\5\1\1\1\6\1\2\1\3";
	static final String DFA11_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\11\5\uffff\1\10\6\uffff\1\7\24\uffff\1\12\3\uffff\1\1\1\2"
					+ "\147\uffff\1\4\u00fa\uffff\1\6\17\uffff\1\5\57\uffff\1\3",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "", "", "", "", "", "" };
	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA
			.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;
	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	class DFA11 extends DFA {
		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}

		public String getDescription() {
			return "131:1: unary options {backtrack=true; } : (head= propertyExpression ( COMPOSITION rest+= propertyExpression )+ -> ^( PROPERTY_CHAIN $head $rest) | NOT OPEN_PARENTHESYS expression CLOSED_PARENTHESYS -> ^( NEGATED_EXPRESSION expression ) | NOT atomic -> ^( NEGATED_EXPRESSION atomic ) | qualifiedRestriction -> ^( qualifiedRestriction ) | constant | atomic );";
		}

		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA11_1 = input.LA(1);
				int index11_1 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred16_MOWLParser()) {
					s = 11;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred19_MOWLParser()) {
					s = 9;
				} else if (true) {
					s = 12;
				}
				input.seek(index11_1);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA11_2 = input.LA(1);
				int index11_2 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred16_MOWLParser()) {
					s = 11;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred19_MOWLParser()) {
					s = 9;
				} else if (true) {
					s = 12;
				}
				input.seek(index11_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA11_3 = input.LA(1);
				int index11_3 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred16_MOWLParser()) {
					s = 11;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred19_MOWLParser()) {
					s = 9;
				} else if (true) {
					s = 12;
				}
				input.seek(index11_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA11_4 = input.LA(1);
				int index11_4 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred16_MOWLParser()) {
					s = 11;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred19_MOWLParser()) {
					s = 9;
				} else if (true) {
					s = 12;
				}
				input.seek(index11_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA11_5 = input.LA(1);
				int index11_5 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred16_MOWLParser()) {
					s = 11;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred19_MOWLParser()) {
					s = 9;
				} else if (true) {
					s = 12;
				}
				input.seek(index11_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA11_6 = input.LA(1);
				int index11_6 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred16_MOWLParser()) {
					s = 11;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred19_MOWLParser()) {
					s = 9;
				} else if (true) {
					s = 12;
				}
				input.seek(index11_6);
				if (s >= 0) {
					return s;
				}
				break;
			case 6:
				int LA11_7 = input.LA(1);
				int index11_7 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred16_MOWLParser()) {
					s = 11;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred19_MOWLParser()) {
					s = 9;
				}
				input.seek(index11_7);
				if (s >= 0) {
					return s;
				}
				break;
			case 7:
				int LA11_8 = input.LA(1);
				int index11_8 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred17_MOWLParser()) {
					s = 13;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred18_MOWLParser()) {
					s = 14;
				}
				input.seek(index11_8);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (OPPLPatternParser_OPPLParser_MOWLParser.this.state.backtracking > 0) {
				OPPLPatternParser_OPPLParser_MOWLParser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 11, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	static final String DFA13_eotS = "\15\uffff";
	static final String DFA13_eofS = "\15\uffff";
	static final String DFA13_minS = "\1\6\7\0\5\uffff";
	static final String DFA13_maxS = "\1\u01d0\7\0\5\uffff";
	static final String DFA13_acceptS = "\10\uffff\1\4\1\1\1\2\1\3\1\5";
	static final String DFA13_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\5\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\10\14\uffff\1\7\30\uffff\1\1\1\2\147\uffff\1\4\u00fa\uffff"
					+ "\1\6\17\uffff\1\5\57\uffff\1\3", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "", "",
			"", "", "" };
	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA
			.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;
	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	class DFA13 extends DFA {
		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}

		public String getDescription() {
			return "147:9: ( options {backtrack=true; } : propertyExpression SOME expression -> ^( SOME_RESTRICTION propertyExpression expression ) | propertyExpression ONLY expression -> ^( ALL_RESTRICTION propertyExpression expression ) | cardinalityRestriction -> ^( cardinalityRestriction ) | oneOf -> ^( oneOf ) | valueRestriction -> ^( valueRestriction ) )";
		}

		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA13_1 = input.LA(1);
				int index13_1 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred21_MOWLParser()) {
					s = 9;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred22_MOWLParser()) {
					s = 10;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred23_MOWLParser()) {
					s = 11;
				} else if (true) {
					s = 12;
				}
				input.seek(index13_1);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA13_2 = input.LA(1);
				int index13_2 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred21_MOWLParser()) {
					s = 9;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred22_MOWLParser()) {
					s = 10;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred23_MOWLParser()) {
					s = 11;
				} else if (true) {
					s = 12;
				}
				input.seek(index13_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA13_3 = input.LA(1);
				int index13_3 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred21_MOWLParser()) {
					s = 9;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred22_MOWLParser()) {
					s = 10;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred23_MOWLParser()) {
					s = 11;
				} else if (true) {
					s = 12;
				}
				input.seek(index13_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA13_4 = input.LA(1);
				int index13_4 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred21_MOWLParser()) {
					s = 9;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred22_MOWLParser()) {
					s = 10;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred23_MOWLParser()) {
					s = 11;
				} else if (true) {
					s = 12;
				}
				input.seek(index13_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA13_5 = input.LA(1);
				int index13_5 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred21_MOWLParser()) {
					s = 9;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred22_MOWLParser()) {
					s = 10;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred23_MOWLParser()) {
					s = 11;
				} else if (true) {
					s = 12;
				}
				input.seek(index13_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA13_6 = input.LA(1);
				int index13_6 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred21_MOWLParser()) {
					s = 9;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred22_MOWLParser()) {
					s = 10;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred23_MOWLParser()) {
					s = 11;
				} else if (true) {
					s = 12;
				}
				input.seek(index13_6);
				if (s >= 0) {
					return s;
				}
				break;
			case 6:
				int LA13_7 = input.LA(1);
				int index13_7 = input.index();
				input.rewind();
				s = -1;
				if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred21_MOWLParser()) {
					s = 9;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred22_MOWLParser()) {
					s = 10;
				} else if (OPPLPatternParser_OPPLParser_MOWLParser.this
						.synpred23_MOWLParser()) {
					s = 11;
				} else if (true) {
					s = 12;
				}
				input.seek(index13_7);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (OPPLPatternParser_OPPLParser_MOWLParser.this.state.backtracking > 0) {
				OPPLPatternParser_OPPLParser_MOWLParser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 13, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_binaryAxiom_in_axiom231 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_unaryAxiom_in_axiom243 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_assertionAxiom_in_axiom255 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_assertionAxiom285 = new BitSet(
			new long[] { 0x000000C000000000L });
	public static final BitSet FOLLOW_INSTANCE_OF_in_assertionAxiom288 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_TYPES_in_assertionAxiom292 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_assertionAxiom295 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_assertionAxiom326 = new BitSet(
			new long[] { 0x0000300000080000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_propertyExpression_in_assertionAxiom328 = new BitSet(
			new long[] { 0x0000310000000000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_value_in_assertionAxiom331 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NOT_in_assertionAxiom365 = new BitSet(
			new long[] { 0x0000300000001000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_assertionAxiom_in_assertionAxiom367 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expression_in_binaryAxiom406 = new BitSet(
			new long[] { 0x0000000000100000L });
	public static final BitSet FOLLOW_SUBCLASS_OF_in_binaryAxiom408 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_binaryAxiom415 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expression_in_binaryAxiom453 = new BitSet(
			new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_EQUIVALENT_TO_in_binaryAxiom455 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_binaryAxiom461 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expression_in_binaryAxiom498 = new BitSet(
			new long[] { 0x0000000004000000L });
	public static final BitSet FOLLOW_DISJOINT_WITH_in_binaryAxiom500 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_binaryAxiom506 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expression_in_binaryAxiom543 = new BitSet(
			new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_SUB_PROPERTY_OF_in_binaryAxiom545 = new BitSet(
			new long[] { 0x0000300000080000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_propertyExpression_in_binaryAxiom551 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_binaryAxiom588 = new BitSet(
			new long[] { 0x0000000002000000L });
	public static final BitSet FOLLOW_INVERSE_OF_in_binaryAxiom590 = new BitSet(
			new long[] { 0x0000300000000000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_atomic_in_binaryAxiom596 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_binaryAxiom627 = new BitSet(
			new long[] { 0x0000000000800000L });
	public static final BitSet FOLLOW_SAME_AS_in_binaryAxiom629 = new BitSet(
			new long[] { 0x0000300000000000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_atomic_in_binaryAxiom636 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_binaryAxiom674 = new BitSet(
			new long[] { 0x0000000001000000L });
	public static final BitSet FOLLOW_DIFFERENT_FROM_in_binaryAxiom676 = new BitSet(
			new long[] { 0x0000300000000000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_atomic_in_binaryAxiom683 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_binaryAxiom720 = new BitSet(
			new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_DOMAIN_in_binaryAxiom723 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_binaryAxiom725 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_binaryAxiom761 = new BitSet(
			new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_RANGE_in_binaryAxiom763 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_binaryAxiom765 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_unaryCharacteristic_in_unaryAxiom839 = new BitSet(
			new long[] { 0x0000310000081040L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_unary_in_unaryAxiom843 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FUNCTIONAL_in_unaryCharacteristic888 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INVERSE_FUNCTIONAL_in_unaryCharacteristic902 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SYMMETRIC_in_unaryCharacteristic916 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ANTI_SYMMETRIC_in_unaryCharacteristic930 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_REFLEXIVE_in_unaryCharacteristic944 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IRREFLEXIVE_in_unaryCharacteristic958 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TRANSITIVE_in_unaryCharacteristic972 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_conjunction_in_expression1015 = new BitSet(
			new long[] { 0x0000000000000802L });
	public static final BitSet FOLLOW_OR_in_expression1018 = new BitSet(
			new long[] { 0x0000310000081040L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_conjunction_in_expression1020 = new BitSet(
			new long[] { 0x0000000000000802L });
	public static final BitSet FOLLOW_complexPropertyExpression_in_expression1039 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_OPEN_PARENTHESYS_in_expression1052 = new BitSet(
			new long[] { 0x0000310000081160L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_expression1054 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_CLOSED_PARENTHESYS_in_expression1056 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_unary_in_conjunction1089 = new BitSet(
			new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_AND_in_conjunction1092 = new BitSet(
			new long[] { 0x0000310000081040L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_unary_in_conjunction1094 = new BitSet(
			new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_INVERSE_in_complexPropertyExpression1115 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_OPEN_PARENTHESYS_in_complexPropertyExpression1117 = new BitSet(
			new long[] { 0x0000300000080000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_complexPropertyExpression_in_complexPropertyExpression1119 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_CLOSED_PARENTHESYS_in_complexPropertyExpression1121 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INVERSE_in_complexPropertyExpression1134 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_OPEN_PARENTHESYS_in_complexPropertyExpression1136 = new BitSet(
			new long[] { 0x0000300000000000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_atomic_in_complexPropertyExpression1138 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_CLOSED_PARENTHESYS_in_complexPropertyExpression1140 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_propertyExpression_in_unary1177 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_COMPOSITION_in_unary1180 = new BitSet(
			new long[] { 0x0000300000080000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_propertyExpression_in_unary1184 = new BitSet(
			new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_NOT_in_unary1206 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_OPEN_PARENTHESYS_in_unary1208 = new BitSet(
			new long[] { 0x0000310000081160L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_unary1210 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_CLOSED_PARENTHESYS_in_unary1212 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NOT_in_unary1226 = new BitSet(new long[] {
			0x0000300000000000L, 0x0000000000000000L, 0x0000000000200000L,
			0x0000000000000000L, 0x0000000000000000L, 0x0000000000000000L,
			0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_atomic_in_unary1228 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_qualifiedRestriction_in_unary1251 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_constant_in_unary1263 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_unary1269 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_propertyExpression_in_qualifiedRestriction1342 = new BitSet(
			new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_SOME_in_qualifiedRestriction1345 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_qualifiedRestriction1349 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_propertyExpression_in_qualifiedRestriction1378 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_ONLY_in_qualifiedRestriction1380 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_qualifiedRestriction1383 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_cardinalityRestriction_in_qualifiedRestriction1402 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_oneOf_in_qualifiedRestriction1416 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_valueRestriction_in_qualifiedRestriction1430 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_propertyExpression1462 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_complexPropertyExpression_in_propertyExpression1476 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_propertyExpression_in_cardinalityRestriction1518 = new BitSet(
			new long[] { 0x0000000000038000L });
	public static final BitSet FOLLOW_restrictionKind_in_cardinalityRestriction1521 = new BitSet(
			new long[] { 0x0000040000000000L });
	public static final BitSet FOLLOW_INTEGER_in_cardinalityRestriction1523 = new BitSet(
			new long[] { 0x0000310000081042L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_unary_in_cardinalityRestriction1525 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_MIN_in_restrictionKind1558 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_MAX_in_restrictionKind1572 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_EXACTLY_in_restrictionKind1586 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_OPEN_CURLY_BRACES_in_oneOf1608 = new BitSet(
			new long[] { 0x0000100000000000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_oneOf1610 = new BitSet(
			new long[] { 0x0000002000000080L });
	public static final BitSet FOLLOW_COMMA_in_oneOf1613 = new BitSet(
			new long[] { 0x0000100000000000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_oneOf1615 = new BitSet(
			new long[] { 0x0000002000000080L });
	public static final BitSet FOLLOW_CLOSED_CURLY_BRACES_in_oneOf1619 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_propertyExpression_in_valueRestriction1639 = new BitSet(
			new long[] { 0x0000000000040000L });
	public static final BitSet FOLLOW_VALUE_in_valueRestriction1641 = new BitSet(
			new long[] { 0x0000310000000000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_value_in_valueRestriction1643 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_value1668 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_constant_in_value1683 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DBLQUOTE_in_constant1708 = new BitSet(
			new long[] { 0x0000001000000002L });
	public static final BitSet FOLLOW_POW_in_constant1712 = new BitSet(
			new long[] { 0x0000100000000000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_constant1718 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_binaryAxiom_in_synpred1_MOWLParser231 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_synpred3_MOWLParser285 = new BitSet(
			new long[] { 0x000000C000000000L });
	public static final BitSet FOLLOW_set_in_synpred3_MOWLParser287 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_synpred3_MOWLParser295 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_synpred4_MOWLParser326 = new BitSet(
			new long[] { 0x0000300000080000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_propertyExpression_in_synpred4_MOWLParser328 = new BitSet(
			new long[] { 0x0000310000000000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_value_in_synpred4_MOWLParser331 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expression_in_synpred5_MOWLParser406 = new BitSet(
			new long[] { 0x0000000000100000L });
	public static final BitSet FOLLOW_SUBCLASS_OF_in_synpred5_MOWLParser408 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_synpred5_MOWLParser415 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expression_in_synpred6_MOWLParser453 = new BitSet(
			new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_EQUIVALENT_TO_in_synpred6_MOWLParser455 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_synpred6_MOWLParser461 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expression_in_synpred7_MOWLParser498 = new BitSet(
			new long[] { 0x0000000004000000L });
	public static final BitSet FOLLOW_DISJOINT_WITH_in_synpred7_MOWLParser500 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_synpred7_MOWLParser506 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expression_in_synpred8_MOWLParser543 = new BitSet(
			new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_SUB_PROPERTY_OF_in_synpred8_MOWLParser545 = new BitSet(
			new long[] { 0x0000300000080000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_propertyExpression_in_synpred8_MOWLParser551 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_synpred9_MOWLParser588 = new BitSet(
			new long[] { 0x0000000002000000L });
	public static final BitSet FOLLOW_INVERSE_OF_in_synpred9_MOWLParser590 = new BitSet(
			new long[] { 0x0000300000000000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_atomic_in_synpred9_MOWLParser596 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_synpred10_MOWLParser627 = new BitSet(
			new long[] { 0x0000000000800000L });
	public static final BitSet FOLLOW_SAME_AS_in_synpred10_MOWLParser629 = new BitSet(
			new long[] { 0x0000300000000000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_atomic_in_synpred10_MOWLParser636 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_synpred11_MOWLParser674 = new BitSet(
			new long[] { 0x0000000001000000L });
	public static final BitSet FOLLOW_DIFFERENT_FROM_in_synpred11_MOWLParser676 = new BitSet(
			new long[] { 0x0000300000000000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_atomic_in_synpred11_MOWLParser683 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atomic_in_synpred12_MOWLParser720 = new BitSet(
			new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_DOMAIN_in_synpred12_MOWLParser723 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_synpred12_MOWLParser725 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_conjunction_in_synpred14_MOWLParser1015 = new BitSet(
			new long[] { 0x0000000000000802L });
	public static final BitSet FOLLOW_OR_in_synpred14_MOWLParser1018 = new BitSet(
			new long[] { 0x0000310000081040L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_conjunction_in_synpred14_MOWLParser1020 = new BitSet(
			new long[] { 0x0000000000000802L });
	public static final BitSet FOLLOW_complexPropertyExpression_in_synpred15_MOWLParser1039 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_propertyExpression_in_synpred16_MOWLParser1177 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_COMPOSITION_in_synpred16_MOWLParser1180 = new BitSet(
			new long[] { 0x0000300000080000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_propertyExpression_in_synpred16_MOWLParser1184 = new BitSet(
			new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_NOT_in_synpred17_MOWLParser1206 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_OPEN_PARENTHESYS_in_synpred17_MOWLParser1208 = new BitSet(
			new long[] { 0x0000310000081160L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_synpred17_MOWLParser1210 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_CLOSED_PARENTHESYS_in_synpred17_MOWLParser1212 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NOT_in_synpred18_MOWLParser1226 = new BitSet(
			new long[] { 0x0000300000000000L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_atomic_in_synpred18_MOWLParser1228 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_qualifiedRestriction_in_synpred19_MOWLParser1251 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_propertyExpression_in_synpred21_MOWLParser1342 = new BitSet(
			new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_SOME_in_synpred21_MOWLParser1345 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_synpred21_MOWLParser1349 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_propertyExpression_in_synpred22_MOWLParser1378 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_ONLY_in_synpred22_MOWLParser1380 = new BitSet(
			new long[] { 0x0000310000081060L, 0x0000000000000000L,
					0x0000000000200000L, 0x0000000000000000L,
					0x0000000000000000L, 0x0000000000000000L,
					0x0000000100010000L, 0x0000000000010000L });
	public static final BitSet FOLLOW_expression_in_synpred22_MOWLParser1383 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_cardinalityRestriction_in_synpred23_MOWLParser1402 = new BitSet(
			new long[] { 0x0000000000000002L });
}