package Linked_List;

class Node12 {
    int data;
    Node next;

    Node12(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    Node12(int data1) {
        data = data1;
        next = null;
    }
}

class DeleteMiddle {
    public Node deleteMiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}

public class DeleteMiddleNode {
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        DeleteMiddle DM = new DeleteMiddle();
        System.out.print("Original Linked List: ");
        printLL(head);

        Solution obj = new Solution();
        head = DM.deleteMiddle(head);
        System.out.print("Updated Linked List: ");
        printLL(head);
    }
}