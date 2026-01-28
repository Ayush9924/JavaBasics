package com.lpu.OOps.arrays.one_d;

import java.util.Arrays;

public class ArrayClonning {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int [] dup = arr;
        arr[0] = 10;
        System.out.println(dup[0]);

        int[] clone = arr.clone();
        clone[0] = 20;

        System.out.println(arr[0]);
        System.out.println(Arrays.toString(clone));

    }
}
