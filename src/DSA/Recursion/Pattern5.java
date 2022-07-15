package DSA.Recursion;

public class Pattern5 {
    public static void main(String[] args) {
        printPattern(6, 1);
    }

    static char c = 'A';

    static void printChar(int n) {
        if (n == 0) return;
        System.out.print( (char)c++ + " ");
        printChar(n - 1);
    }

    static void printPattern(int rows, int curRow) {
        if (rows == 0) return;
        printChar(curRow);
        System.out.println();
        printPattern(rows - 1, curRow + 1);
    }
}
