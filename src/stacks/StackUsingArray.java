package stacks;

public class StackUsingArray {
	
	private int[] data;
	private int top = -1;
	public StackUsingArray() {
		
	}
	
	public StackUsingArray(int size) {
		data = new int[size];
	}
	
	public void push(int data) throws StackOverFLow {
		if(top == -1) {
			this.data[++top] = data;
		}else {
			if(top == this.data.length-1) {
				throw new StackOverFLow();
			}
			else this.data[++top] = data;
		}
	}
	
	public void pop() throws StackUnderFLow {
		if(top <= -1) {
			throw new StackUnderFLow();
		}else --top;
		
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int peek() throws StackUnderFLow{
		if(top >= 0) return this.data[top];
		throw new StackUnderFLow();
	}
	
	public void increase() {
		System.out.println("Size Doubled");
		int temp[] = data;
		data = new int[2* data.length];
		for(int i = 0; i < temp.length; i++) data[i] = temp[i];
	}
	
	public int size() {
		return top+1;
	}
	
	public void print() {
		for(int i = top; i >= 0; i--) System.out.print(data[i]+" ");
		System.out.println();
	}
}
