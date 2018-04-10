package com.wang.se.thread.simple;

/**
 * Created by wang on 2018/2/24.
 */
public class SimpleThread extends Thread{
    private int count=5;
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" count:"+count);
            count--;
        }
    }
}
