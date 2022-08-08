package recursion;

import java.util.Scanner;

public class PairStar {
	
	public static String addStars(String s) {
		if(s.length() == 1) return s;
        String s1 = addStars(s.substring(1));
        if(s.charAt(0) == s1.charAt(0)) return s.charAt(0) +"*"+s1;
        return s.charAt(0) +s1;

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		s.close();
		System.out.println(addStars(input));
	}
}
