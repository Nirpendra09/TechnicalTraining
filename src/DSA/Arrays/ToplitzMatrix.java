package DSA.Arrays;

public class ToplitzMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{6, 7, 8}, {4, 6, 7}, {1, 4, 6}};
        System.out.println(isToplitz(matrix));
    }

    static boolean isToplitz(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1])
                    return false;
            }
        }
        return true;
    }
}
