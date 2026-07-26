package BinaryTree;

import java.util.Scanner;

class Node9 {
    int val;
    Node9 left;
    Node9 right;

    Node9(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class kthLevel {

    public static void printKthLevel(Node9 root, int k) {

        if (root == null)
            return;

        if (k == 0) {
            System.out.print(root.val + " ");
            return;
        }

        printKthLevel(root.left, k - 1);
        printKthLevel(root.right, k - 1);
    }

    public static void display(Node9 root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        Node9 a = new Node9(1);
        Node9 b = new Node9(2);
        Node9 c = new Node9(3);
        Node9 d = new Node9(4);
        Node9 e = new Node9(5);
        Node9 f = new Node9(6);
        Node9 g = new Node9(7);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        display(a);
        System.out.println();
        int k = sc.nextInt();


        System.out.println("Nodes at Level " + k + ":");
        printKthLevel(a, k);
    }
}