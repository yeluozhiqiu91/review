package com.wang.se.designpattern.proxy;

/**
 * Created by wang on 2018/2/28.
 */
public class Test {
    public static void main(String[] args) {
        Image image=new ProxyImage("test.jpg");
        image.display();

        image.display();
    }
}
