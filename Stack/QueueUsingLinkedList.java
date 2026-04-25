package Stack;

public class QueueUsingLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private ListNode front;
    private ListNode rear;

    public QueueUsingLinkedList() {
        front = null;
        rear = null;
    }

    public void enqueue(int x) {
        ListNode node = new ListNode(x);

        if (rear == null) {
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = front.val;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.val;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        ListNode temp = front;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.printQueue();

        System.out.println("Front: " + q.peek());

        q.dequeue();
        q.printQueue();
    }
}