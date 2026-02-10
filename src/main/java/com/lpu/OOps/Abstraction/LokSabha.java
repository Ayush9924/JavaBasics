package com.lpu.OOps.Abstraction;

public interface LokSabha {
    void elect(int candidate);
//    void electDecision();
    static void members(){
        System.out.println("there are "+ 543 + " memebrs in Loksabha");
    }
    default void locationOfLokSabha(){
        System.out.println("Locatoion is Delhi");
    }
}
//any interface having one abstraction function is called as functional interface;

