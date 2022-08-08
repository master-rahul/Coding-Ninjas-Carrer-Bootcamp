package recursion;

import java.util.Scanner;

public class CheckAB {

	public static boolean checkAB(String input) {
		if(input.length() <= 0) return true;
        if(input.charAt(0) == 'a' && input.length() > 2 && input.substring(0,3).equals("abb")) return checkAB(input.substring(3,input.length()));
        else if(input.charAt(0) == 'a' && input.length() >= 1 ) return checkAB(input.substring(1,input.length()));
        else return false;
        
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		s.close();
		System.out.println(checkAB(input));
	}
}
