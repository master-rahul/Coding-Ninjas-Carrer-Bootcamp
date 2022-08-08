package strings;

public class AllSubstrings {
	
	public static void printSubstrings(String s) {
		int n = s.length(), temp = 0;
		for(int i = 0; i < n; i++) {
			temp++;
			for(int j = 0; j < s.length(); j++) {
				System.out.print(s.substring(j,j+temp)+"\t");
				if(j+temp == s.length()) break;
			}
			System.out.println();
		}
	}	
	
	public static void printSubstrings1(String s) {
		for(int i = 0; i < s.length(); i++) {
			for(int j = i+1; j <= s.length(); j++) System.out.print(s.substring(i,j)+ "\t");
			System.out.println();
		}
	}
	
	public static void printSubstrings2(String s) {
		for(int i = 1; i <= s.length(); i++) { 
			for(int j = 0; j <= s.length() - i; j++) System.out.print(s.substring(j, j+i)+"\t");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String s = "hello";
		printSubstrings(s);
		System.out.println();
		printSubstrings1(s);
		System.out.println();
		printSubstrings2(s);

	}
}
