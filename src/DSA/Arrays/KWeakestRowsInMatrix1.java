package DSA.Arrays;

import java.util.*;

public class KWeakestRowsInMatrix1 {
    static class Pair {
        int ind;
        int val;

        Pair(int i, int v) {
            ind = i;
            val = v;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        Pair[] str = new Pair[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int strength = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1)
                    strength++;
            }
            str[i] = new Pair(i, strength);
        }
        Arrays.sort(str, (a, b) -> a.val - b.val);
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i].ind+" ");
        }
    }
}
