package com.lpu.io.file;

import java.io.FileOutputStream;

public class AppendUsingFOS {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("data.txt", true); // true = append mode
            //it will start appending insteed of replacing

            String text = "\nThis is extra text added using FileOutputStream.";

            byte[] bytes = text.getBytes();

            fos.write(bytes);

            fos.close();

            System.out.println("Text appended successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
