package com.wang.se.lambda.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangliujie
 * @Date: 2020/5/11 20:56
 */
public class Test1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Zhangsan",23,60.6,"C1"));
        list.add(new Student("Lisi",24,70.6,"C1"));
        list.add(new Student("Wangwu",22,72.6,"C2"));
        list.add(new Student("Zhuge",27,50.6,"C2"));
        list.add(new Student("Guojia",25,89.6,"C3"));
        list.add(new Student("Liubei",28,80.6,"C3"));
        //将年龄大于23的学生筛选出来
        //jdk1.8之前写法
        List<Student> result = filterStudent(list,23);
        for(Student s: result){
            System.out.println(s);
        }
    }
    static List<Student> filterStudent(List<Student> list ,int age){
        List<Student> result = new ArrayList<>();
        for(Student s:list){
            if(s.getAge()>age){
                result.add(s);
            }
        }
        return result;
    }
}
