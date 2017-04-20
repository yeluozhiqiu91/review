package com.wang.se.thread.executor;

/**
 * Created by wang on 2017/4/17.
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"正在执行...");
    }
}
