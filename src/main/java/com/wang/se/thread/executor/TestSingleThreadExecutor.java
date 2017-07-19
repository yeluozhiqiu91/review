package com.wang.se.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wang on 2017/4/17.
 * 从执行结果可以看出，三个线程对象使用的同一个线程
 */
public class TestSingleThreadExecutor {
    public static void main(String args[]){
        //创建一个可重用固定线程数（1个）的线程池
        ExecutorService pool= Executors.newSingleThreadExecutor();
        Thread t1=new MyThread();
        Thread t2=new MyThread();
        Thread t3=new MyThread();
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.shutdown();
    }
}
