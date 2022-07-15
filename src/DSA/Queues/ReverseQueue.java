package DSA.Queues;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

//        reverse(q);
        reverseUsingStack(q);
    }

    static void reverseUsingStack(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty())
            st.push(q.poll());

        while (!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }

    static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int x = q.peek();
        q.poll();
        reverse(q);
        q.add(x);

    }
}
