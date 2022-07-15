package DSA.Recursion;

public class Pattern1 {
    public static void main(String[] args) {
        printPattern(6, 1);
    }

    static void printStar(int noOfStars) {
        if(noOfStars == 0) return;
        System.out.print("*");
        printStar(noOfStars - 1);
    }

    static void printPattern(int rows, int curRow) {
        if(rows == 0) return;
        printStar(curRow);
        System.out.println();
        printPattern(rows-1, curRow+1);
    }
}
