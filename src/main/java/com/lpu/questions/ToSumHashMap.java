package com.lpu.questions;

import java.util.HashMap;

public class ToSumHashMap {
    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 8, 11, 2};
        int tar = 10;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int need = tar - arr[i];

            if (map.containsKey(need)) {
                System.out.println(map.get(need) + " " + i);
                return;
            }

            map.put(arr[i], i);
        }
                                                    //TODO Blind 75 , Grind 75 , top 150
        //Bitwise
        //Arrays
        //strings
        //stack
        //queue
        //LinkedList
        //singly and doubly
        //2 pointers
        //sliding window two graph
        //recurrsion tree, dp, graph
        //trie
        //Merge sort

        //TODO Merge sort Stack codes


        System.out.println("0");
    }
}
