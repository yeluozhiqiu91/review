package com.wang.se.designpattern.chain.logger;

/**
 * Created by wang on 2018/2/28.
 */
public class DebugLogger extends AbstractLogger{
    public DebugLogger(int level){
        this.level=level;
    }
    protected void write(String message) {
        System.out.println("Debug Console Logger:"+message);
    }
}
