package com.wang.rabbitmq.work;

import com.rabbitmq.client.*;
import com.wang.rabbitmq.utils.ConnectionUtils;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author: wangliujie
 * @Date: 2019/3/4 21:56
 */
public class Recv2 {
    private static final String QUEUE_NAME="test_work_queue";
    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = ConnectionUtils.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String str = new String(body,"utf-8");
                System.out.println("recv2,msg:" + str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println("recv2 done");
                }
            }
        };
        boolean autoAck=true;
        //监听队列
        channel.basicConsume(QUEUE_NAME,autoAck,defaultConsumer);
    }
}
