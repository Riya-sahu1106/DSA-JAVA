package Doubly_Linked_List;

class Node4{
    int data;
    Node4 next,prev;

    Node4(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DeleteNode {
    static void display(Node4 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node4 deleteNode(Node4 head,Node4 delNode){
        if(head==null || delNode==null)
            return head;

        if(head==delNode){
            head=head.next;

            if(head!=null)
                head.prev=null;
            return head;
        }

        if(delNode.prev!=null)
            delNode.prev.next=delNode.next;

        if (delNode.next != null)
            delNode.next.prev = delNode.prev;
        return head;
    }
    public static void main(String[] args) {
        Node4 head = new Node4(10);
        Node4 second = new Node4(20);
        Node4 third = new Node4(30);
        Node4 fourth = new Node4(40);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        System.out.println("Original List:");
        display(head);

        head = deleteNode(head, third);

        System.out.println("\nAfter Deletion:");
        display(head);
    }
}
