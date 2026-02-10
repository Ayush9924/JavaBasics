package com.lpu.questions;

import java.util.Scanner;

public class ArmstrongChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        System.out.println(isArmstrong(input));
    }

    // 🔹 Armstrong check without log
    public static boolean isArmstrong(int num) {

        int original = num;
        int digits = 0;

        // 1️⃣ Count digits
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // 2️⃣ Calculate Armstrong sum
        int sum = 0;
        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // 3️⃣ Compare
        return sum == original;
    }
}

//
//package dev.codecounty.dsa.pattern;
//
//import java.util.Scanner;
//
//public class ArmstrongChecker {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int input = sc.nextInt();
//
//        if (isArmstrong(input)) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//
//    }
//
//    public static boolean isArmstrong( int num) {
//
//        // 1. Find number of digits mathematically
//        // Example: log10(153) is ~2.18. Floor + 1 = 3.
//        int n = (num == 0) ? 1 : (int) Math.log10(num) + 1;
//        int sum = 0;
//        int temp = num;
//
//        while (temp > 0) {
//            int digit = temp % 10;
//
//            // Math.pow returns double, so we cast to int
//            sum += (int) Math.pow(digit, n);
//
//            temp /= 10;
//        }
//
//        return sum == num;
//    }
//}