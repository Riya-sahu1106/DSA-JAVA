package Doubly_Linked_List;

class Node3 {
    int data;
    Node3 next;
    Node3 prev;

    Node3(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class InsertAfterNode {
    static void display(Node3 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static Node3 insertAfter(Node3 head,int target,int newData){
        Node3 curr=head;

        while(curr!=null && curr.data!=target){
            curr=curr.next;
        }

        if(curr==null) {
            return head;
        }

        Node3 newnode = new Node3(newData);

        newnode.next=curr.next;
        newnode.prev=curr;

        if (curr.next != null) {
            curr.next.prev = newnode;
        }
        curr.next = newnode;

        return head;
    }
    public static void main(String[] args) {
        Node3 head = new Node3(10);

        Node3 second = new Node3(20);
        Node3 third = new Node3(40);
        Node3 fourth = new Node3(50);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        System.out.println("Original List:");
        display(head);

        insertAfter(head,40,30);

        System.out.println();
        System.out.print("Linkedlist after inserting the node:");
        display(head);
    }
}
