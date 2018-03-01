package com.wang.se.designpattern.filter;

import java.util.List;

/**
 * Created by wang on 2018/2/28.
 */
public class OrCriteria implements Criteria{
    private Criteria firstCriteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria firstCriteria, Criteria otherCriteria) {
        this.firstCriteria = firstCriteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstPersons=this.firstCriteria.meetCriteria(personList);
        List<Person> secondPersons=this.otherCriteria.meetCriteria(personList);
        for(Person p:secondPersons){
            if(!firstPersons.contains(p)){
                firstPersons.add(p);
            }
        }
        return firstPersons;
    }
}
