package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CheckPermutation {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static boolean isPermutation(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        int[] arr = new int[26];
        for(int i = 0; i < str1.length(); i++) arr[str1.charAt(i) - 97]++;
        for(int i = 0; i < str2.length(); i++) arr[str2.charAt(i) - 97]--;
		for(int i = 0; i < 26; i++) if(arr[i] > 0) return false;
        return true;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String str1 = br.readLine();
		if (str1 != null) {
			str1 = str1.trim();
		} else {
			str1 = "";
		}

		String str2 = br.readLine();
		if (str2 != null) {
			str2 = str2.trim();
		} else {
			str2 = "";
		}

		boolean ans = isPermutation(str1, str2);

		System.out.println(ans);
		
	}
}
