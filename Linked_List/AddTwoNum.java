package Linked_List;

class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3() {}
    ListNode3(int val) { this.val = val; }
    ListNode3(int val, ListNode3 next) {
        this.val = val;
        this.next = next;
    }
}
class Add{
    public ListNode3 addTwoNumbers(ListNode3 l1, ListNode3 l2){
        ListNode3 dummy = new ListNode3();
        ListNode3 temp = dummy;
        int carry = 0;

        while(l1 != null || l2 !=null || carry != 0){
            int sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;

            ListNode3 node = new ListNode3(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}
public class AddTwoNum {
     static ListNode3 createList(int[]arr){
         ListNode3 head = new ListNode3(arr[0]);
         ListNode3 temp = head;
         for (int i = 1; i < arr.length; i++) {
             temp.next = new ListNode3(arr[i]);
             temp = temp.next;
         }
         return head;
     }

    static void printList(ListNode3 head){
        while(head != null){
            System.out.print(head.val);
            if(head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int[]num1 = {2, 4, 3};
         int[]num2 = {5, 6, 4};
         ListNode3 l1 = createList(num1);
         ListNode3 l2 = createList(num2);

         Add add = new Add();
         ListNode3 result = add.addTwoNumbers(l1, l2);
         printList(result);

    }
}
