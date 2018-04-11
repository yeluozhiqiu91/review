package com.wang.se.designpattern.strategy;

/**
 * Created by wang on 2018/4/11.
 */
public class Test2 {
    public static void main(String[] args) {
        Context context=new Context((a,b)->a+b);//使用相加策略
        System.out.println("10 + 20 = "+context.executeStrategy(10,20));

        context=new Context((a,b)->a-b);//使用相减策略
        System.out.println("10 * 20 = "+context.executeStrategy(10,20));
        context=new Context((a,b)->a*b);//使用相乘策略
        System.out.println("10 - 20 = "+context.executeStrategy(10,20));
    }
}
