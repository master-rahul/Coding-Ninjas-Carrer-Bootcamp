package function;
import java.util.Scanner;
public class DivideNumbers {
	public static double divide(int a, int b) {
		if(b == 0) return Double.MIN_VALUE;
		else return (a*1.0)/b;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		divide(m,n);
		System.out.println(divide(n,m));
		s.close();
		
	}
}
