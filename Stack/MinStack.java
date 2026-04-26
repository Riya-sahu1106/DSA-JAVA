package Stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) return -1;
        return minStack.peek();
    }

    public void printStack() {
        System.out.println(stack);
    }
    public static void main(String[] args) {

        MinStack s = new MinStack();

        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);

        s.printStack();

        System.out.println("Min: " + s.getMin());

        s.pop();
        System.out.println("Min: " + s.getMin());

        s.pop();
        System.out.println("Top: " + s.top());
        System.out.println("Min: " + s.getMin());

    }
}
