package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPalindrome {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static boolean isPalindrome(String s) {
		for(int i = 0; i <= s.length()/2; i++) 
			if(s.charAt(i) != s.charAt(s.length()-i-1)) 
				return false;
			
		return true;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		boolean ans = isPalindrome(str);
		System.out.println(ans);
	}
}
