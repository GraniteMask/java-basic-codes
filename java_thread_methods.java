package com.company;

class thread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thank you" + this.getName());
        }
    }
}

class thread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thank you" + this.getName());
        }
    }
}

public class java_thread_methods {
    public static void main(String[] args){
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        try{
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        }

        t2.start();
    }
}
