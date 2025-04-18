package com.corejava;

public class StringReverse {
    public static void main(String[] args){
        String str = "Hareesh";

        StringBuffer sb = new StringBuffer(str); // using StrinBuffer Class
        System.out.println("Using String Reverse Method:" + sb.reverse());
        //Scenario 2
        char[] strArray = str.toCharArray();
        System.out.println("using charArray:" );
        for(int i=strArray.length-1; i>=0;i--){
            System.out.print( strArray[i]);
        }

    }
}
