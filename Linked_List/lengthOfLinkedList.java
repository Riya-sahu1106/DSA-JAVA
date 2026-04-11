package Linked_List;

class Node3{
    int data;
    Node next;
    Node3(int data1){
        data=data1;
        next=null;
    }
}
class Length{
    public int LengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
public class lengthOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.print("Given list: ");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

        Length obj = new Length();

        System.out.println("Length of Linked List: "
                + obj.LengthOfLL(head));
    }
}
