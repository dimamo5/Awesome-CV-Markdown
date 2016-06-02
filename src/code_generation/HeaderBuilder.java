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
    private String headerCode;

    public HeaderBuilder(Info info) {
        this.out = null;
        this.info = info;

        try {
            out = new FileOutputStream(FILES_LOCATION + Markdown.settings.getPdfName() + "/header.tex");

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
            out.write(s.getBytes("UTF-8"));
            closeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getHeaderCode() {
        if (headerCode == null || headerCode.isEmpty()) {
            buildHtml();
        }
        return headerCode;
    }

    @Override
    public void buildHtml() {
        headerCode = "<header>\n" +
                "<h1>";
        //NAME
        String[] names = info.getName().split(" ");
        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                headerCode += "<strong>" + names[i] + "</strong></h1>\n";
            } else
                headerCode += names[i] + " ";
        }

        //POSITION
        headerCode += "<h3>";
        for (int i = 0; i < info.getSub().size(); i++) {
            if (i == info.getSub().size() - 1)
                headerCode += info.getSub().get(i) + " ";
            else
                headerCode += info.getSub().get(i) + "&middot; ";
        }
        headerCode += "</h3>\n";

        //ADDRESS
        headerCode += "<h3 id=\"address\">" + info.getAddress() + "</h3>\n";

        //CONTACTS
        for (int i = 0; i < info.getContacts().size(); i++) {
            headerCode += new IconTextBuilder(info.getContacts().get(i)).getIconTextCode(Settings.LanguageOutput.HTML) + " | ";
        }

        headerCode += "\n</header>\n\n";
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
