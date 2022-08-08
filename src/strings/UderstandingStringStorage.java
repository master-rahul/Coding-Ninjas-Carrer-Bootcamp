package strings;

public class UderstandingStringStorage {
	public static void main(String[] args) {
		String s = "abc";
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		//s3.charAt(0) = 'b;; invalid - string immutable
		//s.chartAt(0) = 'f' invalid - string immutable
		s = "afsds";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
