package com.company;

class thread extends Thread{
    public thread(String name){
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

public class java_thread_priorities {
    public static void main(String[] args){
        thread t1 = new thread("Ratnadeep");
        thread t2 = new thread("RRR1");
        thread t3 = new thread("RRR2");
        thread t4 = new thread("RRR3");
        thread t5 = new thread("RRR4 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}


// MIN_PRIORITY = 1
// NORM_PRIORITY = 5
// MAX_PRIORITY = 10