package com.wang.se.designpattern.adapter;

/**
 * Created by wang on 2018/2/27.
 */
public class Test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();//Audioplayer使用适配器，适配器与AudioPlayer实现相同的接口，并且适配器使用能播放其它格式的类
        audioPlayer.play("mp3","Travle light.mp3");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("avi","mind me.avi");
    }
}
