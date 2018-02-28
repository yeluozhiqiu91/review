package com.wang.se.designpattern.observer;

/**
 * Created by wang on 2018/2/28.
 */
public class Test {
    public static void main(String[] args) {
        Subject subject=new Subject();
        AObserver aObserver=new AObserver(subject);
        BObserver bObserver=new BObserver(subject);
        subject.setStatus(10);//每当主题状态改变时，A,B都会收到通知
        subject.setStatus(20);
    }
}
