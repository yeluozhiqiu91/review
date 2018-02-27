package com.wang.se.designpattern.decorator;

/**
 * Created by wang on 2018/2/27.
 */
public class WaterCar extends CarDecorator{
    public WaterCar(Moveable moveable) {
        super(moveable);
    }

    public void swim(){
        System.out.println("水里游");
    }
    @Override
    public void move() {
        super.move();
        swim();
    }
}
