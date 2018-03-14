package com.wang.se.annotation.deprecated;

/**
 * Created by wang on 2018/3/14.
 */
public class Test {
    public static void main(String[] args) {
        Fruit f=new Fruit();
        f.info();//因为info方法被标注了@Deprecated注解，因此在使用此方法时会收到编译器的警告
    }
}
