package com.wang.se.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/3/15.
 */
public class ListErr {
    public static void main(String[] args) {
        //创建一个只想保存字符串的集合
        List arr=new ArrayList();
        arr.add("hello");
        arr.add("world");
        //下面不小心丢了一个Integer对象进去，结果后面强制转换成String的时候报异常了java.lang.ClassCastException
        //如果用了泛型的话，就不会出现这种情况，编译期就会报错，看例子GenericList
        arr.add(5);
        for(int i=0;i<arr.size();i++){
            System.out.println((String)arr.get(i));
        }
    }
}
