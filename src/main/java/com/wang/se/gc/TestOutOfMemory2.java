package com.wang.se.gc;

/**
 * Created by wang on 2018/4/19.
 -Xmx20m
 -Xms20m
 -Xmn10m
 -XX:+PrintGCDetails
 -XX:SurvivorRatio=8
 -XX:+UseSerialGC
 -XX:PretenureSizeThreshold=3145728       超过3M的直接在年老代分配
 */
public class TestOutOfMemory2 {
    private static final int _1MB=1024*1024;
    public static void main(String[] args) {
        byte[] a4;
        a4=new byte[4*_1MB];//分配4M
    }
}
