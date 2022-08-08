package function;
import java.util.Scanner;
public class MoreOnFunctions {
	public static int sumOfTwo(int a, int b) {
		return a + b;
	}
	
	public static void printEven(int n) {
		int i = 2;
		while(i <= n) {
			System.out.print(i+" ");
			i += 2;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(sumOfTwo(a,b));
		printEven(a);
		s.close();
	}
	
}
