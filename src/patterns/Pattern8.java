package patterns;
import java.util.Scanner;
public class Pattern8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1, j = 0;
		while(i <= n) {
			j = 0;
			while(j < n) System.out.print((char)('A'+j++));
			System.out.println();
			i++;
		}
		s.close();
	}

}
