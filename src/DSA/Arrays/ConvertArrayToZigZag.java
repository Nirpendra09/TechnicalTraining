package DSA.Arrays;

import java.util.*;

public class ConvertArrayToZigZag {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 8, 6, 7, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 1) {
                if (arr[i - 1] > arr[i])
                    swap(arr, i, i - 1);
                if (arr[i] < arr[i + 1])
                    swap(arr, i, i + 1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
