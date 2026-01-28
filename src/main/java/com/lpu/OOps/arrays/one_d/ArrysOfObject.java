package com.lpu.OOps.arrays.one_d;

import java.util.Arrays;

public class ArrysOfObject {
    public static void main(String[] args) {
        String[] arr = {"Ayush","krishna","vansh"};
        String[] srtArr = new String[5];
        System.out.println(srtArr);//hash code is a unique code
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(srtArr));

        Student[]  students = {
                new Student (1, "adarsh"),
                new Student(3, "krishna"),
                new Student(4, "akash"),
                new Student(2, "suman")
        };
//        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
class Student{
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}