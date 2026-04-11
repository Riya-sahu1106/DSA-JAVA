package Linked_List;

class Node6{
    int data;
    Node6 prev,next;
    Node6(int data1){
        data=data1;
        prev=null;
        next=null;
    }
}
class DeleteHeadDLL{
    public Node6 deleteTail(Node6 head){
        if(head == null || head.next == null){
            return null;
        }

        Node6 temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
        return  head;
    }
}
public class DeleteTailOfDLL {
    public static void main(String[] args) {
        Node6 head = new Node6(1);
        head.next = new Node6(2);
        head.next.prev = head;
        head.next.next = new Node6(3);
        head.next.next.prev = head.next;

        DeleteHeadDLL dl = new DeleteHeadDLL();
        head = dl.deleteTail(head);

        Node6 curr=head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
