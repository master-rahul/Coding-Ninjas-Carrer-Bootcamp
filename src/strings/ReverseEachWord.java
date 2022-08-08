package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseEachWord {
	
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	public static String reverse(String s){
        String s1 = "";
        for(int i = 0; i < s.length(); i++) s1 = s.charAt(i)+s1;
        return s1;
    }
	public static String reverseEachWord(String str) {
		String s = new String("");
        int index = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                s += reverse(str.substring(index, i))+" ";  
            	index = i+1;
            }
        }
        return s + reverse(str.substring(index, str.length()));
	}
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = reverseEachWord(str);

		System.out.println(ans);
		
	}
}
