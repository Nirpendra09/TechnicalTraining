package DSA.LinkedLists;

import java.util.*;

public class LRUCache {
    class Node {
        int key, val;
        Node prev, next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Map<Integer, Node> map = new HashMap<>();
    Node start, last;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        start = new Node(0, 0);
        last = new Node(0, 0);
        start.next = last;
        last.prev = start;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null)
            return -1;
        remove(node);
        insert(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            remove(last.prev);
        }
        insert(new Node(key, value));
    }

    public void insert(Node node) {
        map.put(node.key, node);
        node.next = start.next;
        start.next.prev = node;
        node.prev = start;
        start.next = node;
    }

    public void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

