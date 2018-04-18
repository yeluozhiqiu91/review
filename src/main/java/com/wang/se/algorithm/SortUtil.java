package com.wang.se.algorithm;

/**
 * Created by wang on 2018/4/18.
 */
public class SortUtil {
    //冒泡排序，两两比较，前面比后面大就交换位置，每一趟过后，最大的都跑到最后面
    public static int[] bubbleSort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    //插入排序，默认第一个元素自己是排好序的，从第二个元素开始得找到它应该在的位置然后插入该位置
    public static int[] insertSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int j=i+1;
            int temp=a[j];
            while(j>=1&&temp<a[j-1]){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
        return a;
    }

    //用一个变量来记录最小值位置，每一趟都选出后面没有排序的最小值位置，然后将该最小值与未排好序的第一个元素交换位置
    public static int[] selectSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[minPos]){
                    minPos=j;
                }
            }
            if(a[i]!=a[minPos]){
                int temp=a[i];
                a[i]=a[minPos];
                a[minPos]=temp;
            }
        }
        return a;
    }

    public static void printIntArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
            if(i==a.length-1){
                System.out.println();
            }else{
                System.out.print(",");
            }
        }
    }
}
