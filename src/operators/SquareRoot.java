package operators;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        while(i*i <= n) i++;
        System.out.println(i-1);
        s.close();
	}
}
