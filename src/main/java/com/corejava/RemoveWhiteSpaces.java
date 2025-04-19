package com.corejava;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input String to remove White Spaces:..");
        String inputString= sc.nextLine();
        String withOutSpaes = inputString.replaceAll("\\s+", "");
        System.out.println(withOutSpaes);
    }
}
