package DSA.Trees;

public class HeightOfTree {
    public int height(BinaryTree<Integer> root) {
        if (root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return 1 + Math.max(lh, rh);
    }
}
