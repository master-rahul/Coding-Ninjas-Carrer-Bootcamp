package array;

import java.util.Scanner;

public class Jagged2DArray {
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
	public static int[][] takeJaggedInput(){
		int row = s.nextInt();
		int arr[][] = new int[row][];
		for(int i = 0; i < row; i++) {
			int col = s.nextInt();
			arr[i] = new int[col];
			for(int j = 0; j < col; j++) arr[i][j] = s.nextInt();
		}
		return arr;
	}
	
	public static void printInput(int arr[][]){
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr1 = takeInput();
		int[][] arr2 = takeJaggedInput();
		printInput(arr1);
		printInput(arr2);
		int[][] arr3 = new int[3][];
		System.out.println(arr3[1].length);
		for(int i= 0; i < arr3.length; i++) System.out.println(arr3[i]);
	}
}


