package com.wang.se.designpattern.chain.idcard;

import java.util.ArrayList;

/**
 * @Author: wangliujie
 * @Date: 2018/9/10 23:16
 * 具体处理者1
 */
public class Beijing implements Handler{
    private Handler handler;
    private ArrayList<String> numberList;
    Beijing(){
        numberList=new ArrayList<String>();
        numberList.add("111111");
        numberList.add("222222");
        numberList.add("333333");
    }
    @Override
    public void handleRequest(String number) {
        if(numberList.contains(number)){
            System.out.println("该人在北京居住");
        }else{
            System.out.println("该人不在北京居住");
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
