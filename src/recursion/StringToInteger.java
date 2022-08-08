package recursion;

import java.util.Scanner;

public class StringToInteger {
	public static int convertStringToInt(String input){
    	if(input.length() == 2 && input.charAt(0) == '-') return -1 * (input.charAt(1) - '0');
		if(input.length() == 1) return input.charAt(0)-'0';
        if(input.length() == 0) return 0;
       	int a = convertStringToInt(input.substring(0, input.length()-1))*10;
        int b = (input.charAt(input.length()-1) - '0');
        if(a < 0) return a -b;
        return a+b;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		s.close();
		System.out.println(convertStringToInt(input));
	}
}
