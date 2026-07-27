package Linked_List;

class Node23 {
    int data;
    Node23 next;

    Node23(int data) {
        this.data = data;
    }
}

public class LinkedListCycle {

    static boolean hasCycle(Node23 head) {

        Node23 slow = head;
        Node23 fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node23 head = new Node23(10);
        head.next = new Node23(20);
        head.next.next = new Node23(30);
        head.next.next.next = new Node23(40);

        // Creating Cycle
        head.next.next.next.next = head.next;

        if (hasCycle(head))
            System.out.println("Cycle Found");
        else
            System.out.println("No Cycle");
    }
}