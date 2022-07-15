package DSA.Trees;

import java.util.*;

public class TopView {
    static void topView(BinaryTree<Integer> root, int dist, TreeMap<Integer,List<Integer>> map) {
        if(root == null) {
            return;
        }
        if(map.get(dist) == null) {
            List<Integer> i = new ArrayList<>();
            i.add(root.data);
            map.put(dist, i);
        } else {
            map.get(dist).add(root.data);
        }

        topView(root.left, dist - 1, map);
        topView(root.right, dist + 1, map);
    }
}
