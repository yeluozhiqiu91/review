package com.wang.se.tools;

import org.fit.cssbox.demo.ImageRenderer;
import org.xml.sax.SAXException;

import java.io.*;
import java.util.Arrays;

/**
 * Created by wang on 2017/4/13.
 * 用来网页截图的
 */
public class CssBox {
    public static void main(String args[]) throws IOException, SAXException {
        ImageRenderer render = new ImageRenderer();


        String url="http://112.74.212.33:10086/alarm/confirmPage/A70413110600000/B489958BEB3C5CED6E64C02FF3D63274.htm";

        long start2=System.currentTimeMillis();
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        render.renderURL(url,outputStream,ImageRenderer.Type.PNG);
        byte[] bytes2=outputStream.toByteArray();
        long end2=System.currentTimeMillis();
        System.out.println("时差2为："+(end2-start2));
        long start1=System.currentTimeMillis();
        System.out.println("开始...");
        FileOutputStream fileout=null;
        File file=new File("D:"+File.separator+"html.png");
        fileout=new FileOutputStream(file);
        render.renderURL(url, fileout, ImageRenderer.Type.PNG);
        byte[] byte1=getBytesFromFile(file);
        long end1=System.currentTimeMillis();
        System.out.println("时差1为："+(end1-start1));
        fileout.close();
        System.out.println("结束");

        if(Arrays.equals(byte1,bytes2)){
            System.out.println("内容相同");
        }else{
            System.out.println("内容不同");
        }
        outputStream.close();
    }
    public static byte[] getBytesFromFile(File file) throws IOException {

        if(!file.exists()) {
            throw new IOException("图片文件不存在!");
        }

        FileInputStream fis = null;
        ByteArrayOutputStream bos = null;
        byte[] videoBuffer = new byte[1024];
        byte[] byteArray = null;
        try {
            fis = new FileInputStream(file);
            bos = new ByteArrayOutputStream();

            int len = 0;
            while ((len=fis.read(videoBuffer)) != -1) {
                bos.write(videoBuffer, 0, len);
            }

            byteArray = bos.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {

                }
                bos = null;
            }

            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {

                }
                fis = null;
            }
        }

        return byteArray;
    }
}
