// Generated from C:/Users/diogo/IdeaProjects/markdown-cv/src/grammar\MarkdownLexer.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, TAB=2, NEWLINE=3, EMPH=4, MINUS=5, UNDERSCORE=6, CLOSE_ANGLE_BRACKET=7, 
		OPEN_ANGLE_BRACKET=8, SHARP=9, OPEN_PAREN=10, CLOSE_PAREN=11, OPEN_SB=12, 
		CLOSE_SB=13, DOUBLE_QUOTE=14, SINGLE_QUOTE=15, COLON=16, SEMI_COLON=17, 
		AT=18, SLASH=19, PERIOD=20, EQUAL=21, AMPERSAND=22, BACKSLASH=23, BACKTICK=24, 
		PLUS=25, OPEN_CURLY=26, CLOSE_CURLY=27, NORMAL_CHAR=28, STRING_LITERAL=29, 
		DIGIT=30, NUMBER=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "TAB", "NEWLINE", "EMPH", "MINUS", "UNDERSCORE", "CLOSE_ANGLE_BRACKET", 
		"OPEN_ANGLE_BRACKET", "SHARP", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_SB", 
		"CLOSE_SB", "DOUBLE_QUOTE", "SINGLE_QUOTE", "COLON", "SEMI_COLON", "AT", 
		"SLASH", "PERIOD", "EQUAL", "AMPERSAND", "BACKSLASH", "BACKTICK", "PLUS", 
		"OPEN_CURLY", "CLOSE_CURLY", "NORMAL_CHAR", "STRING_LITERAL", "DIGIT", 
		"NUMBER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'\t'", null, "'*'", "'-'", "'_'", "'>'", "'<'", "'#'", "'('", 
		"')'", "'['", "']'", "'\"'", "'''", "':'", "';'", "'@'", "'/'", "'.'", 
		"'='", "'&'", "'\\'", "'`'", "'+'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "TAB", "NEWLINE", "EMPH", "MINUS", "UNDERSCORE", "CLOSE_ANGLE_BRACKET", 
		"OPEN_ANGLE_BRACKET", "SHARP", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_SB", 
		"CLOSE_SB", "DOUBLE_QUOTE", "SINGLE_QUOTE", "COLON", "SEMI_COLON", "AT", 
		"SLASH", "PERIOD", "EQUAL", "AMPERSAND", "BACKSLASH", "BACKTICK", "PLUS", 
		"OPEN_CURLY", "CLOSE_CURLY", "NORMAL_CHAR", "STRING_LITERAL", "DIGIT", 
		"NUMBER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MarkdownLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MarkdownLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u008e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\5\4I\n\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\7\36\u0083\n\36\f\36\16\36\u0086\13\36\3\37\3\37\3 \6"+
		" \u008b\n \r \16 \u008c\2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!\3\2\5\4\2C\\c|\5\2\62;C\\c|\3\2\62;"+
		"\u0091\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5E\3\2\2\2\7L\3\2\2\2\t"+
		"N\3\2\2\2\13P\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25"+
		"Z\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2\37d\3\2\2\2"+
		"!f\3\2\2\2#h\3\2\2\2%j\3\2\2\2\'l\3\2\2\2)n\3\2\2\2+p\3\2\2\2-r\3\2\2"+
		"\2/t\3\2\2\2\61v\3\2\2\2\63x\3\2\2\2\65z\3\2\2\2\67|\3\2\2\29~\3\2\2\2"+
		";\u0080\3\2\2\2=\u0087\3\2\2\2?\u008a\3\2\2\2AB\7\"\2\2BC\3\2\2\2CD\b"+
		"\2\2\2D\4\3\2\2\2EF\7\13\2\2F\6\3\2\2\2GI\7\17\2\2HG\3\2\2\2HI\3\2\2\2"+
		"IJ\3\2\2\2JM\7\f\2\2KM\7\f\2\2LH\3\2\2\2LK\3\2\2\2M\b\3\2\2\2NO\7,\2\2"+
		"O\n\3\2\2\2PQ\7/\2\2Q\f\3\2\2\2RS\7a\2\2S\16\3\2\2\2TU\7@\2\2U\20\3\2"+
		"\2\2VW\7>\2\2W\22\3\2\2\2XY\7%\2\2Y\24\3\2\2\2Z[\7*\2\2[\26\3\2\2\2\\"+
		"]\7+\2\2]\30\3\2\2\2^_\7]\2\2_\32\3\2\2\2`a\7_\2\2a\34\3\2\2\2bc\7$\2"+
		"\2c\36\3\2\2\2de\7)\2\2e \3\2\2\2fg\7<\2\2g\"\3\2\2\2hi\7=\2\2i$\3\2\2"+
		"\2jk\7B\2\2k&\3\2\2\2lm\7\61\2\2m(\3\2\2\2no\7\60\2\2o*\3\2\2\2pq\7?\2"+
		"\2q,\3\2\2\2rs\7(\2\2s.\3\2\2\2tu\7^\2\2u\60\3\2\2\2vw\7b\2\2w\62\3\2"+
		"\2\2xy\7-\2\2y\64\3\2\2\2z{\7}\2\2{\66\3\2\2\2|}\7\177\2\2}8\3\2\2\2~"+
		"\177\t\2\2\2\177:\3\2\2\2\u0080\u0084\59\35\2\u0081\u0083\t\3\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085<\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\t\4\2\2\u0088>\3\2"+
		"\2\2\u0089\u008b\5=\37\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d@\3\2\2\2\7\2HL\u0084\u008c\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}