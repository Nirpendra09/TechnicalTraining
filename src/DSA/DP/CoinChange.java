package DSA.DP;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = new int[]{357, 239, 73, 52};
        int amount = 9832;
        System.out.println(coinChange(coins, amount));
    }

    static int coinChangeTabulation(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, Integer.MAX_VALUE - 1);
        }
        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(1 + dp[i][j - coins[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[coins.length][amount] >= Integer.MAX_VALUE - 1 ? -1 : dp[coins.length][amount];
    }

    static Integer[][] memo;

    public static int coinChange(int[] coins, int amount) {
        memo = new Integer[coins.length][amount + 1];
        int res = help(coins, amount, 0);
        return res >= Integer.MAX_VALUE ? -1 : res;
    }

    private static int help(int[] coins, int amount, int i) {
        if (amount == 0) return 0;
        if (i == coins.length || amount < 0) return Integer.MAX_VALUE;

        if (memo[i][amount] != null) return memo[i][amount];
        int take = help(coins, amount - coins[i], i);

        if (take != Integer.MAX_VALUE) {
            take = 1 + take;
        }
        int notTake = help(coins, amount, i + 1);

        return memo[i][amount] = Math.min(take, notTake);
    }
}
