package com.wang.se.thread.synchronize.demo02;

import com.wang.se.thread.synchronize.demo01.HasFuncPrivateNum;

/**
 * Created by wang on 2018/3/19.
 */
public class ThreadA extends Thread{
    private HasPrivateNum privateNum;
    public ThreadA(HasPrivateNum privateNum){
        super();
        this.privateNum=privateNum;
    }
    @Override
    public void run() {
        super.run();
        privateNum.addNum("a");
    }
}
