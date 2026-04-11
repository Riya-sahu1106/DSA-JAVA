package Linked_List;

class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
         data=data1;
         next=next1;
    }

    Node(int data1){
        data=data1;
        next=null;
    }
}

class Insert{
    public Node insertAtHeadd(Node head,int newData){

        Node newNode = new Node(newData,head);

        return newNode;
    }

  public  void printList(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
      System.out.println();
  }
}

public class insertAtHead {
    public static void main(String[] args) {
        Insert in = new Insert();

        Node head = new Node(2);
        head.next = new Node(3);

        System.out.print("Original List: ");
        in.printList(head);

        head=in.insertAtHeadd(head,1);

        System.out.print("After insertion at Head: ");
        in.printList(head);
    }
}
