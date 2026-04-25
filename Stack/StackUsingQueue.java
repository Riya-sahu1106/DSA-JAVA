package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        q.add(x);

        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q.remove();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public int top() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q.peek();
    }

    public void printStack() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int x : q) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(10);
        s.push(20);
        s.push(30);

        s.printStack();
        System.out.println("Top: " + s.top());

        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
