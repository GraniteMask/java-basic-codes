package com.company;

class thread2 extends Thread{
    public thread2(String name){
        super(name);
    }
    public void run(){
        int i=34;
//        System.out.println("Thank you" + this.getName());
        while(true){
            System.out.println("Thank you" + this.getName());
        }
    }
}

public class java_thread_methods {
}
