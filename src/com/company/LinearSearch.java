package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8, 9};
        boolean res = search(arr, 8);

        if (res) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }

    private static boolean search(int[] arr, int target) {

        for (int i : arr) {
            if (i == target)
                return true;
        }

        return false;
    }
}
