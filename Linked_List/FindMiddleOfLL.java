package Linked_List;

class Node8{
    int data;
    Node8 next;

    Node8(int data,Node8 next){
        this.data=data;
        this.next=next;
    }

    Node8(int data){
        this.data=data;
        this.next=null;
    }
}
public class FindMiddleOfLL {

    static Node8 findMiddle(Node8 head){
        if(head==null || head.next==null){
            return head;
        }
        Node8 temp = head;
        int count = 0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int mid = count/2+1;
        temp=head;

        while(temp != null){
            mid=mid-1;

            if(mid==0){
                break;
            }
            temp=temp.next;
        }

        return temp;
    }
    public static void main(String[] args) {
        Node8 head = new Node8(1);
        head.next=new Node8(2);
        head.next.next=new Node8(3);
        head.next.next.next=new Node8(4);
        head.next.next.next.next=new Node8(5);

        Node8 temp= head;
        System.out.print("Linked List: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        Node8 middleNode = findMiddle(head);

        System.out.println("The middle node value is: "+middleNode.data);
    }
}
