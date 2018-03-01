package com.wang.se.designpattern.command;

/**
 * Created by wang on 2018/2/28.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        System.out.println("调用者发出命令");
        this.command.execute();
    }
}
