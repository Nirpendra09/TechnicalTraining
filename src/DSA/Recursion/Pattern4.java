package DSA.Recursion;

public class Pattern4 {
    public static void main(String[] args) {
        printPattern(6, 1);
    }

    static char c = 'A';

    static void printChar(int n) {
        if (n == 0) return;
        System.out.print( c + " ");
        printChar(n - 1);
    }

    static void printPattern(int rows, int curRow) {
        if (rows == 0) return;
        printChar(curRow);
        c++;
        System.out.println();
        printPattern(rows - 1, curRow + 1);
    }
}
