package com.wang.se.annotation.override;

/**
 * Created by wang on 2018/3/14.
 */
public class Apple extends Fruit{
    @Override
    public void info() {        //这里假设把info写成inf0 ,因为有@Override注解，因此会报错。
        System.out.println("这是苹果"); // @Override方法保证该方法在父类中存在，否则会报错，它能帮助我们及早发现错误，而不是在运行时才发现
    }
}
