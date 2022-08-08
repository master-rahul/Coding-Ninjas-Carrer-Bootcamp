package fundamentals;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		while(a >= 0) {
			System.out.println("Hello");
		}
		s.close();
	}
}
