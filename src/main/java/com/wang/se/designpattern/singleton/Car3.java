package com.wang.se.designpattern.singleton;

/**
 * Created by wang on 2017/4/12. 构造方法私有化，然后提供一个
 * 只给司机一辆车
 *
 * 懒加载、因为加了synchronized关键字所以线程安全
 */
public class Car3 {
    private static Car3 car;
    private Car3(){

    }
    public synchronized static Car3 getInstance(){
        if(car==null){
            car=new Car3();
        }
        return car;
    }
    public void run(){
        System.out.println("冒着烟奔跑着car...");
    }
}
