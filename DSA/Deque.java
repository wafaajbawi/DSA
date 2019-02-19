public class Deque<E> extends LinkedList {

    private LinkedList list;
    private Node lastNode;
    private int size;

    public Deque(LinkedList list, Node lastNode, int size) {
        this.list = list;
        this.lastNode = lastNode;
        this.size = size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void addFirst(E data) {
        Node node = new Node(data); // create a new node
        Deque<E> deque = this;
        deque.node.add(data);

        if (lastNode == null)
            lastNode = node;
        size++;
    }

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getElement() + " ");
            node = node.getNext();
        }
        System.out.println();
        // System.out.print(node.getElement());
    }

    public E removeFirst() {
        if (size == 0){
            return null;
        }
        Node temp = head;
		
        head = head.getNext();
        size--;
        return (E) temp.getElement();
    }

    public void addLast(E data) {
        Node newNode = new Node(data);
        if (lastNode == null) {
            lastNode = newNode;
            head = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
        size++;
    }

    public E removeLast() {
        if (size == 0)
            return null;

        Node temp = lastNode;
        Node current = head;
        if (size == 1) {

            head = null;
            lastNode = null;
            return (E) temp.getElement();
        }
        this.show();
        while (current.getNext() != temp) {
            current = current.getNext();

        } // when the wile loop is done
        current.next = null;
        lastNode = current;

        size--;

        return (E) temp.getElement();
    }

}