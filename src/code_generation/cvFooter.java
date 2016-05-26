package code_generation;

import data.Cv;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * Created by inesa on 21/05/2016.
 */
public class CvFooter {

    public CvFooter(Cv cv) throws IOException {
        FileOutputStream out = null;

        try {
            out = new FileOutputStream(Paths.get("").toAbsolutePath().toString() + "/resources/CvFooter.tex");

            //Personal info!
            String[] splited = cv.info.getName().split(" ");
            String s = "\n" + "\\" + "makecvfooter";

            s += "\n" + "{\\today}";
            s += "\n" + "{" + cv.info.getName() + "~~~·~~~Résumé}";
            s+= "\n" + "{\\thepage}";

            out.write(s.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

}
