package com.company;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i+= 2) {

            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
