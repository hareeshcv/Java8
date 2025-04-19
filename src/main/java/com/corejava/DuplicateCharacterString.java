package com.corejava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacterString {

     static void duplicateCharString(String inputString){

         HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();
             char[] charArray = inputString.toCharArray();
             for(char c : charArray){
                if(charCountMap.containsKey(c)){
                    charCountMap.put(c, charCountMap.get(c)+1);
                }
                else{
                    charCountMap.put(c,1);
                }
             }
         Set<Character> charInString = charCountMap.keySet();
             System.out.println("Duplicate Characters Input String:" + inputString);
            for(Character ch:charInString){
                if(charCountMap.get(ch) > 1){
                    System.out.println(ch + " :" + charCountMap.get(ch));
                }
            }
    }
    public static void main(String[] args){
         duplicateCharString("JavaJ2EE");
         duplicateCharString("Hareesh");
         duplicateCharString("SprinfSpringboot");
    }
}
