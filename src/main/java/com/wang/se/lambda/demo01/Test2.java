package com.wang.se.lambda.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: wangliujie
 * @Date: 2020/5/11 20:56
 */
public class Test2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Zhangsan",23,60.6,"C1"));
        list.add(new Student("Lisi",24,70.6,"C1"));
        list.add(new Student("Wangwu",22,72.6,"C2"));
        list.add(new Student("Zhuge",27,50.6,"C2"));
        list.add(new Student("Guojia",25,89.6,"C3"));
        list.add(new Student("Liubei",28,80.6,"C3"));
        //将年龄大于23的学生筛选出来
        //jdk1.8之前，将筛选条件封装写法
        //筛选年龄大于23的
        Filter f1 = new Filter() {
            @Override
            public boolean test(Student s) {
                if(s.getAge()>23){
                    return true;
                }else{
                    return false;
                }
            }
        };
        List<Student> result = filterStudent(list,f1);
        for(Student s: result){
            System.out.println(s);
        }

        //筛选C1班的
        Filter f2 = new Filter() {
            @Override
            public boolean test(Student s) {
                if(s.getClassRoom().equals("C1")){
                    return true;
                }else{
                    return false;
                }
            }
        };
        List<Student> result2 = filterStudent(list,f2);
        for(Student s: result2){
            System.out.println(s);
        }
    }
    static List<Student> filterStudent(List<Student> list ,Filter filter){
        List<Student> result = new ArrayList<>();
        for(Student s:list){
            if(filter.test(s)){
                result.add(s);
            }
        }
        return result;
    }

}
interface Filter {
    boolean test(Student s);
}
