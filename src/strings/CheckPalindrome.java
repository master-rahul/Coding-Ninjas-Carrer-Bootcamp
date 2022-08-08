package strings;

public class CheckPalindrome {
	public static void main(String[] args) {
		String s = "abcbcbcba";
		for(int i = 0; i <= s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				System.out.println("Not Palindrome");
				return;
			}
		}
		System.out.println("Its Palindrome");
	}
}
