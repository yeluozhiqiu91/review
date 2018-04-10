package com.wang.se.thread.communication;

import java.util.ArrayList;

/**
 * Created by wang on 2018/3/27.
 */
public class TestDemo02 {
    public static void main(String[] args) throws Exception{
        MyList myList=new MyList();
        ThreadDemo01 threadDemo01=new ThreadDemo01(myList);
        ThreadDemo02 threadDemo02=new ThreadDemo02(myList);
        threadDemo01.start();
        threadDemo01.sleep(50);
        threadDemo02.start();
    }
}
