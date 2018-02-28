package com.wang.se.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/2/28.
 */
public class Subject {
    private List<Observer> observers=new ArrayList<Observer>();
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
        notifyAllObserver();
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObserver(){
        for(Observer o:observers){
            o.update();
        }
    }
}
