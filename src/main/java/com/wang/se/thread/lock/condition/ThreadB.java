package com.wang.se.thread.lock.condition;

/**
 * Created by wang on 2018/3/28.
 */
public class ThreadB extends Thread{
    private MyService myService;
    public ThreadB(MyService myService){
        this.myService=myService;
    }

    @Override
    public void run() {
        super.run();
        for(int i=0;i<10;i++){
            myService.set();
        }
    }
}
