package code_generation;

import data.Table;

import java.io.FileOutputStream;

/**
 * Created by diogo on 28/05/2016.
 */
public class TableBuilder implements TexBuilder{
    private final Table table;
    private String tableCode;

    public TableBuilder(Table t){
        table=t;
        tableCode="";
    }


    @Override
    public void buildTex() {

    }

    @Override
    public void closeFile() {

    }

    public String getTableCode() {
        return tableCode;
    }
}
