package com.FileHandling;

import java.io.*;

class MyFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
        return name.endsWith(".png");
    }
}

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Java-TechnicalTraining\\sample.txt";

        File file = new File(path);

        if (file.exists()) {
            File file2 = new File("D:\\Java-TechnicalTraining\\samplecopy.txt");
            file.renameTo(file2);
//            file.delete();
//            System.out.println("File deleted successfully");
        } else {
            file.createNewFile();
            System.out.println("File created successfully");
        }

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());

        path = "D:\\Java-TechnicalTraining\\songs";
        file = new File(path);

        //file.mkdir();
//        file.mkdirs();
//        MyFilter filter = new MyFilter();
//        File []files = file.listFiles(filter);

        File []files1 = file.listFiles((dirPath, fileName) -> fileName.endsWith(".txt"));
        File []files2 = file.listFiles((dirPath, fileName) -> fileName.endsWith(".png"));

        System.out.println("No. of txt files : " + files1.length);
        System.out.println("No. of png files : " + files2.length);
    }
}
