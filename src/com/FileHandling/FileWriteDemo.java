package com.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data to write in file: ");
        String txt = sc.nextLine();

        FileOutputStream fo = new FileOutputStream("D:\\Java-TechnicalTraining\\songs\\sample.txt");
        fo.write(txt.getBytes());

        fo.close();
    }
}
