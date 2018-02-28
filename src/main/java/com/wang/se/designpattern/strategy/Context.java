package com.wang.se.designpattern.strategy;

/**
 * Created by wang on 2018/2/28.
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
