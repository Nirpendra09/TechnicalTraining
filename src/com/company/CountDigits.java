package com.company;

public class CountDigits {
    public static void main(String[] args) {
        int x = 125;
        int count = 0;

        while (x != 0) {
            x /= 10;
            count++;
        }
        System.out.println("Number of Digits : " + count);
    }
}
