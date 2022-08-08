package fundamentals;
import java.util.Scanner;

public class CheckPrime {
	
	public static void isPrime(int a) {
		int div = 2;
		boolean isPrime = true;
		while(div <= a/2) {
			if(a%div == 0) {
				isPrime = false;
				break;
			}
			div++;
		}
		if(isPrime && a > 1) {
			System.out.println("Prime");
		}else {
			System.out.println("Composite");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		isPrime(a);
		s.close();
		
		
	}
}
