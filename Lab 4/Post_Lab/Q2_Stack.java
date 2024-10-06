import java.util.*;

class StackOfIntegers {
    private int[] elements;
    private int size;
    private int top = 0;

    // Default constructor
    StackOfIntegers() {
        System.out.println("Object Created");
    }

    // Constructor with size parameter
    StackOfIntegers(int size) {
        this.size = size;
        elements = new int[size];
    }

    // Check if the stack is empty
    boolean isEmpty() {
        return top == 0;
    }

    // Peek the top element of the stack
    int peek() {
        if (top != 0) {
            return elements[top - 1]; // Fix: return the element at top-1
        }
        return -1; // Stack is empty
    }

    // Push an element onto the stack
    void push(int val) {
        if (top < size) { // Fix: correct the condition to check if the stack is full
            elements[top] = val;
            top++;
            System.out.println("Element pushed at index: " + (top - 1)); // Show the correct index
        } else {
            System.out.println("Stack is full (overflow)");
        }
    }

    // Pop an element from the stack
    int pop() {
        if (top == 0) {
            return -1; // Stack is empty
        }
        top--; // Fix: Decrement top first, then access the element
        int a = elements[top];
        elements[top] = 0; // Optional: clear the value (not necessary, but helpful)
        return a;
    }

    // Get the size of the stack
    int getSize() {
        return this.size;
    }
}

public class Q2_Stack {
    public static void main(String[] args) {
        StackOfIntegers a = new StackOfIntegers(5); // Create a stack of size 5
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
        
        System.out.println("Top element is: " + a.peek()); // Should print 50
        
        System.out.println("Popped element is: " + a.pop()); // Should print 50
        System.out.println("Popped element is: " + a.pop()); // Should print 40
        System.out.println("Top element is: " + a.peek()); // Should print 30
    }
}
