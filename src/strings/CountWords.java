package strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWords {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int countWords(String str) {	
        if(str.length() == 0) return 0;
        int count = 0;
        for(int i = 0; i < str.length(); i++) if((char)(str.charAt(i))==' ')count++;
        return ++count;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		int count = countWords(str);
		System.out.println(count);
	}
}
