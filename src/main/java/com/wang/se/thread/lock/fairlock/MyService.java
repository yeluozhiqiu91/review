package com.wang.se.thread.lock.fairlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wang on 2018/3/27.
 */
public class MyService {
    private ReentrantLock lock;
    public MyService(boolean isFair){
        lock=new ReentrantLock(isFair);
    }
    public void method(){
        try{
            lock.lock();
            System.out.println("获得锁："+Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
