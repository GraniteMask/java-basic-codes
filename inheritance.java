package com.company;

class Base{
    int x;

    public void setX(int x) {
        System.out.println("I am in Base and setting X now");
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance {
    public static void main(String[] args){
//        Base b = new Base();
        Derived b = new Derived();
        b.setX(4);
        System.out.println(b.getX());
    }
}
