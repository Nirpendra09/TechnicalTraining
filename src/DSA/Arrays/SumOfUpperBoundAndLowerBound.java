package DSA.Arrays;

public class SumOfUpperBoundAndLowerBound {
    public static void main(String[] args) {
        int[][] matrix = {{6, 5, 4}, {1, 2, 5}, {7, 9, 7}};
        int upperBound = 0;
        int lowerBound = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j <= i) {
                    lowerBound += matrix[i][j];
                }
                if (j >= i) {
                    upperBound += matrix[i][j];
                }
            }
        }
        System.out.println("Upper Bound Sum : " + upperBound);
        System.out.println("Lower Bound Sum: " + lowerBound);
    }
}
