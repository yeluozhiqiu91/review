package com.wang.se.socket.chapter3;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by wang on 2018/4/27.
 */
public class SocketServerTest {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("server将一直等待连接的到来");
        while (true) {//循环等客户端连接，服务完一个，还可以继续服务
            Socket socket = serverSocket.accept();
            //建立连接后获得输入流
            InputStream inputStream = socket.getInputStream();
            byte bytes[] = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = inputStream.read(bytes)) != -1) {
                sb.append(new String(bytes, 0, len, "UTF-8"));
            }
            System.out.println("get message from client: " + sb);
            inputStream.close();
            socket.close();
        }
    }
}
