package com.wang.se.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/4/19.
 * -Xms20m
 -Xmx20m
 -Xmn10m
 -XX:+HeapDumpOnOutOfMemoryError
 -XX:+PrintGCDetails
 */
public class TestOutOfMemory {
    private static final int _1MB=1024*1024;
    public static void main(String[] args) {
        byte[] a1,a2,a3,a4;
        a1=new byte[2*_1MB];//分配2M
        a2=new byte[2*_1MB];//分配2M
        a3=new byte[2*_1MB];//分配2M
        a4=new byte[4*_1MB];//分配4M
    }
}
