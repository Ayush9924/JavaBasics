package com.lpu.questions;

public class PrivateConst {
    private  PrivateConst(){
        System.out.println("obj creation not allowed");
    }
    static void test() {
        new PrivateConst(); // allowed inside same class
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int square(int x){
        return x*x;
    }

}
//When object is useless (Utility class)
//
//Example: Math, Arrays, Collections
//
//They contain only static methods.
//
//So why make object?
//
//Math m = new Math(); // meaningless
//
//
//So Java designers did:
//
//constructor private
//
//no object allowed
//
//✔ Saves memory
//✔ Prevents misuse
//✔ Makes code clean