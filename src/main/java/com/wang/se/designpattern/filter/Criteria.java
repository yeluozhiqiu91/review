package com.wang.se.designpattern.filter;

import java.util.List;

/**
 * Created by wang on 2018/2/28.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> personList);
}
