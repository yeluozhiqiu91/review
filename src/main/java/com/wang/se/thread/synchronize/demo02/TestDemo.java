package com.wang.se.thread.synchronize.demo02;


/**
 * Created by wang on 2018/3/19.
 */
public class TestDemo {
    public static void main(String[] args) {
        HasPrivateNum privateNum=new HasPrivateNum();
        ThreadA threadA=new ThreadA(privateNum);
        threadA.start();
        ThreadB threadB=new ThreadB(privateNum);
        threadB.start();
    }
}
