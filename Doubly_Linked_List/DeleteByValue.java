package Doubly_Linked_List;

class Node5{
    int data;
    Node5 next,prev;
    Node5(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DeleteByValue {
    static void display(Node5 head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static Node5 deleteByValue(Node5 head, int key){
        if (head == null)
            return null;

        Node5 current = head;

        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null)
            return head;

        if (current == head) {
            head = head.next;

            if (head != null)
                head.prev = null;

            return head;
        }

        if (current.prev != null)
            current.prev.next = current.next;

        if (current.next != null)
            current.next.prev = current.prev;

        return head;


    }
    public static void main(String[] args) {
        Node5 head = new Node5(10);
        Node5 second = new Node5(20);
        Node5 third = new Node5(30);
        Node5 fourth = new Node5(40);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        System.out.println("Original List:");
        display(head);

        head = deleteByValue(head, 30);

        System.out.println("\nAfter Deletion:");
        display(head);
    }
}
