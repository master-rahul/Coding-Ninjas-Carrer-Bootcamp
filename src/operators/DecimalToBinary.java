package operators;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long num = 0, p = 1;
        while(n > 0){
            if(n%2 == 0) p *= 10;
            else {
            	num += 1 *p;
                p*=10;
            }
            n /=2;
        }
        System.out.println(num);
        s.close();
	}
}
