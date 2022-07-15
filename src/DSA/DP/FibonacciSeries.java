package DSA.DP;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 20;
        int[] cache = new int[n + 1];
//        System.out.println(fib(n));
//        System.out.println(fibMemo(n, cache));
        System.out.println(fibTabulation(n));
    }

    // Bottom Up
    static int fibTabulation(int n) {
        int cache[] = new int[n+1];
        cache[0] = 0;
        cache[1] = 1;
        for(int i  = 2; i <=n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }


        // TOP DOWN
    static int fibMemo(int n, int[] cache) {
        if (n == 0 || n == 1)
            return n;

        if (cache[n] != 0) {
            return cache[n];
        }

        int first = fibMemo(n - 1, cache);
        int second = fibMemo(n - 2, cache);
        cache[n] = first + second;
        return cache[n];
    }

    static int fib(int n) {
        if (n == 0 || n == 1)
            return n;

        int first = fib(n - 1);
        int second = fib(n - 2);

        return first + second;
    }
}
