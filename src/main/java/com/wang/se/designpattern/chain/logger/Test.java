package com.wang.se.designpattern.chain.logger;

/**
 * Created by wang on 2018/2/28.
 */
public class Test {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger infoLogger=new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger=new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        return infoLogger;
    }
    public static void main(String[] args) {
        AbstractLogger chain=getChainOfLoggers();
        //infoLogger可以处理INFO级别的消息
        chain.logMessage(AbstractLogger.INFO,"This is an information");
        System.out.println();

        //debugLogger可以处理INFO、DEBUG级别的消息
        chain.logMessage(AbstractLogger.DEBUG,"This is a debug information");
        System.out.println();

        //errorLogger可以处理INFO、DEBUG、ERROR级别的消息
        chain.logMessage(AbstractLogger.ERROR,"This is an error information");
    }
}
