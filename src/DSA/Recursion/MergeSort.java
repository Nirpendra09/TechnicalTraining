package DSA.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {60, 10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }

    static int[] mergeSort(int[] arr, int start, int end) {
        if (start == end) return new int[]{arr[start]};
        int mid = (start + end) / 2;

        int[] left = mergeSort(arr, start, mid);
        int[] right = mergeSort(arr, mid + 1, end);

        int[] merged = merge(left, right);
        return merged;
    }

    static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] merged = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }
        while (j < right.length) {
            merged[k++] = right[j++];
        }
        return merged;
    }
}
