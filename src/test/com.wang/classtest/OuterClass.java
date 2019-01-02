package com.wang.classtest;

/**
 * @Author: wangliujie
 * @Date: 2019/1/2 11:10
 * 内部类是延迟加载的，就是使用到的时候才会加载
 */
public class OuterClass
{
    static{
        System.out.println("外部类的静态块 load.");
    }

    public OuterClass()
    {
        System.out.println("外部类无参构造 flag");
    }
    public OuterClass(String flag)
    {
        System.out.println("外部类有参构造flag:"+flag);
    }

    class InnerClass
    {
        //private static String te = "";
        /*static{
            System.out.println("InnerClass static load.");
        }*/
        private OuterClass out = new OuterClass("内部类调用外部类有参构造inner");
    }
    static class InnerStaticClass
    {
        private static OuterClass out = new OuterClass("内部静态类调用外部类有参构造innerStatic");
        static{
            System.out.println("内部静态类，静态构造块 load.");
        }
        private static void load()
        {
            System.out.println("内部静态类，静态方法 load().");
        }
    }
    public static  OuterClass getInstatnce()
    {
        return OuterClass.InnerStaticClass.out;
    }
    public static void main(String[] args)
    {
        OuterClass outerClass=new OuterClass();
        System.out.println("===============");
        OuterClass.InnerStaticClass.load();
        System.out.println("*****************");
        OuterClass out = OuterClass.InnerStaticClass.out;
        System.out.println("#################");
        OuterClass.InnerClass innerClass = out.new InnerClass() ;
    }

}