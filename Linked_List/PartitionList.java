package Linked_List;


class Node30{
    int data;
    Node30 next;

    Node30(int data){
        this.data=data;
        this.next=null;
    }
}

public class PartitionList {
    public static void display(Node30 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static Node30 partion(Node30 head,int x){
        Node30 small=new Node30(0);
        Node30 large=new Node30(0);

        Node30 s=small;
        Node30 l=large;

        while(head!=null){
            if(head.data<x){
                s.next=head;
                s=s.next;
            }
            else{
                l.next=head;
                l=l.next;
            }
            head=head.next;
        }
        l.next=null;
        s.next=large.next;

        return small.next;
    }
    public static void main(String[] args) {
        Node30 head = new Node30(1);
        head.next = new Node30(4);
        head.next.next = new Node30(3);
        head.next.next.next = new Node30(2);
        head.next.next.next.next = new Node30(5);
        head.next.next.next.next.next = new Node30(2);

        System.out.print("Original linkedList:");
        display(head);


        head=partion(head,3);
        System.out.print("After partioning List:");
        display(head);
    }
}
