package function;

import java.util.Scanner;

public class FibonacciNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.println(checkMember(n));
	}
	public static boolean checkMember(int n){
		if(n == 0 || n == 1) return true;
        int f = 0, s = 1, sum = 0;
        while(sum <= n){
            if(sum == n) return true;
            sum = f + s;
            f = s;
            s = sum;
        }
        return false;
	}
	
}
