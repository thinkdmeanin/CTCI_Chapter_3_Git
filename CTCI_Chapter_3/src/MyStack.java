public class MyStack {
	private int depth;
	public static final int VOLUME = 50;
	private int[] contents;
	
	public MyStack() {
		contents = new int[MyStack.VOLUME];
	}
	
	public MyStack(int value) {
		contents = new int[MyStack.VOLUME];
		contents[0] = value;
		depth = 1;
	}
	
	public boolean isEmpty() {
		return (depth == 0);
	}
	
	public boolean isFull() {
		return (depth == MyStack.VOLUME);
	}
	
	public int push(int value) {
		if (isFull()) return (-value);
		contents[depth] = value;
		++depth;
		return value;
	}
	
	public int pop() {
		if (isEmpty()) return -1;
		--depth;
		return contents[depth];
	}
	
	public int length() {
		return depth;
	}
	
}
