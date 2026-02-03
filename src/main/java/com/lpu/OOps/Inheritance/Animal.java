package com.lpu.OOps.Inheritance;

public class Animal {
    boolean isExtinct;
    void run() {
        System.out.println("Animal is running");
        System.out.println("runn");
    }
    void eat(){
        System.out.println("eating");
    }

}

    class Tiger extends Animal {
//    @overriding
//        void run() {
//        System.out.println("Tiger is running");
//   }


}

     class bird extends Animal{
    int wingSpan;
    void fly(){
        System.out.println("the bird is flying");
    }
     }


