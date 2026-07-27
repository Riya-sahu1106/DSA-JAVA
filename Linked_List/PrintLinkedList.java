package Linked_List;
import java.util.*;

class Node18{
    int data;
    Node18 next;

    Node18(int data){
        this.data=data;
        this.next=null;
    }
}


public class PrintLinkedList {

    public static Node18 print(Node18 head){

        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        return head;
    }
    public static void main(String[] args) {

        Node18 head = new Node18(5);
        head.next = new Node18(15);
        head.next.next = new Node18(25);
        head.next.next.next = new Node18(35);
        head.next.next.next.next = new Node18(45);

        print(head);
    }
}
