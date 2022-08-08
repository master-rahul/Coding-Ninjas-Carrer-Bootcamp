package strings;

public class StringComparison {
	public static void main(String[] args) {
//		int arr1[] = {1,2};
//		int arr2[] = {1,2};
//		System.out.println(arr1 == arr2);
//		System.out.println(arr1+" "+arr2);
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		System.out.println(str1 == str2); //address is compared
		System.out.println(str2 == str3); //address is compared
		System.out.println(str1.equals(str3)); //contents is compared
		System.out.println(str1.contains(""));
	}
}
