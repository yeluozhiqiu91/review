package com.wang.se.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/2/28.
 */
public class CriteriaSingle implements Criteria{
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singleList=new ArrayList<Person>();
        for(Person p:personList){
            if(p.getStatus().equalsIgnoreCase("single")){
                singleList.add(p);
            }
        }
        return singleList;
    }
}
