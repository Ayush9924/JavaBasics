package com.lpu.OOps.Inheritance;

public class TypeCasting {
    public static void main(String[] args) {
        bird b1 = new bird();
        b1.eat();
        b1.fly();
        System.out.println(b1.wingSpan);
        System.out.println(b1.isExtinct);

        Animal a2 = b1;//upcasting
        a2.eat();
//        a2.fly();//not allowed to call child class
        System.out.println(a2.isExtinct);

        Animal a3 = new bird();

        if(a3 instanceof bird){
            bird myBird = (bird) a3;//downcasting

            myBird.fly();
            myBird.eat();
        }else{
            System.out.println("this is animal connot fly");
        }
    }
}
