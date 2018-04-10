package com.wang.se.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by wang on 2018/3/28.
 */
public class Test {
    public static void main(String[] args) {
        Thread thread=new Thread();
        FutureTask<Integer> futureTask=new FutureTask<Integer>((Callable<Integer>)()->{
            int i=0;
            for(;i<100;i++){
                System.out.println(Thread.currentThread().getName()+"循环i:"+i);
            }
            return i;
        });
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"循环i:"+i);
            if(i==20){
                new Thread(futureTask,"有返回值的线程").start();
            }
        }
        try {
            System.out.println("线程的返回值是："+futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
