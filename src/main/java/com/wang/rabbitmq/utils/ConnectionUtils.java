package com.wang.rabbitmq.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author: wangliujie
 * @Date: 2019/3/4 21:43
 * 获取MQ的连接
 */
public class ConnectionUtils {
    public static Connection getConnection() throws IOException, TimeoutException {
        //定义一个连接工厂
        ConnectionFactory  factory=new ConnectionFactory();

        //设置服务地址

        factory.setHost("127.0.0.1");

        //设置端口号
        factory.setPort(5672);

        //vhost
        factory.setVirtualHost("/");

        //用户名
        factory.setUsername("wang");
        //密码
        factory.setPassword("wang");

        return factory.newConnection();
    }
}
