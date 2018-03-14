package com.wang.se.annotation.self;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by wang on 2018/3/14.
 */
@Retention(RetentionPolicy.RUNTIME) //只有取值是RUNTIME的时候才能利用反射获取注解的信息
public @interface MyTag {
    //定义了两个成员变量，成员变量以方法的形式来定义,default是默认值
    String name() default "wang";
    int age() default 26;
}
