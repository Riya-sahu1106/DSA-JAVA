package Stack;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    // Pop (dequeue)
    public int pop() {
        peek();
        return output.pop();
    }

    // Peek (front element)
    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public void printQueue() {
        if (empty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = output.size() - 1; i >= 0; i--) {
            System.out.print(output.get(i) + " ");
        }

        for (int i = 0; i < input.size(); i++) {
            System.out.print(input.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(4);
        q.push(8);
        q.push(15);

        q.printQueue();

        System.out.println("Front: " + q.peek());

        q.pop();
        q.printQueue();
    }
}
