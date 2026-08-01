package Linked_List;

class Node33{
    int data;
    Node33 next,prev;

    Node33(int data){
        this.data=data;
        this.next=null;

    }
}

public class convertArrayDLL {
    static void display(Node33 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    static Node33 convertArrToLL(int[]arr){
        if(arr.length==0){
            return null;
        }
        Node33 head = new Node33(arr[0]);
        Node33 temp = head;

        for(int i=1; i<arr.length; i++){
            Node33 newNode = new Node33(arr[i]);
            temp.next=newNode;
            newNode.prev=temp;
            temp=newNode;
        }
        return head;
    }
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6};

        Node33 head=convertArrToLL(arr);
        display(head);
    }
}
