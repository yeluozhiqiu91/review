package com.wang.se.socket.chapter2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by wang on 2018/4/27.
 */
public class SocketServerTest {
    public static void main(String[] args) throws IOException {
        int port=8080;
        ServerSocket serverSocket=new ServerSocket(port);
        System.out.println("server将一直等待连接的到来");
        Socket socket=serverSocket.accept();
        //建立连接后获得输入流
        InputStream inputStream=socket.getInputStream();
        byte bytes[]=new byte[1024];
        int len;
        StringBuilder sb=new StringBuilder();
        //客户端关闭它的输出流的时候才会是-1
        while ((len=inputStream.read(bytes))!=-1){
            sb.append(new String(bytes,0,len,"UTF-8"));
        }
        System.out.println("get message from client: " + sb);
        //得到输出流，向客户端发信息
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello Client,I get the message.".getBytes("UTF-8"));

        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
