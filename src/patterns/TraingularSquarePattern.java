package patterns;
import java.util.Scanner;
public class TraingularSquarePattern {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		int n = s.nextInt();
        int i = 0, j = 1;
        while(++i <= n){
            j = 1;
            while(j++ <= i) System.out.print("*");
            System.out.println();
        }
        s.close();
	}
}
