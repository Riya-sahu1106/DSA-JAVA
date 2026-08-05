package Doubly_Linked_List;

class Node14 {
    int data;
    Node14 next, prev;

    Node14(int data) {
        this.data = data;
    }
}

public class CheckPalindromeDLL {
    static void display(Node14 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static boolean isPalindrome(Node14 head) {

        if (head == null || head.next == null)
            return true;

        // Find tail
        Node14 right = head;

        while (right.next != null)
            right = right.next;

        Node14 left = head;

        while (left != right && right.next != left) {

            if (left.data != right.data)
                return false;

            left = left.next;
            right = right.prev;
        }

        return true;
    }
    public static void main(String[] args) {
        Node14 head = new Node14(10);
        Node14 second = new Node14(20);
        Node14 third = new Node14(30);
        Node14 fourth = new Node14(20);
        Node14 fifth = new Node14(10);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.print("List:");
        display(head);
        System.out.println();
        System.out.println(isPalindrome(head));
    }
}