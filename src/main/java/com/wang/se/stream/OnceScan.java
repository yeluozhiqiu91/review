package com.wang.se.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by wang on 2018/4/10.
 */
public class OnceScan {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("java","helo","dsjfk");
        Stream<String> s=list.stream();
        s.forEach(str-> System.out.println(str));//这条会正常执行
        //s.forEach(str-> System.out.println(str));//这条会报错，流只能消费一遍
    }
}
