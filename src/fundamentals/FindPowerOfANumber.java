package fundamentals;

import java.util.Scanner;

public class FindPowerOfANumber {
	public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = 1;
        while(b-- > 0) c *=a;
        System.out.println(c);
        s.close();
    }

}
