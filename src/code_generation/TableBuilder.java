package code_generation;

import data.Table;

/**
 * Created by diogo on 28/05/2016.
 */
public class TableBuilder implements TexBuilder {
    private final Table table;
    private String tableCode;

    public TableBuilder(Table t) {
        table = t;
        tableCode = "";
    }


    @Override
    public void buildTex() {

    }

    public String getTableCode() {
        return tableCode;
    }
}
