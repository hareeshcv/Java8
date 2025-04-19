package com.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateArray {
    private static void duplicateNumber(int[] inputArray){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : inputArray){
            if(map.get(element) == null){
                map.put(element,1);
            }
            else{
                map.put(element,map.get(element)+1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            if(entry.getValue()>1){
                System.out.println("Duplicate Element:" + entry.getKey() + " found" + entry.getValue());
            }
        }
    }
    public static void main(String [] args){
        int[] inputArray = new int[] {100,231,101,100,231};
        duplicateNumber(inputArray);
    }
}
