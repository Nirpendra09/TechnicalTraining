package DSA.Arrays;

import java.util.*;

public class KWeakestRowsInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < matrix.length; i++) {
            int strength = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    strength++;
            }
            map.putIfAbsent(strength, new ArrayList<Integer>());
            map.get(strength).add(i);
        }

        for (int i : map.keySet()) {
            for(int j : map.get(i)) {
                System.out.println(j);
            }
        }
    }
}
