package com.corejava;

import java.util.Scanner;

public class PiramidMainClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rowCount");
        int noOfRows = sc.nextInt();

        int rowCount = 1;
        System.out.println("Here is Piramid Structure");

        for(int i=noOfRows;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=rowCount;j++){
                System.out.print(rowCount + " ");
            }
            System.out.println();
             rowCount++;
        }

    }
}
