package com.wang.se.thread.lock;

/**
 * Created by wang on 2018/3/27.
 */
public class MyThread2 extends Thread{
    private MyService2 myService2;
    public MyThread2(MyService2 myService2){
        this.myService2=myService2;
    }

    @Override
    public void run() {
        super.run();
        myService2.await();
    }
}
