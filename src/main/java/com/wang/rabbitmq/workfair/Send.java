package com.wang.rabbitmq.workfair;

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
    private static final String QUEUE_NAME="test_work_queue";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        Connection connection = ConnectionUtils.getConnection();

        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

        int prefetchCount=1;
        channel.basicQos(prefetchCount);

        for(int i=0;i<50;i++){
            String msg = "hello "+i;
            channel.basicPublish("",QUEUE_NAME,null,msg.getBytes());
            System.out.println("--send msg:"+msg);
            Thread.sleep(i*5);
        }

        channel.close();
        connection.close();
    }

}
