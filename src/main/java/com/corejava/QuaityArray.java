package com.corejava;

public class QuaityArray {
    public static void  main(String [] args){
        int [] arrayOne = {1,2,3,4};
        int[] arrayTwo = {1,2,3,5};
        boolean equalOrNot = true;

        if(arrayOne.length==arrayTwo.length){
            for(int i=0;i<arrayOne.length;i++){
                if(arrayOne[i]!=arrayTwo[i]){
                    equalOrNot=false;
                }
            }
        }else{
            equalOrNot=false;
        }
        if(equalOrNot){
            System.out.println("Both array values are equal");
        }
        else{
            System.out.println("Both array values are not equal");
        }
    }
}
