package com.wang.se.thread.synchronize.demo01;

/**
 * Created by wang on 2018/3/19.
 * 方法中的变量不存在非线程安全的问题,因为方法内部的变量是私有的，见TestDemo01
 */
public class HasFuncPrivateNum {
    public void addNum(String word){
        int num=0;
        try {
            if(word.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else if(word.equals("b")){
                num=200;
                System.out.println("b set over");
            }
            System.out.println(word+" num="+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
