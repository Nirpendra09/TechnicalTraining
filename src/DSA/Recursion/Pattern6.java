package DSA.Recursion;

public class Pattern6 {
    public static void main(String[] args) {
        printPattern(6, 6);
    }

    static void printSpace(int noOfSpaces) {
        if(noOfSpaces == 0) return;
        System.out.print(" ");
        printSpace(noOfSpaces-1);
    }
    static void printStar(int noOfStars) {
        if(noOfStars == 0) return;
        System.out.print("* ");
        printStar(noOfStars - 1);
    }

    static void printPattern(int rows, int curRow) {
        if(rows == 0) return;
        printSpace(rows - 1);
        printStar(curRow - rows + 1);
        System.out.println();
        printPattern(rows-1, curRow+1);
    }
}
