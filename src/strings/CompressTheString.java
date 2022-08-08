package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompressTheString {

	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	public static String getCompressedString(String str) {
		String s = new String("");
        int index = 0;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i-1) != str.charAt(i)){
                s += str.charAt(i-1);
                if(i-index > 1) s += (char)(i-index +'0');
                index = i;
            }
        }
        s += str.charAt(str.length()-1);
        if(str.length()-index > 1) s += (char)(str.length()-index +'0');
        return s;
	}
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine ();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = getCompressedString(str);
		System.out.println(ans);
		
	}
}
