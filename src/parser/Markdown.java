package parser;

import code_generation.BlockBuilder;
import code_generation.HeaderBuilder;
import code_generation.MainBuilder;
import data.Block;
import data.Cv;
import grammar.MarkdownGrammar;
import grammar.MarkdownLexer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import static code_generation.TexBuilder.FILES_LOCATION;

public class Markdown {
    public static Settings settings;
    private String file2Parse;
    private String outputFile;
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
        md.generateCv();

    }

    public void generateCv() {
        new CLI(this.cv).consoleGetBlocks();
        generateLatexCode(cv);
        generatePdf();
        generateHtml(this.cv);
    }

    private void parseFile() {
        try {
            System.out.println("Parsing file: " + settings.getFileName());

            // Create a scanner that reads from the input stream passed to us
            Lexer lexer = new MarkdownLexer(new ANTLRFileStream(settings.getFilePath().getAbsolutePath()));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser that reads from the scanner
            MarkdownGrammar parser = new MarkdownGrammar(tokens);

            // start parsing at the compilationUnit rule
            ParserRuleContext t = parser.cv();
            if (settings.isPrintTree()) System.out.println(t.toStringTree(parser));

            this.cv = parser.cv;

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