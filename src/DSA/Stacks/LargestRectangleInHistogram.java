package DSA.Stacks;

import java.util.Arrays;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        System.out.println((largestRectangleArea(arr)));
    }

    public static int largestRectangleArea(int[] heights) {
        int res = 0;
        int n = heights.length;
        for (int i = 0; i < n; i++) {
            int cur = heights[i];
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] >= heights[i]) {
                    cur += heights[i];
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (heights[j] >= heights[i]) {
                    cur += heights[i];
                } else {
                    break;
                }
            }
            res = Math.max(res, cur);
        }
        return res;
    }
}
