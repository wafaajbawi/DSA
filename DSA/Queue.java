import java.util.Stack;

public class Queue<T> {

    Stack<T> stack1 = new Stack<T>();
    Stack<T> stack2 = new Stack<T>();

    // O(1)
    public void enqueue(T value) {
        stack1.push(value);
        System.out.print(value + " ");
    }

    // O(n)
    public T dequeue() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // O(1)
    public int size() {
        return stack1.size() + stack2.size();
    }

    // O(1)
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // O(n)
    // returns the oldest element in the queue
    public T front() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
}