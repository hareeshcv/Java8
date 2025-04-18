package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String args[]){
        //Collection<Integer> collection = new ArrayList<>();
        //if we want to work with index values we have to use List  instead of using COllection interface
        List<Integer> collection = new ArrayList<>();
        collection.add(10);
        collection.add(14);
        collection.add(13);
        collection.add(20);

        System.out.println(collection.get(2));
        System.out.println("index value for given number from list= " + collection.indexOf(14));
        for(int num : collection){

            System.out.println(num);
        }

    }
}
