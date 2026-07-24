package BinaryTree;

class Node5 {
    int data;
    Node5 left;
    Node5 right;

    Node5(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class SymmetricTree {

    public static boolean isSymmetric(Node5 root) {
        if (root == null) return true;

        mirror(root.left);
        return isIdentical(root.left, root.right);
    }

    public static boolean isIdentical(Node5 p, Node5 q) {
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        if (p.data != q.data)
            return false;

        return isIdentical(p.left, q.left) &&
                isIdentical(p.right, q.right);
    }

    public static void mirror(Node5 root) {
        if (root == null)
            return;

        Node5 temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror(root.left);
        mirror(root.right);
    }

    public static void display(Node5 root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {

        /*
                  1
                /   \
               2     2
              / \   / \
             3   4 4   3
        */

        Node5 a = new Node5(1);
        Node5 b = new Node5(2);
        Node5 c = new Node5(2);
        Node5 d = new Node5(3);
        Node5 e = new Node5(4);
        Node5 f = new Node5(4);
        Node5 g = new Node5(3);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        System.out.print("Original Tree (Preorder): ");
        display(a);

        System.out.println();

        if (isSymmetric(a))
            System.out.println("Tree is Symmetric");
        else
            System.out.println("Tree is NOT Symmetric");

        System.out.print("Tree after checking: ");
        display(a);
    }
}