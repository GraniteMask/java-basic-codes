package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";          // write toString then press enter to get the auto suggestion for this whole block
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class throw_and_throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = (Math.PI*r*r);
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args){
        try{
//            int c = divide(6,8);
//            System.out.println(c);
            double ar = area(6);
        }catch(Exception e){
            System.out.println("Exception " + e);
        }


    }
}

// We can use 'finally' if we want to execute certain code at any cost.
