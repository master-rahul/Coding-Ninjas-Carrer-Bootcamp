package recursion;

public class ReplacePi {
	
	public static String replacePi(String s) {
		if(s.length() == 0) return s;
		String s1 = replacePi(s.substring(1));
		if(s.charAt(0) == 'p' && s1.charAt(0) == 'i') return "3.14" + s1.substring(1);
		else return s.charAt(0) + s1;
	}
	
	public static String replacePi_1(String s) {
		if(s.length() <= 1) return s;
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i') return "3.14" + replacePi_1(s.substring(2));
		else return s.charAt(0) + replacePi_1(s.substring(1));
	}
	
	public static void main(String[] args) {
		System.out.println(replacePi("pipifdsfdippisdfspi"));
		System.out.println(replacePi_1("pipifdsfdippisdfspi"));
	}

}
