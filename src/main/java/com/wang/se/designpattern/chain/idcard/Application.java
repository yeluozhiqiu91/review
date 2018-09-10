package com.wang.se.designpattern.chain.idcard;

/**
 * @Author: wangliujie
 * @Date: 2018/9/10 23:22
 */
public class Application {
    private Handler beijing,shanghai,tianjin;
    public void createChain(){
        beijing=new Beijing();
        shanghai=new Shanghai();
        tianjin=new Tianjin();
        beijing.setNextHandler(shanghai);
        shanghai.setNextHandler(tianjin);
    }
    public void responseClient(String number){
        beijing.handleRequest(number);
    }
    public static void main(String[] args) {
        Application application=new Application();
        application.createChain();
        application.responseClient("888888");
    }
}
