package com.wang.se.thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wang on 2018/3/27.
 */
public class MyService2 {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void await(){
        try {
            lock.lock();
            System.out.println("start await:" + System.currentTimeMillis());
            condition.await();
            System.out.println("end await:" + System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signal(){
        try{
            lock.lock();
            System.out.println("start signal:"+System.currentTimeMillis());
            condition.signal();
            System.out.println("end signal:"+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
