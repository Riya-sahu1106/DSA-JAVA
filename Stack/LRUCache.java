package Stack;

import java.util.*;

class LRU {

    class Node {
        int key, value;
        Node prev, next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }
    private int capacity;
    private HashMap<Integer, Node> map;
    private Node head, tail;

    public LRU(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
            map.remove(key);
        }

        if (map.size() == capacity) {
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }

        Node newNode = new Node(key, value);
        insert(newNode);
        map.put(key, newNode);
    }
}

public class LRUCache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = sc.nextInt();
        System.out.print("Enter the number of operations:");
        int q = sc.nextInt();

        LRU cache = new LRU(capacity);
        List<Integer> results = new ArrayList<>();
        while (q-- > 0) {
            String op = sc.next();

            if (op.equals("put")) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                cache.put(key, value);
            } else if (op.equals("get")) {
                int key = sc.nextInt();
                results.add(cache.get(key));
            }
        }
        for (int res : results) {
            System.out.println(res);
        }
    }
}
