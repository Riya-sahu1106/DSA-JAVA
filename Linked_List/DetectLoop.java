package Linked_List;

class Nodee {
    int data;
    Nodee next;

    Nodee(int data) {
        this.data = data;
        this.next = null;
    }
}

class Detect {
    public boolean detectLoop(Node head) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

public class DetectLoop {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        Detect sol = new Detect();

        if (sol.detectLoop(head)) {
            System.out.println("Loop detected");
        } else {
            System.out.println("No loop");
        }
    }
}