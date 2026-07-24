package BinaryTree;

class Node1{
    int val;
    Node left;
    Node right;
    Node1(int val){
        this.val=val;
    }
}

public class Levels {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        d.left=f; c.right=g;
        display(a);
        System.out.println();
        System.out.println("Levels of Binary tree is: "+levels(a));
    }

    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    public static int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
}
