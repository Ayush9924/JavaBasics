package com.lpu.io.file;

import java.io.File;

public class FileOperations {
    public static void main(String... args) {
        // \\ means single slash
        File file = new File(FilePaths.SAMPLE_FILE_ABSOLUTE_PATH);

        if (file.exists()){
            System.out.println("file exist");
            System.out.println("folder " + file.isDirectory());
            System.out.println("file"+file.isFile());
            System.out.println("Absolute path :" +file.getAbsolutePath());
            System.out.println("Name :" + file.getName());

            System.out.println("Parent :" + file.getParent());
            System.out.println("length in bytes :" + file.length());
            System.out.println("read : " + file.canRead());
            System.out.println("write : " + file.canWrite());
            System.out.println("execute " + file.canExecute());
            System.out.println("Last Modified : " + file.lastModified());
            System.out.println(file.list());
        }
    }
}
