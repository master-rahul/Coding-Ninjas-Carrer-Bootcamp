package operators;

public class IncrementDecrementOperator {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println(a++);
		System.out.println(b++);
		System.out.println(a);
		System.out.println(b);
		System.out.println(--a);
		System.out.println(--b);
		System.out.println(a++ + b--);
		System.out.println(--a - b++);
	}
}
