package Linked_List;

class Node17 {
    int val;
    Node17 next;
    Node17 random;

    public Node17(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {

    public static Node17 copyRandomList(Node17 head) {
        if (head == null) {
            return null;
        }

        Node17 curr = head;

        while (curr != null) {
            Node17 newNode = new Node17(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        Node17 newHead = head.next;
        Node17 newCurr = newHead;

        while (curr != null) {
            curr.next = newCurr.next;
            curr = curr.next;

            if (curr != null) {
                newCurr.next = curr.next;
                newCurr = newCurr.next;
            }
        }

        return newHead;
    }

    public static void printList(Node17 head) {
        Node17 curr = head;
        while (curr != null) {
            int randomVal = (curr.random != null) ? curr.random.val : -1;
            System.out.print("[" + curr.val + ", random:" + randomVal + "] -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node17 n1 = new Node17(1);
        Node17 n2 = new Node17(2);
        Node17 n3 = new Node17(3);

        n1.next = n2;
        n2.next = n3;

        n1.random = n3;
        n2.random = n1;
        n3.random = n2;

        System.out.println("Original List:");
        printList(n1);

        Node17 copied = copyRandomList(n1);

        System.out.println("Copied List:");
        printList(copied);
    }
}
