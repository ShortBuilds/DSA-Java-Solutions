import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        
        // Push to minStack if it's empty OR the new value is a new minimum
        // Note: We use <= to handle duplicate minimum values!
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        // Unbox to primitive 'int' to safely use the == operator
        int poppedVal = stack.pop();
        
        // If the value we just popped was the current minimum, 
        // remove it from the minStack too.
        if (poppedVal == minStack.peek()) {
            minStack.pop();
        }
    }
    
    // This is the peek() operation you asked about!
    public int top() {
        return stack.peek(); 
    }
    
    public int getMin() {
        return minStack.peek();
    }
}