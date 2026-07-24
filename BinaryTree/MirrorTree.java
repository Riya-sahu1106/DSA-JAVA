package BinaryTree;

class Node3{
    int data;
    Node3 left;
    Node3 right;

    Node3(int data){
        this.data=data;
    }
}
public class MirrorTree {
    public static void display(Node3 root){
        if(root==null) return;
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }

    public static Node3 mirror(Node3 root){
        if(root==null) return null;
        Node3 temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
        return root;
    }
    public static void main(String[] args) {
        Node3 a= new Node3(2);
        Node3 b= new Node3(5);
        Node3 c= new Node3(1);
        Node3 d= new Node3(9);
        Node3 e= new Node3(6);
        Node3 f= new Node3(4);
        Node3 g= new Node3(3);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        display(a);
        System.out.println();
        System.out.print("Mirror elements are: ");
        mirror(a);
        display(a);

    }
}
