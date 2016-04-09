// Generated from C:/Users/diogo/IdeaProjects/markdown-cv/src/grammar\MarkdownGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarkdownGrammar}.
 */
public interface MarkdownGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarkdownGrammar#cv}.
	 * @param ctx the parse tree
	 */
	void enterCv(MarkdownGrammar.CvContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownGrammar#cv}.
	 * @param ctx the parse tree
	 */
	void exitCv(MarkdownGrammar.CvContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownGrammar#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(MarkdownGrammar.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownGrammar#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(MarkdownGrammar.InfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownGrammar#subHeader}.
	 * @param ctx the parse tree
	 */
	void enterSubHeader(MarkdownGrammar.SubHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownGrammar#subHeader}.
	 * @param ctx the parse tree
	 */
	void exitSubHeader(MarkdownGrammar.SubHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownGrammar#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(MarkdownGrammar.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownGrammar#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(MarkdownGrammar.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownGrammar#contacts}.
	 * @param ctx the parse tree
	 */
	void enterContacts(MarkdownGrammar.ContactsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownGrammar#contacts}.
	 * @param ctx the parse tree
	 */
	void exitContacts(MarkdownGrammar.ContactsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownGrammar#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MarkdownGrammar.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownGrammar#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MarkdownGrammar.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownGrammar#icon}.
	 * @param ctx the parse tree
	 */
	void enterIcon(MarkdownGrammar.IconContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownGrammar#icon}.
	 * @param ctx the parse tree
	 */
	void exitIcon(MarkdownGrammar.IconContext ctx);
}