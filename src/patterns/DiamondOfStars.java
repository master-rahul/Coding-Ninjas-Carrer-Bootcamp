package patterns;
import java.util.Scanner;
public class DiamondOfStars {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1, stars = 1, spaces = n/2, j = 1;
		while(i <= n) {
			if(i <= n/2 +1) {
				j = spaces--;
				while(j-- > 0) System.out.print(" ");
				j = stars;
				while(j-- > 0) System.out.print("*");
				stars += 2;
				System.out.println();
			}else {
				if(i == n/2 + 2) {
					stars = n - 2 ;
					spaces = 1;
				}
				j = spaces++;
				while(j-- > 0) System.out.print(" ");
				j = stars;
				while(j-- > 0) System.out.print("*");
				stars -= 2;
				System.out.println();
			}
			i++;
		}
		s.close();
	}
}
