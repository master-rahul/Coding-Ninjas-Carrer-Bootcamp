package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveCharacter {
	
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String s = new String("");
        for(int i = 0; i < str.length(); i++) if(str.charAt(i) != ch) s += str.charAt(i);
        return s;
	}
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		char x = br.readLine().charAt(0);
		
		String ans = removeAllOccurrencesOfChar(str, x);

		System.out.println(ans);
		
	}

}
