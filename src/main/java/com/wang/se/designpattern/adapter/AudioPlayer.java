package com.wang.se.designpattern.adapter;

/**
 * Created by wang on 2018/2/27.
 */
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file,fileName:"+fileName);
        }else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("Invalid media. "+audioType+" is not supported");
        }
    }
}
