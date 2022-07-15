package DSA.Arrays;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            arr[i] = sc.nextInt();
        }


    }

    static void update(int[] arr, int value, int value2) {
        int index = search(arr, value);
        if(index >= 0 && index < arr.length) {
            arr[index] = value2;
        } else {
            System.out.println("Value not found");
        }
    }

    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " found at index " + i);
                return i;
            }
        }
        System.out.println(target + "Not Found");
        return -1;
    }
}
