package com.company;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 8, 7, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The Sum is : " + sum);
    }
}
