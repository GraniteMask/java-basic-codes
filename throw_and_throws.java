package com.company;

public class throw_and_throws {
    public static float area(int r){
        float result = (float) (Math.PI*r*r);
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args){
        try{
            int c = divide(6,8);
            System.out.println(c);
        }catch(Exception e){
            System.out.println("Exception " + e);
        }

    }
}
