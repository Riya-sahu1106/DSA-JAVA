package Linked_List;

class Node27 {
    int data;
    Node27 next;

    Node27(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IntersectionLinkedList {

    static Node27 getIntersection(Node27 headA, Node27 headB) {

        Node27 a = headA;
        Node27 b = headB;

        while (a != b) {

            if (a == null)
                a = headB;
            else
                a = a.next;

            if (b == null)
                b = headA;
            else
                b = b.next;
        }

        return a;
    }

    public static void main(String[] args) {

        Node27 common = new Node27(8);
        common.next = new Node27(10);
        common.next.next = new Node27(12);

        Node27 headA = new Node27(1);
        headA.next = new Node27(2);
        headA.next.next = common;

        Node27 headB = new Node27(5);
        headB.next = new Node27(6);
        headB.next.next = new Node27(7);
        headB.next.next.next = common;

        Node27 ans = getIntersection(headA, headB);

        if (ans != null)
            System.out.println("Intersection Node = " + ans.data);
        else
            System.out.println("No Intersection");
    }
}
