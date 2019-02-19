public class TestQueue {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Deque<Integer> q = new Deque<>(list);

        q.addFirst(8);
        q.addFirst(2);
        q.addFirst(12);
        q.addFirst(8);
        q.show();

        q.removeFirst();
        q.show();

        q.addLast(45);

        // q.removeLast();
        q.show();
        q.isEmpty();
        System.out.println(q.size());
    }
}