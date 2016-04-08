// Generated from C:/Users/inesa/Documents/GitHub/markdown-dsl/src/grammar\MarkdownGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownGrammar extends Parser {
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
	public static final int
		RULE_header = 0, RULE_subHeader = 1;
	public static final String[] ruleNames = {
		"header", "subHeader"
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

	@Override
	public String getGrammarFileName() { return "MarkdownGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MarkdownGrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HeaderContext extends ParserRuleContext {
		public List<TerminalNode> SHARP() { return getTokens(MarkdownGrammar.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public SubHeaderContext subHeader() {
			return getRuleContext(SubHeaderContext.class,0);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(MarkdownGrammar.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(MarkdownGrammar.STRING_LITERAL, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(SHARP);
			setState(6); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(5);
				match(STRING_LITERAL);
				}
				}
				setState(8); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING_LITERAL );
			setState(10);
			match(SHARP);
			setState(11);
			match(NEWLINE);
			setState(12);
			subHeader();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubHeaderContext extends ParserRuleContext {
		public List<TerminalNode> SHARP() { return getTokens(MarkdownGrammar.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(MarkdownGrammar.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(MarkdownGrammar.STRING_LITERAL, i);
		}
		public SubHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterSubHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitSubHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitSubHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubHeaderContext subHeader() throws RecognitionException {
		SubHeaderContext _localctx = new SubHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				match(SHARP);
				setState(15);
				match(SHARP);
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(16);
					match(STRING_LITERAL);
					}
					}
					setState(19); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING_LITERAL );
				setState(21);
				match(SHARP);
				setState(22);
				match(SHARP);
				setState(23);
				match(NEWLINE);
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SHARP );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\37\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\6\2\t\n\2\r\2\16\2\n\3\2\3\2\3\2\3\2\3\3\3\3\3\3\6\3\24\n\3"+
		"\r\3\16\3\25\3\3\3\3\3\3\6\3\33\n\3\r\3\16\3\34\3\3\2\2\4\2\4\2\2\37\2"+
		"\6\3\2\2\2\4\32\3\2\2\2\6\b\7\13\2\2\7\t\7\37\2\2\b\7\3\2\2\2\t\n\3\2"+
		"\2\2\n\b\3\2\2\2\n\13\3\2\2\2\13\f\3\2\2\2\f\r\7\13\2\2\r\16\7\5\2\2\16"+
		"\17\5\4\3\2\17\3\3\2\2\2\20\21\7\13\2\2\21\23\7\13\2\2\22\24\7\37\2\2"+
		"\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2"+
		"\27\30\7\13\2\2\30\31\7\13\2\2\31\33\7\5\2\2\32\20\3\2\2\2\33\34\3\2\2"+
		"\2\34\32\3\2\2\2\34\35\3\2\2\2\35\5\3\2\2\2\5\n\25\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}