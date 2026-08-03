package Linked_List;

class Node37{
    int data;
    Node37 next,prev;

    Node37(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}


public class DeletePosition {
    static void display(Node37 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    static Node37 deletePosition(Node37 head,int position){
        if(head==null)
            return null;

        if(position==1){
            if(head.next==null)
                return null;

            head=head.next;
            head.prev=null;
            return head;
        }

        Node37 temp=head;
        for(int i=1; i<position && temp!=null; i++){
            temp=temp.next;
        }

       if(temp==null)
           return head;

       if(temp.next!=null)
           temp.next.prev=temp.prev;

        if(temp.prev!=null)
            temp.prev.next=temp.next;

        return head;
    }
    public static void main(String[] args) {
        Node37 head=new Node37(10);

        head.next=new Node37(20);
        head.next.prev=head;

        head.next.next=new Node37(30);
        head.next.next.prev=head.next;

        head.next.next.next = new Node37(40);
        head.next.next.next.prev = head.next.next;

        System.out.print("Before deleting:");
        display(head);


        System.out.print("List after deleting 3rd node:");
        head=deletePosition(head,3);
        display(head);

    }
}
