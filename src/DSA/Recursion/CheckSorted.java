package DSA.Recursion;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(isSorted(0, arr));
    }

    static boolean isSorted(int i, int arr[]) {
        if (i == arr.length - 1)
            return true;

        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(i + 1, arr);
    }
}
