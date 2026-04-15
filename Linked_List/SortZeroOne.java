package Linked_List;

class Node14{
    int data;
    Node next;

    Node14(int data1,Node next1){
        data=data1;
        next=next1;
    }
    Node14(int data1){
        data=data1;
        next=null;
    }
}

class LinkedList{
    Node head;

    LinkedList(){
        head = null;
    }

    void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println(" -> NULL");
    }
}

class SortZeroOneTwo{
    void sortZeroOneTwo(LinkedList ll){
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);

        Node zeroTail = zeroDummy;
        Node oneTail = oneDummy;
        Node twoTail = twoDummy;

        Node curr = ll.head;

        while(curr!=null){
            if(curr.data == 0){
                zeroTail.next = curr;
                zeroTail = zeroTail.next;
            }
            else if(curr.data == 1){
                oneTail.next = curr;
                oneTail = oneTail.next;
            }
            else{
                twoTail.next = curr;
                twoTail = twoTail.next;
            }
            curr = curr.next;
        }

        zeroTail.next = (oneDummy.next != null) ? oneDummy.next :twoDummy.next;
        oneTail.next = twoDummy.next;
        twoTail.next = null;

        ll.head = zeroDummy.next;
    }
}
public class SortZeroOne {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        SortZeroOneTwo sol = new SortZeroOneTwo();

        ll.insert(1);
        ll.insert(2);
        ll.insert(0);
        ll.insert(1);
        ll.insert(2);
        ll.insert(0);

        System.out.println("Original List:");
        ll.print();

        sol.sortZeroOneTwo(ll);

        System.out.println("Sorted List:");
        ll.print();
    }
}
