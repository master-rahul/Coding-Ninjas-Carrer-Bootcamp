package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveConsecutiveDuplicates {
	
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	public static String removeConsecutiveDuplicates(String str) {
		String s = new String("");
        for(int i = 1; i < str.length(); i++) if(str.charAt(i-1) != str.charAt(i)) s += str.charAt(i-1);
        return s += str.charAt(str.length()-1);
    }
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = removeConsecutiveDuplicates(str);

		System.out.println(ans);
		
	}
}
