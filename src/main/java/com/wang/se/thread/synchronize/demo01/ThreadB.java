package com.wang.se.thread.synchronize.demo01;

/**
 * Created by wang on 2018/3/19.
 */
public class ThreadB extends Thread{
    private HasFuncPrivateNum funcPrivateNum;
    public ThreadB(HasFuncPrivateNum funcPrivateNum){
        super();
        this.funcPrivateNum=funcPrivateNum;
    }
    @Override
    public void run() {
        super.run();
        funcPrivateNum.addNum("b");
    }
}
