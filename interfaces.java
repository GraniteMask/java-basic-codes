package com.company;

interface bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements bicycle{
    void blowHorn(){
        System.out.println("Blow Horn");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speedup");
    }
}

public class interfaces {
}
