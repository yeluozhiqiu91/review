package com.wang.se.designpattern.chain.idcard;

/**
 * @Author: wangliujie
 * @Date: 2018/9/10 23:22
 */
public class Application {
    /**
     * 责任链上的对象
     */
    private Handler beijing,shanghai,tianjin;

    /**
     * 建立责任链
     */
    public void createChain(){
        beijing=new Beijing();
        shanghai=new Shanghai();
        tianjin=new Tianjin();
        beijing.setNextHandler(shanghai);
        shanghai.setNextHandler(tianjin);
    }

    /**
     * 响应用户的请求
     * @param number
     */
    public void responseClient(String number){
        beijing.handleRequest(number);
    }
    public static void main(String[] args) {
        Application application=new Application();
        application.createChain();
        application.responseClient("888888");
    }
}
