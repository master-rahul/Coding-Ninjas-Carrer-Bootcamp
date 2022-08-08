package patterns;
import java.util.Scanner;
public class Pattern1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1, j = 1;
		while(i++ <= n) {
			j = 1;
			while(j++ <= n) System.out.print("*");
			System.out.println();
		}
		s.close();
	}
}
