public class Problem1Test {

    public static void main(String[] args) {
        Problem1 queue = new Problem1();
        queue.enqueue(queue, 1);
        queue.enqueue(queue, 33);
        System.out.println(queue.dequeue(queue));
        queue.dequeue(queue);

    }
}