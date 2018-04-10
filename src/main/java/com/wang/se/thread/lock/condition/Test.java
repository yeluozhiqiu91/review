package com.wang.se.thread.lock.condition;

/**
 * Created by wang on 2018/3/28.
 */
public class Test {
    public static void main(String[] args) {
        MyService service=new MyService();
        ThreadA threadA=new ThreadA(service);
        ThreadB threadB=new ThreadB(service);
        threadA.start();
        threadB.start();
    }
}
