package com.wang.se.thread.lock.reentrant.r2;

/**
 * Created by wang on 2018/3/28.
 */
public class ThreadA extends Thread{
    private MyService myService;
    public ThreadA(MyService myService){
        this.myService=myService;
    }

    @Override
    public void run() {
        super.run();
        myService.write();
    }
}
