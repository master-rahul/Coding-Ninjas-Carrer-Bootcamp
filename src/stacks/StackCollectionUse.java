package stacks;

import java.util.Stack;

public class StackCollectionUse {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		System.out.println(stack.size());
		System.out.println(stack.peek());
		stack.push(11);
		stack.push(21);
		System.out.println(stack.get(0));
		System.out.println(stack.isEmpty());
		System.out.println(stack.contains(10));
		
	}
}
