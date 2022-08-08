package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighestOccuringCharacter {
	
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	public static char highestOccuringChar(String str) {
		int[] arr = new int[26];
        for(int i = 0; i < str.length(); i++) arr[str.charAt(i) -97]++;
        int lar = arr[0];
        int index = 0;
		for(int i = 0; i < 26; i++) {
            if(lar < arr[i]){
            	lar = arr[i];
                index = i;
            }
        }        
    	return (char)(index +97);
    }
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine ();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		char ans = highestOccuringChar(str);

		System.out.println(ans);
		
	}
}
