package com.wang.se.designpattern.command;

/**
 * Created by wang on 2018/2/28.
 */
public class ConcreteCommand1 extends Command{
    private Receiver receiver;
    public ConcreteCommand1(Receiver receiver){
        this.receiver=receiver;
    }
    public void execute() {
        System.out.println("命令1交给接受者去做事情");
        this.receiver.doSomething();
    }
}
