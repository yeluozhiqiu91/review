package com.wang.se.designpattern.singleton;

/**
 * Created by wang on 2017/4/12. 构造方法私有化，然后提供一个
 * 只给司机一辆车
 * 非懒加载，它基于 classloder 机制避免了多线程的同步问题，所以是线程安全的
 */
public class Car {
    private static Car car=new Car();
    private Car(){

    }
    public static Car getInstance(){
        return car;
    }
    public void run(){
        System.out.println("冒着烟奔跑着car...");
    }
}
