package com.lpu.OOps.arrays.one_d;

public class arraysIntro {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[4] = 10;
        System.out.println(arr[4]);
        System.out.println(arr);
        for (int i = 0; i<arr.length; i++){//.length is the variable instance variable of array
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
//            arr[i] = i*i;
            System.out.println(arr[i]*arr[i]);
        }
    }
}
