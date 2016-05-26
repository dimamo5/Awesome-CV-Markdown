package code_generation;

import data.Info;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by inesa on 21/05/2016.
 */
public class HeaderBuilder implements TexBuilder {
    private FileOutputStream out;
    private Info info;

    public HeaderBuilder(Info info) throws IOException {
        this.out = null;
        this.info = info;

        try {
            out = new FileOutputStream(FILES_LOCATION + "header.tex");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void buildTex() {
        //Personal info!
        String[] splited = info.getName().split(" ");
        String s = "\n" + "\\" + "name";

        for (int i = 0; i < splited.length; i++) {
            s += "{" + splited[i] + "}";
        }

        // \position{Software Engineer{\enskip\cdotp\enskip}Security Expert}

        s += "\n" + "\\" + "position" + "{";
        for (int i = 0; i < info.getSub().size() - 1; i++) {
            s += info.getSub().get(i) + "{\\enskip\\cdotp\\enskip}";
        }

        s += info.getSub().get(info.getSub().size() - 1) + "}";

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