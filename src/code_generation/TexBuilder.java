package code_generation;

/**
 * Created by diogo on 26/05/2016.
 */
public interface TexBuilder {
    String FILES_LOCATION=System.getProperty("user.dir") + "/resources/generated/resume/";
    void buildTex();
    void closeFile();
}
