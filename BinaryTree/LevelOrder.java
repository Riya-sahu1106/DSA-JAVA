package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node7{
    int val;
    Node7 left;
    Node7 right;
    Node7(int val){
        this.val=val;
    }
}

class Pair{
    Node7 node;
    int level;
    Pair(Node7 node,int level){
        this.level=level;
        this.node=node;
    }
}

public class LevelOrder {
    public static void display(Node7 root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    public static void levelOrderLineWise(Node7 root) {
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new Pair(root, 0));
        while (q.size() > 0) {
            Pair front = q.remove();
            if (front.level != currLevel) {
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val + " ");
            if (front.node.left != null) q.add(new Pair(front.node.left, front.level + 1));
            if (front.node.right != null) q.add(new Pair(front.node.right, front.level + 1));
        }
    }
     private static void levelOrder(Node7 root){
         Queue<Node7> q = new LinkedList<>();
         q.add(root);
         while(q.size()>0){
             Node7 front=q.remove();
             System.out.print(front.val+" ");
             if(front.left!=null)q.add(front.left);
             if(front.right!=null)q.add(front.right);
         }
         System.out.println();
     }
    public static void main(String[] args) {
        Node7 a = new Node7(3);
        Node7 b = new Node7(4);
        Node7 c = new Node7(2);
        Node7 d = new Node7(-1);
        Node7 e = new Node7(1);
        Node7 f = new Node7(6);
        Node7 g = new Node7(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        d.left=f; c.right=g;
        display(a);
        System.out.println();
        levelOrder(a);
        System.out.println();
        levelOrderLineWise(a);
    }
}
