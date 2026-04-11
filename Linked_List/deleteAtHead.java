package Linked_List;

class Node2{
    int data;
    Node next;

    Node2(int data1){
        data=data1;
        next=null;
    }

}
class DeleteHead{
    public Node deleteHead(Node head){
        if(head==null || head.next==null){
            return null;
        }

        head=head.next;

        return head;
    }
}
public class deleteAtHead {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.print("Original linkedlist: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
        DeleteHead obj = new DeleteHead();
        head = obj.deleteHead(head);

        System.out.print("After deletion linkedlist: ");
        // Print list after deletion
        Node temp1 = head;
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
    }
}
