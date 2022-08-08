package operators;

public class BitwiseOperators {
	public static void main(String[] args) {
		int a = 19; // 19 = 10011
		int b = 28; // 28 = 11100
		int c = 0;
		c = a & b; // 16 = 10000
		System.out.println("a & b = " + c );
		c = a | b; // 31 = 11111
		System.out.println("a | b = " + c );
		c = a ^ b; // 15 = 01111
		System.out.println("a ^ b = " + c );
		c = ~a; // -20 = 01100
		System.out.println("~a = " + c );
		c = a << 2; // 76 = 1001100
		System.out.println("a << 2 = " + c );
		c = a >> 2; // 4 = 00100
		System.out.println("a >> 2 = " + c );
		c = a >>> 2; // 4 = 00100
		System.out.println("a >>> 2 = " + c );
	}
}
