package com.corejava;

import java.util.Arrays;

public class EqualityOfTwoStringArrays {
    public static void main(String[] args){
        String[] str1 = {"Hareesh","Mahesh","Rakesh","Rahul"};
        String[] str2 = {"Mahesh","Rahul","Hareesh","Rakesh"};

        Arrays.sort(str1);
        Arrays.sort(str2);
        System.out.println(Arrays.equals(str1,str2) );

        String[][] s1 = {{"Hareesh","Mahesh","Rakesh","Rahul"},{"mohan","neha","sneha"}};
        String[][] s2 = {{"Hareesh","Mahesh","Rakesh","Rahul"},{"mohan","neha","sneha"}};
        System.out.println(Arrays.deepEquals(s1,s2));
        System.out.println(Arrays.equals(s1,s2));
    }
}
