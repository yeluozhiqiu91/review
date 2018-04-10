package com.wang.se.thread.simple;

/**
 * Created by wang on 2018/2/24.
 */
public class SimpleTest {
    public static void main(String[] args) {
        SimpleThread02 thread02=new SimpleThread02();
        Thread t1=new Thread(thread02);
        Thread t2=new Thread(thread02);
        Thread t3=new Thread(thread02);
        Thread t4=new Thread(thread02);
        Thread t5=new Thread(thread02);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
