package Linked_List;

class Node29{
    int data;
    Node29 next;

    Node29(int data){
        this.data=data;
        this.next=null;
    }
}

public class SwapNodeInPairs {
    public static void display(Node29 head){
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static Node29 swapNodes(Node29 head){
        Node29 dummy=new Node29(0);
        dummy.next=head;

        Node29 prev=dummy;

        while(prev.next!=null && prev.next.next!=null){
               Node29 first=prev.next;
               Node29 second=first.next;

               first.next=second.next;
               second.next=first;
               prev.next=second;
               prev=first;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        Node29 head = new Node29(1);
        head.next = new Node29(2);
        head.next.next = new Node29(3);
        head.next.next.next = new Node29(4);
        head.next.next.next.next = new Node29(5);
        head.next.next.next.next.next = new Node29(6);

        System.out.print("Original list:");
        display(head);

       head=swapNodes(head);
        System.out.print("After swapping:");
        display(head);

    }
}
