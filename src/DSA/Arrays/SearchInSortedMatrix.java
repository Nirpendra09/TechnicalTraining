package DSA.Arrays;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45},
                {22, 29, 37, 48}, {32, 33, 39, 50}};
        int target = 33;

        int[] res = search(matrix, target);
        if (res != null) {
            System.out.println("Target found at " + Arrays.toString(res));
        } else {
            System.out.println("Target Not found");
        }
    }

    static int[] search(int[][] matrix, int target) {
        if (target == matrix[0][0]) return new int[]{0, 0};

        int i = 0;
        int j = matrix[i].length - 1;

        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target)
                return new int[]{i, j};
            else if (matrix[i][j] > target)
                j--;
            else if (matrix[i][j] < target)
                i++;
        }
        return null;
    }
}
