public class TestQueue2 {

    public static void main(String[] args) {

        Deque2<Integer> q = new Deque2<>();

        q.addFirst(8);
        q.addFirst(2);
        q.addFirst(12);
        q.addFirst(8);
        q.addLast(45);
        q.show();

        System.out.println("remove : " + q.removeFirst());

        q.show();
        System.out.println("dg " + q.removeLast());

        System.out.println("is the queue empty ? " + q.isEmpty());
        System.out.println("the size is " + q.size());
    }
}