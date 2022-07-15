package com.dit.javaoops;

interface Subtract {
    int subtract(int a, int b);
}

public class InterfaceExample {
    public static void main(String[] args) {
        Subtract sub = (a, b) -> a - b;
        System.out.println(sub.subtract(10, 5));
    }
}
