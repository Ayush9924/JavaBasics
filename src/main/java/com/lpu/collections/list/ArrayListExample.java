package com.lpu.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        int[] num = {156,45,878,5,6};
        // All the colection accept only obj type
        ArrayList list = new ArrayList();
        list.add(40);
        list.add("hey");
        list.add(6.2);
        list.add(true);
        System.out.println(list);

        ArrayList<Integer> listOfNums = new ArrayList<>();//forcsing the array to store integer
        listOfNums.add(40);
        listOfNums.add(47);
        listOfNums.add(14);
        listOfNums.add(4);

        System.out.println(listOfNums);

        listOfNums.remove(2);
        System.out.println(listOfNums);

//        listOfNums.add(null);
//        System.out.println(listOfNums);
        listOfNums.set(2,69);
        System.out.println(listOfNums);

        listOfNums.add(2, 9856);
        System.out.println(listOfNums);

        for (int i = 0; i < listOfNums.size(); i++){
            System.out.print(listOfNums.get(i)+" ");
        }
        System.out.println();

        for (int n : listOfNums){
            System.out.print(n + " ");
        }
        System.out.println();

        Iterator<Integer> iterator = listOfNums.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //TODO research on looping from last to first in listofnums;

        listOfNums.stream().forEach(System.out::println);

        listOfNums.stream().filter(x-> x % 2 == 0).forEach(System.out::println);

        if (listOfNums.isEmpty()){
            System.out.println("empty");
        }
        System.out.println("First and Last");
        System.out.println(listOfNums.get(0));
        System.out.println(listOfNums.get(listOfNums.size()-1));//if we have null dont use null it will throw exception

        System.out.println(listOfNums.getFirst());
        System.out.println(listOfNums.getLast());

        List<Integer> list2 = List.of(54,65,4,35);
//        list2.add(5) // its not possible as it is immutable

        listOfNums.addAll(list2);//TODo see how you can truly merge two lists
        System.out.println(listOfNums);
        listOfNums.clear();

        ArrayList<Integer> merged = new ArrayList<>(list);
        merged.addAll(list2);

        System.out.println(merged);


    }
}
