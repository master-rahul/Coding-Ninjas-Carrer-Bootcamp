package patterns;
import java.util.Scanner;
public class Pattern2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0, j = 1;
		while(i++ < n) {
			j = 1;
			while(j++ <= n) System.out.print(i);
			System.out.println();
		}
		s.close();
	}
}
