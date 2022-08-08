package patterns;
import java.util.Scanner;
public class MirrorImageNumberPattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1, j = 1, k = 1;
		while(i <= n) {
			j = n - i;
			k = 1;
			while(j-- > 0) System.out.print(" ");
			j = i++;
			while(j-- > 0) System.out.print(k++);
			System.out.println();
		}
		s.close();
	}
}
