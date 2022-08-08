package recursion;

import java.util.Scanner;

public class CheckNumberInArray {
	static Scanner s = new Scanner(System.in);
	
	public static boolean checkNumber(int input[], int x) {
		if(input.length == 0) return false;
        if(input[0] == x) return true;
        int[] smallArray = new int[input.length-1];
        for(int i = 1; i < input.length; i++) smallArray[i-1] = input[i];
        return checkNumber(smallArray, x);
 	}
	
	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));
	}
}
