package DSA.Arrays;

import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 3, 1, 10, 4};
        int k = 9;
        pairSum3(arr, k);
    }

    static void pairSum3(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            if (map.containsKey(k - x)) {
                System.out.println(k - x + "-" + map.get(k - x));
            } else {
                map.put(x, k - x);
            }
        }
    }

    static void pairSum2(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (list.contains(k - arr[i])) {
                System.out.println(k - arr[i] + "-" + arr[i]);
            } else {
                list.add(arr[i]);
            }
        }

    }

    static void pairSum1(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == k) {
                System.out.println(arr[i] + "-" + arr[j]);
                i++;
                j--;
            } else if (sum > k)
                j--;
            else
                i++;
        }
    }

    static void pairSum(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(arr[i] + "-" + arr[j]);
                }
            }
        }
    }
}
