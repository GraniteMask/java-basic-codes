package com.company;

class Base1{
    public int x;

    Base1(){
        System.out.println("I am a constructor");
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Derived1 extends Base1{
    public int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class constructors_in_Inheritance {
    public static void main(String[] args){
        Base1 b = new Base1();
    }
}
