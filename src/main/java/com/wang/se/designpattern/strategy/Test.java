package com.wang.se.designpattern.strategy;

/**
 * Created by wang on 2018/2/28.
 * 将不同的算法封装成不同的策略，实体选择使用不同的策略就得到不同结果
 */
public class Test {
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());//使用相加策略
        System.out.println("10 + 20 = "+context.executeStrategy(10,20));

        context=new Context(new OperationMul());//使用相减策略
        System.out.println("10 * 20 = "+context.executeStrategy(10,20));
        context=new Context(new OperationSub());//使用相乘策略
        System.out.println("10 - 20 = "+context.executeStrategy(10,20));
    }
}
