package com.wang.se.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wang on 2017/4/17.
 */
public class TestFixedPool {
    public static void main(String args[]){
        //创建一个可重用固定线程数（2个）的线程池
        ExecutorService pool= Executors.newFixedThreadPool(2);
        Thread t1=new MyThread();
        Thread t2=new MyThread();
        Thread t3=new MyThread();
        Thread t4=new MyThread();
        Thread t5=new MyThread();
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        pool.shutdown();
    }
}
