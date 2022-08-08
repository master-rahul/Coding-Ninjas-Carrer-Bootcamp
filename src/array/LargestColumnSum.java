package array;

import java.util.Scanner;

public class LargestColumnSum {
public static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput(){
		int row = s.nextInt();
		int col = s.nextInt();
		int arr[][] = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) arr[i][j] = s.nextInt();
		}
		return arr;
	}
	
	public static int largestColumnSum(int arr[][]){
		int sum = Integer.MIN_VALUE;
		for(int i = 0; i < arr[0].length; i++) {
			int temp = 0;
			for(int j = 0; j < arr.length; j++) temp += arr[j][i];
			if(temp > sum) sum = temp;
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[][] = takeInput();
		System.out.println(largestColumnSum(arr));
	}
	

}
