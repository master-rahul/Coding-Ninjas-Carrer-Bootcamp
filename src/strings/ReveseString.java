package strings;

public class ReveseString {
	public static String reverse(String s) {
		String str = "";
		for(int i = s.length()-1; i >= 0; i--)
			str += s.charAt(i);
		return str;
	}
	public static String reverse1(String s) {
		String str = "";
		for(int i = 0; i < s.length(); i++)
			str += s.charAt(s.length()-i-1);
				return str;
	}
	public static String reverse2(String s) {
		String str = "";
		for(int i = 0; i < s.length(); i++)
			str = s.charAt(i) +str;
				return str;
	}
	
	public static void main(String[] args) {
		String s = "helllo";
		String str = reverse(s);
		String str1 = reverse1(s);
		String str2 = reverse2(s);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);

	}
}
