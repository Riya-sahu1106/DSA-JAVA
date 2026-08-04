package Doubly_Linked_List;

class Node1{
    int data;
    Node1 next,prev;

    Node1(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class SearchElement {
    static void display(Node1 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    static boolean found(Node1 head,int key){
        Node1 curr=head;
        boolean found=false;
        while(curr!=null){
            if(key==curr.data)
                return true;
            curr=curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node1 head = new Node1(10);

        Node1 second = new Node1(20);
        Node1 third = new Node1(30);
        Node1 fourth = new Node1(40);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        System.out.println("Doubly Linked List:");
        display(head);

        boolean ans=found(head,10);

        if(ans){
            System.out.print("Element is found");
        }
        else{
            System.out.print("Element is not found");
        }
    }
}
