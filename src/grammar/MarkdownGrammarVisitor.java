// Generated from C:/Users/diogo/IdeaProjects/markdown-cv/src/grammar\MarkdownGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MarkdownGrammar}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MarkdownGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#cv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCv(MarkdownGrammar.CvContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo(MarkdownGrammar.InfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#subHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubHeader(MarkdownGrammar.SubHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MarkdownGrammar.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress(MarkdownGrammar.AddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#contacts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContacts(MarkdownGrammar.ContactsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MarkdownGrammar.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#subBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubBlock(MarkdownGrammar.SubBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(MarkdownGrammar.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#blockList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockList(MarkdownGrammar.BlockListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#blockListCell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockListCell(MarkdownGrammar.BlockListCellContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(MarkdownGrammar.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#tableBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableBody(MarkdownGrammar.TableBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#icon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIcon(MarkdownGrammar.IconContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#boldText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldText(MarkdownGrammar.BoldTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#tableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableHeader(MarkdownGrammar.TableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#tableCell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCell(MarkdownGrammar.TableCellContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#tableLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLine(MarkdownGrammar.TableLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#blockName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockName(MarkdownGrammar.BlockNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#blockSubName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSubName(MarkdownGrammar.BlockSubNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(MarkdownGrammar.AnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#tablecontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablecontent(MarkdownGrammar.TablecontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownGrammar#word_space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord_space(MarkdownGrammar.Word_spaceContext ctx);
}