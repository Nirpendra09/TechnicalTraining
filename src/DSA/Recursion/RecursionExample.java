package DSA.Recursion;

public class RecursionExample {
    public static void main(String[] args) {
        int n = 7;
        print(n);
    }

    static void print(int n) {
        if (n <= 0) return;
        if (n % 2 != 0) {
            System.out.print(n + " ");
        }
        print(n - 1);
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }
    }
}
