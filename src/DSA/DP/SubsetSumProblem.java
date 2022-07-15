package DSA.DP;

public class SubsetSumProblem {
    public static void main(String[] args) {
        int N = 6;
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;

        System.out.println(isSubsetSum(N, arr, sum));
    }

    static Boolean isSubsetSumTabulation(int n, int arr[], int sum) {
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }

    static Boolean[][] memo;
    static Boolean isSubsetSum(int n, int arr[], int sum) {
        memo = new Boolean[n][sum + 1];
        return help(arr, sum, 0);
    }

    static boolean help(int[] arr, int sum, int i) {
        if (sum == 0) return true;
        if (i == arr.length || sum < 0) return false;

        if (memo[i][sum] != null) return memo[i][sum];

        boolean take = help(arr, sum - arr[i], i + 1);
        boolean notTake = help(arr, sum, i + 1);

        return memo[i][sum] = (take || notTake);
    }
}
