package fundamentals;

import java.util.Scanner;

public class TypeConversions {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char c = 'a'; // 1 byte
		int i = c;	// 1 byte to 4 byte
		//char d = i; // 4 byte to 1 byte -> compiler error
		//c = c +1; // 1 byte + 4 byte -> compiler error
		char e = (char) i; // 4 byte to 1 byte -> explicit conversion
		int f = (int) 10.5;
		//float g = 1.7; //8 byte to 4 byte -> compiler error
		float h = (float) 1.4;
		System.out.println(e + " " + f +" "+ h);
		System.out.println(4+4);
		System.out.println(4+4.1);
		System.out.println(4.1+4.1);
		System.out.println(4+4f);
		s.close();
	}
}
