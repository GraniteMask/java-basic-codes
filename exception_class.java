package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString() + " I am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am getMessage()";
    }
}

public class exception_class {
    public static void main (String[] args){
        int a;
        Scanner sc= new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
    }
}

// search for exception methods in JAVA