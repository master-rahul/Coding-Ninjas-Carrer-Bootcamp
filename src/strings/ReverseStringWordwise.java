package strings;

public class ReverseStringWordwise {
	
	public static void reverseStringWordWise(String s) {
		int index = s.length();
		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) == ' ') {
				System.out.print(s.substring(i+1,index)+" ");
				index = i;
			}
		}
		System.out.print(s.substring(0,index));
	}
	
	public static String reverseStringWordWise1(String s) {
		int index = 0;
		String str = "";
		for(int i =0; i < s.length(); i++) 
			if(s.charAt(i) == ' ') {
				str = s.substring(index, i) +" "+ str;
				index = i+1;
			}
		str = s.substring(index, s.length()) +" "+str;
		
		return str;
	}
	
	public static void main(String[] args) {
		String s = "Welcome to Coding Ninjas";
		reverseStringWordWise(s);
		System.out.println();
		String s1 = reverseStringWordWise1(s);
		System.out.println(s1);
	}

}
