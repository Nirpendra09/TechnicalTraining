package DSA.Arrays;

public class AddTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 9, 3, 5};
        int[] arr2 = {4, 2, 4, 5};
        StringBuilder res = new StringBuilder();

        int carry = 0;
        int curSum = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;

        while (i >= 0 && j >= 0) {
            curSum = arr1[i] + arr2[j] + carry;
            res.append(curSum % 10);
            carry = curSum / 10;
            i--;
            j--;
        }

        while (i >= 0) {
            curSum = arr1[i] + carry;
            res.append(curSum % 10);
            carry = curSum / 10;
            i--;
        }

        while (j >= 0) {
            curSum = arr1[j] + carry;
            res.append(curSum % 10);
            carry = curSum / 10;
            j--;
        }

        System.out.println(res.reverse());
    }
}
