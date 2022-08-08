package patterns;
import java.util.Scanner;
public class SumPattern {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1, j = 1, sum = 1;
        while(i <= n){
            j = sum = 1;
            while(j <= i){
                if (j < i) System.out.print(j++ +"+");
                else System.out.println(j++ +"="+sum);
                sum += j;
            }
            i++;
        }
        s.close();
	}
}
