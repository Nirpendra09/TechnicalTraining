package DSA.Backtracking;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    static String[] codes = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();
        return LetterCombinations(digits);
    }

    private static List<String> LetterCombinations(String digits) {
        if (digits.length() == 0) {
            List<String> res = new ArrayList<>();
            res.add("");
            return res;
        }

        List<String> sres = LetterCombinations(digits.substring(1));
        List<String> res = new ArrayList<>();

        String curcode = codes[digits.charAt(0)-'0'];

        for (int i = 0; i < curcode.length(); i++) {
            char cur = curcode.charAt(i);
            for (String s : sres) {
                res.add(cur + s);
            }
        }
        return res;
    }
}
