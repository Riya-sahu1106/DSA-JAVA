package Linked_List;

class Node1{
    int data;
    Node next;

    Node1(int data1){
        data=data1;
        next=null;
    }

}
class Delete{
    public Node deleteTail(Node head){
        if(head==null || head.next==null){
            return null;
        }

        Node curr=head;
        while(curr.next.next != null){
            curr = curr.next;
        }

        curr.next = null;

        return head;
    }
}
public class deleteAtTail {
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
                Delete obj = new Delete();
                head = obj.deleteTail(head);

        System.out.print("After deletion linkedlist: ");
                // Print list after deletion
                Node temp1 = head;
                while (temp1 != null) {
                    System.out.print(temp1.data + " ");
                    temp1 = temp1.next;
                }
    }
}
