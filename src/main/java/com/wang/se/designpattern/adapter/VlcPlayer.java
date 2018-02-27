package com.wang.se.designpattern.adapter;

/**
 * Created by wang on 2018/2/27.
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    public void playVlc(String fileName) {
        System.out.println("Playing vlc fileName:"+fileName);
    }

    public void playMp4(String fileName) {

    }
}
