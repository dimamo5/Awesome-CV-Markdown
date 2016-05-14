// Generated from C:/Users/Utilizador/Desktop/MIEIC/3º ano/2º semestre/COMP/markdown-dsl/src/grammar\MarkdownLexer.g4 by ANTLR 4.5.1
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
		SPACE=1, TAB=2, NEWLINE=3, STAR=4, MINUS=5, COLON=6, CLOSE_ANGLE_BRACKET=7, 
		OPEN_ANGLE_BRACKET=8, SHARP=9, OPEN_SB=10, CLOSE_SB=11, SLASH=12, OPEN_CURLY=13, 
		CLOSE_CURLY=14, BLOCKSPLITTER=15, TILT=16, HAT=17, SPLIT=18, ESCAPE=19, 
		SYMBOL=20, WORD=21, INT=22, STAR_CLASS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "TAB", "NEWLINE", "STAR", "MINUS", "COLON", "CLOSE_ANGLE_BRACKET", 
		"OPEN_ANGLE_BRACKET", "SHARP", "OPEN_SB", "CLOSE_SB", "SLASH", "OPEN_CURLY", 
		"CLOSE_CURLY", "BLOCKSPLITTER", "TILT", "HAT", "SPLIT", "CHAR", "DIGIT", 
		"ESCAPE", "SYMBOL", "WORD", "INT", "STAR_CLASS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'\t'", null, "'*'", "'-'", "':'", "'>'", "'<'", "'#'", "'['", 
		"']'", "'/'", "'{'", "'}'", "'------'", "'~'", "'^'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "TAB", "NEWLINE", "STAR", "MINUS", "COLON", "CLOSE_ANGLE_BRACKET", 
		"OPEN_ANGLE_BRACKET", "SHARP", "OPEN_SB", "CLOSE_SB", "SLASH", "OPEN_CURLY", 
		"CLOSE_CURLY", "BLOCKSPLITTER", "TILT", "HAT", "SPLIT", "ESCAPE", "SYMBOL", 
		"WORD", "INT", "STAR_CLASS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4=\n\4\r\4\16\4>\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26z\n\26\3\27\3\27"+
		"\3\30\6\30\177\n\30\r\30\16\30\u0080\3\31\6\31\u0084\n\31\r\31\16\31\u0085"+
		"\3\32\3\32\3\32\5\32\u008b\n\32\3\32\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\2)\2+\25-\26/\27\61\30\63\31\3\2\b\4\2\f\f\17\17\4\2C\\c|\3\2\62;\5"+
		"\2#$&+-\u00c4\4\2\60\60^^\4\2\62\62\67\67\u0098\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\59\3"+
		"\2\2\2\7<\3\2\2\2\t@\3\2\2\2\13B\3\2\2\2\rD\3\2\2\2\17F\3\2\2\2\21H\3"+
		"\2\2\2\23J\3\2\2\2\25L\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33R\3\2\2\2\35"+
		"T\3\2\2\2\37V\3\2\2\2!]\3\2\2\2#_\3\2\2\2%a\3\2\2\2\'c\3\2\2\2)e\3\2\2"+
		"\2+y\3\2\2\2-{\3\2\2\2/~\3\2\2\2\61\u0083\3\2\2\2\63\u0087\3\2\2\2\65"+
		"\66\7\"\2\2\66\67\3\2\2\2\678\b\2\2\28\4\3\2\2\29:\7\13\2\2:\6\3\2\2\2"+
		";=\t\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\b\3\2\2\2@A\7,\2\2"+
		"A\n\3\2\2\2BC\7/\2\2C\f\3\2\2\2DE\7<\2\2E\16\3\2\2\2FG\7@\2\2G\20\3\2"+
		"\2\2HI\7>\2\2I\22\3\2\2\2JK\7%\2\2K\24\3\2\2\2LM\7]\2\2M\26\3\2\2\2NO"+
		"\7_\2\2O\30\3\2\2\2PQ\7\61\2\2Q\32\3\2\2\2RS\7}\2\2S\34\3\2\2\2TU\7\177"+
		"\2\2U\36\3\2\2\2VW\7/\2\2WX\7/\2\2XY\7/\2\2YZ\7/\2\2Z[\7/\2\2[\\\7/\2"+
		"\2\\ \3\2\2\2]^\7\u0080\2\2^\"\3\2\2\2_`\7`\2\2`$\3\2\2\2ab\7~\2\2b&\3"+
		"\2\2\2cd\t\3\2\2d(\3\2\2\2ef\t\4\2\2f*\3\2\2\2gh\7^\2\2hz\5\13\6\2ij\7"+
		"^\2\2jz\5\r\7\2kl\7^\2\2lz\5!\21\2mn\7^\2\2nz\5#\22\2op\7^\2\2pz\5\31"+
		"\r\2qr\7^\2\2rz\5\33\16\2st\7^\2\2tz\5\35\17\2uv\7^\2\2vz\5%\23\2wx\7"+
		"^\2\2xz\5\23\n\2yg\3\2\2\2yi\3\2\2\2yk\3\2\2\2ym\3\2\2\2yo\3\2\2\2yq\3"+
		"\2\2\2ys\3\2\2\2yu\3\2\2\2yw\3\2\2\2z,\3\2\2\2{|\t\5\2\2|.\3\2\2\2}\177"+
		"\5\'\24\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\60\3\2\2\2\u0082\u0084\5)\25\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\62\3\2\2\2\u0087"+
		"\u008a\5\61\31\2\u0088\u0089\t\6\2\2\u0089\u008b\t\7\2\2\u008a\u0088\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\61\2\2\u008d"+
		"\u008e\5\61\31\2\u008e\64\3\2\2\2\b\2>y\u0080\u0085\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}