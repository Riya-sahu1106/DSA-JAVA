package Doubly_Linked_List;

class Node12{
    int data;
    Node12 next,prev;
    Node12(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class PairSumDLL {
    static void display(Node12 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    static void pairSum(Node12 head,int target){
        if (head == null)
            return;

        Node12 left = head;
        Node12 right = head;

        while(right.next!=null)
            right=right.next;

        boolean found = false;
        while(left!=right && right.next!=left){
            int sum = left.data + right.data;

            if (sum == target) {
                System.out.println(left.data + " " + right.data);
                found = true;
                left = left.next;
                right = right.prev;
            }else if (sum < target) {

                left = left.next;

            } else {

                right = right.prev;
            }
        }
        if (!found)
            System.out.println("No Pair Found");
    }

    public static void main(String[] args) {
        Node12 head = new Node12(10);
        Node12 second = new Node12(20);
        Node12 third = new Node12(30);
        Node12 fourth = new Node12(40);
        Node12 fifth = new Node12(50);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.print("List:");
        display(head);
        pairSum(head, 70);
    }
}
