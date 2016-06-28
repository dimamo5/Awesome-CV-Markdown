package data;

import java.io.File;
import java.util.HashMap;

/**
 * Created by diogo on 13/05/2016.
 */
public class Utils {
    public static String analyseAny(String s, HashMap<String, String> variables) {
        if (s != null) {
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '\\') {
                    sb.deleteCharAt(i);
                    i++;
                } else if (sb.charAt(i) == '/') {
                    String variableName = sb.substring(i, sb.indexOf(" ", i));
                    sb.replace(i, sb.indexOf(" ", i), variables.get(variableName));
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

    public static boolean isDefined(HashMap<String, String> variables, String variable) {
        return variables.get(variable) != null;
    }

    public static void defVar(HashMap<String, String> variables, String var, String val) {
        var = var.substring(1);
        variables.put(var, analyseAny(val, variables));
    }

    public static String formatAuxFile(String s) {
        return s.replaceAll(" ", "_").toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(Utils.formatAuxFile("pers Inf"));
    }
}
