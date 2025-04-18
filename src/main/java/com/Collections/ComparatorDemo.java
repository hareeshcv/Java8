package com.Collections;

import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;


    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}
public class ComparatorDemo {
    public static void main(String [] args){

        Comparator<Student> com = ( i,  j)->i.age > j.age?1:-1;

        List<Student> list = new ArrayList<>();
        list.add(new Student(29,"Hareesh"));
        list.add(new Student(31,"Rahul"));
        list.add(new Student(18,"manasa"));
        list.add(new Student(21,"mahesh"));

        Collections.sort(list,com);
        for (Student std : list) {
            System.out.println(std);
        }
    }
}
