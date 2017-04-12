package com.wang.se.designpattern.factory;

/**
 * Created by wang on 2017/4/12.
 * 能控制交通工具的类型，以及其生产过程
 */
public class Test {
    public static void main(String args[]){
        VehicleFactory factory=new PlaneFactory();//想要替换交通工具，只需替换工厂即可，以后我们也可做成配置，只需改配置就行
        Moveable m=factory.create();
        m.run();
    }
}
