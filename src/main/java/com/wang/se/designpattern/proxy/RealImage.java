package com.wang.se.designpattern.proxy;

/**
 * Created by wang on 2018/2/28.
 */
public class RealImage implements Image{
    private String fileName;
    public void display() {
        System.out.println("Displaying:"+fileName);
    }
    public RealImage(String fileName){
        this.fileName=fileName;
        loadFromDisk(fileName);

    }
    public void loadFromDisk(String fileName){
        System.out.println("Loading :"+fileName);
    }
}
