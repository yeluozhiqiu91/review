package com.wang.se.thread.simple;

/**
 * Created by wang on 2018/2/24.
 */
public class SimpleThread02 extends Thread{
    private int count=5;
    @Override
    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName()+" count:"+count);
    }
}
