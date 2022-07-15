package DSA.Recursion;

public class SearchElementInAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 1, 7, 8};
        int target = 7;
        int idx = search(arr, target, 0);
        System.out.println(idx);
    }

    static int search(int[] arr, int target, int i) {
        if (i == arr.length) return -1;

        if (arr[i] == target) return i;
        return search(arr, target, i + 1);
    }
}
