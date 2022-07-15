package DSA.Recursion;

public class CountNumberOfZeroes {
    public static void main(String[] args) {
        int count = countZero(120200500);
        System.out.println(count);
    }

    private static int countZero(int n) {
        if (n == 0) return 0;

        int rem = n % 10;
        n = n / 10;

        if (rem == 0)
            return 1 + countZero(n);
        return countZero(n);
    }
}
