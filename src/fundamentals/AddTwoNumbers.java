package fundamentals;

import java.util.Scanner;

public class AddTwoNumbers {
	
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int firstNumber, secondNumber;
//		long a, b;
//		String c, d;
//		char e, f;
//		firstNumber = s.nextInt();
//		secondNumber = s .nextInt();
//		a = s.nextLong();
//		b = s.nextLong();
//		c = s.next();
//		d = s.nextLine();
//		e = c.charAt(0);
//		f = d.charAt(1);
//		System.out.println(firstNumber + secondNumber);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(e);
//		System.out.println(f);
//		s.close();
		Scanner s = new Scanner(System.in);
        char a;
        String b;
        int c,d,e;
        int f = Integer.MIN_VALUE;
        int g = Integer.MAX_VALUE;
        b = s.next();
        a = b.charAt(0);
        c = s.nextInt();
        d = s.nextInt();
        e = s.nextInt();
        System.out.println(a);
        System.out.println((c+d+e)/3);
        System.out.println(f+" "+g);
        s.close();
	}
}
