package code_generation;

import data.Info;
import parser.Markdown;
import parser.Settings;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by inesa on 21/05/2016.
 */
public class HeaderBuilder implements TexBuilder {
    private final Info info;
    private FileOutputStream out;

    public HeaderBuilder(Info info) {
        this.out = null;
        this.info = info;

        try {
            out = new FileOutputStream(FILES_LOCATION + Markdown.settings.getPdfName()+"/header.tex");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void buildTex() {
        //NAME
        String[] splited = info.getName().split(" ");
        String s = "\n" + "\\" + "name";

        for (int i = 0; i < splited.length; i++) {
            s += "{" + splited[i] + "}";
        }
        //POSITION

        s += "\n" + "\\" + "position" + "{";
        for (int i = 0; i < info.getSub().size() - 1; i++) {
            s += info.getSub().get(i) + "{\\enskip\\cdotp\\enskip}";
        }
        s += info.getSub().get(info.getSub().size() - 1) + "}";

        //ADDRESS
        s += "\n \\address{" + info.getAddress() + "}";

        //CONTACTS
        for (int i = 0; i < info.getContacts().size(); i++) {
            s += "\n" + "\\" + info.getContacts().get(i).icon.name + "{" + info.getContacts().get(i).text + "}";
        }

        try {
            out.write(s.getBytes());
            closeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFile() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
