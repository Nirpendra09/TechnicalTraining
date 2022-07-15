package DSA.Arrays;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 1};
        boolean sorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Array is Sorted in ascending");
        } else {
            System.out.println("Array Not Sorted in ascending");
        }
    }
}
