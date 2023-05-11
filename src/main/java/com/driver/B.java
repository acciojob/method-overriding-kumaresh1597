package com.driver;

import org.w3c.dom.ls.LSOutput;

// TASK 2
public class B extends A{


    // Task 3
    public static void main(String[] args) {
        B obj = new B();

        String s = obj.meth();

//        Before overring
//        System.out.println(s)
//        Invoking method from class A


//        After overriding
          System.out.println(s);
//        Method is overridden in Extendend class B
    }

//  Taask 4
//
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
