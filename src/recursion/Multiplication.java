package recursion;

import java.util.Scanner;

public class Multiplication {
	
	public static int multiplyTwoIntegers(int m, int n){
		if(m == 0) return 0;
        return n + multiplyTwoIntegers(m-1,n);
	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		s.close();
		System.out.println(multiplyTwoIntegers(m, n));
	}
}
