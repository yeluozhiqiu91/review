package com.wang.se.designpattern.filter;

import java.util.List;

/**
 * Created by wang on 2018/2/28.
 */
public class AndCriteria implements Criteria{
    private Criteria firstCriteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria otherCriteria) {
        this.firstCriteria = firstCriteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstPerson=this.firstCriteria.meetCriteria(personList);

        return this.otherCriteria.meetCriteria(firstPerson);
    }
}
