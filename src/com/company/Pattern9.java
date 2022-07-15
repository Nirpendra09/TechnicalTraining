package com.company;

public class Pattern9 {
    public static void main(String[] args) {
        int r = 5;
        r *= 2;
        for (int i = r - 2; i >= 0; i -= 2) {
            for (int j = i; j <= r; j++) {
                System.out.print(" ");

            }
            for (int j = 2; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
