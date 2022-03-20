package com.company;

interface bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int a = 46;
    void blowHorn1();
    void blowHorn2();
}

class AvonCycle implements bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Blow Horn");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speedup");
    }
    public void blowHorn1(){
        System.out.println("wow momo");
    }
    public void blowHorn2(){
        System.out.println("wowowowow");
    }
}

public class interfaces {
    public static void main(String[] args){
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        // You can create properties in Interfaces
//        System.out.println(cycle.a);
        // You cannot modify the properties in interfaces as they are final
        //cycle.a = 46


        cycle.blowHorn1();
        cycle.blowHorn2();
    }
}
