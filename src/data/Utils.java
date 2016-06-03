package data;

import java.io.File;

/**
 * Created by diogo on 13/05/2016.
 */
public class Utils {
    public static String analyzeEscape(String s) {
        if (s != null) {
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '\\') {
                    sb.deleteCharAt(i);
                    i++;
                }
            }
            return sb.toString().trim();
        } else return null;
    }

    public static boolean dirExists(String s) {
        File f = new File(s);
        return f.exists() && f.isDirectory();
    }

    public static void createDir(String s) {
        File f = new File(s);
        f.mkdir();
    }

    public static String formatAuxFile(String s) {
        return s.replaceAll(" ", "_").toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(Utils.formatAuxFile("pers Inf"));
    }
}
