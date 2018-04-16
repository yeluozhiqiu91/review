package com.wang.se.exception;

/**
 * Created by wang on 2018/3/22.
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=a/1;
            return;
        }catch (Exception e){
            try{
                int c=9;
                int d=c/0;
            }catch (Exception e1){
                System.out.println(e1);
            }finally {
                System.out.println("内层finally");
            }
        }finally {
            System.out.println("外层finally");
        }
    }
}
