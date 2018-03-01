package com.wang.se.designpattern.iterator;

/**
 * Created by wang on 2018/3/1.
 */
public class NameRepository implements Container{
    private String names[]={"Tom","Jake","Green"};
    public Iterator getIterator() {
        return new NameIterator();
    }
    private class NameIterator implements Iterator{
        int index;
        public boolean hasNext() {
            if(index<names.length){
                return true;
            }
            return false;
        }

        public Object next() {
            if(index<names.length){
                return names[index++];
            }
            return null;
        }
    }
}
