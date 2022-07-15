package DSA.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class PreviousGreaterNSmallerElement {
    public static void main(String[] args) {
        int arr[] = {10, 4, 2, 20, 40, 12, 30};
        int n = arr.length;
        prevGreater(arr, n);
        prevSmaller(new int[] { 2, 5, 3, 7, 8, 1, 9}, n);
    }

    private static void prevSmaller(int[] arr, int n) {
        int[] prevSmaller = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);

        prevSmaller[0] = -1;
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i])
                st.pop();

            if (st.isEmpty()) {
                prevSmaller[i] = -1;
            } else {
                prevSmaller[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println("Previous smaller");
        System.out.println(Arrays.toString(prevSmaller));
    }

    private static void prevGreater(int[] arr, int n) {
        int prevGreater[] = new int[n];

        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);

        prevGreater[0] = -1;
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && st.peek() < arr[i])
                st.pop();

            if (st.isEmpty()) {
                prevGreater[i] = -1;
            } else {
                prevGreater[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println("Previous Greater");
        System.out.println(Arrays.toString(prevGreater));
    }

}
