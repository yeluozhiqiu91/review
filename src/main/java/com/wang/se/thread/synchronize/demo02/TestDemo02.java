package com.wang.se.thread.synchronize.demo02;

/**
 * Created by wang on 2018/3/19.
 */
public class TestDemo02 {
    public static void main(String[] args) {
        HasPrivateNum privateNum1=new HasPrivateNum();
        HasPrivateNum privateNum2=new HasPrivateNum();
        ThreadA threadA=new ThreadA(privateNum1);
        ThreadB threadB=new ThreadB(privateNum2);
        threadA.start();
        threadB.start();
        //结果：
        /**
         *
         a set over
         b set over
         b num=200
         a num=100
         */
        //为什么是ThreadB先执行完呢？，因为synchronized 关键字取的是对象锁，而该例是两个对象，有两个锁，两个线程互不影响。
    }
}
