package data;

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
            return sb.toString();
        }else return null;
    }
}
