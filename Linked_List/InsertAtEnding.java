package Linked_List;

class Node21{
    int data;
    Node21 next;

    Node21(int data1,Node21 next1){
        data=data1;
        next=next1;
    }

    Node21(int data1){
        data=data1;
        next=null;
    }
}


public class InsertAtEnding {

        static Node21 insertAtEnd(Node21 head, int value) {

            Node21 newNode = new Node21(value);

            if (head == null)
                return newNode;

            Node21 temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;

            return head;
        }

        static void print(Node21 head) {

            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    public static void main(String[] args) {
        Node21 head = new Node21(10);
        head.next = new Node21(20);
        head.next.next = new Node21(30);

        System.out.print("Before adding at the end: ");
        print(head);
        System.out.println();
        head = insertAtEnd(head, 40);
        System.out.print("after adding at the end: ");
        print(head);
    }
}
