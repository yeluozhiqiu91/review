package com.wang.se.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/4/9.
 */
public class Test {
    public static void main(String[] args) {
        Apple a1=new Apple("red",150);
        Apple a2=new Apple("red",140);
        Apple a3=new Apple("green",150);
        Apple a4=new Apple("green",140);
        Apple a5=new Apple("pink",150);
        List<Apple> apples=new ArrayList<>();
        apples.add(a1);
        apples.add(a2);
        apples.add(a3);
        apples.add(a4);
        apples.add(a5);
        List<Apple> result=filter(apples,(Apple apple)->"red".equals(apple.getColor())||apple.getWeight()>=150);
        for(Apple a:result){
            System.out.println(a);
        }
        //List<String> result2=filter(new ArrayList<>(),(String s)->s.isEmpty());
        /*Runnable runnable=System.out::println;
        Thread thread=new Thread(runnable);
        thread.start();*/
    }
    public static  <T> List<T> filter(List<T> list,Predicate<T> p){
        List<T> result=new ArrayList<>();
        for(T t:list){
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }
}
