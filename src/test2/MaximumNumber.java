package test2;

import java.util.Scanner;

public class MaximumNumber {
	 public static int max_number(int n){
		  
		 int i = 1, old = 0, power = 10;
	        int num = 0, num1 = 0, max = 0, min = n;
	        while(n / i > 0){
	            num = n / power;
	            num1 = n % power;
	            num = num * i + old;
	            if(max < num) max = num;
	            if(min > num) min = num;
	            old = num1;
	            i*=10;
	            power*=10;
	            
	        }
	        System.out.println(min);
	        return max;
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.println(max_number(n));
	}
}
