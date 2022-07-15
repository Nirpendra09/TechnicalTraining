package DSA.Recursion;

import java.util.ArrayList;

public class MazeProblem {
    static ArrayList<String> paths(int currRow, int currCol, int fRow, int fCol) {
        if (currRow == fRow && currCol == fCol) {
            ArrayList<String> t = new ArrayList<>();
            t.add("");
            return t;
        }
        if (currRow > fRow || currCol > fCol) {
            ArrayList<String> t = new ArrayList<>();
            return t;
        }
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> temp = paths(currRow, currCol + 1, fRow, fCol);//for horizontal
        for (String s : temp) {
            res.add("H" + s);
        }
        ArrayList<String> temp1 = paths(currRow + 1, currCol, fRow, fCol);//for vertical
        for (String s : temp1) {
            res.add("V" + s);
        }
        ArrayList<String> temp2 = paths(currRow + 1, currCol + 1, fRow, fCol);//For diagonal
        for (String s : temp2) {
            res.add("D" + s);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(paths(0, 0, 2, 2));
    }
}
