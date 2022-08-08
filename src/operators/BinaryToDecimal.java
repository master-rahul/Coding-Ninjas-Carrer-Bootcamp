package operators;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 0, p = 1;
        while(n > 0){
			num += n%10 *p;
            p *= 2;
            n = n/10;
        }
        System.out.println(num);
        s.close();
	}
}
