package com.wang.se.designpattern.template;

/**
 * Created by wang on 2018/3/1.
 */
public class Test {
    public static void main(String[] args) {
        Game game1=new Football();
        game1.play();
        System.out.println();
        game1=new Basketball();
        game1.play();
    }
}
