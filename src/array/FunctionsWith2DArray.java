package array;
import java.util.Scanner;
public class FunctionsWith2DArray {
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
	
	public static void printInput(int arr[][]){
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[][] = takeInput();
		printInput(arr);
	}

}
