package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("Constructor of base 2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child extends Parent2{
    public void greet(){
        System.out.println("Good Morning!");
    }
}

abstract class Child3 extends Parent2{
    public void tn(){
        System.out.println("I am good");
    }
}


public class abstract_class {
    public static void main(String[] args){
//        Parent2 p = new Parent2();          CANNOT BE IMPLEMENTED AS THIS A ABSTRACT CLASS
        Child c = new Child();
    }
}
