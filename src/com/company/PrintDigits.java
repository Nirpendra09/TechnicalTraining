package com.company;

public class PrintDigits {
    public static void main(String[] args) {
        int n = 345;

        while(n > 0) {
            int remainder = n % 10;
            System.out.print(remainder+" ");
            n /= 10;
        }
    }
}
