package com.FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileReadWriteTask {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Writing file...");

        System.out.println("Enter the data to write in file: ");
        String txt = sc.nextLine();

        String path = "D:\\Java-TechnicalTraining\\songs\\sample.txt";

        FileOutputStream fo = new FileOutputStream(path);
        fo.write(txt.getBytes());
        fo.close();

        File file = new File(path);
        int EOF = -1;

        System.out.println("Reading file...");

        if (file.exists()) {
            FileInputStream fs = new FileInputStream(file);
            int singleByte = fs.read(); // 1 byte

            while (singleByte != EOF) {
                System.out.print((char) singleByte);
                singleByte = fs.read();
            }
            fs.close();
        }
    }
}
