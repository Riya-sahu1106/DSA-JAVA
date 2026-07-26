package BinaryTree;

class Node10 {
    int val;
    Node10 left;
    Node10 right;

    Node10(int val) {
        this.val = val;
    }
}

public class FlattenBinarySearch {

    public static void flatten(Node10 root) {
        Node10 curr = root;

        while (curr != null) {
            if (curr.left != null) {
                Node10 pre = curr.left;

                while (pre.right != null) {
                    pre = pre.right;
                }

                pre.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }

            curr = curr.right;
        }
    }

    public static void printList(Node10 root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   5
              / \   \
             3   4   6
        */

        Node10 root = new Node10(1);
        root.left = new Node10(2);
        root.right = new Node10(5);

        root.left.left = new Node10(3);
        root.left.right = new Node10(4);

        root.right.right = new Node10(6);

        System.out.println("Before Flatten:");
        printPreOrder(root);

        flatten(root);

        System.out.println("\n\nAfter Flatten:");
        printList(root);
    }

    public static void printPreOrder(Node10 root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
}