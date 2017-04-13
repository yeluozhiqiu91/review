package com.wang.se.designpattern.abstractfactory;

/**
 * Created by wang on 2017/4/13.
 * 魔法工厂
 */
public class MagicFactory extends AbstractFactory{

    public Vehicle createVehicle() {
        return new Broom();
    }

    public Weapon createWeapon() {
        return new MagicStick();
    }

    public Food createFood() {
        return new MushRoom();
    }
}
