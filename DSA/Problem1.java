import java.util.Queue;
import java.util.Stack;

public class Problem1 {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(Stack<Integer> topOfStack, int data) {
        topOfStack.push(data);
    }

    public int pop(Stack<Integer> topOfStack) {
        if (topOfStack.isEmpty()) {
            System.out.println("Stack underflow");
            System.exit(0);
        }
        return topOfStack.pop();
    }

    public void enqueue(Problem1 q, int data) {
        push(q.stack1, data);
        System.out.println(data);

    }

    public int dequeue(Problem1 q) {

        int x;

        if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }

        if (q.stack2.isEmpty()) {
            while (!q.stack1.isEmpty()) {
                x = pop(q.stack1);
                push(q.stack2, x);
            }
        }
        x = pop(q.stack2);
        return x;
    }

}