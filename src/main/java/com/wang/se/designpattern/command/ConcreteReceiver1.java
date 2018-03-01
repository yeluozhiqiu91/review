package com.wang.se.designpattern.command;

/**
 * Created by wang on 2018/2/28.
 */
public class ConcreteReceiver1 extends Receiver{
    public void doSomething() {
        System.out.println("接收者1做具体事情");
    }
}
