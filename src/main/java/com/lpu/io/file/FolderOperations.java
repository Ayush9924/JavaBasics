package com.lpu.io.file;

import java.io.File;
import java.io.IOException;

public class FolderOperations {
    public static void main(String... args) {

        File path = new File(FilePaths.SAMPLE_FOLDER_ABSOLUTE_PATH + "\\sample2.txt");

        if (!path.exists()) {
            System.out.println("Path doesn't exist, creating file...");

            try {
                boolean createStatus = path.createNewFile();
                System.out.println("New file created: " + createStatus);
            } catch (IOException e) {
                System.out.println("Error while creating file: " + e.getMessage());
            }

        } else {
            System.out.println("Path exists, deleting file...");

            boolean deleteStatus = path.delete();
            System.out.println("File deleted: " + deleteStatus);
        }
    }
}
//todo copy a file uisng io