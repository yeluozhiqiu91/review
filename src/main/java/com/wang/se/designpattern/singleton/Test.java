package com.wang.se.designpattern.singleton;

/**
 * Created by wang on 2017/4/12.
 */
public class Test {
    public static void main(String args[]){
        Car car=Car.getInstance();
        Car car1=Car.getInstance();
        if(car==car1){
            System.out.println("同一辆车");
        }
        car.run();
    }
}
