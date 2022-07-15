package com.company;

public class FactorialNumber {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println("factorial is : "+fact);
    }
}
