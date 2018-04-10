package com.wang.se.thread.communication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/3/27.
 */
public class MyList {
    private static List<String> list=new ArrayList<String>();

    public void add(){
        list.add("sskj");
    }
    public int size(){
        return list.size();
    }
}
