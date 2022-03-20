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


public class abstract_class {
}
