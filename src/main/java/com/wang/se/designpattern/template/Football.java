package com.wang.se.designpattern.template;

/**
 * Created by wang on 2018/3/1.
 */
public class Football extends Game{
    void initGame() {
        System.out.println("Football game init...");
    }

    void startPlay() {
        System.out.println("Football game start...");
    }

    void endPlay() {
        System.out.println("Football game end...");
    }
}
