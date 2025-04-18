package com.corejava;

import java.util.Scanner;

public class Piramid3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int Number = sc.nextInt();

        int countOfRow=1;
        for(int i=Number;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=countOfRow;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
            countOfRow++;
        }

    }
}
