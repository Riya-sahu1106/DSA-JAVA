package Doubly_Linked_List;

class Node15 {
    int data;
    Node15 next, prev;

    Node15(int data) {
        this.data = data;
    }
}
public class SwapTwoNodes {
    static void display(Node15 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static Node15 swapNodes(Node15 head, int x, int y) {
      if(x==y)
          return head;

      Node15 node1 = null;
      Node15 node2 = null;

      Node15 curr = head;

        while (curr != null) {

            if (curr.data == x)
                node1 = curr;

            if (curr.data == y)
                node2 = curr;

            curr = curr.next;
        }

        if(node1 == null || node2 == null)
            return head;

        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;

        return head;
    }
    public static void main(String[] args) {
        Node15 head = new Node15(10);
        Node15 second = new Node15(20);
        Node15 third = new Node15(30);
        Node15 fourth = new Node15(40);
        Node15 fifth = new Node15(50);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.println("Before Swapping:");
        display(head);

        head = swapNodes(head, 20, 40);

        System.out.println("\nAfter Swapping:");
        display(head);
    }
}
