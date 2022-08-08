package patterns;
import java.util.Scanner;
public class Pattern7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0, j = 0;
		while(++i <= n) {
			j  = 0;
			while(j < i) System.out.print(i + j++);
			System.out.println();
		}
		s.close();
	}
}
