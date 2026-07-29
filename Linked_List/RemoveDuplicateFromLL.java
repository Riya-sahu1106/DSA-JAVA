package Linked_List;

class Node25 {
    int data;
    Node25 next;

    Node25(int data) {
        this.data = data;
    }
}

public class RemoveDuplicateFromLL {

    static void display(Node25 head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    static Node25 removeDuplicates(Node25 head) {

        Node25 temp = head;

        while (temp != null && temp.next != null) {

            if (temp.data == temp.next.data)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {

        Node25 head = new Node25(1);
        head.next = new Node25(1);
        head.next.next = new Node25(2);
        head.next.next.next = new Node25(3);
        head.next.next.next.next = new Node25(3);

        System.out.println("Original:");
        display(head);

        head = removeDuplicates(head);

        System.out.println("After Removing Duplicates:");
        display(head);
    }
}