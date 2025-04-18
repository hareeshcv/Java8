package com.Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args){
        //Collection<String> coll = new HashSet<>();
        Collection<String> coll = new TreeSet<String>();
        coll.add("Hareesh");
        coll.add("Rakesh");
        coll.add("Ramesh");
        coll.add("Naresh");
        coll.add("Hareesh"); //it will not allow the duplicate values

        Iterator<String> names = coll.iterator();
        while(names.hasNext())
            System.out.println(names.next());
    }
}
