package com.wang.se.designpattern.proxy;

/**
 * Created by wang on 2018/2/28.
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;
    public ProxyImage(String fileName){
        this.fileName=fileName;
    }
    public void display() {
        if(realImage==null){
            realImage=new RealImage(fileName);
        }
        realImage.display();
    }
}
