package com.wang.se.thread.lock.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wang on 2018/3/28.
 */
public class MyService {
    private ReentrantLock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    private boolean hasValue=false;
    public void set(){
        try{
            lock.lock();
            while (hasValue){//如果有值就一直等
                System.out.println("如果此条信息连续出现，就代表唤醒的是同类线程set");
                condition.await();
            }
            System.out.println("放入值，打印★");//如果没值就打印星号（模拟放了个值进去），并将标记置为有值,并发出唤醒信号通知其他正在等的线程
            hasValue=true;
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void get(){
        try{
            lock.lock();
            while (!hasValue){//如果没值就一直等
                System.out.println("如果此条信息连续出现，就代表唤醒的是同类线程get");
                condition.await();
            }
            System.out.println("取走值，打印☆");//如果有值就打印星号（模拟取走值),并标记为无值，并发出唤醒信号
            hasValue=false;
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
