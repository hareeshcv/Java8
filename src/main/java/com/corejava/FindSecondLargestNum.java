package com.corejava;

public class FindSecondLargestNum {
    static int secondLargestNumber(int[] inputNumber){
        int firstLargestNum,secondLargestNum;
        if(inputNumber[0]>inputNumber[1]){
            firstLargestNum = inputNumber[0];
            secondLargestNum = inputNumber[1];
        }else {
            firstLargestNum = inputNumber[1];
            secondLargestNum = inputNumber[0];
        }
        for(int i=2; i<inputNumber.length;i++){
            if(inputNumber[i] > firstLargestNum){
                secondLargestNum=firstLargestNum;
                firstLargestNum = inputNumber[i];

            }else if(inputNumber[i]<firstLargestNum && inputNumber[i]>secondLargestNum){
                secondLargestNum = inputNumber[i];
            }
        }
        return secondLargestNum;
    }
    public static void main(String [] args){
        System.out.println(secondLargestNumber(new int[]{45, 51, 28, 75, 49, 42}));
        System.out.println(secondLargestNumber(new int[] {985, 521, 975, 831, 479, 861}));
    }
}
