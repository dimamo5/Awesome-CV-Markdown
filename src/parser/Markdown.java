package parser;

import code_generation.HeaderBuilder;
import code_generation.MainBuilder;
import grammar.MarkdownGrammar;
import grammar.MarkdownLexer;
import org.antlr.v4.runtime.*;

import java.io.*;

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
        Markdown md=new Markdown(file2Parse,out);
        md.parseFile();
        md.generatePdf();
    }

    public Markdown(String s,String out){
        settings=new Settings(Settings.Color.RED,"resume");
        file2Parse= System.getProperty("user.dir")+"/"+s;
        outputFile=System.getProperty("user.dir")+"/"+out;
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

            //new HeaderBuilder(parser.cv.info).buildTex();
            new MainBuilder(parser.cv,settings.getPdfName()).buildTex();


        } catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
    }

    private void generatePdf() {
        ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c","cd "+this.outputFile+ "&& xelatex "+ settings.getPdfName()+".tex");
        pb.redirectOutput();
        Process p = null;
        try {
            p = pb.start();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = "";
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}