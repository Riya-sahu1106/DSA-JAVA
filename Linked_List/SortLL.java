package Linked_List;

class Node13{
    int data;
    Node next;

    Node13(int data1,Node next1){
        data=data1;
        next=next1;
    }

    Node13(int data1) {
        data = data1;
        next = null;
    }
}

class Sort{

    public Node mergeTwoSortedLinkedLists(Node list1,Node list2){
        Node dummyNode = new Node(-1, null);
        Node temp = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return dummyNode.next;
    }

    public Node findMiddle(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node sortLL(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node middle = findMiddle(head);
        Node right = middle.next;
        middle.next = null;
        Node left = head;

        left = sortLL(left);
        right = sortLL(right);

        return mergeTwoSortedLinkedLists(left, right);
    }
}
public class SortLL {

    static void printLinkedList(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(3, null);
        head.next = new Node(2, null);
        head.next.next = new Node(5, null);
        head.next.next.next = new Node(4, null);
        head.next.next.next.next = new Node(1, null);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        Sort s  = new Sort();
        head=s.sortLL(head);

        System.out.print("Sorted Linked List: ");
        printLinkedList(head);
    }

}
