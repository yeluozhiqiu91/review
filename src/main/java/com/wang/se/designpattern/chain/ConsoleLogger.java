package com.wang.se.designpattern.chain;

/**
 * Created by wang on 2018/2/28.
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level){
        this.level=level;
    }
    protected void write(String message) {
        System.out.println("Standard Console Logger:"+message);
    }
}
