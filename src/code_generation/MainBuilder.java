package code_generation;

import data.Block;
import data.Cv;
import data.Utils;
import parser.Markdown;

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
        this.pdfName = Markdown.settings.getPdfName();
        this.outPath = new File(TexBuilder.FILES_LOCATION + pdfName + ".tex");

    }

    @Override
    public void buildTex() {
        // TODO: 02/06/2016 verificar isto
        String fileBeginning = "\\documentclass[11pt, a4paper]{awesome-cv}\n" +
                "\\geometry{left=1.4cm, top=.8cm, right=1.4cm, bottom=1.8cm, footskip=.5cm}\n" +
                "\\fontdir[fonts/]\n" +
                "\\colorlet{awesome}{" + Markdown.settings.getColorCode() + "}\n" +
                //"\\setbool{acvSectionColorHighlight}{true}\n" +
                //"\\renewcommand{\\acvHeaderSocialSep}{\\quad\\textbar\\quad}\n" +
                "\\usepackage[table]{xcolor}\n" +
                "\\usepackage{tabularx}" +
                "\\input{" + pdfName + "/header.tex}\n";        //Header of the pdf

        String footer = "\t{\\today}\n" + "\t{" + cv.info.getName() + "~~~·~~~Résumé}\n" + "\t{\\thepage}\n";

        String blocks = "";
        for (Block b : cv.blocks) {
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

}
