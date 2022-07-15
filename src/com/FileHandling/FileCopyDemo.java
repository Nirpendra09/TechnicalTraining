package com.FileHandling;

import java.io.*;

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        String sourcePath = "D:\\Java-TechnicalTraining\\songs\\A.png";
        String destPath = "D:\\Java-TechnicalTraining\\songs\\Acopy.png";

        File file = new File(sourcePath);

        if (!file.exists()) {
            System.out.println("File not found");
            return;
        }

        final int EOF = -1;

        FileInputStream fs = new FileInputStream(file);
        BufferedInputStream bs = new BufferedInputStream(fs);

        FileOutputStream fo = new FileOutputStream(destPath);
        BufferedOutputStream bo = new BufferedOutputStream(fo);

        long startTime = System.currentTimeMillis();

        int singleByte = bs.read();
        while (singleByte != EOF) {
            bo.write(singleByte);
            singleByte = bs.read();
        }

        bo.close();
        bs.close();

        fs.close();
        fo.close();


        long endTime = System.currentTimeMillis();

        System.out.println("Time taken to copy file: " + (endTime - startTime) + " ms");
    }
}
