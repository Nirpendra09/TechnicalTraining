package com.FileHandling;

import java.io.File;
import java.io.IOException;

class InvalidException extends Exception {
    public InvalidException(String str) {
        super(str);
    }
}

public class ExceptionWithFileHandling {
    public static void main(String[] args) throws InvalidException {
        File file = new File("D:\\Java-TechnicalTraining\\songs\\bb");

        try {
            file.createNewFile();
            System.out.println("File created Successfully.");
        } catch (IOException e) {
            throw new InvalidException("Wrong file path");
        } finally {
            System.out.println("File Name: " + file.getName());
        }

    }
}
