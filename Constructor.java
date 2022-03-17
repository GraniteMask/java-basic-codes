package com.company;
import java.util.Scanner;

class MyEmployee{
    private int id;
    private String name;

    public MyEmployee(){
        id = 45;
        name = "Your Name";
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class Constructor {

    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        emp.setName("Ratnadeep");
        emp.getName();
        emp.setId(20);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
