package com.wang.se.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by wang on 2018/4/27.
 */
public class SocketClientTest {
    public static void main(String[] args) throws IOException {
        String host="127.0.0.1";
        int port=8080;
        Socket socket=new Socket(host,port);
        //建立连接后获得输出流
        OutputStream outputStream = socket.getOutputStream();
        String message="你好啊，服务器";
        outputStream.write(message.getBytes("UTF-8"));
        outputStream.close();
        socket.close();
    }
}
