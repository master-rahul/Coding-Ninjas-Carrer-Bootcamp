package operators;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 0;
        if(n == 0) num = 0;
        else while(n > 0){ num = num*10 + n%10; n /=10;} 
        System.out.println(num);
        s.close();
	}
}
