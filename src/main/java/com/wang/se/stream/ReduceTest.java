package com.wang.se.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by wang on 2018/4/10.
 */
public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        int sum=numbers.stream().reduce(0,(a,b)->a+b);//将numbers里面所有元素都加起来，初始值是0
        System.out.println("和为："+sum);
        int total=numbers.stream().reduce(1,(a,b)->a*b);//将numbers里面所有元素都乘起来，初始值是1
        System.out.println("积为："+total);
        Optional<Integer> max=numbers.stream().reduce(Integer::max);
        Optional<Integer> min=numbers.stream().reduce(Integer::min);
        System.out.println("最大值："+max.get());
        System.out.println("最小值："+min.get());
    }
}
