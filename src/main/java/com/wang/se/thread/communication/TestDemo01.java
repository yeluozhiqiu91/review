package com.wang.se.thread.communication;

/**
 * Created by wang on 2018/3/27.
 */
public class TestDemo01 {
    public static void main(String[] args) {
        String str=new String();
        try {
            str.wait();                     //会报错，wait必须要先拥有锁
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
