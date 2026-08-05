package Doubly_Linked_List;

class Node13{
    int data;
    Node13 next,prev;
    Node13(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class TripletSumDLL {
    static void display(Node13 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    static void findTriplets(Node13 head, int target) {
        if(head==null)
            return;

        Node13 tail=head;

        while(tail.next!=null)
            tail=tail.next;

        Node13 first=head;

        while (first != null) {
            Node13 left = first.next;
            Node13 right = tail;

            while (left != null && right != null &&
                    left != right &&
                    right.next != left) {
                int sum = first.data + left.data + right.data;
                if (sum == target) {

                    System.out.println(first.data + " "
                            + left.data + " "
                            + right.data);

                    left = left.next;
                    right = right.prev;

                }else if (sum < target) {

                    left = left.next;

                } else {

                    right = right.prev;
                }
            }
            first = first.next;
        }
    }
    public static void main(String[] args) {
        Node13 head = new Node13(10);
        Node13 second = new Node13(20);
        Node13 third = new Node13(30);
        Node13 fourth = new Node13(40);
        Node13 fifth = new Node13(50);

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
        findTriplets(head, 100);
    }
}
