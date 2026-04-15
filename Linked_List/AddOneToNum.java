package Linked_List;

class Node15 {
    int data;
    Node15 next;

    Node15(int value) {
        data = value;
        next = null;
    }
}

class LinkedList1 {
    Node15 append(Node15 head, int value) {
        Node15 newNode = new Node15(value);
        if (head == null) {
            return newNode;
        }
        Node15 current = head;
        while (current.next != null) {
            current = current.next;
        }
            current.next = newNode;
            return head;
    }

    void printList(Node15 head) {
        Node15 current = head;
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
}
class AddToNum{
    Node15 reverseList(Node15 node) {
        Node15 prev = null;
        Node15 current = node;

        while (current != null) {
            Node15 nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    Node15 addOne(Node15 head){
        head = reverseList(head);
        Node15 current = head;
        int carry = 1;

        while (current != null && carry > 0) {
            int sum = current.data + carry;
            current.data = sum % 10;
            carry = sum / 10;
            if (current.next == null && carry > 0) {
                current.next = new Node15(carry);
                carry = 0;
            }

            current = current.next;
        }

        head = reverseList(head);
        return head;
    }
}

public class AddOneToNum {
    public static void main(String[] args) {
        Node15 head = null;
        LinkedList1 ll = new LinkedList1();
        AddToNum sol = new AddToNum();

        head = ll.append(head, 1);
        head = ll.append(head, 2);
        head = ll.append(head, 9);

        System.out.print("Original Number: ");
        ll.printList(head);

        head = sol.addOne(head);

        System.out.print("After Adding One: ");
        ll.printList(head);
    }
}
