package patterns;
import java.util.Scanner;
public class TriangleOfNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1, j = 1, count = 1;
		while(i <=  n) {
			j = n - i;
			count = i;
			while(j-- > 0) System.out.print(" ");
			j = i;
			while(j-- > 0) System.out.print(count++);
			count--;
			j = i++ - 1;
			while(j-- > 0)System.out.print(--count);
			System.out.println();
		}
		s.close();
		System.out.println(~1);
	}
}
