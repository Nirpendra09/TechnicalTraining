package com.company;

public class PowerNumber {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int res = 1;

        while (exponent != 0){
            res *= base;
            exponent--;
        }
        System.out.println("Power of a Number is: "+res);
    }
}
