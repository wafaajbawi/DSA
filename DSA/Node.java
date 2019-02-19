public class Node<T> {
    private T data;
    private Node<T> next;

    Node(T d) {
        data = d;
        next = null;
    }

    public void setNext(Node<T> n) {
        next = n;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getElement() {
        return data;
    }
}