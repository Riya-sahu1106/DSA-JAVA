package Doubly_Linked_List;

class Node2 {
    int data;
    Node2 next;
    Node2 prev;

    Node2(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class InsertBeforeNode {
    static void display(Node2 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static Node2 insertBefore(Node2 head,int target,int newData){
        Node2 curr=head;

        while(curr!=null && curr.data!=target){
            curr=curr.next;
        }

        if(curr==null) {
            return head;
        }

        Node2 newnode = new Node2(newData);

        if(curr==head){
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
            return head;
        }

        Node2 previous=curr.prev;

        previous.next=newnode;
        newnode.next=curr;
        curr.prev=newnode;

        return head;
    }
    public static void main(String[] args) {
        Node2 head = new Node2(10);

        Node2 second = new Node2(20);
        Node2 third = new Node2(40);
        Node2 fourth = new Node2(50);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        System.out.println("Original List:");
        display(head);

        insertBefore(head,40,30);

        System.out.println();
        System.out.print("Linkedlist after inserting the node:");
        display(head);
    }
}
