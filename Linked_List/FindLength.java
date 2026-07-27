package LinkedList;

class Node19 {

    int data;
    Node19 next;

    Node19(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FindLength {

    static int length(Node19 head) {

        int count = 0;

        while (head != null) {

            count++;

            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) {

        Node19 head = new Node19(5);
        head.next = new Node19(15);
        head.next.next = new Node19(25);
        head.next.next.next = new Node19(35);
        head.next.next.next.next = new Node19(45);

        System.out.println("Length = " + length(head));
    }
}