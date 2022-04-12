package com.company;

class thread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thank you");
            try {
                Thread.sleep(455);    // stops the thread for the given time in millisecond
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class thread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thank you");
        }
    }
}

public class java_thread_methods {
    public static void main(String[] args){
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        try{
            t1.join();           // this is done so that t2 starts when the execution of t1 finishes
        }catch (Exception e){
            System.out.println(e);
        }

        t2.start();
    }
}
