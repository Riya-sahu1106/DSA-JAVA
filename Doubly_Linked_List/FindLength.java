package Doubly_Linked_List;

class Node{
    int data;
    Node next,prev;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class FindLength {
    static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    static int findLength(Node head){
        Node curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        System.out.println("Doubly Linked List:");
        display(head);

        int length = findLength(head);

        System.out.println("\nLength = " + length);
    }
}
