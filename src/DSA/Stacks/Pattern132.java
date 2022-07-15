package DSA.Stacks;

import java.util.Stack;

public class Pattern132 {
    // first optimized [TLE]
    public boolean find132pattern1(int[] nums) {
        int n = nums.length;
        int min = nums[0];

        for (int j = 1; j < n - 1; j++) {
            min = Math.min(min, nums[j]);
            if (min == nums[j])
                continue;
            for (int k = j + 1; k < n; k++) {

                if (nums[k] < nums[j] && min < nums[k]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optimal
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int[] min = new int[n];
        min[0] = nums[0];

        for (int i = 1; i < n; i++) {
            min[i] = Math.min(min[i - 1], nums[i]);
        }

        Stack<Integer> st = new Stack<>();
        for (int j = n - 1; j >= 0; j--) {
            if (nums[j] > min[j]) {
                while (!st.isEmpty() && st.peek() <= min[j])
                    st.pop();
                if (!st.isEmpty() && st.peek() < nums[j])
                    return true;
                st.push(nums[j]);
            }
        }
        return false;
    }
}
