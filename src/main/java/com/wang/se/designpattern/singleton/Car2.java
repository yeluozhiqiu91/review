package com.wang.se.designpattern.singleton;

/**
 * Created by wang on 2017/4/12. 构造方法私有化，然后提供一个
 * 只给司机一辆车
 *
 * 懒加载、非线程安全
 */
public class Car2 {
    private static Car2 car;
    private Car2(){

    }
    public static Car2 getInstance(){
        if(car==null){
            car=new Car2();
        }
        return car;
    }
    public void run(){
        System.out.println("冒着烟奔跑着car...");
    }
}
