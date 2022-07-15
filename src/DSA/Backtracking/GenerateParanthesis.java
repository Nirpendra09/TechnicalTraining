package DSA.Backtracking;

import java.util.*;

public class GenerateParanthesis {

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(list, "", 0, 0, n);
        return list;
    }

    static void helper(List<String> res, String cur, int open, int close, int n) {
        if (cur.length() == 2 * n) {
            res.add(cur);
            return;
        }

        if(open < n)
            helper(res, cur+"(", open+1, close, n);
        if(close < open)
            helper(res, cur+")", open, close+1, n);
    }
}
