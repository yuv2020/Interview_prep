//Implementation of stack using array

public class stack_array {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to set up the stack
    public stack_array(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Method to add elements to the stack
    public void push(int x) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        stack[++top] = x;
    }

    // Method to remove the top element
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top--];
    }

    // Method to view the top element without removing it
    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    // Utility methods to check if the stack is empty or full
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    // Main method to demonstrate stack operations
    public static void main(String[] args) {
        stack_array stack = new stack_array(5);

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Attempting to push another element should cause an error
        try {
            stack.push(60);
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
        }

        // Popping elements from the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        // Attempting to pop from an empty stack should cause an error
        try {
            stack.pop();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
