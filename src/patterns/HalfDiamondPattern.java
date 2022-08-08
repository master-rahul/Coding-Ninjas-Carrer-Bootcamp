package patterns;
import java.util.Scanner;
public class HalfDiamondPattern {
	public static void main(String[] args) {       
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rows = 2*n - 1, cols = 1, i = 1, j = 1, k = 1;
        System.out.println("*");
        while(i <= rows){
            k = j = 1;
            System.out.print("*");
           	int limit = cols/2 +1;
            while(j <= cols){
                if(j <= limit) System.out.print(k++);
                else {
                    if(j == limit+1) k -=2;
                    System.out.print(k--);
                }
                j++;
            }
            if(++i <= n) cols +=2;
            else cols -=2;
            System.out.println("*");
        }
        System.out.println("*");
        s.close();
    }
}
