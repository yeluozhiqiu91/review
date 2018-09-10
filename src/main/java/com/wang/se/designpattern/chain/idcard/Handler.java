package com.wang.se.designpattern.chain.idcard;

/**
 * @Author: wangliujie
 * @Date: 2018/9/10 23:14
 * 处理者
 */
public interface Handler {
    void handleRequest(String number);
    void setNextHandler(Handler handler);
}
