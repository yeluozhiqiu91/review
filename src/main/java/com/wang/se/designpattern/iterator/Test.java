package com.wang.se.designpattern.iterator;

/**
 * Created by wang on 2018/3/1.
 */
public class Test {
    public static void main(String[] args) {
        NameRepository nameRepository=new NameRepository();
        for(Iterator iter=nameRepository.getIterator();iter.hasNext();){
            String name=(String)iter.next();
            System.out.println("Name:"+name);
        }
    }
}
