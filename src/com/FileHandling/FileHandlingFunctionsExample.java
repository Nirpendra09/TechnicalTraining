package com.FileHandling;

import java.io.*;

class CustomFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
        return name.endsWith(".png");
    }
}

public class FileHandlingFunctionsExample {
    public static void main(String[] args) {

        String path = "D:\\Java-TechnicalTraining\\songs";
        File file = new File(path);

        File[] files1 = file.listFiles((dirPath, fileName) -> fileName.endsWith(".txt"));
        CustomFilter filter = new CustomFilter();
        File[] files2 = file.listFiles(filter);

        System.out.println("No. of txt files : " + files1.length);
        System.out.println("No. of png files : " + files2.length);
    }
}
