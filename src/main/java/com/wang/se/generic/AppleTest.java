package com.wang.se.generic;

/**
 * Created by wang on 2018/3/15.
 */
public class AppleTest {
    public static void main(String[] args) {
        Apple<String> apple=new Apple<String>("红富士");
        System.out.println(apple.getInfo());
        Apple<Integer> apple2=new Apple<Integer>(5);
        System.out.println(apple2.getInfo());
        System.out.println(apple.getClass()==apple2.getClass());
    }
}
