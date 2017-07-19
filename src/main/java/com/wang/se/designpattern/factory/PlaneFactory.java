package com.wang.se.designpattern.factory;

/**
 * Created by wang on 2017/4/12.
 * 生产飞机的工厂
 */
public class PlaneFactory implements VehicleFactory{
    public Moveable create() {
        return new Plane();
    }
}
