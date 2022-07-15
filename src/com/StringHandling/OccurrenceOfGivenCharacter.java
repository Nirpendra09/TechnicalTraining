package com.StringHandling;

public class OccurrenceOfGivenCharacter {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        char ch = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("The occurence of '" + ch + "' in the given string is " + count);
    }

}
