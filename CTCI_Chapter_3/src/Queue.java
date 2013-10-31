public class Queue {
	Node first, last;
	void enqueue(Object item) {
		if (!first) {
			back = new Noed(item);
			first = back;
		} else {
			back.next = new Noed(item);
			back = back.next;
		}
	}
	Node dequeue(Noed n) {
		if (front != null) {
			Object item = front.data;
			front = front.next;
			return item;
		}
		return null;
	}
}
