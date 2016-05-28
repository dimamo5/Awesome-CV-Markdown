package parser;

import code_generation.FooterBuilder;
import code_generation.HeaderBuilder;
import grammar.MarkdownGrammar;
import grammar.MarkdownLexer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionMode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/* This more or less duplicates the functionality of grun (TestRig) but it
 * has a few specific options for benchmarking like -x2 and -threaded.
 * It also allows directory names as commandline arguments. The simplest test is
 * for the current directory:
~/antlr/code/grammars-v4/java $ java Test .
/Users/parrt/antlr/code/grammars-v4/java/./JavaBaseListener.java
/Users/parrt/antlr/code/grammars-v4/java/./JavaLexer.java
/Users/parrt/antlr/code/grammars-v4/java/./JavaListener.java
/Users/parrt/antlr/code/grammars-v4/java/./JavaParser.java
/Users/parrt/antlr/code/grammars-v4/java/./Test.java
Total lexer+parser time 1867ms.
 */
class Markdown {
    private Settings settings;
    private String file2Parse;
    private String outputFile;

    public static void main(String[] args) {
        String file2Parse = "resources/mdfiles/cv.md";
        String out="resources\\generated";
        new Markdown(file2Parse,out).parseFile();
    }

    public Markdown(String s,String out){
        settings=new Settings(Settings.Color.RED);
        file2Parse= System.getProperty("user.dir")+"/resources/"+s;
        outputFile=System.getProperty("user.dir")+out;
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

            new HeaderBuilder(parser.cv.info).buildTex();
            new FooterBuilder(parser.cv.info.getName()).buildTex();

            ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c","cd "+this.outputFile+ "&& xelatex resume.tex");
            pb.redirectOutput();
            Process p = pb.start();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = "";
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }

            //MarkdownGrammarBaseVisitor x = new MarkdownGrammarBaseVisitor();
            //x.visitInfo(parser.info());
        } catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
    }
}