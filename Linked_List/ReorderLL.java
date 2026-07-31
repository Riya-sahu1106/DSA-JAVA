package Linked_List;

class Node32{
    int data;
    Node32 next;

    Node32(int data){
        this.data=data;
        this.next=null;
    }
}

public class ReorderLL {
    public static void display(Node32 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    static Node32 reverse(Node32 head){
        Node32 prev=null;
        while(head!=null){
            Node32 next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    static void reorderList(Node32 head){
        if(head==null || head.next==null)
            return;
        Node32 slow = head;
        Node32 fast = head;

        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        Node32 second=reverse(slow.next);

        slow.next=null;
        Node32 first=head;
        while(second!=null){
            Node32 temp1=first.next;
            Node32 temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }

    }
    public static void main(String[] args) {
        Node32 head = new Node32(1);
        head.next = new Node32(2);
        head.next.next = new Node32(3);
        head.next.next.next = new Node32(4);
        head.next.next.next.next = new Node32(5);

        System.out.println("Original List:");
        display(head);

        reorderList(head);
        System.out.print("Rearrange the list:");
        display(head);

    }
}
