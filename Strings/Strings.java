import java.util.Scanner;

public class Strings {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String args[]) {
		//countWords();
		//stringPalindrome();
		//printSubstringsIterative();
		//reverseStringWordWise();
		//checkPermutation();
		//removeConsecutiveDuplicates();
		//reverseEachWord();
		//removeCharacter();
		//highestOccuringCharacter();
		//compressString();
	}
	public static void countWords() {
		System.out.println("CountWords : ");
		String line = s.nextLine();
		if(line.length() == 0) {System.out.println("0"); return;}
		int wordCount = 0;
		for(int i = 0; i < line.length(); i++) if(line.charAt(i) == ' ') wordCount++;
		System.out.println(wordCount+1);
	}
	public static void stringPalindrome() {
		System.out.println("StringPalindrome : ");
		String line = s.next();
		for(int i  = 0; i < line.length()/2; i++) if(line.charAt(i) != line.charAt(line.length()-1-i)) {System.out.println(false); return;}
		System.out.println(true);
	}
	public static void printSubstringsIterative() {
		System.out.println("PrintSubstringIterative : ");
		String word = s.next();
		for(int i = 0; i < word.length(); i++) {
			for(int j = i; j < word.length(); j++) {
				for(int k = i ; k <=j; k++)System.out.print(word.charAt(k));
				System.out.println();
			}
		}
	}
	public static void reverseStringWordWise() {
		System.out.println("ReverseStringWordWise : ");
		String line = s.nextLine();
		String reverse = "";
		int lastIndex = 0;
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == ' ') {
				reverse = line.substring(lastIndex, i) + ' ' +reverse;
				lastIndex = i+1;
			}
		}
		reverse = line.substring(lastIndex, line.length()) +' '+ reverse;
		System.out.println(reverse);
	}
	public static void checkPermutation() {
		System.out.println("CheckPermutation : ");
		String s1 = s.next();
		String s2 = s.next();
		if(s1.length() != s2.length()) {System.out.println(false); return;}
		int arr[] = new int[26];
		for(char c : s1.toCharArray()) arr[c - 'a']++;
		for(char c : s2.toCharArray()) arr[c - 'a']--;
		for(int a : arr) if(a != 0) {System.out.println(false); return;}
		System.out.println(true); 
	}
	public static void removeConsecutiveDuplicates() {
		System.out.println("RemoveConsecutiveDuplicates : ");
		String str = s.next();
		String ans = str.charAt(0)+"";
		for(int i = 1; i < str.length(); i++) if(ans.charAt(ans.length()-1) != str.charAt(i)) ans += str.charAt(i);
		System.out.println(ans);
	}
	public static void reverseEachWord() {
		System.out.println("ReverseEachWord : ");
		String str = s.nextLine();
		String ans = "";
		int index = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				StringBuilder ss = new StringBuilder(str.substring(index, i));
				index = i+1;
				ans += ss.reverse() + " ";
			}
		}
		StringBuilder ss = new StringBuilder(str.substring(index, str.length()));
		ans += ss.reverse();
		System.out.println(ans);
	}
	public static void removeCharacter() {
		System.out.println("RemoveCharacter : ");
		String str = s.next();
		char c = s.next().charAt(0);
		String ans = "";
		for(char ch : str.toCharArray()) if(c != ch) ans += ch;
		System.out.println(ans);
	}
	public static void highestOccuringCharacter() {
		System.out.println("HighestOccuringCharacter : ");
		String str = s.next();
		int frequency[] = new int[26];
		for(char c : str.toCharArray()) frequency[c - 'a']++;
		int index = 0, max = Integer.MIN_VALUE;
		for(int i = 0; i < 26; i++) if(frequency[i] > max) {max = frequency[i]; index = i;}
		System.out.println((char)('a' + index));
	} 
	public static void compressString() {
		System.out.println("CompressSting : ");
		String str = s.next();
		String ans  = str.charAt(0)+ "";
		int count = 1;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == ans.charAt(ans.length()-1)) count++;
			else {
				if(count == 1) ans +=str.charAt(i);
				else ans += String.valueOf(count) + str.charAt(i);
				count = 1;
			}
		}
		if(count != 1) ans += String.valueOf(count);
		System.out.println(ans);
		
	}
}
