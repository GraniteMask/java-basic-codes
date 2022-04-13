package com.company;

public class throw_and_throws {
    public static int dicide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args){
        try{
            int c = divide(6,8);
            System.out.println(c);
        }

    }
}
