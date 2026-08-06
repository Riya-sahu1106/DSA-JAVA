package Doubly_Linked_List;

class Node18 {

    int data;
    Node18 next, prev;

    Node18(int data) {
        this.data = data;
    }
}

public class DeleteAllOccurrences {

    static void display(Node18 head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static Node18 deleteAll(Node18 head, int key) {
        Node18 curr = head;

        while (curr != null) {
            Node18 nextNode = curr.next;

            if (curr.data == key) {
                if (curr == head) {

                    head = head.next;

                    if (head != null)
                        head.prev = null;
                } else {
                    if (curr.prev != null)
                        curr.prev.next = curr.next;

                    if (curr.next != null)
                        curr.next.prev = curr.prev;
                }
            }
            curr = nextNode;
        }
        return head;
    }
    public static void main(String[] args) {
        Node18 head = new Node18(10);
        Node18 second = new Node18(20);
        Node18 third = new Node18(30);
        Node18 fourth = new Node18(20);
        Node18 fifth = new Node18(40);
        Node18 sixth = new Node18(20);

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

        head = deleteAll(head, 20);

        System.out.println("\nAfter Deleting:");
        display(head);
    }
}
