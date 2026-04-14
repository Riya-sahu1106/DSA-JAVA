package Linked_List;

import java.util.Arrays;
import java.util.List;

class Node11{
    int data;
    Node next;

    Node11(int d,Node next1){
        data = d;
        next = next1;
    }
    Node11(int d){
        data = d;
        next = null;
    }
}
class Remove{

    public void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public Node deleteNthNodeFromEnd(Node head,int N){
        Node dummy = new Node(0,head);

        Node slow=dummy;
        Node fast=dummy;

        for (int i = 0; i <= N; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
}

public class RemoveNthNode {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int N = 3;

        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));
        head.next.next.next.next = new Node(arr.get(4));

        Remove re = new Remove();
        System.out.print("Original Linked List:");
        re.printLL(head);

        head = re.deleteNthNodeFromEnd(head,N);

        System.out.println();
        System.out.print("LinkedList after deleting "+N+" node: " );
       re.printLL(head);
    }
}
