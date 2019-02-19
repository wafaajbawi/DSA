// Singly Linked List class
public class LinkedList<T> {
	Node<T> head; // head of list

	/*
	 * Inserts a new Node at front of the list. every time you call add you creating
	 * a new node will have a value from the user and a reference for the next node
	 * 
	 */

	public void add(T data) {
		Node node = new Node(data); // create a new node
		node.setNext(head); // make next of the new node as head
		head = node; // move the head to point to the new node

	}

	public void show() {
		Node node = head;
		while (node != null) { // if the node doesn´t point to null then print it
			System.out.print(node.getElement() + " ");
			node = node.getNext(); // update
		}
		System.out.println();
	}

	/* Delete all nodes with given data */
	public void delete(T data) {
		Node node = head;

		while (node.getNext() != null) { // travel through the list, i start fron the node next to the head EXCLUDING
											// THE HEAD
			if (node.getNext().getElement() == data) { // if the THE VALUE of the next node to the head equal the value
														// i want to delete
				node.setNext(node.getNext().getNext()); // then we SET the node pointer to next of the next node
			}
			node = node.getNext(); // i update the condition
		}

		if (head.getElement() == data) { // if i want to delete the head
			head = head.getNext(); // we assign the head to be the next element of the head
		}

	}

	// Get data at index i
	public T get(int i) {
		Node<T> node = head;
		for (int j = 0; j < i; j++) { // i travel through the list from the head until the given index < i e.g. i want
										// get element of index 2
			// get(2), j<2 ... loop j= 0,j= 1 *CANNOT BE J=2* then when i am on node 1 j=1
			// the we assign NODE1 to be the next node namely NODE2
			node = node.getNext(); // assign the node to be the next node since i only travel untill one element
									// less than the given index
			// then next node = i will be my element
		}
		return node.getElement();
	}

	/* Returns count of nodes in linked list */
	public int getCount() {
		Node temp = head;
		int count = 0;
		while (temp != null) { // treavel throught the list until the last element , if it doesn´t point to
								// null then increment count
			count++;
			temp = temp.getNext(); // update go to the next element
		}
		return count;
	}

}