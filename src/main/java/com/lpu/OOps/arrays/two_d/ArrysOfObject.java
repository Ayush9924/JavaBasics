package com.lpu.OOps.arrays.two_d;

import java.util.Arrays;

public class ArrysOfObject {
    public static void main(String[] args) {
        String[] arr = {"Ayush","krishna","vansh"};
        String[] srtArr = new String[5];
        System.out.println(srtArr);//hash code is a unique code
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
