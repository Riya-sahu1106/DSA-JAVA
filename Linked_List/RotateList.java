package Linked_List;

class Node31{
    int data;
    Node31 next;

    Node31(int data){
        this.data=data;
        this.next=null;
    }
}

public class RotateList {
    public static void display(Node31 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    static Node31 rotate(Node31 head,int k){
        if(head==null || head.next==null || k==0)
            return head;

        Node31 tail=head;
        int len=1;

        while(tail.next!=null){
            tail=tail.next;
            len++;
        }

        k=k%len;
        if(k==0)
            return head;

        tail.next=head;
        int steps=len-k;

        Node31 newtail=head;
        for(int i=1;i<steps;i++){
            newtail=newtail.next;
        }
        Node31 newhead=newtail.next;
        newtail.next=null;
        return newhead;

    }
    public static void main(String[] args) {
        Node31 head = new Node31(1);
        head.next = new Node31(4);
        head.next.next = new Node31(3);
        head.next.next.next = new Node31(2);
        head.next.next.next.next = new Node31(5);
        head.next.next.next.next.next = new Node31(2);

        System.out.print("Original list:");
        display(head);

        head=rotate(head,2);
        System.out.print("After rotating:");
        display(head);
    }
}
