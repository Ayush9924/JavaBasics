package com.lpu.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsAndList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(){{
          add(11);
          add(29);
          add(34);
          add(4);
        }};

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(list);
//        Collections.copy(list2, list);
        System.out.println(list);
        System.out.println(list2);

        list.replaceAll(x -> x * 2);
        System.out.println(list);

        //assign is very fast in arrya list but inserting is O(n)

        //on creating coustom class we cannot sort it will give error it will dosnt know what factor its should sort

        ArrayList<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("john", 20));
        listOfStudents.add(new Student("jane", 21));
        listOfStudents.add(new Student("jack", 22));
        listOfStudents.add(new Student("jill", 23));
        Collections.sort(listOfStudents, new NameComparator());

        Collections.sort(listOfStudents,
                (Student st1, Student st2)-> st1.name.compareTo(st2.name));
        Collections.sort(listOfStudents,
                Comparator.comparing((Student st) -> st.name));

        System.out.println();;
        listOfStudents.stream().forEach(System.out::println);

    }
}

class Student implements Comparable<Student>{//1sst Modeify the stu class
    String name;
    int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Student st1){
        if(st1.age == this.age){
            return 0;

        }else if (st1.age > this.age){
            return 1;
        }else{
            return -1;
        }
    }
}
//2nd using comparator
class NameComparator implements Comparator<Student> {//it is a functional interface soo we can use lamda function here
    public int compare(Student st1, Student st2){
        return -st1.name.compareTo(st2.name);//if we use -ve it will print in -ve format and even it is integers then use can use minus for rev
    }
}