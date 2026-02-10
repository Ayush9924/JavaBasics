package com.lpu.OOps.Abstraction;

public interface conplexCase {


    static void call(){
        System.out.println("complex Case");
    }
    default void ring(){
        System.out.println("ringing");
    }
}
