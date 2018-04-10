package com.wang.se.thread.synchronize.demo02;

/**
 * Created by wang on 2018/3/19.
 */
public class ThreadB extends Thread{
    private HasPrivateNum privateNum;
    public ThreadB(HasPrivateNum privateNum){
        super();
        this.privateNum=privateNum;
    }
    @Override
    public void run() {
        super.run();
        privateNum.addNum("b");
    }
}
