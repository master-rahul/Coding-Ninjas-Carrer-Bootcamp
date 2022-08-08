package fundamentals;

import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int e = 0, o = 0;
        while(a > 0){
            if(a%2 == 0) e += a%10;
            else o += a%10;
            a /=10;
        }
        System.out.println(e+" "+o);
        s.close();
	}

}
