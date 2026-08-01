package Linked_List;

class Node36{
    int data;
    Node36 prev,next;

    Node36(int data){
        this.data=data;
    }
}
public class InsertPosition {
    static void display(Node36 head){

        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    static Node36 insertAtPosition(Node36 head,int position,int value){
        Node36 newNode=new Node36(value);
        if(position==1){

            newNode.next=head;

            if(head!=null)
                head.prev=newNode;

            return newNode;
        }
        Node36 temp=head;
        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null)
            return head;

        newNode.next=temp.next;
        newNode.prev=temp;

        if(temp.next!=null)
            temp.next.prev=newNode;

        temp.next=newNode;
        return head;
    }
    public static void main(String[] args) {
        Node36 head=new Node36(10);
        head.next=new Node36(20);
        head.next.prev=head;

        head.next.next=new Node36(40);
        head.next.next.prev=head.next;

        head=insertAtPosition(head,3,30);
        display(head);
    }
}
