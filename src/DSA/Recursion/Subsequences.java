package DSA.Recursion;

import java.util.*;

public class Subsequences {
    public static void main(String[] args) {
        String s = "Ravi";
//        List<String> res = new ArrayList<>();
//        getSubsequences(s, 0, "", res);
//        System.out.println(res);

        ArrayList<String> al = subSeq(s);
        System.out.println(al);
    }

    static ArrayList<String> subSeq(String str) {
        if (str.length() == 0) {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
        char currentChar = str.charAt(0);
        String remString = str.substring(1);
        ArrayList<String> temp = subSeq(remString);

        ArrayList<String> res = new ArrayList<>();
        for(String s : temp) {
            res.add(s);
            res.add(currentChar + s);
        }
        return res;
    }

    static void getSubsequences(String s, int i, String cur, List<String> res) {
        if (i == s.length()) {
            res.add(cur);
            return;
        }

        getSubsequences(s, i + 1, cur, res);
        getSubsequences(s, i + 1, cur + s.charAt(i), res);
    }
}
