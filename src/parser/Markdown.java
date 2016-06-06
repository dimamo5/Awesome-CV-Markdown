package parser;

import code_generation.BlockBuilder;
import code_generation.HeaderBuilder;
import code_generation.MainBuilder;
import data.Block;
import data.Cv;
import grammar.MarkdownGrammar;
import grammar.MarkdownGrammarBaseListener;
import grammar.MarkdownLexer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

import static code_generation.TexBuilder.FILES_LOCATION;

public class Markdown {
    public static Settings settings;
    public static boolean abort = false;
    private Cv cv;

    public Markdown(Settings set) {
        settings = set;

        if (!data.Utils.dirExists(FILES_LOCATION + settings.getFileName())) {
            data.Utils.createDir(FILES_LOCATION + settings.getFileName());
        }

        //Parses file and creates CV structure
        parseFile();
    }

    public static void main(String[] args) {
        Settings set = CLI.consoleGetSettings();
        Markdown md = new Markdown(set);
        //md.generateCv();
    }

    public void generateCv() {
        if (!abort) {
            new CLI(this.cv).consoleGetBlocks();
            generateLatexCode(cv);
            generatePdf();
            generateHtml(this.cv);
        }
    }

    private void parseFile() {
        try {
            System.out.println("Parsing file: " + settings.getFileName());

            // Create a scanner that reads from the input stream passed to us
            Lexer lexer = new MarkdownLexer(new ANTLRFileStream(settings.getFilePath().getAbsolutePath()));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser that reads from the scanner
            MarkdownGrammar parser = new MarkdownGrammar(tokens);
            parser.addErrorListener(new ANTLRErrorListener() {

                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s,
                                        RecognitionException e) {
                    abort = true;
                    System.out.println(e);

                }


                @Override
                public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet,
                                            ATNConfigSet atnConfigSet) {

                }

                @Override
                public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet,
                                                        ATNConfigSet atnConfigSet) {

                }

                @Override
                public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet
                        atnConfigSet) {

                }
            });


            // start parsing at the compilationUnit rule
            ParserRuleContext tree = parser.cv();
            if (settings.isPrintTree()) System.out.println(tree.toStringTree(parser));

            // Walk it and attach our listener
            ParseTreeWalker walker = new ParseTreeWalker();
            MarkdownGrammarBaseListener listener = new MarkdownGrammarBaseListener();
            walker.walk(listener, tree);

            this.cv = listener.cv;

        } catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
    }

    private void generateLatexCode(Cv cv) {
        settings.setOutput(Settings.LanguageOutput.TEX);

        new MainBuilder(cv).buildTex();
        new HeaderBuilder(cv.info).buildTex();

        for (Block b : cv.blocks) {
            if (b.isSelected())
                new BlockBuilder(b).buildTex();
        }

    }

    private void generatePdf() {

        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "cd " + FILES_LOCATION + "&& xelatex " + settings
                .getFileName() + ".tex");
        pb.redirectOutput();
        Process p = null;
        try {
            p = pb.start();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File f = new File(FILES_LOCATION + settings.getFileName() + ".pdf");
        try {
            Desktop.getDesktop().browse(f.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void generateHtml(Cv cv) {
        settings.setOutput(Settings.LanguageOutput.HTML);

        System.out.println("HTML FILE GENERATED");
        new MainBuilder(cv).buildHtml();

        File f = new File(FILES_LOCATION + settings.getFileName() + ".html");
        try {
            Desktop.getDesktop().browse(f.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}