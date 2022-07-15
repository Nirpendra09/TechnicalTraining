package DSA.Trees;

public class BinaryTree<T> {
    T data;
    BinaryTree<T> left;
    BinaryTree<T> right;

    public BinaryTree(T data) {
        this.data = data;
        left = right = null;
    }
}