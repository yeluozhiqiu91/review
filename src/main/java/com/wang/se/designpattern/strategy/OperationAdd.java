package com.wang.se.designpattern.strategy;

/**
 * Created by wang on 2018/2/28.
 */
public class OperationAdd implements Strategy{
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
