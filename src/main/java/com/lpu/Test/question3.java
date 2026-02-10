package com.lpu.Test;

import java.util.Scanner;

public class question3 {
    public static int findSecondLargest(int[] arr) {
        int l = arr[0];
        int secLar =arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > l) {
                secLar = l;
                l= arr[i];
            }
        }
        return secLar;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = findSecondLargest(arr);
        System.out.println(result);

    }
}
