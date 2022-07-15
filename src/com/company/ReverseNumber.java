package com.company;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 345;
        int res = 0;
        while(n > 0) {
            int remainder = n % 10;
            res = res * 10 + remainder;
            n /= 10;
        }
        System.out.println(res);
    }
}
