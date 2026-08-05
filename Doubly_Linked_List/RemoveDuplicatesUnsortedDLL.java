package Doubly_Linked_List;

import java.util.HashSet;

class Node8{
    int data;
    Node8 next,prev;

    Node8(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class RemoveDuplicatesUnsortedDLL {
    static void display(Node8 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    static Node8 removeDuplicates(Node8 head) {
        if (head == null)
            return head;

        HashSet<Integer> set = new HashSet<>();
        Node8 curr = head;

        while (curr != null) {
            if (!set.contains(curr.data)) {

                set.add(curr.data);
                curr = curr.next;

            } else {
                Node8 nextNode = curr.next;


                if (curr.prev != null)
                    curr.prev.next = curr.next;

                if (curr.next != null)
                    curr.next.prev = curr.prev;

                curr = nextNode;
            }
        }
         return head;
    }

    public static void main(String[] args) {
        Node8 head = new Node8(10);
        Node8 second = new Node8(30);
        Node8 third = new Node8(20);
        Node8 fourth = new Node8(40);
        Node8 fifth = new Node8(30);
        Node8 sixth = new Node8(50);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        fifth.next = sixth;
        sixth.prev = fifth;

        System.out.println("Before:");
        display(head);

        head = removeDuplicates(head);

        System.out.println("\nAfter:");
        display(head);
    }
}
