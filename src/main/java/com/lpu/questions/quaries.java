package com.lpu.questions;

import java.util.Scanner;

public class quaries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i <= t; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int sum = a;
            int power = 1;

            for (int j = 0; j <= n; j++){
                sum = sum + power + b;
                power = power * 2;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
//String s = Integer.toString(n);
