package com.lpu.questions;

public class sumOf2Darray {
    public static void main(String[] args) {
        int arr[][] ={
            {2, 2, 2},
            {1, 1, 1},
            {3, 3, 3}};
        int arr2[][] = {
                {1, 1, 3},
                {7, 7, 7},
                {1, 0, 9}
        };
        int sum[][]= new int[3][3];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        for(int i = 0; i < sum.length; i++){
            for(int j = 0; j < sum[i].length; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}