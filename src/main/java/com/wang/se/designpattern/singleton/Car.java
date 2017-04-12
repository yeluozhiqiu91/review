package com.wang.se.designpattern.singleton;

/**
 * Created by wang on 2017/4/12.
 * 只给司机一辆车
 */
public class Car {
    private static Car car=new Car();
    public static Car getInstance(){
        return car;
    }
    public void run(){
        System.out.println("冒着烟奔跑着car...");
    }
}
