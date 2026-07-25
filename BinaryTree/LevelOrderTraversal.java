package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node8 {
    int val;
    Node8 left;
    Node8 right;

    Node8(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class LevelOrderTraversal {

    public static ArrayList<Integer> levelOrder(Node8 root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<Node8> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            Node8 temp = q.poll();
            ans.add(temp.val);

            if (temp.left != null)
                q.offer(temp.left);

            if (temp.right != null)
                q.offer(temp.right);
        }

        return ans;
    }

    public static void main(String[] args) {

        // Creating Binary Tree
        Node8 a = new Node8(1);
        Node8 b = new Node8(2);
        Node8 c = new Node8(3);
        Node8 d = new Node8(4);
        Node8 e = new Node8(5);
        Node8 f = new Node8(6);
        Node8 g = new Node8(7);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        ArrayList<Integer> result = levelOrder(a);

        System.out.println("Level Order Traversal:");

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}