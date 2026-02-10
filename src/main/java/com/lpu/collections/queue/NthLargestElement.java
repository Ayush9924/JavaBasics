package com.lpu.collections.queue;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class NthLargestElement {
    public static void main(String[] args) {
        List<Integer> nums = List.of(45,6,5,1,5,2,2,22,9,8,99,54,51,26,112,5666,215,2,542,41);
        int n = 4;

        HashSet<Integer> set = new HashSet<>(nums);
        if (set.size() < n){
            System.out.println("invalid output");
            return;
        }else {
            PriorityQueue<Integer> pg = new PriorityQueue<>(Collections.reverseOrder());
            pg.addAll(set);

            for (int i = 1; i <= n-1; i++){
                pg.poll();
            }
            System.out.println(pg.peek());
        }

    }
}
