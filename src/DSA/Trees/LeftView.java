package DSA.Trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class LeftView {

    static int maxLevel = 0;
    static void leftViewRec(BinaryTree<Integer> root, int level) {
        if(root == null) return;
        if(maxLevel < level)  {
            System.out.println(root.data);
            maxLevel = level;
        }

        leftViewRec(root.left, level + 1);
        leftViewRec(root.right, level + 1);
    }


    static void leftView(BinaryTree<Integer> root) {
        if(root == null) return;

        Queue<BinaryTree<Integer>> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                BinaryTree<Integer> cur = q.poll();

                if(i == 0) {
                    System.out.print(cur.data+" ");
                }
                if(cur.left != null) {
                    q.add(cur.left);
                }
                if(cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
    }
}
