package com.wang.se.thread.synchronize.demo01;

/**
 * Created by wang on 2018/3/19.
 */
public class TestDemo01 {
    public static void main(String[] args) {
        HasFuncPrivateNum funcPrivateNum=new HasFuncPrivateNum();
        ThreadA threadA=new ThreadA(funcPrivateNum);
        threadA.start();
        ThreadB threadB=new ThreadB(funcPrivateNum);
        threadB.start();
    }
}
