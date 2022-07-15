package DSA.Trees;

import java.util.ArrayList;
import java.util.Stack;

public class Traversals {
    public static void main(String[] args) {

    }

    ArrayList<Integer> preOrderIterative(BinaryTree<Integer> root) {
        // Code
        Stack<BinaryTree<Integer>> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        st.push(root);

        while(!st.isEmpty()) {
            BinaryTree<Integer> cur = st.pop();
            res.add(cur.data);

            if(cur.right != null) st.push(cur.right);
            if(cur.left != null) st.push(cur.left);
        }
        return res;
    }

    void preorder(BinaryTree<Integer> root) {
        if(root == null) return;

        System.out.print(root.data);

        preorder(root.left);
        preorder(root.right);
    }

    void postorder(BinaryTree<Integer> root) {
        if(root == null) return;

        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data);
    }

    void inorder(BinaryTree<Integer> root) {
        if(root == null) return;

        preorder(root.left);
        System.out.print(root.data);
        preorder(root.right);
    }
}
