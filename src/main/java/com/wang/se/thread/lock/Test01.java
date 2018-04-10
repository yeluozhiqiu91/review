package com.wang.se.thread.lock;

/**
 * Created by wang on 2018/3/27.
 */
public class Test01 {
    public static void main(String[] args) {
        MyService myService=new MyService();
        MyThread myThread01=new MyThread(myService);
        MyThread myThread02=new MyThread(myService);
        MyThread myThread03=new MyThread(myService);
        MyThread myThread04=new MyThread(myService);
        myThread01.start();
        myThread02.start();
        myThread03.start();
        myThread04.start();
    }
}
