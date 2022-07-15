package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\nirpe\\IdeaProjects\\Technical Training - Java\\src\\com\\FileHandling\\FileReadDemo.java";

        File file = new File(path);

        final int EOF = -1;

        if(file.exists()) {
            FileInputStream fs = new FileInputStream(file);
            int singleByte = fs.read(); // 1 byte

            while(singleByte != EOF) {
                System.out.print((char)singleByte);
                singleByte = fs.read();
            }
            fs.close();
        }
    }
}
