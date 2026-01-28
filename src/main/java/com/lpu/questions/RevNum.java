package com.lpu.questions;

import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int rev = 0;

        while (num != 0) {
            int digit = num % 10;      // get last digit
            rev = rev * 10 + digit;    // add digit to reverse
            num = num / 10;            // remove last digit
        }

        System.out.println(rev);
    }
}
