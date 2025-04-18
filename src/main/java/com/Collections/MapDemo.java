package com.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String [] args){

        Map<String, Integer> students = new HashMap<>();
        students.put("Hareesh", 95);
        students.put("Rakesh",90);
        students.put("Mohan",80);
        students.put("Hareesh", 99);

        System.out.println(students);
        System.out.println(students.keySet());
        for(String name : students.keySet()){
            System.out.println(name +":" + students.get(name));
        }
    }
}
