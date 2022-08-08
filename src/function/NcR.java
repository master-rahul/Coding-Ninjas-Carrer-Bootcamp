package function;
import java.util.Scanner;
public class NcR {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		System.out.println(factorial(n)/(factorial(r)*factorial(n-r)));
		s.close();
	}
	public  static int factorial(int n) {
		int num = 1;
		while(n > 1) num *= n--;
		return num;
	}
	
}
