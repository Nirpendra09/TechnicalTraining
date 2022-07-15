package DSA.Stacks;

public class NextSmaller {
    static int[] NextSmallerElement(int arr[], int n) {
        int res[] = new int[n];
        int next, i, j;
        for (i = 0; i < n; i++) {
            next = -1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            res[i] = next;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {4, 8, 5, 2, 25};
        int n = arr.length;
        NextSmallerElement(arr, n);
    }
}
