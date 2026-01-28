package com.lpu.OOps.arrays.one_d;

import java.util.Scanner;

public class MissingNaturalNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();      // numbers from 1 to n
        int[] arr = new int[n - 1];     // one number missing
        int ans = 0;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        // XOR all array elements
        for (int i = 0; i < n - 1; i++) {
            ans ^= arr[i];
        }

        // XOR numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            ans ^= i;
        }

        System.out.println(ans);
    }
}
