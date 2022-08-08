package stacks;

class LinkedListNode{
	protected int data;
	protected LinkedListNode next;
	public LinkedListNode(int data) {
		this.data = data;
		next = null;
	}
}

public class StackUsingLinkedList extends LinkedListNode {
	
	private LinkedListNode head = null;
	private int size = 0;
	
	public StackUsingLinkedList(int data) {
		super(data);
	}
	
	public StackUsingLinkedList() {
		super(0);
	}
	
	public void push(int data) {
		LinkedListNode temp = new LinkedListNode(data);
		if(head == null) {
			head = temp;
			size++;
		}else {
			temp.next = head;
			head = temp;
			size++;
		}
	}
	
	public void pop() throws StackUnderFLow {
		if(head == null) throw new StackUnderFLow();
		else {
			head = head.next;
			size--;
		}
	}
	
	public int peek() throws StackUnderFLow{
		if(head == null) throw new StackUnderFLow();
		return head.data;
	} 
	
	public boolean isEmpty() {
		if(head == null) return true;
		else return false;
	}
	public int size() {
		return size;
	}
	
	public void print() {
		LinkedListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}
}
