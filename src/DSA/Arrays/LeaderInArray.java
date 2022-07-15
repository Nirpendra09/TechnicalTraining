package DSA.Arrays;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 5, 2};
        int max = arr[0];
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i] > max) {
                System.out.println("Leader " + arr[i]);
                max = arr[i];
            }
        }
    }
}
