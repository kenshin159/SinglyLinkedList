package family.com;

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	private int size;

	public SinglyLinkedList() {
		super();
	}

	public SinglyLinkedList(Node head, Node tail, int size) {
		super();
		this.head = head;
		this.tail = tail;
		this.size = size;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void addFirstElement(int data) {
		Node node = new Node(data, null);
		size++;
		if (head == null) {
			head = node;
			tail = head;
		} else {
			node.setNext(head);
			head = node;
		}
	}

	public void addLastElement(int data) {
		Node node = new Node(data, null);
		size++;
		if (tail == null) {
			head = node;
			tail = head;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}

	public void removeFirstElement() {
		if (size == 0) {
			return;
		} else if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {
			head = head.getNext();
			size--;
		}
	}

	public void removeLastElement() {
		if (size == 0) {
			return;
		} else if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {
			Node temp = head;
			for (int i = 1; i < size; i++) {
				if (temp.getNext() == tail) {
					tail = temp;
					tail.setNext(null);
				} else {
					temp = temp.getNext();
				}
			}
			size--;
		}
	}

	public void addElementAtPosition(int index, int data) throws Exception {
		if (index < size && index >= 0) {
			if (index == 0) {
				addFirstElement(data);
			} else if (index == size) {
				addLastElement(data);
			} else {
				Node node = new Node(data, null);
				Node temp = head;
				for (int i = 1; i < size; i++) {
					if (i == index) {
						Node afterNode = temp.getNext();
						temp.setNext(node);
						node.setNext(afterNode);
						size++;
					} else {
						temp = temp.getNext();
					}
				}
			}
		} else {
			throw new Exception("index > size");
		}
	}
	
	public void removeAllElementWithTargetValue(int data) {
		if (head.getData() == data) {
			removeFirstElement();
			removeAllElementWithTargetValue(data);
		} else {
			Node temp = head;
			for (int i = 1; i < size; i++) {
				Node currentNode = temp.getNext();
				int currentNodeValue = currentNode.getData();
				if (currentNode == tail) {
					tail = temp;
					temp.setNext(null);
					size--;
					break;
				}
				if (currentNodeValue == data) {
					temp.setNext(currentNode.getNext());
					size--;
				} else {
					temp = temp.getNext();
				}
			}
		}
	}

	public void displayLinkedList() {
		if (size > 0) {
			String result = "Value: " + head.getData();
			Node temp = head.getNext();
			for (int i = 1; i < size; i++) {
				result += "," + temp.getData();
				if (temp != tail) {
					temp = temp.getNext();
				}
			}
			System.out.println(result);
		} else {
			System.out.println("list is empty");
		}
	}
}
