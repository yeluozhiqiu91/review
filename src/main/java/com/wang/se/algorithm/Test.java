package com.wang.se.algorithm;

/**
 * Created by wang on 2018/4/18.
 */
public class Test {
    public static void main(String[] args) {
        int[] temp=new int[]{5,3,2,4,1,7,9,8,0,6};
        int[] after1=SortUtil.bubbleSort(temp);
        int[] temp2=new int[]{5,3,2,4,1,7,9,8,0,6};
        int[] after2=SortUtil.insertSort(temp2);
        int[] temp3=new int[]{5,3,2,4,1,7,9,8,0,6};
        int[] after3=SortUtil.selectSort(temp3);
        SortUtil.printIntArray(after1);
        SortUtil.printIntArray(after2);
        SortUtil.printIntArray(after3);
    }
}
