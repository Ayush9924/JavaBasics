package com.lpu.collections.set;

import java.util.*;
import java.util.stream.Collectors;

public class HashSetExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(55,42,2,5,24,3,55,21,35,1,5,7);
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums){
            if(!list.contains(num)){
                list.add(num);//O(n^2); time complexity
            }
        }
        System.out.println(list);

//        HashSet<Integer> set = new HashSet<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();//we use linkedhasset for sorting order

        for (int num : nums){
            set.add(num);
        }
        System.out.println(set);//does not contain duplicates soo time complexity is O(n)
        //no Order
        //for order we use linked hashset;
        //extermly fast in searching;
//        set.add(null);
//        set.add(null);
        System.out.println(set);

        for (Integer num: set){
            System.out.println(num);
        }
        Set<Integer> collect = list.stream().collect(Collectors.toSet());
//        list.parallelStream().forEach(System.out::println);

        System.out.println(set.contains(5));//almost O(1);
        //we cannot sort a set as it is fixed so we need tree set

        TreeSet<Integer> treeSet = new TreeSet<>(set);//we cannot use null with treeSet
        System.out.println(treeSet); //TODO time complext for treeSet


    }
}
