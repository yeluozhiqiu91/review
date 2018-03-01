package com.wang.se.designpattern.template;

/**
 * Created by wang on 2018/3/1.
 * 为防止恶意操作，一般模板方法都加上 final 关键词。抽象类中定义好骨架，具体实现由子类去决定，
 * 就是定义好一个算法的步骤，但这些步骤具体应该做些什么由子类决定
 */
public abstract class Game {
    abstract void initGame();
    abstract void startPlay();
    abstract void endPlay();
    public final void play(){
        //初始化
        initGame();

        //开始
        startPlay();

        //结束
        endPlay();
    }
}
