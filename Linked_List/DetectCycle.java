package Linked_List;

class ListNodee {
    int val;
    ListNode next;

    ListNodee(int x) {
        val = x;
        next = null;
    }
}

class Solu {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;

            // Move fast two steps
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }
        return null;
    }
}

public class DetectCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        head.next.next.next.next = head.next;

        Solu obj = new Solu();
        ListNode result = obj.detectCycle(head);

        if (result != null)
            System.out.println("Cycle starts at node with value: " + result.val);
        else
            System.out.println("No cycle found.");
    }
}
