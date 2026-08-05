package Doubly_Linked_List;

class Node9{
    int data;
    Node9 prev,next;

    Node9(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class SortDLL {
    static void display(Node9 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    static Node9 sort(Node9 head){
        if(head==null)
            return head;

        boolean swapped;

        do{
            swapped=false;
            Node9 curr=head;

            while(curr.next!=null){
                if(curr.data > curr.next.data){
                    int temp=curr.data;
                    curr.data=curr.next.data;
                    curr.next.data=temp;

                    swapped=true;
                }
                curr=curr.next;
            }
        }while(swapped);
            return head;
        }
    public static void main(String[] args) {
        Node9 head = new Node9(40);
        Node9 second = new Node9(10);
        Node9 third = new Node9(30);
        Node9 fourth = new Node9(20);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        System.out.println("Before Sorting:");
        display(head);

        head = sort(head);

        System.out.println("\nAfter Sorting:");
        display(head);
    }
}
