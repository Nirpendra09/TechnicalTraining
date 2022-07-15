package DSA.Recursion;

public class Pattern3 {
    public static void main(String[] args) {
        printPattern(6, 1);
    }

    static int num = 1;

    static void printNum(int n) {
        if (n == 0) return;
        System.out.print(num++ + " ");
        printNum(n - 1);
    }

    static void printPattern(int rows, int curRow) {
        if (rows == 0) return;
        printNum(curRow);
        System.out.println();
        printPattern(rows - 1, curRow + 1);
    }
}
