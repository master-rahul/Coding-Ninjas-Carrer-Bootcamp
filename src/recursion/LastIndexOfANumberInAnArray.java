package recursion;

import java.util.Scanner;

public class LastIndexOfANumberInAnArray {
	
	static Scanner s = new Scanner(System.in);

	public static int lastIndex(int input[], int x) {
		if(input.length == 0) return -1;
		int[] arr = new int[input.length-1];
		for(int i = 1; i < input.length; i++) arr[i-1] = input[i];
		int num = lastIndex(arr, x);
		if(num != -1) return num + 1;
		if(input[0] == x) return 0;
		else return -1;
	}
	
	public static int lastIndex(int input[], int x, int s) {
		if(s == input.length) return -1;
		int num = lastIndex(input, x, s+1);
		if(num != -1) return num;
		if(input[s] == x) return s;
		return -1;
	}
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(lastIndex(input, x));
		System.out.println(lastIndex(input, x, 0)) ;
	}
}
