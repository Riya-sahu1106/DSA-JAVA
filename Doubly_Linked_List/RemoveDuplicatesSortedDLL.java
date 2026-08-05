package Doubly_Linked_List;

class Node7{
    int data;
    Node7 next,prev;

    Node7(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class RemoveDuplicatesSortedDLL {
    static void display(Node7 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    static Node7 removeDuplicates(Node7 head){
        if(head==null)
            return head;

        Node7 curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data) {
                Node7 duplicate = curr.next;
                curr.next = duplicate.next;

                if (duplicate.next != null) {
                    duplicate.next.prev = curr;
                }
            }
               else{
                   curr=curr.next;
                }
            }
            return head;
        }

    public static void main(String[] args) {
        Node7 head = new Node7(10);
        Node7 second = new Node7(20);
        Node7 third = new Node7(20);
        Node7 fourth = new Node7(30);
        Node7 fifth = new Node7(30);
        Node7 sixth = new Node7(40);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        fifth.next = sixth;
        sixth.prev = fifth;

        System.out.println("Before:");
        display(head);

        head = removeDuplicates(head);

        System.out.println("\nAfter:");
        display(head);
    }
}
