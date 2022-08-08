package strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringsDemo {
	 
	public static void main(String[] args) throws FileNotFoundException {
		//char[] arr = {'a','b','c','d'};
//		String str = "Coding";
//		String str5 = "coding";
//		String str1 = " is awsome"; //Empty String
//		String str2 = " is fun";
//		String str4 = " is fun";
//		String str3 = str.concat(str2);
//		str1 = str + str1;
//		System.out.println(str1.charAt(1));
//		System.out.println(str.length());
//		System.out.println(str1);
//		System.out.println(str3);
//		System.out.println(str2.equals(str4));
//		System.out.println(str.compareTo(str5)); //returns difference between mismatched characters and its checks lexo-graphically
//		System.out.println(str.compareToIgnoreCase(str5));
//		System.out.println(str.contains("ing"));
//		
//		String a ="abcd";
//		String b="abcda";
//		System.out.println(a.compareTo(b));
//		 
//		String str6 = "Coding";
//		System.out.println(str.substring(1));
//		System.out.println(str.substring(1,5));
//		System.out.println(str.substring(str6.length())+"--");
		File file = new File("/Users/extreme/eclipse-workspace/Carrer Bootcamp/src/strings/hello.txt");
	    Scanner s = new Scanner(file);
	    String st = s.nextLine();
	    System.out.println(st);
	    while (s.hasNextLine()) {
	        System.out.println(s.nextLine());
	    }
		s.close();
//		String sttt = "hello";
//		String stt = "1hello";
//		String st = "hello";
//		String sttt1 = new String("helloqejdwioefwfewef");
		;
	}
}
