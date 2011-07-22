package org.coode.parsers.oppl.patterns;

// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g 2011-04-04 16:02:48
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

public class OPPLPatternLexer extends Lexer {
	public static final int HAS_KEY = 109;
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
	public static final int CREATE = 80;
	public static final int POW = 36;
	public static final int NOT_EQUAL = 72;
	public static final int INVERSE_OBJECT_PROPERTY_EXPRESSION = 68;
	public static final int INSTANCE_OF = 38;
	public static final int BEGIN = 83;
	public static final int RETURN = 415;
	public static final int QUESTION_MARK = 46;
	public static final int DISJOINT_PROPERTIES = 117;
	public static final int SYMMETRIC = 30;
	public static final int CARDINALITY_RESTRICTION = 64;
	public static final int SELECT = 75;
	public static final int ROLE_ASSERTION = 67;
	public static final int DIFFERENT_FROM_AXIOM = 53;
	public static final int TRANSITIVE = 34;
	public static final int ANTI_SYMMETRIC = 31;
	public static final int GREATER_THAN_EQUAL = 514;
	public static final int ALL_RESTRICTION = 62;
	public static final int CONJUNCTION = 56;
	public static final int NEGATED_ASSERTION = 59;
	public static final int WHITESPACE = 9;
	public static final int MATCH = 176;
	public static final int SEMICOLON = 422;
	public static final int VALUE = 18;
	public static final int FAIL = 541;
	public static final int GROUPS = 356;
	public static final int OPEN_CURLY_BRACES = 6;
	public static final int DISJUNCTION = 55;
	public static final int INVERSE = 19;
	public static final int DBLQUOTE = 40;
	public static final int OR = 11;
	public static final int LESS_THAN = 508;
	public static final int CONSTANT = 70;
	public static final int ENTITY_REFERENCE = 45;
	public static final int END = 84;
	public static final int COMPOSITION = 4;
	public static final int CLOSED_SQUARE_BRACKET = 86;
	public static final int DOLLAR = 400;
	public static final int SAME_AS = 23;
	public static final int WHERE = 71;
	public static final int DIFFERENT_INDIVIDUALS = 119;
	public static final int DISJOINT_WITH = 26;
	public static final int SUPER_PROPERTY_OF = 88;
	public static final int VARIABLE_TYPE = 89;
	public static final int CLOSED_PARENTHESYS = 8;
	public static final int ONLY = 14;
	public static final int EQUIVALENT_TO_AXIOM = 49;
	public static final int SUB_PROPERTY_OF = 21;
	public static final int NEGATED_EXPRESSION = 58;
	public static final int MAX = 16;
	public static final int CREATE_DISJUNCTION = 82;
	public static final int AND = 10;
	public static final int INVERSE_PROPERTY = 60;
	public static final int AT = 114;
	public static final int VARIABLE_NAME = 464;
	public static final int THIS_CLASS = 416;
	public static final int DIFFERENT_FROM = 24;
	public static final int IN = 74;
	public static final int EQUIVALENT_TO = 22;
	public static final int UNARY_AXIOM = 54;
	public static final int COMMA = 37;
	public static final int CLOSED_CURLY_BRACES = 7;
	public static final int IDENTIFIER = 44;
	public static final int IRI = 110;
	public static final int SOME = 13;
	public static final int EQUAL = 73;
	public static final int OPEN_PARENTHESYS = 5;
	public static final int SAME_INDIVIDUAL = 118;
	public static final int REFLEXIVE = 32;
	public static final int PLUS = 79;
	public static final int DIGIT = 41;
	public static final int DOT = 78;
	public static final int SUPER_CLASS_OF = 87;
	public static final int EXPRESSION = 69;
	public static final int SOME_RESTRICTION = 61;
	public static final int ADD = 90;
	public static final int INTEGER = 42;
	public static final int GREATER_THAN = 511;
	public static final int EXACTLY = 17;
	public static final int SUB_PROPERTY_AXIOM = 51;
	public static final int OPEN_SQUARE_BRACKET = 85;
	public static final int VALUES = 354;
	public static final int RANGE = 28;
	public static final int SET = 115;
	public static final int ONE_OF = 65;
	public static final int MIN = 15;
	public static final int SUB_CLASS_AXIOM = 48;
	public static final int Tokens = 47;
	public static final int DOMAIN = 27;
	public static final int SUBPROPERTY_OF = 105;
	public static final int COLON = 77;
	public static final int DISJOINT_WITH_AXIOM = 50;
	public static final int CREATE_INTERSECTION = 81;
	public static final int HYPHEN = 465;
	public static final int INVERSE_FUNCTIONAL = 35;
	public static final int RENDERING = 355;
	public static final int IRI_ATTRIBUTE_NAME = 112;
	public static final int IRREFLEXIVE = 33;
	public static final int LESS_THAN_EQUAL = 513;
	public static final int ASSERTED = 76;
	public static final int FUNCTIONAL = 29;
	public static final int PROPERTY_CHAIN = 57;
	public static final int TYPE_ASSERTION = 66;
	public static final int DISJOINT_CLASSES = 116;
	// delegates
	public OPPLPatternLexer_OPPLLexer_MOWLLexer gMOWLLexer;
	public OPPLPatternLexer_OPPLLexer gOPPLLexer;

	// delegators
	public OPPLPatternLexer() {
		;
	}

	public OPPLPatternLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public OPPLPatternLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
		this.gOPPLLexer = new OPPLPatternLexer_OPPLLexer(input, state, this);
	}

	@Override
	public String getGrammarFileName() {
		return "/Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g";
	}

	// $ANTLR start "THIS_CLASS"
	public final void mTHIS_CLASS() throws RecognitionException {
		try {
			int _type = THIS_CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:24:3:
			// ( '$thisClass' )
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:25:5:
			// '$thisClass'
			{
				this.match("$thisClass");
			}
			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "THIS_CLASS"
	// $ANTLR start "DOLLAR"
	public final void mDOLLAR() throws RecognitionException {
		try {
			int _type = DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:29:3:
			// ( '$' )
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:30:5:
			// '$'
			{
				this.match('$');
			}
			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "DOLLAR"
	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:34:3:
			// ( 'RETURN' )
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:35:5:
			// 'RETURN'
			{
				this.match("RETURN");
			}
			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RETURN"
	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:39:2:
			// ( ';' )
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:40:3:
			// ';'
			{
				this.match(';');
			}
			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SEMICOLON"
	// $ANTLR start "HYPHEN"
	public final void mHYPHEN() throws RecognitionException {
		try {
			int _type = HYPHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:43:8:
			// ( '-' )
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:44:3:
			// '-'
			{
				this.match('-');
			}
			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "HYPHEN"
	@Override
	public void mTokens() throws RecognitionException {
		// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:1:8:
		// ( THIS_CLASS | DOLLAR | RETURN | SEMICOLON | HYPHEN | MOWLLexer.
		// Tokens | OPPLLexer. Tokens )
		int alt1 = 7;
		alt1 = this.dfa1.predict(this.input);
		switch (alt1) {
		case 1:
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:1:10:
			// THIS_CLASS
		{
			this.mTHIS_CLASS();
		}
			break;
		case 2:
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:1:21:
			// DOLLAR
		{
			this.mDOLLAR();
		}
			break;
		case 3:
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:1:28:
			// RETURN
		{
			this.mRETURN();
		}
			break;
		case 4:
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:1:35:
			// SEMICOLON
		{
			this.mSEMICOLON();
		}
			break;
		case 5:
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:1:45:
			// HYPHEN
		{
			this.mHYPHEN();
		}
			break;
		case 6:
		case 7:
			// /Users/luigi/Documents/workspace/Parsers/src/OPPLPatternLexer.g:1:69:
			// OPPLLexer. Tokens
		{
			this.gOPPLLexer.mTokens();
		}
			break;
		}
	}

	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS = "\1\uffff\1\63\1\67\2\uffff\1\67\6\uffff\15\67\6\uffff\4\67\1\uffff"
			+ "\5\67\1\uffff\10\67\2\uffff\3\67\1\uffff\45\67\1\uffff\1\67\3\uffff"
			+ "\3\67\1\uffff\65\67\2\uffff\3\67\1\uffff\135\67\1\u0120\41\67\1" + "\uffff\u00cc\67";
	static final String DFA1_eofS = "\u01ed\uffff";
	static final String DFA1_minS = "\1\11\1\164\1\55\2\uffff\1\55\6\uffff\15\55\5\uffff\1\0\1\43\1\75"
			+ "\1\60\1\55\1\0\5\55\1\uffff\10\55\2\uffff\3\55\1\uffff\45\55\1\0"
			+ "\1\42\1\uffff\1\43\1\uffff\3\55\1\0\1\47\64\55\1\0\1\uffff\3\55"
			+ "\1\0\177\55\1\uffff\u00cc\55";
	static final String DFA1_maxS = "\1\175\1\164\1\172\2\uffff\1\172\6\uffff\15\172\5\uffff\1\uffff"
			+ "\1\172\1\75\1\71\1\172\1\uffff\5\172\1\uffff\10\172\2\uffff\3\172"
			+ "\1\uffff\45\172\1\uffff\1\42\1\uffff\1\172\1\uffff\3\172\1\uffff"
			+ "\1\47\64\172\1\uffff\1\uffff\3\172\1\uffff\177\172\1\uffff\u00cc" + "\172";
	static final String DFA1_acceptS = "\3\uffff\1\4\1\5\1\uffff\6\6\15\uffff\5\6\13\uffff\1\7\10\uffff"
			+ "\1\1\1\2\3\uffff\1\6\47\uffff\1\6\1\uffff\1\6\72\uffff\1\6\u0083"
			+ "\uffff\1\3\u00cc\uffff";
	static final String DFA1_specialS = "\36\uffff\1\0\4\uffff\1\1\71\uffff\1\3\7\uffff\1\5\65\uffff\1\2"
			+ "\4\uffff\1\4\u014c\uffff}>";
	static final String[] DFA1_transitionS = {
			"\2\13\2\uffff\1\13\22\uffff\1\13\1\51\1\36\1\uffff\1\1\2\uffff"
					+ "\1\43\1\6\1\11\1\uffff\1\51\1\32\1\4\1\51\1\uffff\12\41\1\51"
					+ "\1\3\1\37\1\35\1\40\1\51\1\12\1\14\1\53\1\42\1\24\1\21\1\27"
					+ "\1\54\1\26\1\23\3\61\1\20\1\16\1\15\2\61\1\2\1\17\1\30\1\61"
					+ "\1\22\1\44\3\61\1\33\1\uffff\1\34\1\31\2\uffff\1\46\1\61\1\50"
					+ "\1\45\1\55\1\57\1\61\1\26\1\47\3\61\1\56\1\16\1\5\2\61\1\25"
					+ "\1\52\1\30\1\61\1\60\4\61\1\7\1\uffff\1\10",
			"\1\62",
			"\1\70\2\uffff\13\70\6\uffff\1\65\3\70\1\64\25\70\4\uffff\1"
					+ "\70\1\uffff\1\65\3\70\1\66\25\70",
			"",
			"",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\72\3\70\1\71\10\70\4\uffff"
					+ "\1\70\1\uffff\15\70\1\72\3\70\1\71\10\70",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\75\11\70\1\73\4\70\1\76"
					+ "\7\70\4\uffff\1\70\1\uffff\15\70\1\74\4\70\1\77\7\70",
			"\1\70\2\uffff\13\70\6\uffff\1\70\1\100\13\70\1\72\3\70\1\71"
					+ "\10\70\4\uffff\1\70\1\uffff\15\70\1\72\3\70\1\71\10\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\101\13\70\4\uffff\1\70"
					+ "\1\uffff\16\70\1\101\13\70",
			"\1\70\2\uffff\13\70\6\uffff\1\104\3\70\1\106\11\70\1\102\5"
					+ "\70\1\103\3\70\1\105\1\70\4\uffff\1\70\1\uffff\1\104\3\70\1"
					+ "\107\11\70\1\102\5\70\1\103\3\70\1\105\1\70",
			"\1\70\2\uffff\13\70\6\uffff\1\111\7\70\1\110\21\70\4\uffff"
					+ "\1\70\1\uffff\1\112\7\70\1\110\21\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\115\2\70\1\114\6\70\1\113"
					+ "\2\70\4\uffff\1\70\1\uffff\20\70\1\114\6\70\1\113\2\70",
			"\1\70\2\uffff\13\70\6\uffff\1\116\31\70\4\uffff\1\70\1\uffff" + "\1\117\31\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\120\3\70\1\121\10\70\4"
					+ "\uffff\1\70\1\uffff\15\70\1\122\3\70\1\123\10\70",
			"\1\70\2\uffff\13\70\6\uffff\1\126\7\70\1\124\5\70\1\125\13"
					+ "\70\4\uffff\1\70\1\uffff\10\70\1\124\5\70\1\125\13\70",
			"\1\70\2\uffff\13\70\6\uffff\1\65\3\70\1\66\25\70\4\uffff\1"
					+ "\70\1\uffff\1\65\3\70\1\66\25\70",
			"\1\70\2\uffff\13\70\6\uffff\1\127\31\70\4\uffff\1\70\1\uffff" + "\1\127\31\70",
			"\1\70\2\uffff\13\70\6\uffff\1\131\23\70\1\130\5\70\4\uffff"
					+ "\1\70\1\uffff\1\132\23\70\1\130\5\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\134\6\70\1\133\1\70\4\uffff"
					+ "\1\70\1\uffff\21\70\1\134\6\70\1\133\1\70",
			"",
			"",
			"",
			"",
			"",
			"\42\135\1\136\uffdd\135",
			"\1\140\11\uffff\16\140\2\uffff\1\137\1\uffff\1\140\1\uffff"
					+ "\32\140\1\uffff\1\140\2\uffff\1\140\1\uffff\32\140",
			"\1\141",
			"\12\41",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\142\2\70\1\143\13\70\4"
					+ "\uffff\1\70\1\uffff\21\70\1\144\10\70",
			"\47\145\1\146\uffd8\145",
			"\1\70\2\uffff\13\70\6\uffff\7\70\1\147\22\70\4\uffff\1\70\1" + "\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\124\5\70\1\125\13\70\4"
					+ "\uffff\1\70\1\uffff\10\70\1\124\5\70\1\125\13\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\150\4\70\1\77\7\70\4\uffff"
					+ "\1\70\1\uffff\15\70\1\74\4\70\1\77\7\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\122\3\70\1\123\10\70\4"
					+ "\uffff\1\70\1\uffff\15\70\1\122\3\70\1\123\10\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\21\70" + "\1\151\10\70",
			"",
			"\1\70\2\uffff\13\70\6\uffff\1\104\3\70\1\107\11\70\1\102\5"
					+ "\70\1\103\3\70\1\105\1\70\4\uffff\1\70\1\uffff\1\104\3\70\1"
					+ "\107\11\70\1\102\5\70\1\152\3\70\1\105\1\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\153\25\70\4\uffff\1\70\1" + "\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\154\10\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\20\70\1\114\6\70\1\113\2\70\4\uffff"
					+ "\1\70\1\uffff\20\70\1\114\6\70\1\113\2\70",
			"\1\70\2\uffff\13\70\6\uffff\1\155\7\70\1\110\21\70\4\uffff"
					+ "\1\70\1\uffff\1\155\7\70\1\110\21\70",
			"\1\70\2\uffff\13\70\6\uffff\24\70\1\130\5\70\4\uffff\1\70\1"
					+ "\uffff\1\156\23\70\1\130\5\70",
			"\1\70\2\uffff\13\70\6\uffff\1\117\31\70\4\uffff\1\70\1\uffff" + "\1\117\31\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"",
			"\1\70\2\uffff\13\70\6\uffff\5\70\1\160\6\70\1\161\1\162\5\70"
					+ "\1\157\6\70\4\uffff\1\70\1\uffff\5\70\1\160\24\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\163\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\163\14\70",
			"\1\70\2\uffff\13\70\6\uffff\5\70\1\160\24\70\4\uffff\1\70\1"
					+ "\uffff\5\70\1\160\24\70",
			"",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\164\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\164\16\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\165\11\70\1\166\14\70\4"
					+ "\uffff\1\70\1\uffff\3\70\1\165\26\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\165\26\70\4\uffff\1\70\1"
					+ "\uffff\3\70\1\165\17\70\1\167\6\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\170\26\70\4\uffff\1\70\1" + "\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\171\7\70\4\uffff\1\70\1"
					+ "\uffff\30\70\1\172\1\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\30\70" + "\1\172\1\70",
			"\1\70\2\uffff\13\70\6\uffff\11\70\1\173\20\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\174\6\70\4\uffff\1\70\1"
					+ "\uffff\23\70\1\174\6\70",
			"\1\70\2\uffff\13\70\6\uffff\14\70\1\175\15\70\4\uffff\1\70"
					+ "\1\uffff\14\70\1\175\15\70",
			"\1\70\2\uffff\13\70\6\uffff\1\70\1\176\30\70\4\uffff\1\70\1"
					+ "\uffff\1\70\1\176\30\70",
			"\1\70\2\uffff\13\70\6\uffff\14\70\1\177\15\70\4\uffff\1\70"
					+ "\1\uffff\14\70\1\177\15\70",
			"\1\70\2\uffff\13\70\6\uffff\14\70\1\u0080\15\70\4\uffff\1\70"
					+ "\1\uffff\14\70\1\u0080\15\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u0081\7\70\1\u0082\6\70"
					+ "\4\uffff\1\70\1\uffff\23\70\1\u0082\6\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u0082\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u0082\6\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u0083\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u0083\14\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u0085\3\70\1\u0084\2\70"
					+ "\4\uffff\1\70\1\uffff\27\70\1\u0084\2\70",
			"\1\70\2\uffff\13\70\6\uffff\27\70\1\u0084\2\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u0086\3\70\1\u0084\2\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u0087\31\70\4\uffff\1\70\1\uffff" + "\1\u0087\31\70",
			"\1\70\2\uffff\13\70\6\uffff\24\70\1\u0088\5\70\4\uffff\1\70"
					+ "\1\uffff\24\70\1\u0088\5\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\u0089\26\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u008a\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\u008b\16\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u008b\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\u008b\16\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\u008e\16\70\1\u008d\2\70"
					+ "\1\u008c\4\70\4\uffff\1\70\1\uffff\22\70\1\u008d\2\70\1\u008c" + "\4\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0090\10\70\1\u008f\10"
					+ "\70\4\uffff\1\70\1\uffff\21\70\1\u008f\10\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u008d\2\70\1\u008c\4\70"
					+ "\4\uffff\1\70\1\uffff\22\70\1\u008d\2\70\1\u008c\4\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u008f\10\70\4\uffff\1\70"
					+ "\1\uffff\21\70\1\u008f\10\70",
			"\1\70\2\uffff\13\70\6\uffff\5\70\1\u0091\14\70\1\u0092\7\70"
					+ "\4\uffff\1\70\1\uffff\5\70\1\u0091\14\70\1\u0092\7\70",
			"\1\70\2\uffff\13\70\6\uffff\14\70\1\u0093\15\70\4\uffff\1\70"
					+ "\1\uffff\14\70\1\u0093\15\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u0094\6\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u0095\7\70\4\uffff\1\70"
					+ "\1\uffff\22\70\1\u0095\7\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u0096\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u0096\14\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0097\21\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\10\70" + "\1\u0098\21\70",
			"\1\70\2\uffff\13\70\6\uffff\17\70\1\u0099\12\70\4\uffff\1\70"
					+ "\1\uffff\17\70\1\u0099\12\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u009a\31\70\4\uffff\1\70\1\uffff" + "\1\u009a\31\70",
			"\42\135\1\136\uffdd\135",
			"\1\u009b",
			"",
			"\1\140\11\uffff\16\140\3\uffff\1\u009c\1\140\1\uffff\32\140"
					+ "\1\uffff\1\140\2\uffff\1\140\1\uffff\32\140",
			"",
			"\1\70\2\uffff\13\70\6\uffff\1\u009d\31\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u009e\14\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\4\70" + "\1\u009f\25\70",
			"\47\145\1\146\uffd8\145",
			"\1\u00a0",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00a1\25\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\165\26\70\4\uffff\1\70\1"
					+ "\uffff\3\70\1\165\26\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\4\70" + "\1\u00a2\25\70",
			"\1\70\2\uffff\13\70\6\uffff\1\70\1\176\30\70\4\uffff\1\70\1"
					+ "\uffff\1\70\1\176\15\70\1\u00a3\12\70",
			"\1\70\2\uffff\13\70\6\uffff\6\70\1\u00a4\23\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u00a5\13\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\27\70\1\u0084\2\70\4\uffff\1\70"
					+ "\1\uffff\27\70\1\u0084\2\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\10\70" + "\1\u00a6\21\70",
			"\1\70\2\uffff\13\70\6\uffff\24\70\1\u00a7\5\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u00a8\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\u00a8\16\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u00a9\13\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\u00aa\26\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\6\70\1\u00ab\23\70\4\uffff\1\70"
					+ "\1\uffff\6\70\1\u00ab\23\70",
			"\1\70\2\uffff\13\70\6\uffff\30\70\1\u00ac\1\70\4\uffff\1\70"
					+ "\1\uffff\30\70\1\u00ac\1\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u00ad\13\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\10\70" + "\1\u00ae\21\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00af\25\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\14\70" + "\1\u00b0\15\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00b1\25\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00b2\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u00b2\25\70",
			"\1\70\2\uffff\13\70\6\uffff\2\70\1\u00b3\14\70\1\u00b4\12\70"
					+ "\4\uffff\1\70\1\uffff\2\70\1\u00b3\14\70\1\u00b4\12\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00b5\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u00b5\25\70",
			"\1\70\2\uffff\13\70\6\uffff\14\70\1\u00b6\15\70\4\uffff\1\70"
					+ "\1\uffff\14\70\1\u00b6\15\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00b7\25\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\2\70\1\u00b8\27\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\2\70" + "\1\u00b9\27\70",
			"\1\70\2\uffff\13\70\6\uffff\2\70\1\u00ba\27\70\4\uffff\1\70"
					+ "\1\uffff\2\70\1\u00ba\27\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u00bb\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u00bb\21\70",
			"\1\70\2\uffff\13\70\1\51\5\uffff\32\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\24\70\1\u00bc\5\70\4\uffff\1\70"
					+ "\1\uffff\24\70\1\u00bd\5\70",
			"\1\70\2\uffff\13\70\6\uffff\24\70\1\u00bd\5\70\4\uffff\1\70"
					+ "\1\uffff\24\70\1\u00bd\5\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00be\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u00be\25\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u00bf\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u00bf\6\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u00c0\21\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00c1\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u00c1\25\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\5\70\1\u00c2\24\70\4\uffff\1\70"
					+ "\1\uffff\5\70\1\u00c2\24\70",
			"\1\70\2\uffff\13\70\6\uffff\11\70\1\u00c3\20\70\4\uffff\1\70"
					+ "\1\uffff\11\70\1\u00c3\20\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u00c4\31\70\4\uffff\1\70\1\uffff" + "\1\u00c4\31\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u00c5\31\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\12\70\1\u00c6\17\70\4\uffff\1\70"
					+ "\1\uffff\12\70\1\u00c6\17\70",
			"\1\70\2\uffff\13\70\6\uffff\2\70\1\u00c7\27\70\4\uffff\1\70"
					+ "\1\uffff\2\70\1\u00c7\27\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u00c8\16\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\13\70" + "\1\u00c9\16\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00ca\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u00ca\25\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u00cb\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u00cb\14\70",
			"\42\135\1\136\uffdd\135",
			"",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u00cc\7\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u00cd\7\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\1\u00ce" + "\31\70",
			"\47\145\1\146\uffd8\145",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u00cf\10\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\1\u00d0" + "\31\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\4\70" + "\1\u00d1\25\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u00d2\21\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\24\70\1\u00d3\5\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\13\70" + "\1\u00d4\16\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u00d5\10\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00d6\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u00d6\25\70",
			"\1\70\2\uffff\13\70\6\uffff\25\70\1\u00d7\4\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00d8\25\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00d9\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u00d9\25\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u00da\6\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\77\7\70\4\uffff\1\70\1" + "\uffff\22\70\1\77\7\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u00db\10\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\14\70" + "\1\u00dc\15\70",
			"\1\70\2\uffff\13\70\6\uffff\2\70\1\u00dd\27\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u00de\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\u00de\16\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u00df\10\70\4\uffff\1\70"
					+ "\1\uffff\21\70\1\u00df\10\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u00e0\7\70\1\u00e1\21\70\4\uffff"
					+ "\1\70\1\uffff\1\u00e0\7\70\1\u00e1\21\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00e2\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u00e2\25\70",
			"\1\70\2\uffff\13\70\6\uffff\2\70\1\u00e3\27\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\7\70\1\u00e4\22\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\7\70" + "\1\u00e5\22\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u00e6\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u00e6\6\70",
			"\1\70\2\uffff\13\70\6\uffff\25\70\1\u00e7\4\70\4\uffff\1\70"
					+ "\1\uffff\25\70\1\u00e7\4\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00e8\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u00e9\25\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00e9\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u00e9\25\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u00ea\10\70\4\uffff\1\70"
					+ "\1\uffff\21\70\1\u00ea\10\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u00eb\31\70\4\uffff\1\70\1\uffff" + "\1\u00eb\31\70",
			"\1\70\2\uffff\13\70\6\uffff\25\70\1\u00ec\4\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\5\70\1\u00ed\24\70\4\uffff\1\70"
					+ "\1\uffff\5\70\1\u00ed\24\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00ee\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u00ee\25\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u00ef\13\70\4\uffff\1\70"
					+ "\1\uffff\16\70\1\u00ef\13\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u00f0\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u00f0\21\70",
			"\1\70\2\uffff\13\70\6\uffff\17\70\1\u00f1\12\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00f2\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u00f2\25\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u00f3\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u00f3\6\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u00f4\7\70\4\uffff\1\70"
					+ "\1\uffff\22\70\1\u00f4\7\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u00f5\7\70\4\uffff\1\70"
					+ "\1\uffff\22\70\1\u00f5\7\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u00f6\7\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u00f7\6\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\23\70" + "\1\u00f8\6\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u00f9\25\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\23\70" + "\1\u00fa\6\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\21\70" + "\1\u00fb\10\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u00fc\14\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\17\70\1\u00fd\12\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u00fe\14\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\27\70\1\u00ff\2\70\4\uffff\1\70"
					+ "\1\uffff\27\70\1\u00ff\2\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u0100\25\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u0101\10\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u0102\31\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u0103\6\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\4\70" + "\1\u0104\25\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u0105\6\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u0106\31\70\4\uffff\1\70\1\uffff" + "\1\u0106\31\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u0107\13\70\4\uffff\1\70"
					+ "\1\uffff\16\70\1\u0107\13\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u0108\7\70\4\uffff\1\70"
					+ "\1\uffff\22\70\1\u0108\7\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u0109\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u0109\14\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u010a\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u010a\6\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u010b\6\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u010c\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\u010c\16\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u010d\31\70\4\uffff\1\70\1\uffff" + "\1\u010d\31\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u010e\7\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u010f\7\70\4\uffff\1\70"
					+ "\1\uffff\22\70\1\u010f\7\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u0110\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u0110\14\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0111\21\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u0112\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\u0112\16\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u0113\10\70\4\uffff\1\70"
					+ "\1\uffff\21\70\1\u0113\10\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0114\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u0114\21\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u0115\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u0115\14\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u0116\10\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\30\70\1\u0117\1\70\4\uffff\1\70"
					+ "\1\uffff\30\70\1\u0117\1\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0118\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u0118\21\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0119\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u0119\21\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u011a\31\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\4\70" + "\1\u011b\25\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\4\70" + "\1\u011c\25\70",
			"\1\70\2\uffff\13\70\6\uffff\2\70\1\u011d\14\70\1\u011e\12\70"
					+ "\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u011f\7\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0121\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u0121\21\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0122\21\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u0123\6\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u0124\25\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\23\70" + "\1\u0125\6\70",
			"\1\70\2\uffff\13\70\6\uffff\17\70\1\u0126\12\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u0127\7\70\4\uffff\1\70"
					+ "\1\uffff\22\70\1\u0127\7\70",
			"\1\70\2\uffff\13\70\6\uffff\17\70\1\u0128\12\70\4\uffff\1\70"
					+ "\1\uffff\17\70\1\u0128\12\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\u0129\26\70\4\uffff\1\70"
					+ "\1\uffff\3\70\1\u0129\26\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u012a\10\70\4\uffff\1\70"
					+ "\1\uffff\21\70\1\u012a\10\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\30\70\1\u012b\1\70\4\uffff\1\70"
					+ "\1\uffff\30\70\1\u012b\1\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u012c\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\u012c\16\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u012d\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u012d\25\70",
			"\1\70\2\uffff\13\70\6\uffff\2\70\1\u012e\27\70\4\uffff\1\70"
					+ "\1\uffff\2\70\1\u012e\27\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\u012f\26\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u0130\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u0130\25\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u0131\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u0131\25\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u0132\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u0132\14\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u0133\13\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u0134\13\70\4\uffff\1\70"
					+ "\1\uffff\16\70\1\u0134\13\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u0135\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u0135\6\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u0136\14\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0137\13\70\1\u0138\5\70"
					+ "\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0139\13\70\1\u013a\5\70"
					+ "\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\13\70" + "\1\u013b\16\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\21\70" + "\1\u013c\10\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\70\2\uffff\13\70\6\uffff\25\70\1\u013d\4\70\4\uffff\1\70"
					+ "\1\uffff\25\70\1\u013d\4\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u013e\14\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u013f\21\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\u0140\26\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\21\70" + "\1\u0141\10\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u0142\10\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u0143\7\70\4\uffff\1\70"
					+ "\1\uffff\22\70\1\u0143\7\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u0144\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u0144\25\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0145\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u0145\21\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0146\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u0146\21\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u0147\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u0147\25\70",
			"\1\70\2\uffff\13\70\6\uffff\5\70\1\u0149\10\70\1\u0148\13\70"
					+ "\4\uffff\1\70\1\uffff\5\70\1\u0149\10\70\1\u0148\13\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u014a\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u014a\25\70",
			"\1\70\2\uffff\13\70\6\uffff\24\70\1\u014b\5\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\27\70\1\u014c\2\70\4\uffff\1\70"
					+ "\1\uffff\27\70\1\u014c\2\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u014d\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u014d\14\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u014e\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u014e\6\70",
			"\1\70\2\uffff\13\70\6\uffff\17\70\1\u014f\12\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u0150\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u0150\14\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0151\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u0151\21\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u0152\6\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\15\70" + "\1\u0153\14\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\15\70" + "\1\u0154\14\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\15\70" + "\1\u0155\14\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\15\70" + "\1\u0156\14\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\1\u0157" + "\31\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\16\70" + "\1\u0158\13\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u0159\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u0159\25\70",
			"\1\70\2\uffff\13\70\6\uffff\6\70\1\u015a\23\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u015b\13\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\10\70" + "\1\u015c\21\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u015d\13\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u015e\13\70\4\uffff\1\70"
					+ "\1\uffff\16\70\1\u015e\13\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u015f\10\70\4\uffff\1\70"
					+ "\1\uffff\21\70\1\u015f\10\70",
			"\1\70\2\uffff\13\70\6\uffff\25\70\1\u0160\4\70\4\uffff\1\70"
					+ "\1\uffff\25\70\1\u0160\4\70",
			"\1\70\2\uffff\13\70\6\uffff\2\70\1\u0161\27\70\4\uffff\1\70"
					+ "\1\uffff\2\70\1\u0161\27\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u0162\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u0162\14\70",
			"\1\70\2\uffff\13\70\6\uffff\5\70\1\u0163\24\70\4\uffff\1\70"
					+ "\1\uffff\5\70\1\u0163\24\70",
			"\1\70\2\uffff\13\70\6\uffff\24\70\1\u0164\5\70\4\uffff\1\70"
					+ "\1\uffff\24\70\1\u0164\5\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u0165\13\70\4\uffff\1\70"
					+ "\1\uffff\16\70\1\u0165\13\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u0166\31\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0167\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u0167\21\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u0168\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u0168\6\70",
			"\1\70\2\uffff\13\70\6\uffff\2\70\1\u016a\14\70\1\u016b\6\70"
					+ "\1\u0169\3\70\4\uffff\1\70\1\uffff\2\70\1\u016a\14\70\1\u016b"
					+ "\6\70\1\u0169\3\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u016c\25\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u016d\31\70\4\uffff\1\70\1\uffff" + "\1\u016d\31\70",
			"\1\70\2\uffff\13\70\6\uffff\25\70\1\u016e\4\70\4\uffff\1\70"
					+ "\1\uffff\25\70\1\u016e\4\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\23\70" + "\1\u016f\6\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\10\70" + "\1\u0170\21\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\23\70" + "\1\u0171\6\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\10\70" + "\1\u0172\21\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\22\70" + "\1\u0173\7\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\17\70" + "\1\u0174\12\70",
			"\1\70\2\uffff\12\70\1\u0175\6\uffff\32\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u0176\14\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\2\70" + "\1\u0177\27\70",
			"\1\70\2\uffff\13\70\6\uffff\17\70\1\u0178\12\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\5\70\1\u0179\24\70\4\uffff\1\70"
					+ "\1\uffff\5\70\1\u0179\24\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u017a\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u017a\6\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u017b\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u017b\21\70",
			"\1\70\2\uffff\12\70\1\u017c\6\uffff\32\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u017d\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u017d\6\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u017e\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u017e\14\70",
			"\1\70\2\uffff\13\70\6\uffff\5\70\1\u017f\24\70\4\uffff\1\70"
					+ "\1\uffff\5\70\1\u017f\24\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u0180\16\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\25\70\1\u0181\4\70\4\uffff\1\70"
					+ "\1\uffff\25\70\1\u0181\4\70",
			"\1\70\2\uffff\13\70\6\uffff\5\70\1\u0182\2\70\1\u0183\21\70"
					+ "\4\uffff\1\70\1\uffff\5\70\1\u0182\2\70\1\u0183\21\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u0184\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u0184\21\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u0185\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\u0185\16\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u0186\10\70\4\uffff\1\70"
					+ "\1\uffff\21\70\1\u0186\10\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u0187\10\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u0188\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\u0188\16\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u0189\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u0189\25\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\4\70" + "\1\u018a\25\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\16\70" + "\1\u018b\13\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\4\70" + "\1\u018c\25\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\16\70" + "\1\u018d\13\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\22\70" + "\1\u018e\7\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\4\70" + "\1\u018f\25\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\17\70\1\u0190\12\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\12\70\1\u0191\6\uffff\32\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u0192\25\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\30\70\1\u0193\1\70\4\uffff\1\70"
					+ "\1\uffff\30\70\1\u0193\1\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\u0194\26\70\4\uffff\1\70"
					+ "\1\uffff\3\70\1\u0194\26\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u0195\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u0195\6\70",
			"\1\70\2\uffff\13\70\6\uffff\2\70\1\u0196\27\70\4\uffff\1\70"
					+ "\1\uffff\2\70\1\u0196\27\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u0197\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u0197\25\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u0198\10\70\4\uffff\1\70"
					+ "\1\uffff\21\70\1\u0198\10\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u0199\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u0199\14\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u019a\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u019a\6\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u019b\31\70\4\uffff\1\70\1\uffff" + "\1\u019b\31\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u019c\13\70\4\uffff\1\70"
					+ "\1\uffff\16\70\1\u019c\13\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u019d\6\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\12\70\1\u019e\6\uffff\32\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\12\70\1\u019f\6\uffff\32\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\21\70" + "\1\u01a0\10\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\15\70" + "\1\u01a1\14\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\21\70" + "\1\u01a2\10\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\15\70" + "\1\u01a3\14\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u01a4\13\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\21\70" + "\1\u01a5\10\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u01a6\10\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u01a7\10\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u01a8\13\70\4\uffff\1\70"
					+ "\1\uffff\16\70\1\u01a8\13\70",
			"\1\70\2\uffff\13\70\6\uffff\24\70\1\u01a9\5\70\4\uffff\1\70"
					+ "\1\uffff\24\70\1\u01a9\5\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u01aa\13\70\4\uffff\1\70"
					+ "\1\uffff\16\70\1\u01aa\13\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u01ab\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u01ab\6\70",
			"\1\70\2\uffff\12\70\1\u01ac\6\uffff\32\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u01ad\13\70\4\uffff\1\70"
					+ "\1\uffff\16\70\1\u01ad\13\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\u01ae\26\70\4\uffff\1\70"
					+ "\1\uffff\3\70\1\u01ae\26\70",
			"\1\70\2\uffff\13\70\6\uffff\7\70\1\u01af\22\70\4\uffff\1\70"
					+ "\1\uffff\7\70\1\u01af\22\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u01b0\7\70\4\uffff\1\70"
					+ "\1\uffff\22\70\1\u01b0\7\70",
			"\1\70\2\uffff\13\70\6\uffff\17\70\1\u01b1\12\70\4\uffff\1\70"
					+ "\1\uffff\17\70\1\u01b1\12\70",
			"\1\70\2\uffff\13\70\6\uffff\30\70\1\u01b2\1\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\22\70" + "\1\u01b3\7\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\22\70" + "\1\u01b4\7\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\5\70" + "\1\u01b5\24\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\23\70" + "\1\u01b6\6\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u01b7\13\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u01b8\6\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\5\70\1\u01b9\24\70\4\uffff\1\70"
					+ "\1\uffff\5\70\1\u01b9\24\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u01ba\31\70\4\uffff\1\70\1\uffff" + "\1\u01ba\31\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u01bb\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u01bb\21\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\14\70\1\u01bc\15\70\4\uffff\1\70"
					+ "\1\uffff\14\70\1\u01bc\15\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u01bd\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u01bd\21\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u01be\7\70\4\uffff\1\70"
					+ "\1\uffff\22\70\1\u01be\7\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u01bf\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u01bf\25\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\4\70" + "\1\u01c0\25\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\4\70" + "\1\u01c1\25\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\30\70" + "\1\u01c2\1\70",
			"\1\70\2\uffff\13\70\6\uffff\17\70\1\u01c3\12\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\30\70\1\u01c4\1\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u01c5\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\u01c5\16\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u01c6\13\70\4\uffff\1\70"
					+ "\1\uffff\16\70\1\u01c6\13\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\25\70\1\u01c7\4\70\4\uffff\1\70"
					+ "\1\uffff\25\70\1\u01c7\4\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u01c8\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u01c8\25\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u01c9\10\70\4\uffff\1\70"
					+ "\1\uffff\21\70\1\u01c9\10\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\2\70" + "\1\u01ca\27\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\2\70" + "\1\u01cb\27\70",
			"\1\70\2\uffff\13\70\6\uffff\16\70\1\u01cc\13\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u01cd\25\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\12\70\1\u01ce\6\uffff\32\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\15\70\1\u01cf\14\70\4\uffff\1\70"
					+ "\1\uffff\15\70\1\u01cf\14\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u01d0\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u01d0\21\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u01d1\7\70\4\uffff\1\70"
					+ "\1\uffff\22\70\1\u01d1\7\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u01d2\6\70\4\uffff\1\70"
					+ "\1\uffff\23\70\1\u01d2\6\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\23\70" + "\1\u01d3\6\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\23\70" + "\1\u01d4\6\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\5\70" + "\1\u01d5\24\70",
			"\1\70\2\uffff\13\70\6\uffff\21\70\1\u01d6\10\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u01d7\31\70\4\uffff\1\70\1\uffff" + "\1\u01d7\31\70",
			"\1\70\2\uffff\13\70\6\uffff\3\70\1\u01d8\26\70\4\uffff\1\70"
					+ "\1\uffff\3\70\1\u01d8\26\70",
			"\1\70\2\uffff\12\70\1\u01d9\6\uffff\32\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\10\70\1\u01da\21\70\4\uffff\1\70"
					+ "\1\uffff\10\70\1\u01da\21\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\10\70" + "\1\u01db\21\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\10\70" + "\1\u01dc\21\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\23\70\1\u01dd\6\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u01de\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\u01de\16\70",
			"\1\70\2\uffff\13\70\6\uffff\24\70\1\u01df\5\70\4\uffff\1\70"
					+ "\1\uffff\24\70\1\u01df\5\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\4\70\1\u01e0\25\70\4\uffff\1\70"
					+ "\1\uffff\4\70\1\u01e0\25\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\16\70" + "\1\u01e1\13\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\16\70" + "\1\u01e2\13\70",
			"\1\70\2\uffff\13\70\6\uffff\30\70\1\u01e3\1\70\4\uffff\1\70" + "\1\uffff\32\70",
			"\1\70\2\uffff\12\70\1\u01e4\6\uffff\32\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\1\u01e5\31\70\4\uffff\1\70\1\uffff" + "\1\u01e5\31\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u01e6\7\70\4\uffff\1\70"
					+ "\1\uffff\22\70\1\u01e6\7\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\15\70" + "\1\u01e7\14\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\15\70" + "\1\u01e8\14\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\13\70\1\u01e9\16\70\4\uffff\1\70"
					+ "\1\uffff\13\70\1\u01e9\16\70",
			"\1\70\2\uffff\12\70\1\u01ea\6\uffff\32\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\13\70\6\uffff\22\70\1\u01eb\7\70\4\uffff\1\70"
					+ "\1\uffff\22\70\1\u01eb\7\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\70\2\uffff\12\70\1\u01ec\6\uffff\32\70\4\uffff\1\70\1\uffff" + "\32\70",
			"\1\70\2\uffff\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70" };
	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
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

		@Override
		public String getDescription() {
			return "1:1: Tokens : ( THIS_CLASS | DOLLAR | RETURN | SEMICOLON | HYPHEN | MOWLLexer. Tokens | OPPLLexer. Tokens );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA1_30 = input.LA(1);
				s = -1;
				if (LA1_30 >= '\u0000' && LA1_30 <= '!' || LA1_30 >= '#' && LA1_30 <= '\uFFFF') {
					s = 93;
				} else if (LA1_30 == '\"') {
					s = 94;
				}
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA1_35 = input.LA(1);
				s = -1;
				if (LA1_35 >= '\u0000' && LA1_35 <= '&' || LA1_35 >= '(' && LA1_35 <= '\uFFFF') {
					s = 101;
				} else if (LA1_35 == '\'') {
					s = 102;
				}
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA1_155 = input.LA(1);
				s = -1;
				if (LA1_155 == '\"') {
					s = 94;
				} else if (LA1_155 >= '\u0000' && LA1_155 <= '!' || LA1_155 >= '#'
						&& LA1_155 <= '\uFFFF') {
					s = 93;
				}
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA1_93 = input.LA(1);
				s = -1;
				if (LA1_93 == '\"') {
					s = 94;
				} else if (LA1_93 >= '\u0000' && LA1_93 <= '!' || LA1_93 >= '#'
						&& LA1_93 <= '\uFFFF') {
					s = 93;
				}
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA1_160 = input.LA(1);
				s = -1;
				if (LA1_160 == '\'') {
					s = 102;
				} else if (LA1_160 >= '\u0000' && LA1_160 <= '&' || LA1_160 >= '('
						&& LA1_160 <= '\uFFFF') {
					s = 101;
				}
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA1_101 = input.LA(1);
				s = -1;
				if (LA1_101 == '\'') {
					s = 102;
				} else if (LA1_101 >= '\u0000' && LA1_101 <= '&' || LA1_101 >= '('
						&& LA1_101 <= '\uFFFF') {
					s = 101;
				}
				if (s >= 0) {
					return s;
				}
				break;
			}
			NoViableAltException nvae = new NoViableAltException(this.getDescription(), 1, _s,
					input);
			this.error(nvae);
			throw nvae;
		}
	}
}