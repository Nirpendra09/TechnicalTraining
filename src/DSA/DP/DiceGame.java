package DSA.DP;

public class DiceGame {
    public static void main(String[] args) {
        int n = 10;
        int[] cache = new int[n + 1];
//        System.out.println(countWays(0, n, cache));
        System.out.println(countWaysTabulation(n));
    }

    static int countWaysTabulation(int n) {
        int[] cache = new int[n + 1];
        cache[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            for (int dice = 1; dice <= 6 && dice + i < cache.length; dice++) {
                count += cache[dice + i];
            }
            cache[i] = count;
        }
        return cache[0];
    }

    // Memo
    static int countWays(int current, int end, int[] cache) {
        if (current == end) {
            return 1;
        }
        if (current > end) {
            return 0;
        }

        if (cache[current] != 0)
            return cache[current];

        int count = 0;
        for (int dice = 1; dice <= 6; dice++) {
            count += countWays(current + dice, end, cache);
        }

        cache[current] = count;
        return cache[current];
    }
}
