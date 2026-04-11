package Linked_List;

import java.util.Scanner;

class Node5{
    int data;
    Node5 next;
    Node5 prev;

    public Node5(int data1,Node5 next1,Node5 prev1){
        data=data1;
        next=next1;
        prev=prev1;
    }

    public Node5(int data1){
        data=data1;
        next=null;
        prev=null;
    }
}

class InsertAtEnd{

    public static Node5 convertArr2DLL(int[]arr){
        Node5 head = new Node5(arr[0]);
        Node5 prev = head;

        for(int i =1; i<arr.length; i++){
            Node5 temp= new Node5(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    public static void print(Node5 head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node5 insertAtTail(Node5 head, int k){
        Node5 newNode = new Node5(k);
        if(head==null){
            return newNode;
        }

        Node5 tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next=newNode;
        newNode.prev=tail;
        return head;
    }
}

public class InsertAtEndOfDLL {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {12,5,8,7,4};

        Node5 head = InsertAtEnd.convertArr2DLL(arr);

        System.out.println("Doubly Linked List Initially: ");
        InsertAtEnd.print(head);

        System.out.print("Enter the number which has to inserted: ");
        int k = sc.nextInt();
        System.out.println("\nDoubly Linked List After Inserting at the tail with value 10: ");
        head = InsertAtEnd.insertAtTail(head,k);
        InsertAtEnd.print(head);
    }
}
