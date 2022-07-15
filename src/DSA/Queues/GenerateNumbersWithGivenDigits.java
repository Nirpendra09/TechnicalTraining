package DSA.Queues;

import java.util.*;

public class GenerateNumbersWithGivenDigits {
    public static void main(String[] args) {
        int n = 10;
        int[] set = new int[]{5, 6};
        GenerateNumbers(n, set);
    }

    static void GenerateNumbers(int n, int[] set) {
        Queue<String> q = new LinkedList<>();
        for (int i : set)
            q.add(i + "");


        for (int i = 0; i < n; i++) {
            String cur = q.poll();
            System.out.print(cur+" ");
            for (int j = 0; j < set.length; j++) {
                q.add(cur +""+ set[j]);
            }
        }
    }
}
