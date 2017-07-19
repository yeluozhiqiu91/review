package com.wang.se.designpattern.factory;

/**
 * Created by wang on 2017/4/12.
 * 交通工具工厂
 */
public interface VehicleFactory {
    /**
     * 产生交通工具
     * @return
     */
    Moveable create();
}
