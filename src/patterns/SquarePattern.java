package patterns;
import java.util.Scanner;
public class SquarePattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i <= n*n){
        	if(i++ % n == 0){
                 System.out.print(n);
                System.out.println();
            } 
            else System.out.print(n);
        }
        s.close();
	}
}
