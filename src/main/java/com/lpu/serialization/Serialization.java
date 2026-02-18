package com.lpu.serialization;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {

        Student2 st1 = new Student2(23, "Sam");

        // Serialization (Object -> File)
        try {
            FileOutputStream fileOut = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(st1);

            out.close();
            fileOut.close();

            System.out.println("Object Serialized Successfully!");

        } catch (Exception e) {
            System.out.println("Serialization Error: " + e);
        }

        // Deserialization (File -> Object)
        try {
            FileInputStream fileIn = new FileInputStream("student.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Student2 obj = (Student2) in.readObject();

            in.close();
            fileIn.close();

            System.out.println("Object Deserialized Successfully!");
            System.out.println(obj.age + " " + obj.name);

        } catch (Exception e) {
            System.out.println("Deserialization Error: " + e);
        }
    }
}

class Student2 implements Serializable {
    int age;
    String name;

    private static final long serialversionUID = 1L; // it should remain same while serilization and deserialization

    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

//todo serialVersion UID
//TOdo input output me dek io ka private wala dek le
//todo MIME type MIO file copying


//Maven is used as buid tool which make it for runnable program.... for working with gradle we need to use kotlin with it POM.xlm is created when we create project with maven
//when we complie it compile whole project as bacause of maven we use it as project
//it uses Apache
//it is a  dependency management tool
//it holds the config for the project
//it handel project life cycle
