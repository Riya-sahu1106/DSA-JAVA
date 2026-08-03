package Linked_List;

class Node38{
    int data;
    Node38 next,prev;

    Node38(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class ReverseDLL {

    static void display(Node38 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    static Node38 reverse(Node38 head){
        Node38 temp=null;
        Node38 current=head;

        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;

            current=current.prev;
        }
        if (temp != null)
            head = temp.prev;

        return head;
    }
    public static void main(String[] args) {
        Node38 head=new Node38(10);

        head.next=new Node38(20);
        head.next.prev=head;

        head.next.next=new Node38(30);
        head.next.next.prev=head.next;

        head.next.next.next = new Node38(40);
        head.next.next.next.prev = head.next.next;

        System.out.print("Original Linkedlist:");
        display(head);

        System.out.print("After reverse the Linkedlist:");
        head=reverse(head);
        display(head);


    }
}
