package com.lpu.OOps.arrays.two_d;

public class Caution {
    public static void main(String[] args) {
        int[][] mat = {{
                2,3,4},{
                4,5,6},
                {7,8,4}
        };
        int[][] cloned = mat.clone();
        mat[0][0] = 20;
        System.out.println(cloned[0][0]);//clone is good for only 1d array it will not work like this way it will chanhe the value
        int[][] cloned2 = new int[mat.length][];
        for (int i = 0; i < cloned2.length; i++){
            cloned2[i] = mat[i].clone();
        }
//        mat[0][0]=20;
//        System.out.println(cloned2[0][0]);//this will print the clone do not update the value
    }
}
