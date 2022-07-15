package DSA.Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 20, 20, 30, 50, 50, 50};
        Set<Integer> set = new HashSet<>();
        for (int x : arr)
            set.add(x);
        System.out.println(set);
    }
}
