package com.lpu.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadContentOfATextFile {
    public static void main(String[] args) throws IOException {
        File path = new File(FilePaths.SAMPLE_FILE_ABSOLUTE_PATH);

        if (path.exists() && path.isFile()){
            try{
            Scanner scanner = new Scanner(path);
                while(scanner.hasNext()){
                    System.out.println(scanner.nextLine());
                }
            }catch (FileNotFoundException e){
                throw new RuntimeException(e);
            }
    }

        if (path.exists() && path.isFile()){
            try (FileInputStream fis = new FileInputStream(path)){
                int num;
                while((num = fis.read())!= -1){
                    System.out.println((char)num);
                }
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }else {
        }
}//todo csv , json , xml , yaml , .propeties
}
//Serialization

//todo copy file jpg file