package com.wang.se.tools;

/**
 * @Author: wangliujie
 * @Date: 2019/1/2 14:18
 */
public class Util {
    public static boolean isNull(Object obj) {
        return obj == null;
    }
    public static boolean isEmpty(String s) {
        if (isNull(s)) {
            return true;
        }
        return "".equals(s);
    }
    public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }
}
