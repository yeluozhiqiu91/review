package com.wang.netty.chatdemo;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.CharsetUtil;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @Author: wangliujie
 * @Date: 2019/12/24 14:32
 */
public class ChatServerHandler extends SimpleChannelInboundHandler{
    private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object o) throws Exception {
        Channel channel = ctx.channel();
        channelGroup.forEach(temp->{
            if(temp == channel){
                temp.writeAndFlush(Unpooled.copiedBuffer("[自己]发送了信息："+((ByteBuf) o).toString(CharsetUtil.UTF_8),CharsetUtil.UTF_8));
            }else{
                temp.writeAndFlush(Unpooled.copiedBuffer("[客户端]"+channel.remoteAddress()+"发送了信息："+((ByteBuf) o).toString(CharsetUtil.UTF_8),CharsetUtil.UTF_8));
            }
        });
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        channelGroup.writeAndFlush(Unpooled.copiedBuffer("客户端"+channel.remoteAddress()+"上线了",CharsetUtil.UTF_8));
        channelGroup.add(channel);
        System.out.println("客户端"+channel.remoteAddress()+"上线了");
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        /*ByteBuf byteBuf = Unpooled.copiedBuffer("Hello,Client",CharsetUtil.UTF_8);
        ctx.writeAndFlush(byteBuf);*/
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        channelGroup.writeAndFlush(Unpooled.copiedBuffer("客户端"+channel.remoteAddress()+"下线了",CharsetUtil.UTF_8));
        System.out.println("客户端"+channel.remoteAddress()+"下线了");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
