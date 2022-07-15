package DSA.Trees;

import java.util.*;

public class VerticalOrderTraversal {
    static void getVerticalOrder(BinaryTree<Integer> node, int dist, TreeMap<Integer, List<Integer>> map) {
        if (node == null) {
            return;
        }
        if (map.get(dist) == null) {
            List<Integer> i = new ArrayList<>();
            i.add(node.data);
            map.put(dist, i);
        } else {
            map.get(dist).add(node.data);
        }

        getVerticalOrder(node.left, dist - 1, map);
        getVerticalOrder(node.right, dist + 1, map);
    }

    static void verticalOrderIterative(BinaryTree<Integer> root) {
        class Tuple {
            BinaryTree<Integer> node;
            int row;
            int col;

            public Tuple(BinaryTree<Integer> _node, int _row, int _col) {
                node = _node;
                row = _row;
                col = _col;
            }
        }

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.offer(new Tuple(root, 0, 0));
        while (!q.isEmpty()) {
            Tuple tuple = q.poll();
            BinaryTree<Integer> node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;

            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }
            map.get(x).get(y).add(node.data);

            if (node.left != null) {
                q.offer(new Tuple(node.left, x - 1, y + 1));
            }
            if (node.right != null) {
                q.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            res.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    res.get(res.size() - 1).add(nodes.poll());
                }
            }
        }
        System.out.println(res);
    }
}
