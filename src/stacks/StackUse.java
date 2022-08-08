package stacks;

public class StackUse {
	public static void main(String[] args) throws StackUnderFLow {
		StackUsingArray stack = new StackUsingArray(10);
		try {
			//stack.pop();
			//System.out.println(stack.peek());
			System.out.println(stack.isEmpty());
			for(int i = 0; i < 8; i++) stack.push(i+10);
			System.out.println(stack.peek());
			stack.pop();
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.print();
			System.out.println(stack.isEmpty());
			//stack.push(4);
			stack.increase();
			stack.push(5);
			stack.print();
			System.out.println(stack.size());
		}catch(StackUnderFLow e) {
			System.out.println("StackUnderFLow");
		}catch (StackOverFLow e) {
			System.out.println("StackOverFLow");
		}
		System.out.println("-------------------------------------------------");
		StackUsingLinkedList stack1 = new StackUsingLinkedList();

		try {
			//stack1.pop();
			//System.out.println(stack1.peek());
			System.out.println(stack1.isEmpty());
			for(int i = 0; i < 8; i++) stack1.push(i+10);
			System.out.println(stack1.peek());
			stack1.pop();
			stack1.push(1);
			stack1.push(2);
			stack1.push(3);
			stack1.print();
			System.out.println(stack1.isEmpty());
			stack1.push(4);
			stack1.push(5);
			stack1.print();
			System.out.println(stack1.size());
		}catch(StackUnderFLow e) {
			System.out.println("StackUnderFLow");
		}
	}
}
