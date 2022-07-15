package DSA.Recursion;

public class ReplaceAllPIValuesWithValue {
    public static void main(String[] args) {
        String s = "2 - pi + 3 * pi + 5 + pi";

        StringBuilder sb = new StringBuilder(s);
        replace(sb);

        System.out.println(sb);
    }

    static void replace(StringBuilder s) {
        if (s.indexOf("pi") == -1) return;

        int idx = s.indexOf("pi");
        s.replace(idx, idx + 2, "3.14");

        replace(s);
    }

//    static void rec(String[] s, int i) {
//        if (i == s.length) return;
//
//        if (s[i].equals("pi")) {
//            s[i] = String.valueOf(3.14);
//        }
//        rec(s, i + 1);
//    }
}
