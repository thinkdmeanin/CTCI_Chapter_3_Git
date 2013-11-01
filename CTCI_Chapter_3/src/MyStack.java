public class MyStack {
	private MyNode head;
	private int depth;
	public static final int VOLUME = 50;
	
	public MyStack() {
		head = null;
		depth = 0;
	}
	
	public MyStack(int value) {
		head = new MyNode(value);
		depth = 1;
	}
	
	public boolean isEmpty() {
		return (depth == 0);
	}
	
	public boolean isFull() {
		return (depth == MyStack.VOLUME);
	}
	
	public MyNode push(int value) {
		if (isFull()) return head;
		head = head.appendHead(value);
		++depth;
		return head;
	}
	
	public MyNode pop() {
		if (isEmpty()) return null;
		MyNode orphan = head;
		head = head.getNext();
		--depth;
		return orphan;
	}
	
	public int length() {
		return depth;
	}
	
}
