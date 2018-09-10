package com.wang.se.designpattern.chain.idcard;

import java.util.ArrayList;

/**
 * @Author: wangliujie
 * @Date: 2018/9/10 23:16
 * 具体处理者2
 */
public class Shanghai implements Handler{
    private Handler handler;
    private ArrayList<String> numberList;
    Shanghai(){
        numberList=new ArrayList<String>();
        numberList.add("444444");
        numberList.add("555555");
        numberList.add("666666");
    }
    @Override
    public void handleRequest(String number) {
        if(numberList.contains(number)){
            System.out.println("该人在上海居住");
        }else{
            System.out.println("该人不在上海居住");
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
