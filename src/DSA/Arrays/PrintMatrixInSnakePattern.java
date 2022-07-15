package DSA.Arrays;

public class PrintMatrixInSnakePattern {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40}, {50, 60, 70, 80},
                          {27, 29, 31, 48}, {32, 33, 39, 50}};

        for(int i = 0; i < matrix.length; i++) {
            if(i%2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j]+" ");
                }
            } else {
                for(int j = matrix[i].length-1; j >= 0; j--) {
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
