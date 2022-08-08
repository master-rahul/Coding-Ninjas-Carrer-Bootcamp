package patterns;
import java.util.Scanner;
public class OddSquare {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       	int n = s.nextInt();
        int i = 1, j = 1, limit = 2*n, val = -1;
        while(i <= n){
            j = 1;
            val = -3 + 2*i++;
            while(j++ <= n){
                if(val+2 < limit) val += 2; 
                else val = 1;
                System.out.print(val);
            }
            System.out.println();
        }
        s.close();
	}
}
