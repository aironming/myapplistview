package com.example.airon.myapplicationclistview;

/**
 * Created by airon on 7/11/15.
 */
public class General {
    private int imgsrc;
    private String imgname;
    public General(int img, String name) {
        imgsrc = img;
        imgname = name;
    }
    public int getImageSrc(){
        return imgsrc;
    }
    public String getName(){
        return imgname;
    }
}
