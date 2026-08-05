package Doubly_Linked_List;

class Node10{
    int data;
    Node10 next,prev;

    Node10(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class MergeDLL {
    static void display(Node10 head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    static Node10 merge(Node10 head1,Node10 head2){
        if (head1 == null)
            return head2;

        if (head2 == null)
            return head1;

        Node10 head;

        if (head1.data <= head2.data) {
            head = head1;
            head1 = head1.next;
        } else {
            head = head2;
            head2 = head2.next;
        }
        Node10 tail=head;
        tail.prev=null;

        while(head1 !=null && head2 != null){
            if(head1.data<=head2.data){
                tail.next=head1;
                head1.prev=tail;

                tail=head1;
                head1=head1.next;
            }else{
                tail.next = head2;
                head2.prev = tail;

                tail = head2;
                head2 = head2.next;
            }
        }
        if (head1 != null) {
            tail.next = head1;
            head1.prev = tail;
        }

        if (head2 != null) {
            tail.next = head2;
            head2.prev = tail;
        }

        return head;
    }
    public static void main(String[] args) {
        Node10 head1 = new Node10(10);
        Node10 a = new Node10(30);
        Node10 b = new Node10(50);

        head1.next = a;
        a.prev = head1;

        a.next = b;
        b.prev = a;

        // Second List
        Node10 head2 = new Node10(20);
        Node10 c = new Node10(40);
        Node10 d = new Node10(60);

        head2.next = c;
        c.prev = head2;

        c.next = d;
        d.prev = c;

        Node10 result = merge(head1, head2);

        display(result);
    }
}
