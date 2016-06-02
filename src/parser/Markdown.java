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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Markdown {
    public static Settings settings;
    private String file2Parse;
    private String outputFile;

    public Markdown(String s, String out) {
        settings = new Settings(Settings.Color.RED, "resumeTest");
        file2Parse = System.getProperty("user.dir") + "/" + s;
        outputFile = System.getProperty("user.dir") + "/" + out;
        String outputFolder = outputFile + "/" + settings.getPdfName();

        if (!data.Utils.dirExists(outputFolder)) {
            data.Utils.createDir(outputFolder);
        }
    }

    public static void main(String[] args) {
        String file2Parse = "resources/mdfiles/cv.md";
        String out = "resources\\generated";
        Markdown md = new Markdown(file2Parse, out);
        md.parseFile();
        //md.generatePdf();
    }

    public void parseFile() {
        try {
            System.out.println("Parsing file: " + file2Parse);

            // Create a scanner that reads from the input stream passed to us
            Lexer lexer = new MarkdownLexer(new ANTLRFileStream(this.file2Parse));

            CommonTokenStream tokens = new CommonTokenStream(lexer);
//			long start = System.currentTimeMillis();
//			tokens.fill(); // load all and check time
//			long stop = System.currentTimeMillis();
//			lexerTime += stop-start;

            // Create a parser that reads from the scanner
            MarkdownGrammar parser = new MarkdownGrammar(tokens);
            //if (diag) parser.addErrorListener(new DiagnosticErrorListener());
            //if (bail) parser.setErrorHandler(new BailErrorStrategy());
            //if (SLL) parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

            // start parsing at the compilationUnit rule
            ParserRuleContext t = parser.cv();
            if (settings.isPrintTree()) System.out.println(t.toStringTree(parser));

            generateLatexCode(parser.cv);

            generatePdf();

        } catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
    }

    private void generateLatexCode(Cv cv) {
        new MainBuilder(cv).buildTex();
        new HeaderBuilder(cv.info).buildTex();
        //new BlockBuilder(cv.blocks.get(1)).buildTex();

        for (Block b : cv.blocks) {
            new BlockBuilder(b).buildTex();
        }
        //Iterative
        /*ExecutorService executor = Executors.newFixedThreadPool(4);

        for (Block b : cv.blocks) {
            Runnable worker = new BlockBuilder(b);
            executor.execute(worker);
        }

        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
*/

    }

    private void generatePdf() {
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "cd " + this.outputFile + "&& xelatex " + settings.getPdfName() + ".tex");
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

    }
}