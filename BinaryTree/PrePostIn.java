package BinaryTree;

class Node2 {
    int val;
    Node2 left;
    Node2 right;

    Node2(int val) {
        this.val = val;
    }
}

public class PrePostIn {

    public static void main(String[] args) {

        Node2 a = new Node2(3);
        Node2 b = new Node2(4);
        Node2 c = new Node2(-1);
        Node2 d = new Node2(1);
        Node2 e = new Node2(2);
        Node2 f = new Node2(6);
        Node2 g = new Node2(9);

        // Creating Tree
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        d.left = f;

        c.right = g;

        System.out.print("Preorder: ");
        preorder(a);

        System.out.println();

        System.out.print("Inorder: ");
        inorder(a);

        System.out.println();

        System.out.print("Postorder: ");
        postorder(a);

        System.out.println();

        System.out.println("Size is: " + size(a));
    }

    // Preorder
    public static void preorder(Node2 root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder
    public static void inorder(Node2 root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Postorder
    public static void postorder(Node2 root) {
        if (root == null)
            return;

          postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // Size of Binary Tree
    public static int size(Node2 root) {
        if (root == null)
            return 0;

        int leftSize = size(root.left);
        int rightSize = size(root.right);

        return 1 + leftSize + rightSize;
    }
}