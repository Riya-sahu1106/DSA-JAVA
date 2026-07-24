package BinaryTree;

class Node4 {
    int data;
    Node4 left;
    Node4 right;

    Node4(int data) {
        this.data = data;
    }
}

public class IdenticalTree {

    public static void display(Node4 root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);
    }

    public static boolean isIdentical(Node4 p, Node4 q) {

        // Both trees are empty
        if (p == null && q == null)
            return true;

        // One tree is empty and other is not
        if (p == null || q == null)
            return false;

        // Data should match and left & right subtrees should also match
        return (p.data == q.data)
                && isIdentical(p.left, q.left)
                && isIdentical(p.right, q.right);
    }

    public static void main(String[] args) {

        // First Tree
        Node4 a = new Node4(3);
        Node4 b = new Node4(4);
        Node4 c = new Node4(2);
        Node4 d = new Node4(-1);
        Node4 e = new Node4(1);
        Node4 f = new Node4(6);
        Node4 g = new Node4(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        // Second Tree
        Node4 p = new Node4(3);
        Node4 q = new Node4(4);
        Node4 r = new Node4(2);
        Node4 s = new Node4(-1);
        Node4 t = new Node4(1);
        Node4 u = new Node4(6);
        Node4 v = new Node4(9);

        p.left = q;
        p.right = r;
        q.left = s;
        q.right = t;
        r.left = u;
        r.right = v;

        display(a);
        System.out.println();

        if (isIdentical(a, p))
            System.out.println("Trees are Identical");
        else
            System.out.println("Trees are Not Identical");
    }
}