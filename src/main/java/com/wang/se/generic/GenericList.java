package com.wang.se.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/3/15.
 */
public class GenericList {
    public static void main(String[] args) {
        //创建一个只想保存字符串的集合
        List<String> arr=new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        //下面试图丢一个Integer对象进去，由于我们指定了集合元素的类型，这里编译器就会报错
        //arr.add(5);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));//这里arr会记住它的 集合元素的类型为String，所以无需再进行强制类型转换了。
        }
    }
}
