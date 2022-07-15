package DSA.DP;

public class EditDistance {

    public int minDistanceTabulation(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i <= word2.length(); i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }

    Integer[][] memo;

    public int minDistance(String word1, String word2) {
        memo = new Integer[word1.length()][word2.length()];
        return help(word1, word2, 0, 0);
    }

    private int help(String word1, String word2, int i, int j) {
        if (i == word1.length()) return word2.length() - j;
        if (j == word2.length()) return word1.length() - i;

        if (memo[i][j] != null) return memo[i][j];

        if (word1.charAt(i) == word2.charAt(j)) {
            return memo[i][j] = help(word1, word2, i + 1, j + 1);
        }

        int insert = help(word1, word2, i, j + 1);
        int remove = help(word1, word2, i + 1, j);
        int replace = help(word1, word2, i + 1, j + 1);

        return memo[i][j] = 1 + Math.min(insert, Math.min(remove, replace));
    }
}
