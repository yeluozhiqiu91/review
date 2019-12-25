package com.wang.netty.chatdemo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 * @Author: wangliujie
 * @Date: 2019/12/24 14:32
 */
public class ChatClientHandler extends SimpleChannelInboundHandler {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        ByteBuf byteBuf = (ByteBuf)o;
        System.out.println(byteBuf.toString(CharsetUtil.UTF_8));
    }

}
