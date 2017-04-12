package com.wang.se.designpattern.factory;

/**
 * Created by wang on 2017/4/12.
 * 生产汽车的工厂
 */
public class CarFactory implements VehicleFactory{
    public Moveable create() {
        return new Car();
    }
}
