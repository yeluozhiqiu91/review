package com.wang.se.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by wang on 2018/4/11.
 */
public class CreateStreamTest {
    public static void main(String[] args) {
        //用Stream.of生成流
        Stream<String> stream=Stream.of("jaj","sdkk","ij2");
        stream.map(String::toUpperCase).forEach(System.out::println);
        Stream<String> emptyStream=Stream.empty();//空流
        //从数组生成流
        int[] numbers={2,3,5,7,9};
        int sum= Arrays.stream(numbers).sum();
        System.out.println("sum:"+sum);
        //由文件生成流

    }
}
