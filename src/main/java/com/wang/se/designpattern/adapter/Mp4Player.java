package com.wang.se.designpattern.adapter;

/**
 * Created by wang on 2018/2/27.
 */
public class Mp4Player implements AdvancedMediaPlayer{
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 fileName:"+fileName);
    }
}
