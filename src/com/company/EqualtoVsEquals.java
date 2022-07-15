package com.company;

public class EqualtoVsEquals {
    public static void main(String[] args) {
        String str1 = new String("HELLO");
        String str2 = new String("HELLO");

        System.out.println(str1 == str2); //compares reference
        System.out.println(str1.equals(str2)); // compares value
    }
}
