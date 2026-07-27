package Linked_List;

class Node24{
    int data;
    Node24 next;

    Node24(int data){
        this.data=data;
        this.next=null;
    }
}
public class MergeTwoSortedLists {
    public static void display(Node24 head){
        Node24 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node24 merge(Node24 list1,Node24 list2){
          Node24 dummy=new Node24(-1);
          Node24 temp=dummy;

          while(list1!=null && list2!=null){
              if(list1.data<= list2.data){
                  temp.next=list1;
                  list1=list1.next;
              }
              else{
                  temp.next=list2;
                  list2=list2.next;
              }
              temp=temp.next;
          }
        if(list1!=null){
            temp.next=list1;
        }else{
            temp.next=list2;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
           Node24 list1=new Node24(1);
           list1.next=new Node24(3);
           list1.next.next=new Node24(5);
        System.out.print("List1 is: ");
           display(list1);

           Node24 list2=new Node24(2);
           list2.next=new Node24(4);
           list2.next.next=new Node24(6);
           System.out.print("List2 is: ");
           display(list2);

           Node24 ans = merge(list1,list2);
        System.out.print("Merge linked list is:");
        display(ans);
    }
}
