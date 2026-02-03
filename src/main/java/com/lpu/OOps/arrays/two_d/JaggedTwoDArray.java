package com.lpu.OOps.arrays.two_d;

public class JaggedTwoDArray {
    public static void main(String[] args) {//asementic 2d Array
        int [][] jagged = new int[3][];
        jagged[0] = new int[5];
        jagged[1] = new int[3];
        jagged[2] = new int[4];

        for (int i = 0; i< jagged.length; i++){
            for (int j = 0; j< jagged[i].length; j++){
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
