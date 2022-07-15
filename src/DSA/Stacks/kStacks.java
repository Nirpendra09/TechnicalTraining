package DSA.Stacks;

import java.util.Arrays;

public class kStacks {
    int[] arr, top, next;
    int k, freeTop, cap;

    kStacks(int k, int n) {
        this.k = k;
        cap = n;
        arr = new int[cap];
        top = new int[k];
        next = new int[cap];

        Arrays.fill(top, -1);
        freeTop = 0;
        for (int i = 0; i < cap - 1; i++) {
            next[i] = i + 1;
        }
        next[cap - 1] = -1;
    }

    void push(int x, int stackNumber) {
        int i = freeTop;
        freeTop = next[i];
        next[i] = top[stackNumber];
        top[stackNumber] = i;
        arr[i] = x;
    }

    int pop(int stackNumber) {
        int i = top[stackNumber];
        top[stackNumber] = next[i];
        next[i] = freeTop;
        freeTop = i;
        return arr[i];
    }
}
