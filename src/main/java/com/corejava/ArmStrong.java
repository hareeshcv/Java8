package com.corejava;

public class ArmStrong {
    static void checkArmStrongNumber(int number) {

        int copyOfNumber = number;
        int noOfDigits = String.valueOf(number).length();
        int sum = 0;
        while (copyOfNumber != 0) {

            int lastDigits = copyOfNumber % 10;
            int lastDigitToThePowerOfNoOfDigits = 1;
            for (int i = 0; i < noOfDigits; i++) {
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigits;

            }
            sum = sum + lastDigitToThePowerOfNoOfDigits;
            copyOfNumber = copyOfNumber / 10;

        }
        if (sum == number) {
            System.out.println(number + "is an armstrong number");
        } else {
            System.out.println(number + "is not an armstrong number");
        }
    }
        public static void main(String [] args){
        checkArmStrongNumber(157);
        checkArmStrongNumber(153);
        checkArmStrongNumber(9474);
        }
}
