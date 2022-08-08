package recursion;

import java.util.Scanner;

public class PrintFirstNNaturalNumbers {
	
	public static void print(int n){
    	if(n == 0) return;
        print(n-1);
        System.out.print(n+" ");
        return;
    }
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		print(n);
	}
}
