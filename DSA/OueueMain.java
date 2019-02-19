public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(22);
        queue.enqueue(100);
        queue.enqueue(8);

        queue.dequeue();
        queue.dequeue();

        queue.size();
    }

}