package Linked_List;

class Node7 {
    int data;
    Node7 next;
    Node7 prev;

    public Node7(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {

    public static Node7 convertArr2DLL(int[] arr) {
        Node7 head = new Node7(arr[0]);
        Node7 prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node7 temp = new Node7(arr[i]);
            temp.prev = prev;
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node7 deleteHead(Node7 head) {

        if (head == null) return null;

        if (head.next == null) return null;

        Node7 newHead = head.next;
        newHead.prev = null;

        return newHead;
    }

    public static void printDLL(Node7 head) {
        Node7 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class DeleteHeadOfDLList {
    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 7, 4};

        Node7 head = DoublyLinkedList.convertArr2DLL(arr);

        System.out.println("Original DLL:");
        DoublyLinkedList.printDLL(head);

        head = DoublyLinkedList.deleteHead(head);

        System.out.println("After deleting head:");
        DoublyLinkedList.printDLL(head);
    }
}