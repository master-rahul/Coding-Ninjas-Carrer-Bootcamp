package patterns;
import java.util.Scanner;
public class MirrorPattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1, j = 1;
		while(i <= n) {
			j = n - i;
			while(j-- > 0) System.out.print(" ");
			j = i++;
			while(j-- > 0) System.out.print("*");
			System.out.println();
		}
		s.close();
	}
}
