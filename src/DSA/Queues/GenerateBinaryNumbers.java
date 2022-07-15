package DSA.Queues;

import java.util.*;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        int n = 5;
        generateBinary(n);
    }

    private static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String cur = q.poll();
            System.out.print(cur + " ");
            q.add(cur + "0");
            q.add(cur + "1");
        }

    }
}
