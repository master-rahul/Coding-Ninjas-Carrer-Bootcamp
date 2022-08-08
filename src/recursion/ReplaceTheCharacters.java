package recursion;

public class ReplaceTheCharacters {
	public static String replace(String s, char a, char b) {
		if(s.length() == 0) return "";
		if(s.charAt(0) == a) return b + replace(s.substring(1), a, b);
		else return s.charAt(0) + replace(s.substring(1), a, b);
 	}
	public static String replace(char a, String s, char b) {
		if(s.length() == 0) return "";
		if(s.charAt(0) == a) return b + replace(a, s.substring(1),b);
		else return s.charAt(0) + replace(a, s.substring(1), b);
 	}
	public static void main(String[] args) {
		 String s = "fffffffdsfasfssfsaasasfafs";
		 String s1 = replace(s,'f','x');
		 String s2 = replace('f',s,'x');
		 System.out.println(s1);
		 System.out.println(s2);
	}
}
