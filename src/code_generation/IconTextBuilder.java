package code_generation;

import data.IconText;

/**
 * Created by diogo on 01/06/2016.
 */
public class IconTextBuilder implements TexBuilder {
    private IconText iconText;
    private String iconTextCode;

    public IconTextBuilder(IconText it){
        iconText=it;
    }

    public String getIconTextCode(){
        if(iconTextCode==null || iconTextCode.isEmpty()){
            buildTex();
        }
        return iconTextCode;
    }

    @Override
    public void buildTex() {
        iconTextCode="";
        iconTextCode+=iconText.text;

        if(this.iconText.icon.name!= null && this.iconText.icon.name.equals("date")){
            iconTextCode="";
            if(this.iconText.text.matches("\\d{4}-\\d{4}")){
                String dates[] = this.iconText.text.split("-");
                iconTextCode+="{\\timeinterval{\\myyear{"+dates[0]+"}}{\\myyear{"+dates[1]+"}}}";
            }else if(this.iconText.text.matches("\\d{2}\\/\\d{4}-\\d{2}\\/\\d{4}")){
                String dates[] = this.iconText.text.split("-");
                String months1[]=dates[0].split("/");
                String months2[]=dates[1].split("/");
                iconTextCode+="\\timeinterval{\\myyearmonth{"+months1[0]+"}{"+months1[1]+"}}{\\myyearmonth{"+months2[0]+"}{"+months2[1]+"}}";
            }else{
                iconTextCode+=iconText.text;
            }
        }else if(!this.iconText.icon.name.isEmpty()){
            iconTextCode+=new IconBuilder(this.iconText.icon).getIconCode();
        }
    }
}
