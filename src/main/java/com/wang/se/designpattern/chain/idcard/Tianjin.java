package com.wang.se.designpattern.chain.idcard;

import java.util.ArrayList;

/**
 * @Author: wangliujie
 * @Date: 2018/9/10 23:16
 * 具体处理者2
 */
public class Tianjin implements Handler{
    private Handler handler;
    private ArrayList<String> numberList;
    Tianjin(){
        numberList=new ArrayList<String>();
        numberList.add("777777");
        numberList.add("888888");
        numberList.add("999999");
    }
    @Override
    public void handleRequest(String number) {
        if(numberList.contains(number)){
            System.out.println("该人在天津居住");
        }else{
            System.out.println("该人不在天津居住");
            if(handler!=null){
                //将请求传递给下一个处理者
                handler.handleRequest(number);
            }
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler=handler;
    }
}
