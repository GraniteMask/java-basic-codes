package com.company;
import java.util.*;

public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);    // since this is added later so it will be at the top then the element will be 5
        l1.addAll(l2);   // adding all the elements of l2 in l1
        System.out.println(l1.contains(27));    // return boolean after checking whether this number is in the arraylist or not
        System.out.println(l1.indexOf(27));      // return the index number of that number. If that number is not available then it returns -1.
//        l1.clear();
        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i)); // getting the value of ith element
        }
    }
}
