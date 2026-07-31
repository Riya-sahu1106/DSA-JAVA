package Linked_List;

class Node28 {
    int data;
    Node28 next;

    Node28(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedListII {

    static void display(Node28 head) {

        Node28 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static Node28 reverseBetween(Node28 head, int left, int right) {

        if (head == null)
            return null;

        Node28 dummy = new Node28(0);
        dummy.next = head;

        Node28 prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        Node28 curr = prev.next;

        for (int i = 0; i < right - left; i++) {

            Node28 next = curr.next;

            curr.next = next.next;

            next.next = prev.next;

            prev.next = next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        Node28 head = new Node28(1);
        head.next = new Node28(2);
        head.next.next = new Node28(3);
        head.next.next.next = new Node28(4);
        head.next.next.next.next = new Node28(5);

        System.out.println("Original List:");
        display(head);

        head = reverseBetween(head, 2, 4);

        System.out.println("After Reverse:");
        display(head);
    }
}