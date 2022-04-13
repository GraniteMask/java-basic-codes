package com.company;

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

    }
}
