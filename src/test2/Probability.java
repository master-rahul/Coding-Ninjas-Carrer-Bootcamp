package test2;

import java.util.Scanner;

public class Probability {
	public static int probability(int n,int x){
        int ans =  (nCr(4,x)*nCr(4,n-x));
        float p = (ans *1.0f)/nCr(8,n);
        return (int)(p*100);
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		s.close();
		System.out.println((int)probability(n,x));
	}
	public static int nCr(int n, int c) {
		return (fact(n)/((fact(n-c))*fact(c)));
	}
	public static int fact(int n) {
		if(n == 1) return 1;
		if(n == 0) return 0;
		if(n < 0) return 0;
		return n * fact(n-1);
	}
    
}
