package DSA.Trees;

import java.util.Stack;

public class InorderIterative {
    static void inorderIterative(BinaryTree<Integer> root) {
        if(root == null) return;

        Stack<BinaryTree<Integer>> s = new Stack<>();
        BinaryTree<Integer> cur = root;

        while (cur != null || !s.isEmpty()) {
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            System.out.println(cur.data);
            cur = cur.right;
        }
    }
}
