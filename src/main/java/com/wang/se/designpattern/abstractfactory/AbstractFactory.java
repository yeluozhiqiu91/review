package com.wang.se.designpattern.abstractfactory;

/**
 * Created by wang on 2017/4/13.
 * 抽象工厂
 */
public abstract class AbstractFactory {
    /**
     * 生产交通工具
     * @return
     */
    public abstract Vehicle createVehicle();

    /**
     * 生产武器
     * @return
     */
    public abstract Weapon createWeapon();

    /**
     * 生产食物
     * @return
     */
    public abstract Food createFood();
}
