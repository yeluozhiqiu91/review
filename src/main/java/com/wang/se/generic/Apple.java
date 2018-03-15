package com.wang.se.generic;

/**
 * Created by wang on 2018/3/15.
 */
public class Apple<T> {
    private T info;
    public Apple(T info){
        this.info=info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

}
