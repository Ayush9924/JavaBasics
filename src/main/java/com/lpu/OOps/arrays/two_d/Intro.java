package com.lpu.OOps.arrays.two_d;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        int matrix[][] = new int[3][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        for (int[] arr
                : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
//add two strings //why binary seach time complexsity is Olog(n);// matrix multiply