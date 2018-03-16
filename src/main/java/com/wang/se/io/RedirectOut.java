package com.wang.se.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by wang on 2018/3/16.
 */
public class RedirectOut {
    public static void main(String[] args) {
        try {
            PrintStream ps=new PrintStream(new FileOutputStream("d:\\out.txt"));
            System.setOut(ps);//将标准输出重定向到文件
            System.out.println("输出东西哦");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
