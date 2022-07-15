package DSA.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};

        int xor = 0;
        int min = arr[0], max = arr[0];
        for (int i : arr) {
            xor = xor ^ i;
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }

        for (int i = min; i <= max; i++) {
            xor = xor ^ i;
        }
        System.out.println("Missing Number " + xor);
    }
}

/*      int sum = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > n)
                n = arr[i];
        }

        int s = n * (n + 1) / 2;
        System.out.println("The missing number is " + (s - sum));
*/
        /* for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i] - 1) {
                System.out.println("The missing number is " + (arr[i] - 1));
            }
        }
        */