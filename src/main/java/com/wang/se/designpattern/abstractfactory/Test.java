package com.wang.se.designpattern.abstractfactory;

/**
 * Created by wang on 2017/4/13.
 * 普通的工厂要产生新的产品或新的工厂比较容易，但是要产生产品系列就可能有工厂泛滥的情况
 * 抽象工厂的短处在于，如果要产生新的产品的话，比如，人要穿盔甲，那么得改abstractfactory增加一个产生盔甲的方法，各子类也得进行相应修改
 */
public class Test {
    public static void main(String args[]){
        AbstractFactory factory=new MagicFactory();//只需换工厂，一系列产品就换了
        Vehicle vehicle=factory.createVehicle();
        vehicle.run();
        Weapon weapon=factory.createWeapon();
        weapon.shoot();
        Food food=factory.createFood();
        food.getName();
    }
}
