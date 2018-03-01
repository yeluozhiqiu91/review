package com.wang.se.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/2/28.
 */
public class CriteriaMale implements Criteria{
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> maleList=new ArrayList<Person>();
        for(Person p:personList){
            if(p.getGender().equalsIgnoreCase("male")){
                maleList.add(p);
            }
        }
        return maleList;
    }
}
