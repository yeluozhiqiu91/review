package com.wang.se.designpattern.chain.logger;

/**
 * Created by wang on 2018/2/28.
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Error Console Logger:"+message);
    }
}
