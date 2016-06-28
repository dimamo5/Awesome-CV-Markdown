// Generated from C:/Users/inesa/Documents/GitHub/markdown-dsl/src/grammar\MarkdownGrammar.g4 by ANTLR 4.5.3
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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, TAB=2, NEWLINE=3, CLOSE_ANGLE_BRACKET=4, STAR=5, SHARP=6, SLASH=7, 
		OPEN_CURLY=8, CLOSE_CURLY=9, BLOCKSPLITTER=10, HAT=11, SPLIT=12, EQUAL=13, 
		ESCAPE=14, SYMBOL=15, WORD=16, INT=17, STAR_CLASS=18;
	public static final int
		RULE_cv = 0, RULE_defVar = 1, RULE_info = 2, RULE_subHeader = 3, RULE_name = 4, 
		RULE_address = 5, RULE_contacts = 6, RULE_block = 7, RULE_subBlock = 8, 
		RULE_textBlock = 9, RULE_boldText = 10, RULE_italicText = 11, RULE_list = 12, 
		RULE_blockList = 13, RULE_blockListCell = 14, RULE_table = 15, RULE_tableBody = 16, 
		RULE_icon = 17, RULE_tableHeader = 18, RULE_tableCell = 19, RULE_tableLine = 20, 
		RULE_blockName = 21, RULE_blockSubName = 22, RULE_any = 23, RULE_tablecontent = 24, 
		RULE_variable = 25, RULE_word_space = 26;
	public static final String[] ruleNames = {
		"cv", "defVar", "info", "subHeader", "name", "address", "contacts", "block", 
		"subBlock", "textBlock", "boldText", "italicText", "list", "blockList", 
		"blockListCell", "table", "tableBody", "icon", "tableHeader", "tableCell", 
		"tableLine", "blockName", "blockSubName", "any", "tablecontent", "variable", 
		"word_space"
	};

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


	    public java.util.HashMap<String,String> variables= new java.util.HashMap<>();

	public MarkdownGrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CvContext extends ParserRuleContext {
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public List<TerminalNode> BLOCKSPLITTER() { return getTokens(MarkdownGrammar.BLOCKSPLITTER); }
		public TerminalNode BLOCKSPLITTER(int i) {
			return getToken(MarkdownGrammar.BLOCKSPLITTER, i);
		}
		public List<DefVarContext> defVar() {
			return getRuleContexts(DefVarContext.class);
		}
		public DefVarContext defVar(int i) {
			return getRuleContext(DefVarContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterCv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitCv(this);
		}
	}

	public final CvContext cv() throws RecognitionException {
		CvContext _localctx = new CvContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(54);
				defVar();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			info();
			setState(61);
			match(BLOCKSPLITTER);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				match(NEWLINE);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				block();
				setState(68);
				match(BLOCKSPLITTER);
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					match(NEWLINE);
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(76); 
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

	public static class DefVarContext extends ParserRuleContext {
		public VariableContext variable;
		public AnyContext any;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MarkdownGrammar.EQUAL, 0); }
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public DefVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterDefVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitDefVar(this);
		}
	}

	public final DefVarContext defVar() throws RecognitionException {
		DefVarContext _localctx = new DefVarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defVar);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((DefVarContext)_localctx).variable = variable();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(79);
				match(SPACE);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(EQUAL);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					match(SPACE);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(92);
			((DefVarContext)_localctx).any = any();
			setState(93);
			match(NEWLINE);
			data.Utils.defVar(variables,(((DefVarContext)_localctx).variable!=null?_input.getText(((DefVarContext)_localctx).variable.start,((DefVarContext)_localctx).variable.stop):null),(((DefVarContext)_localctx).any!=null?_input.getText(((DefVarContext)_localctx).any.start,((DefVarContext)_localctx).any.stop):null));
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

	public static class InfoContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public List<SubHeaderContext> subHeader() {
			return getRuleContexts(SubHeaderContext.class);
		}
		public SubHeaderContext subHeader(int i) {
			return getRuleContext(SubHeaderContext.class,i);
		}
		public List<ContactsContext> contacts() {
			return getRuleContexts(ContactsContext.class);
		}
		public ContactsContext contacts(int i) {
			return getRuleContext(ContactsContext.class,i);
		}
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitInfo(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			name();
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				subHeader();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SHARP );
			setState(102);
			address();
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				contacts();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLOSE_ANGLE_BRACKET );
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
		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
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
	}

	public final SubHeaderContext subHeader() throws RecognitionException {
		SubHeaderContext _localctx = new SubHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(SHARP);
			setState(109);
			match(SHARP);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(110);
				match(SPACE);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			word_space();
			setState(117);
			match(NEWLINE);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(MarkdownGrammar.SHARP, 0); }
		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(SHARP);
			setState(120);
			word_space();
			setState(121);
			match(NEWLINE);
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

	public static class AddressContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(MarkdownGrammar.STAR, 0); }
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitAddress(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(STAR);
			setState(124);
			any();
			setState(125);
			match(NEWLINE);
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

	public static class ContactsContext extends ParserRuleContext {
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownGrammar.CLOSE_ANGLE_BRACKET, 0); }
		public IconContext icon() {
			return getRuleContext(IconContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public ContactsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contacts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterContacts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitContacts(this);
		}
	}

	public final ContactsContext contacts() throws RecognitionException {
		ContactsContext _localctx = new ContactsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contacts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(CLOSE_ANGLE_BRACKET);
			setState(128);
			icon();
			setState(129);
			any();
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				match(NEWLINE);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class BlockContext extends ParserRuleContext {
		public BlockNameContext blockName() {
			return getRuleContext(BlockNameContext.class,0);
		}
		public List<SubBlockContext> subBlock() {
			return getRuleContexts(SubBlockContext.class);
		}
		public SubBlockContext subBlock(int i) {
			return getRuleContext(SubBlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			blockName();
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				subBlock();
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << STAR) | (1L << SHARP) | (1L << SLASH) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
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

	public static class SubBlockContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TextBlockContext textBlock() {
			return getRuleContext(TextBlockContext.class,0);
		}
		public BlockSubNameContext blockSubName() {
			return getRuleContext(BlockSubNameContext.class,0);
		}
		public SubBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterSubBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitSubBlock(this);
		}
	}

	public final SubBlockContext subBlock() throws RecognitionException {
		SubBlockContext _localctx = new SubBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(141);
				blockSubName();
				}
			}

			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(144);
				list();
				}
				break;
			case 2:
				{
				setState(145);
				table();
				}
				break;
			case 3:
				{
				setState(146);
				textBlock();
				}
				break;
			}
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

	public static class TextBlockContext extends ParserRuleContext {
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<BoldTextContext> boldText() {
			return getRuleContexts(BoldTextContext.class);
		}
		public BoldTextContext boldText(int i) {
			return getRuleContext(BoldTextContext.class,i);
		}
		public List<ItalicTextContext> italicText() {
			return getRuleContexts(ItalicTextContext.class);
		}
		public ItalicTextContext italicText(int i) {
			return getRuleContext(ItalicTextContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public TextBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTextBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTextBlock(this);
		}
	}

	public final TextBlockContext textBlock() throws RecognitionException {
		TextBlockContext _localctx = new TextBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_textBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(149);
						any();
						}
						break;
					case 2:
						{
						setState(150);
						boldText();
						}
						break;
					case 3:
						{
						setState(151);
						italicText();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(157);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(156);
				match(NEWLINE);
				}
			}

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

	public static class BoldTextContext extends ParserRuleContext {
		public List<TerminalNode> STAR() { return getTokens(MarkdownGrammar.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(MarkdownGrammar.STAR, i);
		}
		public TerminalNode WORD() { return getToken(MarkdownGrammar.WORD, 0); }
		public BoldTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boldText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBoldText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBoldText(this);
		}
	}

	public final BoldTextContext boldText() throws RecognitionException {
		BoldTextContext _localctx = new BoldTextContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boldText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(STAR);
			setState(160);
			match(STAR);
			setState(161);
			match(WORD);
			setState(162);
			match(STAR);
			setState(163);
			match(STAR);
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

	public static class ItalicTextContext extends ParserRuleContext {
		public List<TerminalNode> STAR() { return getTokens(MarkdownGrammar.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(MarkdownGrammar.STAR, i);
		}
		public TerminalNode WORD() { return getToken(MarkdownGrammar.WORD, 0); }
		public ItalicTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italicText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterItalicText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitItalicText(this);
		}
	}

	public final ItalicTextContext italicText() throws RecognitionException {
		ItalicTextContext _localctx = new ItalicTextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_italicText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(STAR);
			setState(166);
			match(WORD);
			setState(167);
			match(STAR);
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

	public static class ListContext extends ParserRuleContext {
		public List<BlockListContext> blockList() {
			return getRuleContexts(BlockListContext.class);
		}
		public BlockListContext blockList(int i) {
			return getRuleContext(BlockListContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(169);
					blockList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(172); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BlockListContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(MarkdownGrammar.STAR, 0); }
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public List<BlockListCellContext> blockListCell() {
			return getRuleContexts(BlockListCellContext.class);
		}
		public BlockListCellContext blockListCell(int i) {
			return getRuleContext(BlockListCellContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public BlockListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlockList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlockList(this);
		}
	}

	public final BlockListContext blockList() throws RecognitionException {
		BlockListContext _localctx = new BlockListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blockList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(STAR);
			setState(175);
			any();
			setState(182);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(176);
				match(NEWLINE);
				}
				break;
			case SPACE:
				{
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(177);
					match(SPACE);
					}
					}
					setState(180); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				blockListCell();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLOSE_ANGLE_BRACKET );
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

	public static class BlockListCellContext extends ParserRuleContext {
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownGrammar.CLOSE_ANGLE_BRACKET, 0); }
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public IconContext icon() {
			return getRuleContext(IconContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public BlockListCellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockListCell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlockListCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlockListCell(this);
		}
	}

	public final BlockListCellContext blockListCell() throws RecognitionException {
		BlockListCellContext _localctx = new BlockListCellContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockListCell);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(CLOSE_ANGLE_BRACKET);
			setState(191);
			_la = _input.LA(1);
			if (_la==OPEN_CURLY) {
				{
				setState(190);
				icon();
				}
			}

			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(193);
				any();
				}
				break;
			}
			setState(202);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(196);
				match(NEWLINE);
				}
				break;
			case SPACE:
				{
				setState(198); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(197);
						match(SPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(200); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class TableContext extends ParserRuleContext {
		public TableHeaderContext tableHeader() {
			return getRuleContext(TableHeaderContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public TableBodyContext tableBody() {
			return getRuleContext(TableBodyContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			tableHeader();
			setState(205);
			match(NEWLINE);
			setState(206);
			tableBody();
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

	public static class TableBodyContext extends ParserRuleContext {
		public List<TableLineContext> tableLine() {
			return getRuleContexts(TableLineContext.class);
		}
		public TableLineContext tableLine(int i) {
			return getRuleContext(TableLineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public TableBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTableBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTableBody(this);
		}
	}

	public final TableBodyContext tableBody() throws RecognitionException {
		TableBodyContext _localctx = new TableBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(208);
					tableLine();
					setState(209);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(213); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IconContext extends ParserRuleContext {
		public boolean allow = true;
		public Token STAR_CLASS;
		public TerminalNode OPEN_CURLY() { return getToken(MarkdownGrammar.OPEN_CURLY, 0); }
		public TerminalNode WORD() { return getToken(MarkdownGrammar.WORD, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(MarkdownGrammar.CLOSE_CURLY, 0); }
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public TerminalNode STAR_CLASS() { return getToken(MarkdownGrammar.STAR_CLASS, 0); }
		public IconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_icon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterIcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitIcon(this);
		}
	}

	public final IconContext icon() throws RecognitionException {
		IconContext _localctx = new IconContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_icon);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(OPEN_CURLY);
			setState(216);
			match(WORD);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					match(SPACE);
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(223);
				((IconContext)_localctx).STAR_CLASS = match(STAR_CLASS);
				}
				break;
			}
			String s=(((IconContext)_localctx).STAR_CLASS!=null?((IconContext)_localctx).STAR_CLASS.getText():null); if(s!=null){String[] ints= s.split("/");float esquerda=Float.valueOf(ints[0].trim()); float direita=Float.valueOf(ints[1].trim()); if(esquerda>direita){System.err.println("Nr of stars cannot be bigger than total stars");((IconContext)_localctx).allow = false;}else ((IconContext)_localctx).allow = true;}
			setState(227);
			if (!(_localctx.allow)) throw new FailedPredicateException(this, "$allow");
			setState(228);
			match(CLOSE_CURLY);
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

	public static class TableHeaderContext extends ParserRuleContext {
		public List<Word_spaceContext> word_space() {
			return getRuleContexts(Word_spaceContext.class);
		}
		public Word_spaceContext word_space(int i) {
			return getRuleContext(Word_spaceContext.class,i);
		}
		public List<TerminalNode> HAT() { return getTokens(MarkdownGrammar.HAT); }
		public TerminalNode HAT(int i) {
			return getToken(MarkdownGrammar.HAT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public TableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTableHeader(this);
		}
	}

	public final TableHeaderContext tableHeader() throws RecognitionException {
		TableHeaderContext _localctx = new TableHeaderContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			word_space();
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				match(HAT);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(232);
					match(SPACE);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				word_space();
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HAT );
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

	public static class TableCellContext extends ParserRuleContext {
		public TablecontentContext tablecontent() {
			return getRuleContext(TablecontentContext.class,0);
		}
		public TerminalNode SPLIT() { return getToken(MarkdownGrammar.SPLIT, 0); }
		public TableCellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableCell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTableCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTableCell(this);
		}
	}

	public final TableCellContext tableCell() throws RecognitionException {
		TableCellContext _localctx = new TableCellContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableCell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			tablecontent();
			setState(244);
			match(SPLIT);
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

	public static class TableLineContext extends ParserRuleContext {
		public List<TableCellContext> tableCell() {
			return getRuleContexts(TableCellContext.class);
		}
		public TableCellContext tableCell(int i) {
			return getRuleContext(TableCellContext.class,i);
		}
		public TableLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTableLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTableLine(this);
		}
	}

	public final TableLineContext tableLine() throws RecognitionException {
		TableLineContext _localctx = new TableLineContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				tableCell();
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << SLASH) | (1L << OPEN_CURLY) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
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

	public static class BlockNameContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(MarkdownGrammar.SHARP, 0); }
		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public BlockNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlockName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlockName(this);
		}
	}

	public final BlockNameContext blockName() throws RecognitionException {
		BlockNameContext _localctx = new BlockNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_blockName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(SHARP);
			setState(252);
			word_space();
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				match(NEWLINE);
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class BlockSubNameContext extends ParserRuleContext {
		public List<TerminalNode> SHARP() { return getTokens(MarkdownGrammar.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}
		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public BlockSubNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSubName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlockSubName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlockSubName(this);
		}
	}

	public final BlockSubNameContext blockSubName() throws RecognitionException {
		BlockSubNameContext _localctx = new BlockSubNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_blockSubName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(SHARP);
			setState(259);
			match(SHARP);
			setState(260);
			word_space();
			setState(262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261);
				match(NEWLINE);
				}
				}
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class AnyContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(MarkdownGrammar.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(MarkdownGrammar.INT); }
		public TerminalNode INT(int i) {
			return getToken(MarkdownGrammar.INT, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(MarkdownGrammar.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MarkdownGrammar.SYMBOL, i);
		}
		public List<TerminalNode> ESCAPE() { return getTokens(MarkdownGrammar.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(MarkdownGrammar.ESCAPE, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitAny(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_any);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(276);
					switch (_input.LA(1)) {
					case WORD:
						{
						setState(266);
						match(WORD);
						}
						break;
					case INT:
						{
						setState(267);
						match(INT);
						}
						break;
					case SYMBOL:
						{
						setState(268);
						match(SYMBOL);
						}
						break;
					case ESCAPE:
						{
						setState(269);
						match(ESCAPE);
						}
						break;
					case SPACE:
						{
						setState(271); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(270);
								match(SPACE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(273); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case SLASH:
						{
						setState(275);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(278); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TablecontentContext extends ParserRuleContext {
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public IconContext icon() {
			return getRuleContext(IconContext.class,0);
		}
		public TablecontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablecontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTablecontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTablecontent(this);
		}
	}

	public final TablecontentContext tablecontent() throws RecognitionException {
		TablecontentContext _localctx = new TablecontentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tablecontent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					match(SPACE);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(287);
			_la = _input.LA(1);
			if (_la==OPEN_CURLY) {
				{
				setState(286);
				icon();
				}
			}

			setState(289);
			any();
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

	public static class VariableContext extends ParserRuleContext {
		public boolean defined = false;
		public Token WORD;
		public TerminalNode SLASH() { return getToken(MarkdownGrammar.SLASH, 0); }
		public TerminalNode WORD() { return getToken(MarkdownGrammar.WORD, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(SLASH);
			setState(292);
			((VariableContext)_localctx).WORD = match(WORD);
			((VariableContext)_localctx).defined = data.Utils.isDefined(variables,(((VariableContext)_localctx).WORD!=null?((VariableContext)_localctx).WORD.getText():null));
			if(_localctx.defined)System.out.println("Variable "+(((VariableContext)_localctx).WORD!=null?((VariableContext)_localctx).WORD.getText():null)+"is not defined!");
			setState(294);
			if (!(_localctx.defined)) throw new FailedPredicateException(this, "$defined");
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

	public static class Word_spaceContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(MarkdownGrammar.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(MarkdownGrammar.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MarkdownGrammar.SYMBOL, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public Word_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterWord_space(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitWord_space(this);
		}
	}

	public final Word_spaceContext word_space() throws RecognitionException {
		Word_spaceContext _localctx = new Word_spaceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_word_space);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(296);
				_la = _input.LA(1);
				if ( !(_la==SYMBOL || _la==WORD) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(297);
					match(SPACE);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SYMBOL || _la==WORD );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return icon_sempred((IconContext)_localctx, predIndex);
		case 25:
			return variable_sempred((VariableContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean icon_sempred(IconContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _localctx.allow;
		}
		return true;
	}
	private boolean variable_sempred(VariableContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return _localctx.defined;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\u0136\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\2"+
		"\6\2B\n\2\r\2\16\2C\3\2\3\2\3\2\6\2I\n\2\r\2\16\2J\6\2M\n\2\r\2\16\2N"+
		"\3\3\3\3\7\3S\n\3\f\3\16\3V\13\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\6\4e\n\4\r\4\16\4f\3\4\3\4\6\4k\n\4\r\4\16\4l\3\5\3"+
		"\5\3\5\7\5r\n\5\f\5\16\5u\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\6\b\u0086\n\b\r\b\16\b\u0087\3\t\3\t\6\t\u008c\n"+
		"\t\r\t\16\t\u008d\3\n\5\n\u0091\n\n\3\n\3\n\3\n\5\n\u0096\n\n\3\13\3\13"+
		"\3\13\6\13\u009b\n\13\r\13\16\13\u009c\3\13\5\13\u00a0\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\6\16\u00ad\n\16\r\16\16\16\u00ae\3"+
		"\17\3\17\3\17\3\17\6\17\u00b5\n\17\r\17\16\17\u00b6\5\17\u00b9\n\17\3"+
		"\17\6\17\u00bc\n\17\r\17\16\17\u00bd\3\20\3\20\5\20\u00c2\n\20\3\20\5"+
		"\20\u00c5\n\20\3\20\3\20\6\20\u00c9\n\20\r\20\16\20\u00ca\5\20\u00cd\n"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\6\22\u00d6\n\22\r\22\16\22\u00d7"+
		"\3\23\3\23\3\23\7\23\u00dd\n\23\f\23\16\23\u00e0\13\23\3\23\5\23\u00e3"+
		"\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00ec\n\24\f\24\16\24\u00ef"+
		"\13\24\3\24\6\24\u00f2\n\24\r\24\16\24\u00f3\3\25\3\25\3\25\3\26\6\26"+
		"\u00fa\n\26\r\26\16\26\u00fb\3\27\3\27\3\27\6\27\u0101\n\27\r\27\16\27"+
		"\u0102\3\30\3\30\3\30\3\30\6\30\u0109\n\30\r\30\16\30\u010a\3\31\3\31"+
		"\3\31\3\31\3\31\6\31\u0112\n\31\r\31\16\31\u0113\3\31\6\31\u0117\n\31"+
		"\r\31\16\31\u0118\3\32\7\32\u011c\n\32\f\32\16\32\u011f\13\32\3\32\5\32"+
		"\u0122\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u012d\n"+
		"\34\f\34\16\34\u0130\13\34\6\34\u0132\n\34\r\34\16\34\u0133\3\34\2\2\35"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\3\3\2\21"+
		"\22\u0147\2;\3\2\2\2\4P\3\2\2\2\6b\3\2\2\2\bn\3\2\2\2\ny\3\2\2\2\f}\3"+
		"\2\2\2\16\u0081\3\2\2\2\20\u0089\3\2\2\2\22\u0090\3\2\2\2\24\u009a\3\2"+
		"\2\2\26\u00a1\3\2\2\2\30\u00a7\3\2\2\2\32\u00ac\3\2\2\2\34\u00b0\3\2\2"+
		"\2\36\u00bf\3\2\2\2 \u00ce\3\2\2\2\"\u00d5\3\2\2\2$\u00d9\3\2\2\2&\u00e8"+
		"\3\2\2\2(\u00f5\3\2\2\2*\u00f9\3\2\2\2,\u00fd\3\2\2\2.\u0104\3\2\2\2\60"+
		"\u0116\3\2\2\2\62\u011d\3\2\2\2\64\u0125\3\2\2\2\66\u0131\3\2\2\28:\5"+
		"\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\5"+
		"\6\4\2?A\7\f\2\2@B\7\5\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DL\3"+
		"\2\2\2EF\5\20\t\2FH\7\f\2\2GI\7\5\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK"+
		"\3\2\2\2KM\3\2\2\2LE\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\3\3\2\2\2"+
		"PT\5\64\33\2QS\7\3\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2"+
		"\2VT\3\2\2\2W[\7\17\2\2XZ\7\3\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2"+
		"\2\2\\^\3\2\2\2][\3\2\2\2^_\5\60\31\2_`\7\5\2\2`a\b\3\1\2a\5\3\2\2\2b"+
		"d\5\n\6\2ce\5\b\5\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2"+
		"hj\5\f\7\2ik\5\16\b\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\7\3\2\2"+
		"\2no\7\b\2\2os\7\b\2\2pr\7\3\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2"+
		"\2tv\3\2\2\2us\3\2\2\2vw\5\66\34\2wx\7\5\2\2x\t\3\2\2\2yz\7\b\2\2z{\5"+
		"\66\34\2{|\7\5\2\2|\13\3\2\2\2}~\7\7\2\2~\177\5\60\31\2\177\u0080\7\5"+
		"\2\2\u0080\r\3\2\2\2\u0081\u0082\7\6\2\2\u0082\u0083\5$\23\2\u0083\u0085"+
		"\5\60\31\2\u0084\u0086\7\5\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\17\3\2\2\2\u0089\u008b"+
		"\5,\27\2\u008a\u008c\5\22\n\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\21\3\2\2\2\u008f\u0091"+
		"\5.\30\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0095\3\2\2\2\u0092"+
		"\u0096\5\32\16\2\u0093\u0096\5 \21\2\u0094\u0096\5\24\13\2\u0095\u0092"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\23\3\2\2\2\u0097"+
		"\u009b\5\60\31\2\u0098\u009b\5\26\f\2\u0099\u009b\5\30\r\2\u009a\u0097"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\7\5"+
		"\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\25\3\2\2\2\u00a1\u00a2"+
		"\7\7\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5\7\7\2\2"+
		"\u00a5\u00a6\7\7\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\7\7\2\2\u00a8\u00a9"+
		"\7\22\2\2\u00a9\u00aa\7\7\2\2\u00aa\31\3\2\2\2\u00ab\u00ad\5\34\17\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\33\3\2\2\2\u00b0\u00b1\7\7\2\2\u00b1\u00b8\5\60\31\2\u00b2"+
		"\u00b9\7\5\2\2\u00b3\u00b5\7\3\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b2\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\5\36"+
		"\20\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00c1\7\6\2\2\u00c0\u00c2\5$\23"+
		"\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5"+
		"\5\60\31\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cc\3\2\2\2"+
		"\u00c6\u00cd\7\5\2\2\u00c7\u00c9\7\3\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00c6\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\37\3\2\2\2\u00ce\u00cf\5&\24"+
		"\2\u00cf\u00d0\7\5\2\2\u00d0\u00d1\5\"\22\2\u00d1!\3\2\2\2\u00d2\u00d3"+
		"\5*\26\2\u00d3\u00d4\7\5\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8#\3\2\2\2"+
		"\u00d9\u00da\7\n\2\2\u00da\u00de\7\22\2\2\u00db\u00dd\7\3\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\7\24\2\2\u00e2\u00e1\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b\23\1\2\u00e5"+
		"\u00e6\6\23\2\3\u00e6\u00e7\7\13\2\2\u00e7%\3\2\2\2\u00e8\u00f1\5\66\34"+
		"\2\u00e9\u00ed\7\r\2\2\u00ea\u00ec\7\3\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f2\5\66\34\2\u00f1\u00e9\3\2\2\2\u00f2\u00f3\3"+
		"\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\'\3\2\2\2\u00f5\u00f6"+
		"\5\62\32\2\u00f6\u00f7\7\16\2\2\u00f7)\3\2\2\2\u00f8\u00fa\5(\25\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc+\3\2\2\2\u00fd\u00fe\7\b\2\2\u00fe\u0100\5\66\34\2\u00ff\u0101"+
		"\7\5\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103-\3\2\2\2\u0104\u0105\7\b\2\2\u0105\u0106\7\b\2\2"+
		"\u0106\u0108\5\66\34\2\u0107\u0109\7\5\2\2\u0108\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b/\3\2\2\2\u010c"+
		"\u0117\7\22\2\2\u010d\u0117\7\23\2\2\u010e\u0117\7\21\2\2\u010f\u0117"+
		"\7\20\2\2\u0110\u0112\7\3\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2"+
		"\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0117"+
		"\5\64\33\2\u0116\u010c\3\2\2\2\u0116\u010d\3\2\2\2\u0116\u010e\3\2\2\2"+
		"\u0116\u010f\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\61\3\2\2\2\u011a"+
		"\u011c\7\3\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0122\5$\23\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0124\5\60\31\2\u0124\63\3\2\2\2\u0125\u0126\7\t\2\2\u0126"+
		"\u0127\7\22\2\2\u0127\u0128\b\33\1\2\u0128\u0129\6\33\3\3\u0129\65\3\2"+
		"\2\2\u012a\u012e\t\2\2\2\u012b\u012d\7\3\2\2\u012c\u012b\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0131\u012a\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\67\3\2\2\2);CJNT[fls\u0087\u008d"+
		"\u0090\u0095\u009a\u009c\u009f\u00ae\u00b6\u00b8\u00bd\u00c1\u00c4\u00ca"+
		"\u00cc\u00d7\u00de\u00e2\u00ed\u00f3\u00fb\u0102\u010a\u0113\u0116\u0118"+
		"\u011d\u0121\u012e\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}