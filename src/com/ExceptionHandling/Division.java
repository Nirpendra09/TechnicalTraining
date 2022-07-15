package com.ExceptionHandling;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Divide(a, b);
    }

     private static void Divide(int a, int b) {
        try {
            int c = a / b;
            System.out.println("Result: "+c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible");
        }
    }
}
