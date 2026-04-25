package Stack;

import java.util.List;


public class StackUsingLinkedList {

    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    private ListNode head;
    public StackUsingLinkedList() {
        head = null;
    }
    public void push(int x) {
        ListNode node = new ListNode(x);
        node.next = head;
        head = node;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = head.val;
        head = head.next;
        return value;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void printStack() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        s.printStack();

        System.out.println("Top: " + s.peek());

        s.pop();
        s.printStack();
    }
}
