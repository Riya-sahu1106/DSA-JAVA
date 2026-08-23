package Linked_List;

import java.util.Scanner;

class Node16{
    int data;
    Node16 next;

    Node16(int data){
        this.data=data;
        this.next=null;
    }
}

public class ArrayToLinkedList {
    static Node16 convert(int[]arr){
        if(arr.length==0)
            return null;
        Node16 head=new Node16(arr[0]);
        Node16 temp=head;
        int n=arr.length;

        for(int i=1;i<arr.length;i++){
            temp.next=new Node16(arr[i]);
            temp=temp.next;
        }
        return head;
    }

    static void print(Node16 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[]arr=new int[n];

        System.out.print("Enter the elements of array:");
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        Node16 head = convert(arr);
        print(head);

    }
}
