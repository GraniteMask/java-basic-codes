package com.company;

class thread extends Thread{
    public thread(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank you");
    }
}

public class java_thread_priorities {
    public static void main(String[] args){
        thread t1 = new thread("Ratnadeep");
        thread t2 = new thread("RRR");
    }
}


// MIN_PRIORITY = 1
// NORM_PRIORITY = 5
// MAX_PRIORITY = 10