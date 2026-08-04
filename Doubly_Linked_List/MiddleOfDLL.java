package Doubly_Linked_List;
class Node6 {
    int data;
    Node6 next;
    Node6 prev;

    Node6(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class MiddleOfDLL {

    static Node6 findMiddle(Node6 head) {

        if (head == null)
            return null;

        Node6 slow = head;
        Node6 fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static void print(Node6 head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node6 head = new Node6(10);

        Node6 second = new Node6(20);
        Node6 third = new Node6(30);
        Node6 fourth = new Node6(40);
        Node6 fifth = new Node6(50);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.println("Doubly Linked List:");
        print(head);

        Node6 middle = findMiddle(head);

        System.out.println("\nMiddle Node = " + middle.data);
    }
}