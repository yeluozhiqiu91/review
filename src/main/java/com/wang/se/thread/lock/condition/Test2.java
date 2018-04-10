package com.wang.se.thread.lock.condition;

/**
 * Created by wang on 2018/3/28.
 */
public class Test2 {
    public static void main(String[] args) {
        MyService service=new MyService();
        ThreadA[] threadA=new ThreadA[5];
        ThreadB[] threadB=new ThreadB[5];
        for(int i=0;i<5;i++){
            threadA[i]=new ThreadA(service);
            threadB[i]=new ThreadB(service);
            threadA[i].start();
            threadB[i].start();
        }
    }
}
