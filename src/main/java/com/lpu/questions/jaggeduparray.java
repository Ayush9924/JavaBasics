package com.lpu.questions;

import java.util.Scanner;

public class jaggeduparray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the numbers of rows: ");
        int rows = scanner.nextInt();

        int arr[][] = new int[rows][];

        for (int i = 0; i<rows; i++){
            System.out.println("enter the num of cols: "+ (i+1));
            int cols = scanner.nextInt();

            arr[i] = new int[cols];

            for (int j = 0; j < cols; j++){
                arr[i][j] = scanner.nextInt();
            }
        }



        // display output
        System.out.println("\nJagged Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
