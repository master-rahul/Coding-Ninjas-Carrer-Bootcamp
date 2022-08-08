package test1;

import java.util.Scanner;

public class PlaindromeNumber {
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = n, num = 0;
        while(n > 0){
            num = num*10 + n%10;
            n=n/10;
        }
        if(num == m) System.out.println(true);
        else System.out.println(false);
        s.close();
	}
}
