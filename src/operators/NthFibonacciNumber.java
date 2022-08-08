package operators;
import java.util.Scanner;
public class NthFibonacciNumber {
	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
     	int f = 0, s = 1, num = 1;
        for(int i = 1; i < n ; i++) {
            num = f + s;
            f = s;
            s = num;
        }
        System.out.println(num);
        a.close();
	}
}
