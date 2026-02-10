package com.lpu.map;

import java.util.*;

public class MapExample {
    public static void main(String... args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ayush");
        map.put(2, "krishna");
        map.put(3, "V");
        map.put(2, "Mush");

        System.out.println(map);//key value pair together call as entrys

//        System.out.println(map.keySet());//why we call it keyset as it is unique it give us in set
        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        //Hashing -> keys
        //key -> unique
        //value -> Duplicate

        Collection<String> values = map.values();
        System.out.println(values);

        map.remove(2);
        map.remove(10);//it will not hurt anything
        System.out.println(map);

        //TODO make sure to lear about collection and collections
//        If key is not present in the map, then compute a value and insert it.
        System.out.println(map.get(0));
        System.out.println(map.get(1));

        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
//            System.out.println(entry);
        }

        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
