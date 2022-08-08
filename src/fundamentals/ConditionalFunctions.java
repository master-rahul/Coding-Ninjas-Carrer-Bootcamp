package fundamentals;

import java.util.Scanner;

public class ConditionalFunctions {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		
//		int a = s.nextInt();
//		int b = s.nextInt();
//		
//		if(a > b) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
		s.close();
		int a=50;
	    int b=Integer.MIN_VALUE;
	    if(a/0==b)
	    {

	        System.out.println("Hello");
	    }
	    else
	    {
	        System.out.println("Hi");
	    }
	}
	
}
