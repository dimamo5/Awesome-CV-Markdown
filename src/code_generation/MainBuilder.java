package code_generation;

import data.Block;
import data.Cv;
import data.Utils;
import parser.Markdown;
import parser.Settings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by diogo on 29/05/2016.
 */
public class MainBuilder implements TexBuilder {
    private String pdfName;
    private Cv cv;
    private File outPath;

    public MainBuilder(Cv cv) {
        this.cv = cv;
        this.pdfName = Markdown.settings.getFileName();
        String outPath = TexBuilder.FILES_LOCATION + pdfName;
        if (Markdown.settings.getOutput() == Settings.LanguageOutput.HTML)
            outPath += ".html";
        else if (Markdown.settings.getOutput() == Settings.LanguageOutput.TEX)
            outPath += ".tex";
        this.outPath = new File(outPath);

    }

    @Override
    public void buildTex() {
        String fileBeginning = "\\documentclass[11pt, a4paper]{awesome-cv}\n" +
                "\\geometry{left=1.4cm, top=.8cm, right=1.4cm, bottom=1.8cm, footskip=.5cm}\n" +
                "\\fontdir[fonts/]\n" +
                "\\colorlet{awesome}{" + Markdown.settings.getColorCode(Settings.LanguageOutput.TEX) + "}\n" +
                "\\setbool{acvSectionColorHighlight}{true}\n" +
                "\\renewcommand{\\acvHeaderSocialSep}{\\quad\\textbar\\quad}\n" +
                "\\input{" + pdfName + "/header.tex}\n";        //Header of the pdf

        String footer = "\t{\\today}\n" + "\t{" + cv.info.getName() + "~~~·~~~Résumé}\n" + "\t{\\thepage}\n";

        String blocks = "";
        for (Block b : cv.blocks) {
            if (b.isSelected())
                blocks += "\\input{" + pdfName + "/" + Utils.formatAuxFile(b.getBlockName()) + ".tex}\n";
        }

        String body = "\\begin{document}\n" +
                "\\makecvheader\n" + "\\makecvfooter" + footer + blocks + "\\end{document}\n";


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outPath));
            writer.write(fileBeginning);
            writer.newLine();
            writer.write(body);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void buildHtml() {
        String headHtml = "<!DOCTYPE html>\n<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <meta name=\"description\" content=\"\">\n" +
                "    <meta name=\"author\" content=\"CodeCats\">\n" +
                "\n" +
                "    <title>" + cv.info.getName() + "</title>\n" +
                "\n" +
                "    <!-- Bootstrap Core CSS -->\n" +
                "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min" +
                ".css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" " +
                "crossorigin=\"anonymous\">\n" +
                "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" " +
                "integrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\" " +
                "crossorigin=\"anonymous\"></script>\n" +

                "    <!-- Custom Fonts -->\n" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome" +
                ".min.css\">\n" +
                "<link href='https://fonts.googleapis.com/css?family=Roboto:400,900,700' rel='stylesheet' " +
                "type='text/css'>" +
                "\n" +
                "    <!-- Custom CSS -->\n" +
                "    <link rel=\"stylesheet\" href=\"resume.css\" type=\"text/css\">\n" +
                "\n" +
                "</head>";

        String body = "<body><div class=\"container\">";

        String headerHtml = new HeaderBuilder(cv.info).getHeaderCode();

        String blocks = "";
        for (Block b : cv.blocks) {
            if (b.isSelected())
                blocks += new BlockBuilder(b).getBlockCode() + "\n\n";
        }

        String footer = "</div></body></html>";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outPath));
            writer.write(headHtml);
            writer.newLine();
            writer.write(body);
            writer.write(headerHtml);
            writer.newLine();
            writer.write(blocks);
            writer.write(footer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
