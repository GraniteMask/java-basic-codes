package com.company;

import java.util.Scanner;

public class specific_exception_handling {
    public static void main(String[] args){
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();
        System.out.println("Enter the number");
        int number = sc.nextInt();
    }
}
