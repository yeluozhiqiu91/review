package com.wang.se.thread.lock;

/**
 * Created by wang on 2018/3/27.
 */
public class Test02 {
    public static void main(String[] args) throws Exception{
        MyService2 myService2=new MyService2();
        MyThread2 myThread2=new MyThread2(myService2);
        myThread2.start();
        Thread.sleep(3000);
        myService2.signal();
    }
}
