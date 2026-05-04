package Stack;

public class StackUsingArray {
    private int[]stackArray;
    private int capacity;
    private int topIndex;

    public StackUsingArray(int size){
        capacity = size;
        stackArray = new int[capacity];
        topIndex = -1;
    }

    public StackUsingArray(){
        this(1000);
    }

    public void push(int x){
        if(topIndex >= capacity - 1){
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++topIndex] = x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[topIndex--];
    }

    public int top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public void printStack(){
        for(int i = topIndex; i>=0; i--){
            System.out.print(stackArray[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        StackUsingArray stack = new StackUsingArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();
        System.out.println("Top element: "+stack.top());
        stack.pop();
        stack.printStack();
    }
}
