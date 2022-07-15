package DSA.Arrays;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5}, {3, 2, 4}, {5, 4, 1}};
        boolean isSymmetric = true;

        if (matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        System.out.println("Not Symmetric");
                        isSymmetric = false;
                        break;
                    }
                }
            }
            if (isSymmetric) {
                System.out.println("Symmetric");
            }
        } else {
            System.out.println("Not Symmetric");
        }
    }
}
