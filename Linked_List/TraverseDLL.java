package Linked_List;

class Node34{
    int data;
    Node34 next,prev;
    Node34(int data){
        this.data=data;
    }
}

public class TraverseDLL {
    static Node34 createDLL(){
        Node34 head = new Node34(10);
        Node34 second = new Node34(20);
        Node34 third = new Node34(30);
        Node34 fourth = new Node34(40);

        head.next=second;
        second.prev=head;

        second.next=third;
        third.prev=second;

        third.next=fourth;
        fourth.prev=third;

        return head;
    }
    static void forward(Node34 head){
        Node34 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");

            if(temp.next==null)
                break;

            temp=temp.next;
        }
        System.out.println();
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
    public static void main(String[] args) {
        Node34 head = createDLL();
        forward(head);
    }
}
