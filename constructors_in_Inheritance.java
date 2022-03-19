package com.company;

class Base1{
    public int x;

    Base1(){
        System.out.println("I am a constructor");
    }

    Base1(int a){
        System.out.println("Constructor:" + a);
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

    Derived1(){
        super(0);
        System.out.println("I am a Derived class constructor");
    }

    Derived1(int x, int y){
        super(x);
        System.out.println("Derived Constructor y:" + y);
    }
}

class Derived2 extends Derived1{
    Derived2{
        System.out.println("Default Derived2");
    }
    Derived2(int x, int y, int z){
        super(x,y);
        System.out.println("Derived2:" + z);
    }
}

public class constructors_in_Inheritance {
    public static void main(String[] args){
//        Base1 b = new Base1();
//        Derived1 d = new Derived1(11,12);
          Derived2 dd = new Derived2(11,12,13);
    }
}
