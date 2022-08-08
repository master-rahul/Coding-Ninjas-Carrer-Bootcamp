package operators;
import java.util.Scanner;
public class SumOrProduct {
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int o = s.nextInt();
        int num = 1;
        if(o == 1) for(int i = 2; i <= n; i++) num = num + i;
		else if(o == 2) for(int i = 1; i <= n; i++) num = num * i;
        else num = -1;
        System.out.println(num);
        s.close();
    }
}
