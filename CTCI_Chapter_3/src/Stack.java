public class Stack {
	Node top;
	Node pop() {
		if (top != null) {
			Object item = top.data;
			top = top.next;
			return item;
		}
		return null;
	}
	void push(Object item) {
		Node t = new Noed(item);
		t.next = top;
		top = t;
	}
}
