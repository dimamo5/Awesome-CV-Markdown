// Generated from C:/Users/diogo/IdeaProjects/markdown-cv/src/grammar\MarkdownLexer.g4 by ANTLR 4.5.1
package grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownLexer extends Lexer {
	public static final int
			SPACE = 1, TAB = 2, NEWLINE = 3, CLOSE_ANGLE_BRACKET = 4, STAR = 5, SHARP = 6, SLASH = 7,
			OPEN_CURLY = 8, CLOSE_CURLY = 9, BLOCKSPLITTER = 10, HAT = 11, SPLIT = 12, EQUAL = 13,
			ESCAPE = 14, SYMBOL = 15, WORD = 16, INT = 17, STAR_CLASS = 18;
	public static final String[] ruleNames = {
			"SPACE", "TAB", "NEWLINE", "CLOSE_ANGLE_BRACKET", "STAR", "SHARP", "SLASH",
			"OPEN_CURLY", "CLOSE_CURLY", "BLOCKSPLITTER", "HAT", "SPLIT", "EQUAL",
			"CHAR", "DIGIT", "ESCAPE", "SYMBOL", "WORD", "INT", "STAR_CLASS"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24v\b\1\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\4\6\4\63\n\4" +
					"\r\4\16\4\64\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13" +
					"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21" +
					"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21" +
					"a\n\21\3\22\3\22\3\23\6\23f\n\23\r\23\16\23g\3\24\6\24k\n\24\r\24\16\24" +
					"l\3\25\3\25\3\25\5\25r\n\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7" +
					"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\2!\20#\21%\22\'\23" +
					")\24\3\2\b\4\2\f\f\17\17\5\2C\\c|\u00c2\u0101\3\2\62;\r\2#$&+-\60<=AB" +
					"^^aa\u0080\u0080\u00ac\u00ad\u00bc\u00bd\u00c4\u00c4\4\2\60\60^^\4\2\62" +
					"\62\67\67~\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2" +
					"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27" +
					"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2" +
					"\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7\62\3\2\2\2\t\66\3\2\2\2" +
					"\138\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23@\3\2\2\2\25B\3\2\2" +
					"\2\27F\3\2\2\2\31H\3\2\2\2\33J\3\2\2\2\35L\3\2\2\2\37N\3\2\2\2!`\3\2\2" +
					"\2#b\3\2\2\2%e\3\2\2\2\'j\3\2\2\2)n\3\2\2\2+,\7\"\2\2,\4\3\2\2\2-.\7\13" +
					"\2\2./\3\2\2\2/\60\b\3\2\2\60\6\3\2\2\2\61\63\t\2\2\2\62\61\3\2\2\2\63" +
					"\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\b\3\2\2\2\66\67\7@\2\2\67\n" +
					"\3\2\2\289\7,\2\29\f\3\2\2\2:;\7%\2\2;\16\3\2\2\2<=\7\61\2\2=\20\3\2\2" +
					"\2>?\7}\2\2?\22\3\2\2\2@A\7\177\2\2A\24\3\2\2\2BC\7?\2\2CD\7?\2\2DE\7" +
					"?\2\2E\26\3\2\2\2FG\7`\2\2G\30\3\2\2\2HI\7~\2\2I\32\3\2\2\2JK\7?\2\2K" +
					"\34\3\2\2\2LM\t\3\2\2M\36\3\2\2\2NO\t\4\2\2O \3\2\2\2PQ\7^\2\2Qa\5\27" +
					"\f\2RS\7^\2\2Sa\5\17\b\2TU\7^\2\2Ua\5\21\t\2VW\7^\2\2Wa\5\23\n\2XY\7^" +
					"\2\2Ya\5\31\r\2Z[\7^\2\2[a\5\r\7\2\\]\7^\2\2]a\5\13\6\2^_\7^\2\2_a\5\33" +
					"\16\2`P\3\2\2\2`R\3\2\2\2`T\3\2\2\2`V\3\2\2\2`X\3\2\2\2`Z\3\2\2\2`\\\3" +
					"\2\2\2`^\3\2\2\2a\"\3\2\2\2bc\t\5\2\2c$\3\2\2\2df\5\35\17\2ed\3\2\2\2" +
					"fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h&\3\2\2\2ik\5\37\20\2ji\3\2\2\2kl\3\2\2" +
					"\2lj\3\2\2\2lm\3\2\2\2m(\3\2\2\2nq\5\'\24\2op\t\6\2\2pr\t\7\2\2qo\3\2" +
					"\2\2qr\3\2\2\2rs\3\2\2\2st\7\61\2\2tu\5\'\24\2u*\3\2\2\2\b\2\64`glq\3" +
					"\b\2\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = {
			null, "' '", "'\t'", null, "'>'", "'*'", "'#'", "'/'", "'{'", "'}'", "'==='",
			"'^'", "'|'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, "SPACE", "TAB", "NEWLINE", "CLOSE_ANGLE_BRACKET", "STAR", "SHARP",
			"SLASH", "OPEN_CURLY", "CLOSE_CURLY", "BLOCKSPLITTER", "HAT", "SPLIT",
			"EQUAL", "ESCAPE", "SYMBOL", "WORD", "INT", "STAR_CLASS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public MarkdownLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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

	@Override
	public String getGrammarFileName() {
		return "MarkdownLexer.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN; }
}