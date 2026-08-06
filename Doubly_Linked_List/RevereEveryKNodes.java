package Doubly_Linked_List;

class Node17 {

    int data;
    Node17 next, prev;

    Node17(int data) {
        this.data = data;
    }
}

public class RevereEveryKNodes {
    static void display(Node17 head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

     static Node17 reverseK(Node17 head,int k){
         if (head == null)
             return null;

         Node17 curr = head;
         Node17 newHead = null;
         int count = 0;

         while (curr != null && count < k) {

             Node17 next = curr.next;

             curr.next = curr.prev;
             curr.prev = next;

             newHead = curr;
             curr = next;
             count++;
         }

         if (curr != null) {

             head.next = reverseK(curr, k);

             if (head.next != null)
                 head.next.prev = head;
         }

         return newHead;
     }
    public static void main(String[] args) {
        Node17 head = new Node17(10);
        Node17 second = new Node17(20);
        Node17 third = new Node17(30);
        Node17 fourth = new Node17(40);
        Node17 fifth = new Node17(50);
        Node17 sixth = new Node17(60);

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

        System.out.println("Original DLL:");
        display(head);

        head = reverseK(head, 2);

        System.out.println("\nAfter Reversing Every K Nodes:");
        display(head);
    }
}
