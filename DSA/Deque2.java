
public class Deque2<E> extends LinkedList {

    private LinkedList list;
    private Node lastNode;
    private int size;

    public Deque2() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    // public void show() {
    // super.show();
    // }

    public int size() {
        return size;
    }

    public void addFirst(E data) {
        Node node = new Node(data);
        super.add(node);
        size++;
    }

    public E removeFirst() {

        if (size == 0) {
            return null;
        }
        Node node = head;
        head = head.getNext();
        size--;
        return (E) node.getElement();
    }

    public void addLast(E data) {
        Node newNode = new Node(data);
        if (lastNode == null) {
            lastNode = newNode;
            head = lastNode;
        } else {
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        size++;
    }

    public E removeLast() {
        if (size == 0)
            return null;

        Node temp = lastNode;
        Node current = head;

        while (current.getNext() != null) {
            temp = current;
            current = current.getNext();

        } // when the wile loop is done
        temp.setNext(null);

        size--;

        return (E) current.getElement();
    }

}