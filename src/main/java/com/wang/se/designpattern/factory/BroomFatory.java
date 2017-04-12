package com.wang.se.designpattern.factory;

/**
 * Created by wang on 2017/4/12.
 */
public class BroomFatory implements VehicleFactory{
    public Moveable create() {
        return new Broom();
    }
}
