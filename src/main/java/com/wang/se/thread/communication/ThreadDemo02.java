package com.wang.se.thread.communication;

/**
 * Created by wang on 2018/3/27.
 */
public class ThreadDemo02 extends Thread {
    private MyList myList;

    @Override
    public void run() {
        try {
            synchronized (myList) {
                if (myList.size() != 5) {
                    System.out.println("before wait:" + System.currentTimeMillis());
                    myList.wait();

                    System.out.println("after wait:" + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ThreadDemo02(MyList myList) {
        this.myList = myList;
    }
}
