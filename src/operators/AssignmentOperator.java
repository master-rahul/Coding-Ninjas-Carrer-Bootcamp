package operators;

public class AssignmentOperator {
	public static void main(String[] args) {
		int a = 10, b = 20;
		a += 1;
		b -= 1;
		System.out.println(a+" "+b);
		a <<= 1;
		b >>= 1;
		System.out.println(a+" "+b);
		a &= a;
		b |= b;
		System.out.println(a+" "+b);
		a = 5;
	    a+=5+(++a)+(a++);
	    System.out.println(a);
	    a = 5;
	    a += ++a;
	    System.out.println(a);
	}
}
