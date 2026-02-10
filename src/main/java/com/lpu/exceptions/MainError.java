package com.lpu.exceptions;

public class MainError {
    static int counter = 0;
    public static void main(String[] args) {
        call();
    }
    static void call(){

        System.out.println("calling" + ++counter);
        call();
    }
}


//package com.lpu.exceptions;
//
//public class MainError {
//    int counter = 0;
//    public static void main(String[] args) {
//        MainError m=new MainError();
//        m.call();
//    }
//    void call(){
//
//        System.out.println("calling" + ++counter);
//        call();
//    }
//}
