package com.lpu.collections.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String... args) {
//        PriorityQueue<Integer> pg = new PriorityQueue<>();
        PriorityQueue<Integer> pg = new PriorityQueue<>(Collections.reverseOrder());

        pg.add(5);
        pg.add(42);
        pg.add(41);
        pg.add(-4);
        pg.add(52);
        pg.add(00);
        pg.add(51);
        System.out.println(pg);//unordered

        Integer poll1 = pg.poll();
        System.out.println(poll1);//poll will remove the top element

        System.out.println(pg);

        Integer poll2 = pg.poll();
        System.out.println(poll2);
        System.out.println(pg);//tree min heap

        System.out.println(pg.peek());
        System.out.println(pg);

        for (Integer num : pg){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
