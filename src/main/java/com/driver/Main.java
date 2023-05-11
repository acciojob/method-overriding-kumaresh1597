package com.driver;

public class Main {
    public static class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

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
}