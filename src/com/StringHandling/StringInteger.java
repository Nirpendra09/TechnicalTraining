package com.StringHandling;

public class StringInteger {
    public static void main(String[] args) {
        String str = "12345";
        int num = Integer.valueOf(str);
        System.out.println("String To Integer : "+num);
        System.out.println(((Object)num).getClass().getSimpleName());

        System.out.println();

        int n = 54321;
        String s = String.valueOf(n);
        System.out.println("Integer To String : "+ s);
        System.out.println(s.getClass().getSimpleName());
    }
}
