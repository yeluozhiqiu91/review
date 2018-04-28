package com.wang.se.socket.chapter4;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wang on 2018/4/27.
 * 每有一个socket请求就创建一个线程，采用线程池,使用线程池的方式，算是一种成熟的方式。可以应用在生产中
 */
public class SocketServerTest {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("server将一直等待连接的到来");
        //如果使用多线程，那就需要线程池，防止并发过高时创建过多线程耗尽资源
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        while (true){
            Socket socket=serverSocket.accept();
            Runnable runnable=()->{
                try{
                    //建立连接后获得输入流
                    InputStream inputStream = socket.getInputStream();
                    byte bytes[] = new byte[1024];
                    int len;
                    StringBuilder sb = new StringBuilder();
                    while ((len = inputStream.read(bytes)) != -1) {
                        sb.append(new String(bytes, 0, len, "UTF-8"));
                    }
                    System.out.println(Thread.currentThread().getName()+",get message from client: " + sb);
                    inputStream.close();
                    socket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            };
            threadPool.submit(runnable);
        }
    }
}
