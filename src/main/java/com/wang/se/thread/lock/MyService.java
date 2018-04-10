package com.wang.se.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wang on 2018/3/27.
 */
public class MyService {
    private Lock lock=new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for(int i=0;i<5;i++){
            System.out.println("ThreadName:"+Thread.currentThread().getName()+" "+i);
        }
        lock.unlock();
    }
}
