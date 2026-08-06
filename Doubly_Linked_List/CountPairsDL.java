package Doubly_Linked_List;

class Node16{
    int data;
    Node16 next,prev;
    Node16(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class CountPairsDL {
    static void display(Node16 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static int countPairs(Node16 head,int target){
        if(head==null)
            return 0;

        Node16 left = head;
        Node16 right = head;

        while (right.next != null) {
            right = right.next;
        }

        int count = 0;

        while (left != right && right.next != left) {

            int sum = left.data + right.data;

            if (sum == target) {
                count++;
                left = left.next;
                right = right.prev;
            }
            else if (sum < target) {
                left = left.next;
            }
            else {
                right = right.prev;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Node16 head = new Node16(10);
        Node16 second = new Node16(20);
        Node16 third = new Node16(30);
        Node16 fourth = new Node16(40);
        Node16 fifth = new Node16(50);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        display(head);

        System.out.println("\nTotal Pairs = " + countPairs(head, 60));
    }
}
