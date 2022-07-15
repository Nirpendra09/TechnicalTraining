package DSA.Recursion;

import java.util.*;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 14;
        int k = 2;
        System.out.println(josephus(n, k));
    }

    static int josephus(int n, int k) {
        if (n == 1) return 1;

        int cur = josephus(n - 1, k);
        return (cur + k - 1) % n + 1;
    }
}
