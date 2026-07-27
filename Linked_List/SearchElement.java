package Linked_List;

import java.util.Scanner;

class Node20 {

    int data;
    Node20 next;

    Node20(int data) {
        this.data = data;
        this.next = null;
    }
}


public class SearchElement {

    static Node20 print(Node20 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        return head;
    }
    static boolean search(Node20 head,int key){
        while(head!=null){
            if(head.data==key)
                return true;
            head=head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node20 head = new Node20(5);
        head.next = new Node20(15);
        head.next.next = new Node20(25);
        head.next.next.next = new Node20(35);
        head.next.next.next.next = new Node20(45);

        print(head);
        System.out.println();
        int key=sc.nextInt();

        if(search(head,key)){
            System.out.print("Element found");
        }
        else{
            System.out.print("Not found");
        }
    }
}
