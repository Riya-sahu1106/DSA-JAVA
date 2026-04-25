package Stack;

public class QueueUsingArray {
    private int[] queueArray;
    private int capacity;
    private int front;
    private int rear;

    public QueueUsingArray(int size) {
        capacity = size;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
    }

    public QueueUsingArray() {
        this(1000);
    }

    public void enqueue(int x) {
        if (rear >= capacity - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queueArray[++rear] = x;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queueArray[front++];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.printQueue();

        System.out.println("Front element: " + q.peek());

        q.dequeue();
        q.printQueue();
    }
}