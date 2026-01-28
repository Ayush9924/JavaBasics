package com.lpu.questions;

public class matrixMul {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        }; // 2 × 3

        int[][] b = {
                {1, 2},
                {3, 4},
                {5, 6}
        }; // 3 × 2

        int r1 = a.length;
        int c1 = a[0].length;
        int c2 = b[0].length;

        int[][] result = new int[r1][c2];

        // matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // print result
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
