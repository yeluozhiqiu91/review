package com.wang.se.designpattern.decorator;

/**
 * Created by wang on 2018/2/27.
 */
public class CarDecorator implements Moveable{
    private Moveable moveable;
    public CarDecorator(Moveable moveable){
        this.moveable=moveable;
    }
    public void move() {
        moveable.move();
    }
}
