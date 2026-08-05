package Doubly_Linked_List;

class Node11{
    int data;
    Node11 next,prev;

    Node11(int data){
        this.data=data;
        this.next=next;
        this.prev=null;
    }
}

public class RotateDLL {
    static void display(Node11 head){
        while(head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node11 rotate(Node11 head,int k){
        if(head==null || k==0)
            return head;

        Node11 curr=head;

        int count=1;

        while(count < k && curr!=null){
            curr=curr.next;
            count++;
        }
        if(curr==null)
            return head;

        Node11 newHead = curr.next;

        if (newHead == null)
            return head;

        newHead.prev=null;
        curr.next=null;

        Node11 tail=newHead;

        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head;
        head.prev = tail;

        return newHead;

    }
    public static void main(String[] args) {
        Node11 head = new Node11(10);
        Node11 second = new Node11(20);
        Node11 third = new Node11(30);
        Node11 fourth = new Node11(40);
        Node11 fifth = new Node11(50);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.println("Original List:");
        display(head);

        head = rotate(head, 2);

        System.out.println("\nAfter Rotation:");
        display(head);
    }
}
