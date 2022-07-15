package DSA.Trees;

import java.util.*;

public class RightView {
    static void RightView(BinaryTree<Integer> root) {
        if (root == null) return;

        Queue<BinaryTree<Integer>> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                BinaryTree<Integer> cur = q.poll();
                if (i == size - 1) {
                    System.out.println(cur.data);
                }
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
    }
}
