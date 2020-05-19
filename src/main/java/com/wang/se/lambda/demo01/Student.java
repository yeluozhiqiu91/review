package com.wang.se.lambda.demo01;

/**
 * @Author: wangliujie
 * @Date: 2020/5/15 21:27
 */
public class Student {
    private String name;
    private int age;
    private Double score;
    private String classRoom;

    public Student(String name, int age, Double score, String classRoom) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.classRoom = classRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", classRoom='" + classRoom + '\'' +
                '}';
    }
}
