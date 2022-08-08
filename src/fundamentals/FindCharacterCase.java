package fundamentals;

import java.util.Scanner;

public class FindCharacterCase {
	public static void main(String[] args) {
        // Write your code here
		Scanner s = new Scanner(System.in);
        char a;
        String s1 = s.next();
        a = s1.charAt(0);
        if(a >= 65 && a <= 91) System.out.println("1");
        else if(a >= 97 && a <= 123) System.out.println("0");
        else System.out.println("-1");
        s.close();
    }

}
