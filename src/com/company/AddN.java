package com.company;

public class AddN {
    public static void main(String[] args) {
        add(5);
        add(6);
    }

    private static void add(int n) {
        if (n % 2 == 1) {
            int sum = n * (n + 1) / 2;
            System.out.println("sum = " + sum);
        } else {
            System.out.println("No operation");
            return;
        }
    }
}
