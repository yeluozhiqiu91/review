package com.wang.se.thread.lock;

/**
 * Created by wang on 2018/3/27.
 */
public class MyThread extends Thread{
    private MyService myService;
    public MyThread(MyService myService){
        this.myService=myService;
    }

    @Override
    public void run() {
        super.run();
        myService.testMethod();
    }
}
