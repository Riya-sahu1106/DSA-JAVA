package Linked_List;

class Node4{
    int data;
    Node next;
    Node4(int data1){
        data=data1;
        next=null;
    }
}
class Search{
    public boolean searchValue(Node head,int key){
        Node curr = head;

        while(curr !=null){
            if(curr.data == key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}
public class SearchValue {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.print("Given list: ");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

        Search obj = new Search();

        if(obj.searchValue(head,20)){
            System.out.print("Found");
        }
        else{
            System.out.print("Not Found");
        }
    }
}
