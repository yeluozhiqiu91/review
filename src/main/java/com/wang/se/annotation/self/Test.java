package com.wang.se.annotation.self;

import java.lang.annotation.Annotation;

/**
 * Created by wang on 2018/3/14.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Annotation[] arrs=Class.forName("com.wang.se.annotation.self.UseMyTag").getMethod("info").getAnnotations();
        for(Annotation a:arrs){
            if(a instanceof MyTag){
                MyTag my=(MyTag)a;
                System.out.println("age:"+my.age());
                System.out.println("name:"+my.name());
                System.out.println("annotationType:"+my.annotationType());
            }
            System.out.println(a);
        }
    }
}
