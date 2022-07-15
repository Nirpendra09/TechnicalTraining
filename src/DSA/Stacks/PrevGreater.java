package DSA.Stacks;

import java.util.Stack;

public class PrevGreater {
    public static void main(String[] args) {
        int arr[] = {10, 4, 2, 20, 40, 12, 30};
        int n = arr.length;
        prevGreater(arr, n);
    }

    private static void prevGreater(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i])
                st.pop();
            int res = st.isEmpty() ? -1 : arr[st.peek()];
            System.out.print(res+" ");
            st.push(i);
        }
    }
}
