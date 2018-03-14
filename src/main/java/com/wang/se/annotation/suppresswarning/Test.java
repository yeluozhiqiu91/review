package com.wang.se.annotation.suppresswarning;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/3/14.
 */
@SuppressWarnings(value = "unchecked")
public class Test {
    public static void main(String[] args) {
        List<String> myList=new ArrayList();//如果不加@SuppressWarnings(value = "unchecked")的话，
                                            // 会出现Unchecked assignment: 'java.util.ArrayList' to 'java.util.List<java.lang.String>'提示
    }
}
