package DSA.Arrays;

public class BarChart {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 7, 9};
        int max = Integer.MIN_VALUE;

        for (int x : arr)
            max = Math.max(max, x);

        for (int i = max; i > 0; i--) {
            for (int x : arr) {
                if (x >= i)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
