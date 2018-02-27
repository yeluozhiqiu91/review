package com.wang.se.designpattern.decorator;

/**
 * Created by wang on 2018/2/27.
 */
public class Test {
    public static void main(String[] args) {
        Car car=new Car();
        car.move();
        WaterCar waterCar=new WaterCar(new FlyingCar(car));//原来的车只能在地上跑，现在的车水陆空都可以跑
        waterCar.move();
    }
}
