package Linked_List;


import java.sql.SQLOutput;

class Node26{
    int val;
    Node26 next;

    Node26(int val){
        this.val=val;
        this.next=null;
    }
}

public class OddEvenLinkedList {
    public static void display(Node26 head){
         while(head!=null) {
             System.out.print(head.val + " ");
             head = head.next;
         }
        System.out.println();
    }

    public static Node26 oddeven(Node26 head){
        if(head==null)
            return null;

        Node26 odd=head;
        Node26 even=head.next;
        Node26 evenHead=even;

        while(even!=null && even.next!=null){
             odd.next=even.next;
             odd=odd.next;

             even.next=odd.next;
             even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
    public static void main(String[] args) {
        Node26 head = new Node26(1);
        head.next = new Node26(2);
        head.next.next = new Node26(3);
        head.next.next.next = new Node26(4);
        head.next.next.next.next = new Node26(5);
        System.out.print("Original list is: ");
        display(head);

        head=oddeven(head);
        System.out.print("Odd Even List: ");
        display(head);

    }
}
