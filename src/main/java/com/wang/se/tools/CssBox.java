package com.wang.se.tools;

import org.fit.cssbox.demo.ImageRenderer;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by wang on 2017/4/13.
 * 用来网页截图的
 */
public class CssBox {
    public static void main(String args[]) throws IOException, SAXException {
        ImageRenderer render = new ImageRenderer();
        System.out.println("开始...");
        String url="http://www.imooc.com/";
        FileOutputStream fileout=null;
        File file=new File("D:"+File.separator+"html.png");
        fileout=new FileOutputStream(file);
        render.renderURL(url, fileout, ImageRenderer.Type.PNG);
        fileout.close();
        System.out.println("结束");
    }
}
