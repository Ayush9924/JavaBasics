package com.lpu.basics;

//public class Conditionals {
//    public static void main(String[] args) {
//        int x =100;
//        if(( x > 0 ) && ( x % 2 == 0 )){
//            System.out.println("even");
//        }
//        else if (x<0){
//            System.out.println("negative");
//        }
//        else{
//            System.out.println("odd");
//        }
//    }
//}


class Conditionals {
    public static void main(String[] args) {
        int year = 2025;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}