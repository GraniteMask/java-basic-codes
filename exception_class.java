package com.company;

class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString() + " I am toString()";
    }
    
}

public class exception_class {
    public static void main (String[] args){

    }
}
