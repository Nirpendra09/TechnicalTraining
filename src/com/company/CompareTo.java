package com.company;

public class CompareTo {
    public static void main(String[] args) {
        String str1 = "Java Example";
        String str2 = new String("Java Example");
        String str3 = "DIT";

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str1));
    }
}
