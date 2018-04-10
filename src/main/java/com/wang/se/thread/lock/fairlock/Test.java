package com.wang.se.thread.lock.fairlock;

/**
 * Created by wang on 2018/3/28.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        final MyService service=new MyService(true);//当为true时，为公平锁，哪个线程先运行就先获得锁，
        Runnable runnable=new Runnable() {                  //当为false时，为非公平锁，后运行的线程可能会插队先获得锁
            @Override
            public void run() {
                System.out.println("运行："+Thread.currentThread().getName());
                service.method();
            }
        };
        Thread[] thread=new Thread[50];
        for(int i=0;i<50;i++){
            thread[i]=new Thread(runnable);
        }
        for(int i=0;i<50;i++){
            thread[i].start();
            //Thread.sleep(5);
        }
    }
}
