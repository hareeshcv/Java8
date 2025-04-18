package com.corejava;

public class StringReverse2 {
    static String reursiveMethod(String str){
        if((null==str) || (str.length()<=1)){
            return str;
        }
        return reursiveMethod(str.substring(1)) + str.charAt(0);
    }
    public static void main(String [] args){
        String input = "Mahesh";
        String output = reursiveMethod(input);
        System.out.println("String input value: " + input);
        System.out.println("String output value: " + output);
    }
}
