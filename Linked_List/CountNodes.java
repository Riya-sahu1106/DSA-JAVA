package Linked_List;

class Node22{
    int data;
    Node22 next;

    Node22(int data1,Node22 next1){
        data=data1;
        next=next1;
    }

    Node22(int data1){
        data=data1;
        next=null;
    }
}

public class CountNodes {
    static int countNodes(Node22 head){
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
    public static void main(String[] args) {


        Node22 head = new Node22(10);
        head.next = new Node22(20);
        head.next.next = new Node22(30);
        head.next.next.next = new Node22(40);

        System.out.println("Total Nodes = " + countNodes(head));
    }
}
