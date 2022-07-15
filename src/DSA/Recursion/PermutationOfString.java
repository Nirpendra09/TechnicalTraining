package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subSeq(s));
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
        for (String s : temp) {
            for (int i = 0; i <= s.length(); i++) {
                StringBuilder sb = new StringBuilder(s);
                sb.insert(i, currentChar);
                res.add(sb.toString());
            }
        }
        return res;
    }
}
