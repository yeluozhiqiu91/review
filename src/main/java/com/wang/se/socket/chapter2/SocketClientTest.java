package com.wang.se.socket.chapter2;

import java.io.IOException;
import java.io.InputStream;
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
        //通过shutdownOutput高速服务器已经发送完数据，后续只能接受数据
        socket.shutdownOutput();
        //从服务端得到信息
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len = inputStream.read(bytes)) != -1) {
            //注意指定编码格式，发送方和接收方一定要统一，建议使用UTF-8
            sb.append(new String(bytes, 0, len,"UTF-8"));
        }
        System.out.println("get message from server: " + sb);

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
