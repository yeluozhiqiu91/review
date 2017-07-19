package com.wang.se.designpattern.abstractfactory;

/**
 * Created by wang on 2017/4/13.
 */
public class DefaultFactory extends AbstractFactory{
    public Vehicle createVehicle() {
        return new Car();
    }

    public Weapon createWeapon() {
        return new AK47();
    }

    public Food createFood() {
        return new Apple();
    }
}
