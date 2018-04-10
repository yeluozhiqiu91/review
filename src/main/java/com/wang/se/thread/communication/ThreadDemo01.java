package com.wang.se.thread.communication;

/**
 * Created by wang on 2018/3/27.
 */
public class ThreadDemo01 extends Thread{
    private MyList myList;
    @Override
    public void run() {
        synchronized (myList){
            for(int i=0;i<10;i++){
                myList.add();
                if(myList.size()==5){
                    myList.notifyAll();
                    System.out.println("发出通知");
                }
                System.out.println("添加了"+(i+1)+"个元素");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public ThreadDemo01(MyList myList){
        this.myList=myList;
    }
}
