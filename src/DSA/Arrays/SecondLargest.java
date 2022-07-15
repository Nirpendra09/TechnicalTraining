package DSA.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int max = arr[0];
        int secondMax = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second largest element is: " + secondMax);
    }
}
