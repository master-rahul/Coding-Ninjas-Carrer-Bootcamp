package patterns;
import java.util.Scanner;
public class InterestingAlphabets {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = n , j = 0;
        while(i > 0){
            j = 0;
            while(j <= n-i) System.out.print((char)('A'+i-1+j++));
            i--;
            System.out.println();
        }
        s.close();
    }
}
