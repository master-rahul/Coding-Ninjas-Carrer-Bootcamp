package recursion;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static boolean isStringPalindrome(String input) {
		if(input.length() <= 1) return true;
        if(input.charAt(0) !=  input.charAt(input.length()-1)) return false;
        return isStringPalindrome(input.substring(1, input.length()-1));

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		s.close();
		System.out.println(isStringPalindrome(input));
	}
}
