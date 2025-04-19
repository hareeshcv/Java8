package com.corejava;

import java.util.Arrays;

public class AnagramProgram {
    static void isAnagram(String s1 , String s2){
        String str1 = s1.replaceAll("\\s +", "");
        String str2 = s2.replaceAll("\\s + ", "");

        boolean status= true;
        if(str1.length()!=str2.length()){
            status=false;
        }else {
            char[] arrayOfChar1 = str1.toLowerCase().toCharArray();
            char[] arrayOfChar2 = str2.toLowerCase().toCharArray();

            Arrays.sort(arrayOfChar1);
            Arrays.sort(arrayOfChar2);
            status = Arrays.equals(arrayOfChar1, arrayOfChar2);
        }
            if(status){
                System.out.println(s1+" and" + s2 +" are anagrams");
            }else{
                System.out.println(s1+" and" + s2 +" are not anagrams");

        }
    }
    public static void main(String[] args){
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("keEp", "peeK");
        isAnagram("SiLeNt CAT", "LisTen AcT");
        isAnagram("Debit Card", "Bad Credit");
        isAnagram("School MASTER", "The ClassROOM");
        isAnagram("DORMITORY", "Dirty Room");
        isAnagram("ASTRONOMERS", "NO MORE STARS");
    }
}
