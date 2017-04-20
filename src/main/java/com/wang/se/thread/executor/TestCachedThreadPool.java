package com.wang.se.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wang on 2017/4/17.
 */
public class TestCachedThreadPool {
    public static void main(String args[]){
        //创建一个可重用的线程池,大小不做限制，依赖于操作系统（或者JVM）
        ExecutorService pool= Executors.newCachedThreadPool();
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
