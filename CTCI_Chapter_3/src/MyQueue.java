public class MyQueue {
	private MyNode head;
	private MyNode tail;
	private int depth;
	public static final int VOLUME = 50;
	
	public MyQueue() {
	}
	
	public MyQueue(int value) {
		tail = head = new MyNode(value);
		++depth;
	}
	
	public boolean isEmpty() {
		return (depth == 0);
	}
	
	public boolean isFull() {
		return (depth == VOLUME);
	}
	
	public int length() {
		return depth;
	}
	
	public MyNode getHead() {
		return head;
	}
	
	public MyNode getTail() {
		return tail;
	}
	
	public MyNode push(int value) {
		if (!isFull()) {
			if (isEmpty()) {
				head = tail = new MyNode(value);
			} else {
				tail.setNext(new MyNode(value));
				tail = tail.getNext();
			}
			++depth;
		}
		return head;
	}
	
	public MyNode pop() {
		MyNode orphan = null;
		if (!isEmpty()) {
			if (tail == head) {
				orphan = head;
				head = tail = null;
			} else {
				orphan = head;
				head = head.getNext();
				orphan.setNext(null);
			}
			--depth;
		}
		return orphan;
	}
}
