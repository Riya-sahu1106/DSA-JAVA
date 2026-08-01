package Linked_List;

class Node35{
    int data;
    Node35 next,prev;
    Node35(int data){
        this.data=data;
    }
}

public class InsertAtHeadOfLL {

    static void display(Node35 head){

        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    static Node35 insertAtHead(Node35 head,int value){
        Node35 newNode = new Node35(10);
        newNode.next=head;

        if(head!=null){
            head.prev=newNode;
        }
        return newNode;
    }
    public static void main(String[] args) {
        Node35 head=new Node35(20);
        head.next=new Node35(30);

        head.next.prev=head;

        head=insertAtHead(head,10);
        display(head);

    }
}
