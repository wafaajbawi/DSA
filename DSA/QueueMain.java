public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(22);
        queue.enqueue(100);
        queue.enqueue(8);

        System.out.println();
        System.out.println("remove " + queue.dequeue());
        System.out.println("remove " + queue.dequeue());
        queue.enqueue(77);
        queue.enqueue(85);
        System.out.println();

        System.out.println("remove " + queue.dequeue());
        System.out.println("remove " + queue.dequeue());

        System.out.println("the queue size is " + queue.size());
        System.out.println("is the queue empty ? " + queue.isEmpty());
        System.out.println("the front element is " + queue.front());

    }

}