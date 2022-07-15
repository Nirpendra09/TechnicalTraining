package DSA.Recursion;

import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        int n = 6;
        /*List<List<Integer>> res = new ArrayList<>();
        possibilities(n, new ArrayList<>(), res);
        System.out.println(res);*/

        System.out.println(dicePossibilities(0, n));
    }

    // teacher's code
    static ArrayList<String> dicePossibilities(int currentValue, int endValue) {
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
        for(int dice = 1; dice <= 6; dice++) {
            int newValue = currentValue + dice;
            ArrayList<String> temp = dicePossibilities(newValue, endValue);
            for(String s : temp) {
                result.add(dice + s);
            }
        }
        return result;
    }

    static void possibilities(int target, List<Integer> cur, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (target < 0) return;

        for (int i = 1; i <= 6; i++) {
            if (i <= target) {
                cur.add(i);
                possibilities(target - i, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
