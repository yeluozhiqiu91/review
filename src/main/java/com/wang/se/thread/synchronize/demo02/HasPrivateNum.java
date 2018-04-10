package com.wang.se.thread.synchronize.demo02;

/**
 * Created by wang on 2018/3/19.
 * 对象的实例变量存在线程安全的问题,私有变量值可能被其它线程覆盖，见TestDemo02
 * 只需要加synchronized关键字就可以解决
 */
public class HasPrivateNum {
    private int num=0;
    //public void addNum(String word){
    public synchronized void addNum(String word){
        try {
            if(word.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else if(word.equals("b")){
                num=200;
                System.out.println("b set over");
            }
            System.out.println(word+" num="+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
