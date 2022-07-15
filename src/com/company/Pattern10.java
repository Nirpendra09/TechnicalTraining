package com.company;

public class Pattern10 {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = r; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < (i - 1) * 2; j++)
                System.out.print(" ");
            if (i == 1)
                System.out.println();
            else {
                System.out.print("*\n");
            }
        }
        for (int i = r - 1; i > 0; i--) {
            for (int j = r; j > i; j--)
                System.out.print(" ");

            System.out.print("*");

            for (int j = 1; j < (i - 1) * 2; j++)
                System.out.print(" ");

            if (i == 1)
                System.out.println();
            else
                System.out.print("*\n");
        }
    }
}
