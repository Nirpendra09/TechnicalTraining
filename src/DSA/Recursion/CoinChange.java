package DSA.Recursion;

import java.util.*;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {2, 3, 5, 6};
        int amount = 10;
//        System.out.println(coinChange(coins, amount));
        coinChange(coins, amount, "", 0);
    }

    private static void coinChange(int[] coins, int amount, String cur, int lastIndex) {
        if (amount == 0) {
            System.out.println(cur);
            return;
        }
        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                coinChange(coins, amount - coins[i], cur + coins[i], i);
            }
        }
    }

    /*static List<String> coinChange(int[] coins, int amount) {
        if (amount == 0) {
            List<String> t = new ArrayList<>();
            t.add("");
            return t;
        }
        if (amount < 0) {
            List<String> t = new ArrayList<>();
            return t;
        }
        List<String> res = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            List<String> temp = coinChange(coins, amount - coins[i]);
            for (String s : temp) {
                res.add(coins[i] + s);
            }
        }
        return res;
    }
*/
    /*ArrayList<String> coinPossibilities(int currentValue, int endValue) {
        if (currentValue == endValue) {
            ArrayList<String> t = new ArrayList<>();
            t.add("");
            return t;
        }
        if (currentValue > endValue) {
            ArrayList<String> t = new ArrayList<>();
            return t;
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < costs.length; i++) {

        }
        for (int i = 1; i <= 6; dice++) {
            int newValue = currentValue + dice;
            ArrayList<String> temp = coinPossibilities(newValue, endValue);
            for (String s : temp) {
                result.add(dice + s);
            }
        }
        return result;
    }*/
}
