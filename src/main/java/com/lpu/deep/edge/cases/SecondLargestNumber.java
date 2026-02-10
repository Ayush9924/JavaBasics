package com.lpu.deep.edge.cases;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {56, -45, 789, 90, 80};
        int lar = arr[0];
        int secLar = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > lar) {
                secLar = lar;
                lar = arr[i];
            }
            else {
                if (arr[i] > secLar) {
                    secLar = arr[i];
                }
            }
        }
        System.out.println(secLar);
    }
}
