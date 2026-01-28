package com.lpu.questions;

public class Print2Darray {
    public static void main(String[] args) {
        int arr[][] = {
                {4, 5, 6},
                {5, 2, 6},
                {7, 0, 1}};
        for(int i = 0; i< arr.length; i++){
            for (int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
