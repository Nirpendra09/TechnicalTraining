package DSA.Recursion;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(10, 0));
    }

    static int climbStairs(int n, int i) {
        if (i == n) return 1;
        if (i > n) return 0;
        int one = climbStairs(n, i+1);
        int two = climbStairs(n, i + 2);

        return one + two;
    }
}
