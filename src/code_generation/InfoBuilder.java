package code_generation;

import data.List;

/**
 * Created by diogo on 01/06/2016.
 */
public class InfoBuilder implements TexBuilder {
    private String listCode;
    private List list;

    public InfoBuilder(List l) {
        this.list = l;
        listCode = "";
    }


    @Override
    public void buildTex() {
        switch (list.getType()) {
            case SIMPLE:
                break;
            case HONOR:
                break;
            case QUALIFICATIONS:
                break;
            case OTHER:
                break;
        }
    }
}
