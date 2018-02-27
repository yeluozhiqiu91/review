package com.wang.se.designpattern.decorator;

/**
 * Created by wang on 2018/2/27.
 */
public class FlyingCar extends CarDecorator{
    public FlyingCar(Moveable moveable) {
        super(moveable);
    }

    public void fly(){
        System.out.println("天上飞");
    }
    @Override
    public void move() {
        super.move();
        fly();
    }
}
