package com.wang.se.thread.lock.reentrant.r3;

/**
 * Created by wang on 2018/3/28.
 */
public class Test {
    public static void main(String[] args) {        //读写互斥、写读互斥
        MyService service=new MyService();
        ThreadA threadA=new ThreadA(service);
        ThreadB threadB=new ThreadB(service);
        threadA.start();
        threadB.start();
    }
}
