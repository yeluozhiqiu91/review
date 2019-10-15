package com.wang.rabbitmq.simple;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.wang.rabbitmq.utils.ConnectionUtils;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author: wangliujie
 * @Date: 2019/3/4 21:49
 */
public class Send {
    private static final String QUEUE_NAME="test_simple_queue";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        Connection connection = ConnectionUtils.getConnection();

        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

        String msg="Hello simple!";
        for(int i=0;i<100;i++){
            channel.basicPublish("",QUEUE_NAME,null,(msg+" count:"+i).getBytes());
            System.out.println("--send msg:"+msg+" count:"+i);
            Thread.sleep(500);
        }
        channel.close();
        connection.close();
    }

}
