package com.wang.se.thread.lock.reentrant.r3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by wang on 2018/3/27.
 */
public class MyService {
    private ReentrantReadWriteLock  lock=new ReentrantReadWriteLock();
    public void read(){
        try{
            lock.readLock().lock();
            System.out.println("获取读锁："+Thread.currentThread().getName()+":"+System.currentTimeMillis());
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.readLock().unlock();
        }
    }

    public void write(){
        try{
            lock.writeLock().lock();
            System.out.println("获取写锁："+Thread.currentThread().getName()+":"+System.currentTimeMillis());
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }
}
