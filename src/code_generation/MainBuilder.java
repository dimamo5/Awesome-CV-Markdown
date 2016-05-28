package code_generation;

import data.Block;
import data.Cv;

import java.io.*;

/**
 * Created by diogo on 29/05/2016.
 */
public class MainBuilder implements TexBuilder {
    private Cv cv;
    String pdfName;
    private FileOutputStream out;

    public MainBuilder(Cv cv, String pdfName){
        this.cv=cv;
        this.pdfName=pdfName;
        this.out=null;

        try {
            this.out=new FileOutputStream(new File(TexBuilder.FILES_LOCATION));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void buildTex() {
        String fileBeginning="\\documentclass[11pt, a4paper]{awesome-cv}\n"+
                "\\geometry{left=1.4cm, top=.8cm, right=1.4cm, bottom=1.8cm, footskip=.5cm}\n"+
                "\\fontdir[fonts/]\n"+
                "\\colorlet{awesome}{awesome-red}\n"+
                "\\setbool{acvSectionColorHighlight}{true}\n"+
                "\\renewcommand{\\acvHeaderSocialSep}{\\quad\\textbar\\quad}\n"+
                "\\input{"+pdfName+"/header.tex}\n";        //Header of the pdf

        String footer ="\t{\\today}\n"+"\t{"+cv.info.getName()+"~~~·~~~Résumé}\n"+"\t{\\thepage}\n";

        String blocks="";
        for(Block b:cv.blocks){
            blocks+="\\input{"+pdfName+"/"+b.getBlockName()+".tex}\n";
        }

        String body = "\\begin{document}\n"+
                "\\makecvheader\n"+"\\makecvfooter"+footer+blocks+"\\end{document}\n";



        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(TexBuilder.FILES_LOCATION)+pdfName));
            writer.write(fileBeginning);
            writer.newLine();
            writer.write(body);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void closeFile() {
        try {
            this.out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
