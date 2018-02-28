package com.wang.se.designpattern.observer;

/**
 * Created by wang on 2018/2/28.
 */
public class AObserver extends Observer{
    public AObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Aobject 知道了subject 的状态变成了"+subject.getStatus());
    }
}
