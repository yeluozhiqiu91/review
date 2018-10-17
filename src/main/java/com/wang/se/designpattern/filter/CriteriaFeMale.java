package com.wang.se.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/2/28.
 */
public class CriteriaFeMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femaleList=new ArrayList<Person>();
        for(Person p:personList){
            if(p.getGender().equalsIgnoreCase("female")){
                femaleList.add(p);
            }
        }
        return femaleList;
    }
}
