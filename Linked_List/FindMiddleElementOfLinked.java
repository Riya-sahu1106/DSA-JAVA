package Linked_List;

class Node9{
    int data;
    Node9 next;

    Node9(int data,Node9 next){
        this.data=data;
        this.next=next;
    }

    Node9(int data){
        this.data=data;
        this.next=null;
    }
}
public class FindMiddleElementOfLinked {

    static Node9 findMiddle(Node9 head){
        if(head==null || head.next==null){
            return head;
        }
        Node9 slow = head;
        Node9 fast = head;

        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node9 head = new Node9(1);
        head.next=new Node9(2);
        head.next.next=new Node9(3);
        head.next.next.next=new Node9(4);
        head.next.next.next.next=new Node9(5);

        Node9 temp= head;
        System.out.print("Linked List: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        Node9 middleNode = findMiddle(head);
        System.out.println();
        System.out.println("The middle node value is: "+middleNode.data);
    }
}
