package DSA.Recursion;

import java.util.*;

public class Maze {
    public static void main(String[] args) {
        System.out.println(getMazePath(0, 0, 2, 2));
    }

    static List<String> getMazePath(int curRow, int curCol, int endRow, int endCol) {
        // positive base case
        if (curRow == endRow && curCol == endCol) {
            List<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        // negative base case
        if (curRow > endRow || curCol > endCol) {
            List<String> res = new ArrayList<>();
            return res;
        }

        List<String> horizontalResult = getMazePath(curRow, curCol + 1, endRow, endCol);
        List<String> verticalResult = getMazePath(curRow + 1, curCol, endRow, endCol);

        // store and return result and make final result
        List<String> res = new ArrayList<>();
        for (String s : horizontalResult) {
            res.add("H" + s);
        }
        for (String s : verticalResult) {
            res.add("V" + s);
        }

        return res;
    }
}
