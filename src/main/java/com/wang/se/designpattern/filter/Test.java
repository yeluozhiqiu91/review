package com.wang.se.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/2/28.
 */
public class Test {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));
        Criteria maleCriteria=new CriteriaMale();//过滤男人
        Criteria femaleCriteria=new CriteriaFeMale();//过滤女人
        Criteria singleCriteria=new CriteriaSingle();//过滤单身的
        Criteria andCriteria=new AndCriteria(maleCriteria,singleCriteria);//单身男
        Criteria orCriteria=new OrCriteria(femaleCriteria,singleCriteria);//女的或者单身的
        printPersons(maleCriteria.meetCriteria(persons));
        System.out.println();
        printPersons(femaleCriteria.meetCriteria(persons));
        System.out.println();
        printPersons(singleCriteria.meetCriteria(persons));
        System.out.println();
        printPersons(andCriteria.meetCriteria(persons));
        System.out.println();
        printPersons(orCriteria.meetCriteria(persons));
    }
    public static void printPersons(List<Person> personList){
        for(Person p:personList){
            System.out.println(p.toString());
        }
    }
}
