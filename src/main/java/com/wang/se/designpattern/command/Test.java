package com.wang.se.designpattern.command;

/**
 * Created by wang on 2018/2/28.
 */
public class Test {
    public static void main(String[] args) {
        Invoker invoker=new Invoker();//调用者
        Receiver receiver=new ConcreteReceiver2();//具体接受者
        Command command=new ConcreteCommand1(receiver);//具体命令
        invoker.setCommand(command);
        invoker.action();
    }
}
