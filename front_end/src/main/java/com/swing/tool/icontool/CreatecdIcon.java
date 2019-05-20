package com.swing.tool.icontool;

//创建图片标签类
import javax.swing.*;
public class CreatecdIcon {

    public static ImageIcon add(String ImageName){

    String imgURL="src\\main\\resources\\static\\img\\"+new String(ImageName);
    ImageIcon imgic=new ImageIcon(imgURL);
    return imgic;

    }

}