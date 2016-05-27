package code_generation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by diogo on 27/05/2016.
 */
public class FooterBuilder implements TexBuilder {
    private String name;
    private FileOutputStream out;

    public FooterBuilder(String name){
        this.name=name;
        try {
            out = new FileOutputStream(FILES_LOCATION + "footer.tex");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void buildTex() {
        String s =String.format("\t{today}\n\t{%s~~~·~~~Résumé}\n\t{\thepage}\n", this.name); ;

        try {
            out.write(s.getBytes());
            closeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
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
