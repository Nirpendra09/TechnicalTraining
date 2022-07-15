package com.StringHandling;

public class OccurenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        System.out.println("Occurence of each character in the string");
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println(((char) i == ' ' ? "space" : (char) i )+ " : " + count[i]);
            }
        }
    }
}
