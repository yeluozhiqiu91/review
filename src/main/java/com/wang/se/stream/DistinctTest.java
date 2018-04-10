package com.wang.se.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by wang on 2018/4/10.
 */
public class DistinctTest {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,2,4,6,6,5);
        List<Integer> oven=list.stream().filter(i->i%2==0).distinct().collect(Collectors.toList());//选出所有的偶数并且去掉重复
        System.out.println(oven);
    }
}
