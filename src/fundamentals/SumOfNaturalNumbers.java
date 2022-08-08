package fundamentals;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		while(n-- > 0) {
			sum += s.nextInt();
		}
		System.out.println(sum);
		s.close();
		
	}

}
