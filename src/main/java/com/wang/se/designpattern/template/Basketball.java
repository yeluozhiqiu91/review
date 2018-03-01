package com.wang.se.designpattern.template;

/**
 * Created by wang on 2018/3/1.
 */
public class Basketball extends Game{
    void initGame() {
        System.out.println("Basketball game init...");
    }

    void startPlay() {
        System.out.println("Basketball game start...");
    }

    void endPlay() {
        System.out.println("Basketball game end...");
    }
}
