package com.corejava;

public class SumOfDigitNumber {
    static void sunOfDigits(int inputNumber){
        int copyOfNumber = inputNumber;
        int sum =0;
        while(copyOfNumber!=0){
            int lastDigit = copyOfNumber%10;
            sum = sum+lastDigit;
            //removing last didgit from the input number
            copyOfNumber = copyOfNumber/10;
        }
        System.out.println("Sum of All Digits : "+inputNumber+ " = "+sum);
    }
    public static void main(String[] args){
        sunOfDigits(2874);
    }
}
