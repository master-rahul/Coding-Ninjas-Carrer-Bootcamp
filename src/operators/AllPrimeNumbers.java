package operators;
import java.util.Scanner;
public class AllPrimeNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int i = 2, j = 2, c = 0;
        while(i <= n){
            j = 2;
            c = 0;
            if(i > j) {
                while(i > j){
                    if(i%j == 0){
                        c = 1;
                        break;
                    }
                    j++;
                }
                if(c == 0) System.out.println(i);
            }else System.out.println(i);
        	i++;
        }
	}
}
